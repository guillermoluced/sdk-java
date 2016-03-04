package ar.com.decidir.api;

import java.net.MalformedURLException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import ar.com.decidir.api.authorize.AuthorizeConnector;
import ar.com.decidir.api.authorize.GetAuthorizeAnswerData;
import ar.com.decidir.api.authorize.SendAuthorizeRequestData;
import ar.com.decidir.api.authorize.execute.ExecuteData;
import ar.com.decidir.api.authorize.service.ExecuteResponse;
import ar.com.decidir.api.authorize.service.GetAuthorizeAnswerResponse;
import ar.com.decidir.api.authorize.service.SendAuthorizeRequestResponse;
import ar.com.decidir.api.operation.GetData;
import ar.com.decidir.api.operation.OperationConnector;
import ar.com.decidir.api.operation.service.DataServiceFault;
import ar.com.decidir.api.operation.service.Operations;


public class Decidir {

	public static final String version= "0.1.0";
	
	private AuthorizeConnector auth;
	private OperationConnector op;
	
	private final String prd = "https://sps.decidir.com/services/t/1.1/";
	private final String sdb = "https://sandbox.decidir.com/services/t/1.1/";
	public static final int production = 0;
	public static final int sandbox = 1;


	String endpoint;
	
	Map<String, List<String>> headers;
	
	
	public Decidir(int endpoint, Map<String, List<String>>auth){
		this(endpoint, auth, false);
	}

	public Decidir(int endpoint, Map<String, List<String>>auth, boolean ssl){
		if(ssl){
			this.disableSslVerification();
		}
		//missconfigured SNI on server side - threw "handshake alert:  unrecognized_name" Exception
		System.setProperty("jsse.enableSNIExtension", "false");
		switch(endpoint){
		case production:
			this.endpoint = prd;
			break;
		case sandbox:
			this.endpoint=sdb;
			break;
		}
		this.headers = auth;
	}
	
	//Authorize Service
	public void initAuthorize (String wsdl) throws MalformedURLException{
		auth = new AuthorizeConnector(wsdl, this.endpoint+"Authorize", headers);
	}
	public SendAuthorizeRequestResponse sendAuthorizeRequest(SendAuthorizeRequestData sar){
		return auth.sendAuthorizeRequest(sar);
	}
	public GetAuthorizeAnswerResponse getAuthorizeAnswer(GetAuthorizeAnswerData gaa){
		return auth.getAuthorizeAnswer(gaa);
	}
	public ExecuteResponse execute(ExecuteData ex){
		return auth.execute(ex);
	}

	//Operation Service
	public void initOperation(String wsdl) throws MalformedURLException{
		op = new OperationConnector(wsdl, this.endpoint + "Operation", headers);
	}
	public Operations get(GetData data) throws DataServiceFault{
		return op.get(data);
	}
	
	

	//SSL INVALIDATION
	private void disableSslVerification() {
		try {
			// Create a trust manager that does not validate certificate chains
			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}

				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			} };

			// Install the all-trusting trust manager
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			// Create all-trusting host name verifier
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};
			// Install the all-trusting host verifier
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		}
	}
}

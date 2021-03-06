package ar.com.decidir.api;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.bind.JAXBElement;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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

	public static final String version= "1.0.0";
	
	private AuthorizeConnector auth;
	private OperationConnector op;
	
	private final String prd = "https://sps.decidir.com/services/t/1.1/";
	private final String sdb = "https://sandbox.decidir.com/services/t/1.1/";
	public static final int production = 0;
	public static final int sandbox = 1;

	private final String authorizeWSDL = "/decidir/Authorize.wsdl";
	private final String operationWSDL = "/decidir/Operation.wsdl";

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
		
		//if(this.auth == null){
		this.setAuthorize();
		this.setOperation();
		//}
	}
	
	//Authorize Service
	@Deprecated
	public void initAuthorize (String wsdl) throws MalformedURLException{	
		auth = new AuthorizeConnector(wsdl, this.endpoint+"Authorize", headers);
	}
	
	@Deprecated
	public void initAuthorize (URL wsdl) throws MalformedURLException{	
		auth = new AuthorizeConnector(wsdl, this.endpoint+"Authorize", headers);
	}
	
	private void setAuthorize (){
		try {
			URL wsdl = Decidir.class.getResource(this.authorizeWSDL).toURI().toURL();
			auth = new AuthorizeConnector(wsdl, this.endpoint+"Authorize", headers);

		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
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
	@Deprecated
	public void initOperation(String wsdl) throws MalformedURLException{
		op = new OperationConnector(wsdl, this.endpoint + "Operation", headers);
	}
	
	private void setOperation(){
		URL wsdl;
		try {
			wsdl = Decidir.class.getResource(this.operationWSDL).toURI().toURL();
			op = new OperationConnector(wsdl, this.endpoint + "Operation", headers);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
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
	public Map<String, Map<String,String>> getPayload(JAXBElement<String> element){
		Map<String, Map<String, String>> result = new HashMap<>();
		Map<String, String> resultChild = new HashMap<>();

		if(element!=null){
			 Object ele =  element.getValue();
			 Node answer = ((Node) ele).getFirstChild();
			 result.put("Answer", new HashMap<String, String>());
			 NodeList results = answer.getChildNodes();
			 for(int i=0; i<results.getLength();i++){
				 
				if(results.item(i).getNodeName() != "TOKENIZATION"){
					 result.get("Answer").put(results.item(i).getNodeName(), results.item(i).getTextContent());
				}else{
					 Node nodeToken = results.item(i);
					 Node answerChild = (Node) nodeToken.getChildNodes();
					 
					 for (int j=0; j < ((NodeList) answerChild).getLength(); j++) {
						 if(((NodeList) answerChild).item(j).getNodeName() != "#text"){
							 resultChild.put(((NodeList) answerChild).item(j).getNodeName(), ((NodeList) answerChild).item(j).getTextContent());
						 }
					 }
					 result.put("TOKENIZATION", resultChild);
				}	
			 }
			 
			 result.put("Request", new HashMap<String, String>());
			 Node request = answer.getNextSibling();
			 NodeList results2 = request.getChildNodes();
			 for(int i=0; i<results2.getLength();i++){
				 result.get("Request").put(results2.item(i).getNodeName(), results2.item(i).getTextContent());
			 }
		}
		return result;
	}
}

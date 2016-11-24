package ar.com.decidir.api.authorize;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import ar.com.decidir.api.authorize.execute.ExecuteData;
import ar.com.decidir.api.authorize.service.Authorize;
import ar.com.decidir.api.authorize.service.AuthorizePortType;
import ar.com.decidir.api.authorize.service.Execute;
import ar.com.decidir.api.authorize.service.ExecuteResponse;
import ar.com.decidir.api.authorize.service.GetAuthorizeAnswer;
import ar.com.decidir.api.authorize.service.GetAuthorizeAnswerResponse;
import ar.com.decidir.api.authorize.service.ObjectFactory;
import ar.com.decidir.api.authorize.service.SendAuthorizeRequest;
import ar.com.decidir.api.authorize.service.SendAuthorizeRequestResponse;


public class AuthorizeConnector {

	private ObjectFactory factory;
	private String endpoint = null;
	private AuthorizePortType service = null;

	public AuthorizeConnector(URL wsdl, String endpoint, Map<String, List<String>> auth){
		this.factory = new ObjectFactory();
		this.endpoint = endpoint;
		this.service = new Authorize(wsdl).getAuthorizeHttpsSoap11Endpoint();
		((BindingProvider) service).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		((BindingProvider) service).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, auth);
	}
	
	public AuthorizeConnector(String wsdl, String endpoint, Map<String, List<String>> auth) throws MalformedURLException {
		this.factory = new ObjectFactory();
		this.endpoint = endpoint;
		this.service = new Authorize(new URL(wsdl)).getAuthorizeHttpsSoap11Endpoint();
		((BindingProvider) service).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		((BindingProvider) service).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, auth);
	}

	//Send Authorize Request
	public SendAuthorizeRequestResponse sendAuthorizeRequest(SendAuthorizeRequestData sar){
		SendAuthorizeRequest sendAuthorizeRequest = this.parseToSendAuthorizeRequest(sar);
		SendAuthorizeRequestResponse sarResponse = service.sendAuthorizeRequest(sendAuthorizeRequest);
		return sarResponse;

	}

	private SendAuthorizeRequest parseToSendAuthorizeRequest(SendAuthorizeRequestData sar) {
		SendAuthorizeRequest o = factory.createSendAuthorizeRequest();
		o.setEncodingMethod(factory.createSendAuthorizeRequestEncodingMethod(sar.getEncodingMethod()));
		o.setMerchant(sar.getMerchant());
		o.setSecurity(sar.getSecurity());
		o.setSession(factory.createSendAuthorizeRequestSession(sar.getSession()));
		o.setURLERROR(factory.createSendAuthorizeRequestURLERROR(sar.getUrl_error()));
		o.setURLOK(factory.createSendAuthorizeRequestURLOK(sar.getUrl_ok()));
		o.setPayload(factory.createSendAuthorizeRequestPayload(sar.getPayload()));
		return o;
	}


	//GetAuthorizeAnswer
	public GetAuthorizeAnswerResponse getAuthorizeAnswer(GetAuthorizeAnswerData gaa){
		GetAuthorizeAnswer getAuthorizeAnswer = this.parseToAuthorizeAnswer(gaa);
		GetAuthorizeAnswerResponse getAuthorizeAnswerResponse = service.getAuthorizeAnswer(getAuthorizeAnswer);
		return getAuthorizeAnswerResponse;
	}


	private GetAuthorizeAnswer parseToAuthorizeAnswer(GetAuthorizeAnswerData gaa) {
		GetAuthorizeAnswer o = factory.createGetAuthorizeAnswer();
		o.setAnswerKey(factory.createGetAuthorizeAnswerAnswerKey(gaa.getAnswerKey()));
		o.setRequestKey(factory.createGetAuthorizeAnswerRequestKey(gaa.getRequestKey()));
		o.setMerchant(gaa.getMerchant());
		o.setSecurity(gaa.getSecurity());
		o.setSession(factory.createGetAuthorizeAnswerSession(gaa.getSession()));
		return o;
	}


	//Execute
	public ExecuteResponse execute(ExecuteData ex) {
		Execute e = this.parseToExecute(ex);
		ExecuteResponse exRes = service.execute(e);
		return exRes;
	}


	private Execute parseToExecute(ExecuteData ex) {
		Execute o = factory.createExecute();
		o.setEncodingMethod(factory.createExecuteEncodingMethod(ex.getEncodingMethod()));
		o.setMerchant(ex.getMerchant());
		o.setOperation(ex.getOperation());
		o.setSecurity(ex.getSecurity());
		o.setSession(factory.createExecuteSession(ex.getSession()));
		o.setPayload(factory.createExecutePayload(ex.getPayload()));
		return o;
	}
}

package ar.com.decidir.api.operation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import ar.com.decidir.api.operation.service.DataServiceFault;
import ar.com.decidir.api.operation.service.Get;
import ar.com.decidir.api.operation.service.ObjectFactory;
import ar.com.decidir.api.operation.service.OperationPortType;
import ar.com.decidir.api.operation.service.Operation_Service;
import ar.com.decidir.api.operation.service.Operations;


public class OperationConnector {


	private String endpoint;
	private OperationPortType service;
	private ObjectFactory factory;

	public OperationConnector(String wsdl, String endpoint, Map<String, List<String>> auth) throws MalformedURLException {
		this.factory = new ObjectFactory();
		this.endpoint = endpoint;
		this.service = new Operation_Service(new URL(wsdl)).getOperationHttpsSoap11Endpoint();
		((BindingProvider) service).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		((BindingProvider) service).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, auth);
	}
	
	public OperationConnector(URL wsdl, String endpoint, Map<String, List<String>> auth){
		this.factory = new ObjectFactory();
		this.endpoint = endpoint;
		this.service = new Operation_Service(wsdl).getOperationHttpsSoap11Endpoint();
		((BindingProvider) service).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		((BindingProvider) service).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, auth);
	}
	
	public Operations get(GetData data) throws DataServiceFault{
		Get g = this.parseToAuthorizeAnswer(data);
		Operations ops = service.get(g);
		return ops;
	}

	private Get parseToAuthorizeAnswer(GetData data) {
		Get o = factory.createGet();
		o.setIDSITE(data.getIDSITE());
		o.setIDTRANSACTIONSIT(data.getIDTRANSACTIONSIT());
		return o;
	}

}

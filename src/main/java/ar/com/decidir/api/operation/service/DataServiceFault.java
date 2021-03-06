package ar.com.decidir.api.operation.service;

import javax.xml.ws.WebFault;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.4-b01 Generated
 * source version: 2.2
 * 
 */
@WebFault(name = "DataServiceFault", targetNamespace = "http://ws.wso2.org/dataservice")
public class DataServiceFault extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3547651346306991432L;
	/**
	 * Java type that goes as soapenv:Fault detail element.
	 * 
	 */
	private String faultInfo;

	/**
	 * 
	 * @param message
	 * @param faultInfo
	 */
	public DataServiceFault(String message, String faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @param message
	 * @param faultInfo
	 * @param cause
	 */
	public DataServiceFault(String message, String faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @return returns fault bean: java.lang.String
	 */
	public String getFaultInfo() {
		return faultInfo;
	}

}

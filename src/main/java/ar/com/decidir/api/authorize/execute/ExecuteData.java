package ar.com.decidir.api.authorize.execute;

import java.util.HashMap;
import java.util.Map;

import ar.com.decidir.api.authorize.medioPago.MedioPagoData;
import ar.com.decidir.api.authorize.bsa.BsaData;


public abstract class ExecuteData {

	protected String EncodingMethod = "";
	protected String Merchant = "";
	protected String Security = "";
	protected String Session = "";
	
	protected String Operation = "";
	
	protected MedioPagoData medioDePago;
	
	protected BsaData BsaData;
	
	
	protected Map<String, String> data = new HashMap<String, String>();
	
	public String getEncodingMethod() {
		return EncodingMethod;
	}
	public void setEncodingMethod(String encoding) {
		EncodingMethod = encoding;
	}
	
	public String getMerchant() {
		return Merchant;
	}
	public void setMerchant(String merchant) {
		Merchant = merchant;
	}
	
	public String getOperation() {
		return Operation;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}
	
	public String getSecurity() {
		return Security;
	}
	public void setSecurity(String security) {
		Security = security;
	}
	
	public String getSession() {
		return Session;
	}
	public void setSession(String session) {
		Session = session;
	}
	
	public MedioPagoData getMedioDePago() {
		return medioDePago;
	}
	public void setMedioDePago(MedioPagoData medioDePago) {
		this.medioDePago = medioDePago;
	}
	public BsaData getBsaData() {
		return BsaData;
	}
	public void setBsaData(BsaData bsaData) {
		BsaData = bsaData;
	}
	public String getPayload() {
		String payload = "<Request>";
		
		for (Map.Entry<String, String> entry : data.entrySet()) {
			payload += "<";
			payload += entry.getKey().toUpperCase();
			payload += ">";
			
			payload += entry.getValue();
			
			payload += "</";
			payload += entry.getKey().toUpperCase();
			payload += ">";
		}
		
		if (medioDePago != null) {
			payload += medioDePago.getPayload();
		}
		
		if (BsaData != null) {
			payload += BsaData.getPayload();
		}
		
		payload+="</Request>";
		return payload;
	}
}

package ar.com.decidir.api.authorize;

import ar.com.decidir.api.authorize.extras.ComerciosAgregadores;
import ar.com.decidir.api.authorize.medioPago.MedioPagoData;
import ar.com.decidir.api.authorize.split.Split;
import ar.com.decidir.api.tools.fraudControl.FraudControlData;
import ar.com.decidir.api.tools.fraudControl.FraudControlVertical;

public class SendAuthorizeRequestData {
	
	String security="";
	String session="";
	String merchant="";
	String url_ok="";
	String url_error="";
	String encodingMethod="";
	
	FraudControlData data;
	FraudControlVertical retail;
	
	MedioPagoData medioDePago;
	
	ComerciosAgregadores comercios;
	
	Split split;
	
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getUrl_ok() {
		return url_ok;
	}
	public void setUrl_ok(String url_ok) {
		this.url_ok = url_ok;
	}
	public String getUrl_error() {
		return url_error;
	}
	public void setUrl_error(String url_error) {
		this.url_error = url_error;
	}
	public String getEncodingMethod() {
		return encodingMethod;
	}
	public void setEncodingMethod(String encodingMethod) {
		this.encodingMethod = encodingMethod;
	}
	public String getPayload() {
		String payload = "<Request>";
		payload += "<NROCOMERCIO>" + getMerchant() + "</NROCOMERCIO>";
		payload += "<SECURITY>" +  getSecurity() + "</SECURITY>";
		payload += "<SESSION>" + getSession() + "</SESSION>";
		payload += "<URL_OK>" + getUrl_ok() + "</URL_OK>";
		payload += "<URL_ERROR>" + getUrl_error() + "</URL_ERROR>";
		payload += "<ENCODINGMETHOD>" + getEncodingMethod() + "</ENCODINGMETHOD>";

		if(data!=null){
			payload += data.getForPayload();
		}
		
		if(retail!=null){
			payload += retail.getForPayload();
		}
		
		if(medioDePago!=null){
			payload += medioDePago.getPayload();
		}
		if(comercios !=null){
			payload+= comercios.getForPayload();
		}
		if(split != null){
			payload+= split.getForPayload();
		}
		
		payload+="</Request>";
		//System.out.println(payload);
		return payload;
	}
	
	
	//Fraud Control
	public FraudControlData getFraudControlData() {
		return data;
	}
	public void setFraudControlData(FraudControlData fcd) {
		this.data = fcd;
	}
	public FraudControlVertical getFraudControlRetail() {
		return retail;
	}
	public void setFraudControlVertical(FraudControlVertical fcv) {
		this.retail = fcv;
	}
	
	public void setMedioPago(MedioPagoData medioDePago){
		this.medioDePago = medioDePago;
	}
	
	public void setComerciosAgregadores (ComerciosAgregadores comercio){
		this.comercios = comercio;
	}
	
	public void setSplit(Split split){
		this.split = split;
	}

}

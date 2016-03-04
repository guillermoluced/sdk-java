package ar.com.decidir.api.authorize.medioPago;

import java.util.HashMap;
import java.util.Map;

public abstract class MedioPagoData {

	protected Map<String, String> data = new HashMap<String, String>();
	
	public MedioPagoData(String MEDIODEPAGO){
		data.put("MEDIODEPAGO", MEDIODEPAGO);
	}
	
	public String getPayload() {
//		String payload = "<Request>";
		String payload = "";
		for (Map.Entry<String, String> entry : data.entrySet()) {
			payload += "<";
			payload += entry.getKey().toUpperCase();
			payload += ">";
			
			payload += entry.getValue();
			
			payload += "</";
			payload += entry.getKey().toUpperCase();
			payload += ">";
		}
		
//		payload+="</Request>";
		return payload;
	}
}

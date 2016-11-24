package ar.com.decidir.api.authorize.bsa;

import java.util.HashMap;
import java.util.Map;

public class BsaData {
	
	public final String NROCOMERCIO = "NROCOMERCIO";
	public final String NROOPERACION = "NROOPERACION";
	public final String MEDIODEPAGO = "MEDIODEPAGO";
	public final String NOMBREENTARJETA = "NOMBREENTARJETA";
	public final String NROTARJETA = "NROTARJETA";
	public final String VENCIMIENTO = "VENCIMIENTO";
	public final String CODSEGURIDAD = "CODSEGURIDAD";
	
	public final String PUBLIC_TOKEN = "PUBLIC_TOKEN";
	public final String ISSUE_DATE = "ISSUE_DATE";
	public final String PUBLIC_REQUEST_KEY = "PUBLIC_REQUEST_KEY";
	public final String VOLATILE_ENCRYPTED_DATA = "VOLATILE_ENCRYPTED_DATA";
	public final String FLAG_TOKENIZACION = "FLAG_TOKENIZACION";
	public final String FLAG_CODIGO_SEGURIDAD = "FLAG_CODIGO_SEGURIDAD";
	public final String FLAG_SELECTOR_CLAVE = "FLAG_SELECTOR_CLAVE";
	public final String FLAG_PEI = "FLAG_PEI";	
	public final String DIRECCION_IP = "DIRECCION_IP";
	public final String EMAILCLIENTE = "EMAILCLIENTE";
	public final String CUOTAS = "CUOTAS";
	public final String MONTO = "MONTO";
	public final String MONEDA = "MONEDA";
	
	protected Map<String, String> data = new HashMap<String, String>();
	
	public void putValue(String key, String value){
		String aux = (value.length()>254) ? value.substring(0, 253) : value;
		this.data.put(key, aux);
	}
		
	public String getPayload() {
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
		return payload;
	}
}

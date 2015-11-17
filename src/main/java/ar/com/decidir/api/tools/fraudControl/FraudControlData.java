package ar.com.decidir.api.tools.fraudControl;

import java.util.HashMap;
import java.util.Map;

public class FraudControlData {
	
	public static final String CSBTCITY= "CSBTCITY";
	public static final String CSBTCOUNTRY= "CSBTCOUNTRY";
	public static final String CSBTEMAIL= "CSBTEMAIL";
	public static final String CSBTFIRSTNAME= "CSBTFIRSTNAME";      
	public static final String CSBTLASTNAME= "CSBTLASTNAME";
	public static final String CSBTPHONENUMBER= "CSBTPHONENUMBER";     
	public static final String CSBTPOSTALCODE= "CSBTPOSTALCODE"; 
	public static final String CSBTSTATE= "CSBTSTATE"; 
	public static final String CSBTSTREET1= "CSBTSTREET1";
	public static final String CSBTSTREET2= "CSBTSTREET2";

	public static final String CSBTCUSTOMERID= "CSBTCUSTOMERID"; 
	public static final String CSBTIPADDRESS= "CSBTIPADDRESS";        
	public static final String CSPTCURRENCY= "CSPTCURRENCY";       
	public static final String CSPTGRANDTOTALAMOUNT= "CSPTGRANDTOTALAMOUNT"; 

	public static final String CSMDD6= "CSMDD6"; 
	public static final String CSMDD7= "CSMDD7";         
	public static final String CSMDD8= "CSMDD8";        
	public static final String CSMDD9= "CSMDD9";        
	public static final String CSMDD10= "CSMDD10";      
	public static final String CSMDD11= "CSMDD11";
	
	public static final String device_fingerprint= "device_fingerprint";
	
	
	private Map<String, String> data = new HashMap<String, String>();
	
	public void add(String key, String value){
		String aux = (value.length()>254) ? value.substring(0, 253) : value;
		data.put(key, aux);
	}
	
	public String getForPayload() {
		StringBuilder p = new StringBuilder("");
		
		for (Map.Entry<String, String> entry : data.entrySet()) {
			p.append("<");
			p.append(entry.getKey().toUpperCase());
			p.append(">");
			
			p.append(entry.getValue());
			
			p.append("</");
			p.append(entry.getKey().toUpperCase());
			p.append(">");
		}
		return p.toString();
	}
	
	

}

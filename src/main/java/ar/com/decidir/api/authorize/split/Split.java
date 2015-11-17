package ar.com.decidir.api.authorize.split;

import java.util.HashMap;
import java.util.Map;

public abstract class Split {

	protected Map<String, String> data = new HashMap<String, String>();

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

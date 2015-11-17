package ar.com.decidir.api.authorize.extras;

import java.util.HashMap;
import java.util.Map;

public class ComerciosAgregadores {

	public static final String aindicador="aindicador";
	public static final String adocumento="adocumento";
	public static final String afactpagar="afactpagar";
	public static final String afactdevol="afactdevol";
	public static final String anombrecom="anombrecom";
	public static final String adomiciliocomercio="adomiciliocomercio";
	public static final String anropuerta="anropuerta";
	public static final String acodpostal="acodpostal";
	public static final String arubro="arubro";
	public static final String acodcanal="acodcanal";
	public static final String acodgeografico="acodgeografico";


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

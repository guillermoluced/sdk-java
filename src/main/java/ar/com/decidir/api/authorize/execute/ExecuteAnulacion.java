package ar.com.decidir.api.authorize.execute;

public class ExecuteAnulacion extends ExecuteData{
	
	public ExecuteAnulacion(String NROCOMERCIO, String NROOPERACION, String SECURITY){
		data.put("NROCOMERCIO", NROCOMERCIO);
		data.put("NROOPERACION", NROOPERACION);
		Operation = "Anulacion";
		Security = SECURITY;
		Merchant = NROCOMERCIO;
	}
	
}

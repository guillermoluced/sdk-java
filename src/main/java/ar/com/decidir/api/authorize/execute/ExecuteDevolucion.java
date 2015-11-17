package ar.com.decidir.api.authorize.execute;

public class ExecuteDevolucion extends ExecuteData{
	/*Devolucion Total*/
	public ExecuteDevolucion(String NROCOMERCIO, String NROOPERACION, String SECURITY){
		data.put("NROCOMERCIO", NROCOMERCIO);
		data.put("NROOPERACION", NROOPERACION);
		Operation = "Devolucion";
		Security = SECURITY;
		Merchant = NROCOMERCIO;
	}
	/*Devolucion Parcial
	 * */
	public ExecuteDevolucion(String NROCOMERCIO, String NROOPERACION, String MONTO, String SECURITY){
		data.put("NROCOMERCIO", NROCOMERCIO);
		data.put("NROOPERACION", NROOPERACION);
		data.put("MONTO", MONTO);
		Operation = "Devolucion";
		Security = SECURITY;
		Merchant = NROCOMERCIO;
	}
	
}

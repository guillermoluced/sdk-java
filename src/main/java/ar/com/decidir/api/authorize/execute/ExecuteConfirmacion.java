package ar.com.decidir.api.authorize.execute;

public class ExecuteConfirmacion extends ExecuteData{
	
	public ExecuteConfirmacion(String NROCOMERCIO, String NROOPERACION){
		data.put("NROCOMERCIO", NROCOMERCIO);
		data.put("NROOPERACION", NROOPERACION);
		Operation = "Confirmacion";
	}
	
}

package ar.com.decidir.api.authorize.execute;

public class ExecuteBSA extends ExecuteData{
		
	public ExecuteBSA(String NROCOMERCIO, String NROOPERACION, String SECURITY){
		super.Operation = "Compra";
		super.Security = SECURITY;
		super.Merchant = NROCOMERCIO;
	}
	
	
	
	
}

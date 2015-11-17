package ar.com.decidir.api.authorize.medioPago;

public class PagoMisCuentas extends MedioPagoData{

	public PagoMisCuentas(String MEDIODEPAGO, String FECHAVTO) {
		super(MEDIODEPAGO);
		data.put("FECHAVTO", FECHAVTO);
	}
	
	public void setFECHAVTO (String FECHAVTO){
		data.put("FECHAVTO", FECHAVTO);
	}
}

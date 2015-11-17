package ar.com.decidir.api.authorize.medioPago;

public class TarjetaCredito extends MedioPagoData{

	public TarjetaCredito(String MEDIODEPAGO, String CUOTAS) {
		super(MEDIODEPAGO);
		
		data.put("CUOTAS", CUOTAS);
	}
	public TarjetaCredito(String MEDIODEPAGO, String CUOTAS, String BIN) {
		super(MEDIODEPAGO);
		
		data.put("CUOTAS", CUOTAS);
		data.put("BIN", BIN);
	}
	
	
	public void setCUOTAS (String CUOTAS){
		data.put("CUOTAS", CUOTAS);
	}
	public void setBIN (String BIN){
		data.put("BIN", BIN);
	}
}

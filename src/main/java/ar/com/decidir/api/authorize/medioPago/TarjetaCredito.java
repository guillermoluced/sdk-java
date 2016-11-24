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
	public TarjetaCredito(String MEDIODEPAGO, String CUOTAS, String BIN, boolean TOKENIZAR) {
		super(MEDIODEPAGO);

		data.put("CUOTAS", CUOTAS);
		data.put("BIN", BIN);
		data.put("TOKENIZAR", Boolean.toString(TOKENIZAR).toUpperCase());
	}
	public TarjetaCredito(String MEDIODEPAGO, String CUOTAS, boolean TOKENIZAR) {
		super(MEDIODEPAGO);

		data.put("CUOTAS", CUOTAS);
		data.put("TOKENIZAR", Boolean.toString(TOKENIZAR).toUpperCase());
	}

	public void setCUOTAS (String CUOTAS){
		data.put("CUOTAS", CUOTAS);
	}
	public void setBIN (String BIN){
		data.put("BIN", BIN);
	}
	public void setIDPLAN (String IDPLAN){
		data.put("IDPLAN", IDPLAN);
	}
 	public void setTOKENIZAR (boolean TOKENIZAR){
		data.put("TOKENIZAR", Boolean.toString(TOKENIZAR).toUpperCase());
	}
}

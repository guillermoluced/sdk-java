package ar.com.decidir.api.authorize.medioPago;

public class PagoFacil extends MedioPagoData{

	public PagoFacil(String MEDIODEPAGO, String RECARGO, String FECHAVTO, String FECHAVTO2) {
		super(MEDIODEPAGO);
		
		data.put("RECARGO", RECARGO);
		data.put("FECHAVTO", FECHAVTO);
		data.put("FECHAVTO2", FECHAVTO2);
	}
	
	public void setFECHAVTO (String FECHAVTO){
		data.put("FECHAVTO", FECHAVTO);
	}
	public void setFECHAVTO2 (String FECHAVTO2){
		data.put("FECHAVTO", FECHAVTO2);
	}
	public void setRECARGO (String RECARGO){
		data.put("RECARGO", RECARGO);
	}
}

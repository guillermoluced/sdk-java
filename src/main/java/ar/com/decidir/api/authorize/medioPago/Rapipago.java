package ar.com.decidir.api.authorize.medioPago;

public class Rapipago extends MedioPagoData{

	public Rapipago(String MEDIODEPAGO, String CANTDIASFECHAVENC, String CANTDIASPAGO, String RECARGO, String FECHAVTO, String CLIENTE) {
		super(MEDIODEPAGO);
		
		data.put("CANTDIASFECHAVENC", CANTDIASFECHAVENC);
		data.put("CANTDIASPAGO", CANTDIASPAGO);
		data.put("RECARGO", RECARGO);
		data.put("FECHAVTO", FECHAVTO);
		data.put("CLIENTE", CLIENTE);
	}
	
	public void setCANTDIASFECHAVENC (String CANTDIASFECHAVENC){
		data.put("CANTDIASFECHAVENC", CANTDIASFECHAVENC);
	}
	public void setCANTDIASPAGO (String CANTDIASPAGO){
		data.put("CANTDIASPAGO", CANTDIASPAGO);
	}
	public void setRECARGO (String RECARGO){
		data.put("RECARGO", RECARGO);
	}
	public void setFECHAVTO (String FECHAVTO){
		data.put("FECHAVTO", FECHAVTO);
	}
	public void setCLIENTE (String CLIENTE){
		data.put("CLIENTE", CLIENTE);
	}
}

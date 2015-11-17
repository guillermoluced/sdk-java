package ar.com.decidir.api.operation;

public class GetData {

	String IDSITE;
	String IDTRANSACTIONSIT;
	
	public GetData(String IDSITE, String IDTRANSACTIONSIT){
		this.IDSITE = IDSITE;
		this.IDTRANSACTIONSIT = IDTRANSACTIONSIT;
	}
	
	public String getIDSITE() {
		return IDSITE;
	}

	public String getIDTRANSACTIONSIT() {
		return IDTRANSACTIONSIT;
	}

}

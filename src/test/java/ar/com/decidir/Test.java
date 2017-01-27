package ar.com.decidir;

import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.com.decidir.api.Decidir;
import ar.com.decidir.api.authorize.GetAuthorizeAnswerData;
import ar.com.decidir.api.authorize.SendAuthorizeRequestData;
import ar.com.decidir.api.authorize.bsa.BsaData;
import ar.com.decidir.api.authorize.execute.ExecuteAnulacion;
import ar.com.decidir.api.authorize.execute.ExecuteBSA;
import ar.com.decidir.api.authorize.execute.ExecuteData;
import ar.com.decidir.api.authorize.medioPago.MedioPagoData;
import ar.com.decidir.api.authorize.medioPago.TarjetaCredito;
import ar.com.decidir.api.authorize.service.ExecuteResponse;
import ar.com.decidir.api.authorize.service.GetAuthorizeAnswerResponse;
import ar.com.decidir.api.authorize.service.SendAuthorizeRequestResponse;
import ar.com.decidir.api.operation.GetData;
import ar.com.decidir.api.operation.service.DataServiceFault;
import ar.com.decidir.api.operation.service.Operation;
import ar.com.decidir.api.operation.service.Operations;

public class Test {
	//REEMPLAZAR POR EL ANSWER QUE DEVUELVE EL FORMULARIO
	private static final String ANSWER_KEY = "aaaaa-aaaaa-aaaaa-aaaa";

	static Decidir decidir;
	
	static final String MONTO = "4";
	static String CURRENCYCODE = "032";
	static String MERCHANT = "00133317";
	static String ENCODINGMETHOD = "XML";
	static String SECURITY = "JVWQ40SFJVU0K7WN4AH6QNFF";
	static String NRO_OPERACION = "000000";
	static String NUMERO_COMERCIO = "";
	static String EMAIL_CLIENTE = "test@test.com";
	
	public static void main(String[] args){
		
		//Init Decidir
		int endpoint = Decidir.sandbox;//Developer sandbox
		//int endpoint = Decidir.production; //produccion
		decidir = new Decidir(endpoint, getHeaders());
		
		authorizeSample();
		
		operationSample();
		
	}

	//HttpHeaders
	private static Map<String, List<String>> getHeaders() {
		Map<String, List<String>> parameters = new HashMap<String, List<String>>();
		parameters.put("Authorization", Collections.singletonList("PRISMA " +SECURITY));
		//parameters.put("user_agent", Collections.singletonList("PHPSoapClient"));
		//include all aditional Http headers to map, all of them will be used
		return parameters;
	}
		
	private static void authorizeSample() {
		//decidir.initAuthorize("file:"+System.getProperty("user.dir")+"/resources/Authorize.wsdl");

		//SendAuthorizeRequest
		SendAuthorizeRequestResponse sarResponse = decidir.sendAuthorizeRequest(initSendAuthorizeRequestData());
		printSendAuthorizeRequestResponse(sarResponse);


		//GetAuthorizeAnswer
		GetAuthorizeAnswerResponse gaaResponse = decidir.getAuthorizeAnswer(initGetAuthorizeAnswerData("595664a7-3341-78e1-fc66-f7ce90f77c0c"));
		printGetAuthorizeAnswerResponse(gaaResponse);

		//Execute
		ExecuteResponse exResponse = decidir.execute(initExecuteData());
		printExecuteResponse(exResponse);
	}



	private static SendAuthorizeRequestData initSendAuthorizeRequestData() {
		
		SendAuthorizeRequestData sar = new SendAuthorizeRequestData();
		
		sar.setEncodingMethod(ENCODINGMETHOD);
		sar.setMerchant(MERCHANT);
		sar.setSecurity(SECURITY);
		sar.setNumeroOperacion(NRO_OPERACION);
		sar.setMonto(MONTO);
		sar.setUrl_error("http://someurl.com/error/");
		sar.setUrl_ok("http://someurl.com/ok/");
		sar.setEmailCliente(EMAIL_CLIENTE);

		sar.setNumeroComercio(NUMERO_COMERCIO);
		sar.setEmailCliente(EMAIL_CLIENTE);
		
		MedioPagoData medioDePago = new TarjetaCredito("1", "6", true);

		sar.setMedioPago(medioDePago);

		return sar;
	}

	private static void printSendAuthorizeRequestResponse(SendAuthorizeRequestResponse sarResponse) {
		System.out.println("Status Code: " + sarResponse.getStatusCode());
		System.out.println("StatusMessage: " + sarResponse.getStatusMessage().getValue());
		if(sarResponse.getPublicRequestKey()!=null){
			System.out.println("PublicRequestKey: " + sarResponse.getPublicRequestKey().getValue());
		}
		if(sarResponse.getRequestKey()!=null){
			System.out.println("RequestKey: " + sarResponse.getRequestKey().getValue());
		}
		if(sarResponse.getURLRequest()!=null){
			System.out.println("URLRequest: " + sarResponse.getURLRequest().getValue());
		}
	}
	
	
	private static GetAuthorizeAnswerData initGetAuthorizeAnswerData(String requeskKey) {
		GetAuthorizeAnswerData gaa = new GetAuthorizeAnswerData();
		gaa.setMerchant(MERCHANT);
		gaa.setSecurity(SECURITY);
		gaa.setRequestKey(requeskKey);
		
		gaa.setAnswerKey(ANSWER_KEY);
		return gaa;
	}
	private static void printGetAuthorizeAnswerResponse(GetAuthorizeAnswerResponse gaaResponse) {
		System.out.println("Status Code: " + gaaResponse.getStatusCode());
		System.out.println("AuthorizationKey: " + gaaResponse.getAuthorizationKey().getValue());
		System.out.println("EncodingMethod: " + gaaResponse.getEncodingMethod().getValue());
		System.out.println("StatusMessage: " + gaaResponse.getStatusMessage().getValue());
		System.out.println("Payload: ");
		Map<String, Map<String, String>> payload =  decidir.getPayload(gaaResponse.getPayload());
		for (Map.Entry<String, Map<String, String>> ele1 : payload.entrySet()) {
			System.out.println(ele1.getKey() + ": ");
			for(Map.Entry<String, String> value : ele1.getValue().entrySet()){
				System.out.println(" ->"+ value.getKey() + ": " + value.getValue());
			}
		}
	}
	
	private static ExecuteData initExecuteData() {
		
		String op = "test10";		
		ExecuteData ex = new ExecuteBSA(MERCHANT, op, SECURITY);		
		BsaData bsaData = new BsaData();

		//EXECUTE NORMAL
		bsaData.putValue(bsaData.NROCOMERCIO, MERCHANT);
		bsaData.putValue(bsaData.NROOPERACION, op);
		bsaData.putValue(bsaData.MONTO, "10");
		bsaData.putValue(bsaData.CUOTAS, "01");
		bsaData.putValue(bsaData.MONEDA, "032");
		bsaData.putValue(bsaData.MEDIODEPAGO, "1");
		bsaData.putValue(bsaData.EMAILCLIENTE, "pepe@pepe.com");	
		bsaData.putValue(bsaData.NOMBREENTARJETA, "HELP DESK");
		bsaData.putValue(bsaData.NROTARJETA, "4507990000004905");
		bsaData.putValue(bsaData.VENCIMIENTO, "1808");
		bsaData.putValue(bsaData.CODSEGURIDAD, "775");
			
		//CAMPOS EXTRAS BSA
		bsaData.putValue(bsaData.DIRECCION_IP, "127.0.1");
		bsaData.putValue(bsaData.PUBLIC_TOKEN, " ");
		bsaData.putValue(bsaData.ISSUE_DATE, "20160310");
		bsaData.putValue(bsaData.PUBLIC_REQUEST_KEY, " ");
		bsaData.putValue(bsaData.VOLATILE_ENCRYPTED_DATA, " ");
		bsaData.putValue(bsaData.FLAG_TOKENIZACION, " ");		
		bsaData.putValue(bsaData.FLAG_CODIGO_SEGURIDAD, " ");
		bsaData.putValue(bsaData.FLAG_SELECTOR_CLAVE, " ");
		bsaData.putValue(bsaData.FLAG_PEI, "0");
		
		ex.setBsaData(bsaData);
	
		return ex;
	}
	private static void printExecuteResponse(ExecuteResponse exResponse) {
		System.out.println("Status Code: " + exResponse.getStatusCode());
		System.out.println("StatusMessage: " + exResponse.getStatusMessage().getValue());
		System.out.println("AuthorizationKey: " + exResponse.getAuthorizationKey().getValue());
		System.out.println("EncodingMethod: " + exResponse.getEncodingMethod().getValue());
		System.out.println("Payload: ");
		Map<String, Map<String, String>> payload =  decidir.getPayload(exResponse.getPayload());
		for (Map.Entry<String, Map<String, String>> ele1 : payload.entrySet()) {
			System.out.println(ele1.getKey() + ": ");
			for(Map.Entry<String, String> value: ele1.getValue().entrySet()){
				System.out.println(value.getKey() + ": " + value.getValue());
			}
		}		
	}
	
	
	private static void operationSample() {
		try {
								
			Operations ops = decidir.get(initGetData());
			printOperations(ops);
			
		} catch (DataServiceFault e) {
			e.printStackTrace();
		}
	}


	private static GetData initGetData() {
		GetData data = new GetData("00133317", "hd_soap_300716_02");

		return data;
	}


	private static void printOperations(Operations ops) {
		List<Operation> o = ops.getOperation();
		for(int i=0; i<o.size();i++){
			Operation aux = o.get(i);
			System.out.println("CALLE: " + aux.getCALLE());
			System.out.println("CODAUT: " + aux.getCODAUT());
			System.out.println("CUOTAS: " + aux.getCUOTAS());
			System.out.println("ESTADODESCRI: " + aux.getESTADODESCRI());
			System.out.println("FECHAORIGINAL: " + aux.getFECHAORIGINAL());
			System.out.println("FECHAVTOCUOTA1: " + aux.getFECHAVTOCUOTA1());
			System.out.println("IDESTADO: " + aux.getIDESTADO());
			System.out.println("IDMEDIOPAGO: " + aux.getIDMEDIOPAGO());
			System.out.println("IDMOTIVO: " + aux.getIDMOTIVO());
			System.out.println("IDSITE: " + aux.getIDSITE());
			System.out.println("IDTIPODOC :" + aux.getIDTIPODOC());
			System.out.println("IDTRANSACCIONSITE: " + aux.getIDTRANSACCIONSITE());
			System.out.println("MAIL: " + aux.getMAIL());
			System.out.println("MEDIOPAGODESCRI: " + aux.getMEDIOPAGODESCRI());
			System.out.println("MONTO: " + aux.getMONTO());
			System.out.println("MOTIVO: " + aux.getMOTIVO());
			System.out.println("MOTIVOADICIONAL: " + aux.getMOTIVOADICIONAL());
			System.out.println("NRODOC: " + aux.getNRODOC());
			System.out.println("NROPUERTA: " + aux.getNROPUERTA());
			System.out.println("NROTARJ4: " + aux.getNROTARJ4());
			System.out.println("NROTICKET: " + aux.getNROTICKET());
			System.out.println("PARAMSITIO: " + aux.getPARAMSITIO());
			System.out.println("SEXOTITULAR: " + aux.getSEXOTITULAR());
			System.out.println("TIPODOC: " + aux.getTIPODOC());
			System.out.println("TITULAR: " + aux.getTITULAR());
			System.out.println("VALDOM: " + aux.getVALDOM());	
		}
		
	}

}

package ar.com.decidir;

import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.com.decidir.api.Decidir;
import ar.com.decidir.api.authorize.GetAuthorizeAnswerData;
import ar.com.decidir.api.authorize.SendAuthorizeRequestData;
import ar.com.decidir.api.authorize.execute.ExecuteAnulacion;
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

	static Decidir decidir;
	
	static String CURRENCYCODE = "032";
	static String MERCHANT = "22067736";
	static String ENCODINGMETHOD = "XML";
	static String SECURITY = "RV82RVHO5T0O5CZUUTX2FLHU";

	
	
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
		parameters.put("Authorization", Collections.singletonList("PRISMA RV82RVHO5T0O5CZUUTX2FLHU"));
		parameters.put("user_agent", Collections.singletonList("PHPSoapClient"));
		//include all aditional Http headers to map, all of them will be used
		return parameters;
	}
	
	
	
	private static void authorizeSample() {
		try {
			decidir.initAuthorize("file:D:/Authorize.wsdl");
			
			//SendAuthorizeRequest
			SendAuthorizeRequestResponse sarResponse = decidir.sendAuthorizeRequest(initSendAuthorizeRequestData());
			printSendAuthorizeRequestResponse(sarResponse);
			
			//GetAuthorizeAnswer
			GetAuthorizeAnswerResponse gaaResponse = decidir.getAuthorizeAnswer(initGetAuthorizeAnswerData());
			printGetAuthorizeAnswerResponse(gaaResponse);
			
			//Execute
			ExecuteResponse exResponse = decidir.execute(initExecuteData());
			printExecuteResponse(exResponse);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	private static SendAuthorizeRequestData initSendAuthorizeRequestData() {
		
		SendAuthorizeRequestData sar = new SendAuthorizeRequestData();
		
		sar.setEncodingMethod(ENCODINGMETHOD);
		sar.setMerchant(MERCHANT);
		sar.setSecurity(SECURITY);
		sar.setUrl_error("http://someurl.com/error/");
		sar.setUrl_ok("http://someurl.com/ok/");
		
		MedioPagoData medioDePago = new TarjetaCredito("1", "6");
		
		sar.setMedioPago(medioDePago);

		return sar;
	}

	private static void printSendAuthorizeRequestResponse(SendAuthorizeRequestResponse sarResponse) {
		System.out.println("Status Code: " + sarResponse.getStatusCode());
		System.out.println("StatusMessage: " + sarResponse.getStatusMessage());
		System.out.println("PublicRequestKey: " + sarResponse.getPublicRequestKey());
		System.out.println("RequestKey: " + sarResponse.getRequestKey());
		System.out.println("URLRequest: " + sarResponse.getURLRequest());
	}
	
	
	private static GetAuthorizeAnswerData initGetAuthorizeAnswerData() {
		GetAuthorizeAnswerData gaa = new GetAuthorizeAnswerData();
		gaa.setMerchant(MERCHANT);
		gaa.setSecurity(SECURITY);
		gaa.setRequestKey("cdf96aaf-dd1c-195b-eeee-130a3df96110");
		gaa.setAnswerKey("77215fe6-f9d5-f1c2-372b-c0065e0c4429");
		return gaa;
	}
	private static void printGetAuthorizeAnswerResponse(GetAuthorizeAnswerResponse gaaResponse) {
		System.out.println("Status Code: " + gaaResponse.getStatusCode());
		System.out.println("AuthorizationKey: " + gaaResponse.getAuthorizationKey());
		System.out.println("EncodingMethod: " + gaaResponse.getEncodingMethod());
		System.out.println("StatusMessage: " + gaaResponse.getStatusMessage());
		System.out.println("Payload: " + gaaResponse.getPayload());
	}
	
	private static ExecuteData initExecuteData() {
		ExecuteData ex = new ExecuteAnulacion(MERCHANT, "123456", SECURITY);//Anulacion
		//ExecuteData ex = new ExecuteDevolucion(MERCHANT, "123456", "10.00", SECURITY);//Devolucion Parcial
		//ExecuteData ex = new ExecuteDevolucion(MERCHANT, "123456", SECURITY);//Devolucion Total
		
		return ex;
	}
	private static void printExecuteResponse(ExecuteResponse exResponse) {
		System.out.println("Status Code: " + exResponse.getStatusCode());
		System.out.println("StatusMessage: " + exResponse.getStatusMessage());
		System.out.println("AuthorizationKey: " + exResponse.getAuthorizationKey());
		System.out.println("EncodingMethod: " + exResponse.getEncodingMethod());
		System.out.println("Payload: " + exResponse.getPayload());		
	}
	
	
	
	private static void operationSample() {
		try {
			decidir.initOperation("file:D:/Operation.wsdl");
			
			Operations ops = decidir.get(initGetData());
			printOperations(ops);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (DataServiceFault e) {
			e.printStackTrace();
		}
	}


	private static GetData initGetData() {
		GetData data = new GetData(MERCHANT, "123456");
		return data;
	}


	private static void printOperations(Operations ops) {
		List<Operation> o = ops.getOperation();
		for(int i=0; i<o.size();i++){
			Operation aux = o.get(i);
			System.out.println("CALLE" + aux.getCALLE());
			System.out.println("CODAUT" + aux.getCODAUT());
			System.out.println("CUOTAS" + aux.getCUOTAS());
			System.out.println("ESTADODESCRI" + aux.getESTADODESCRI());
			System.out.println("FECHAORIGINAL" + aux.getFECHAORIGINAL());
			System.out.println("FECHAVTOCUOTA1" + aux.getFECHAVTOCUOTA1());
			System.out.println("IDESTADO" + aux.getIDESTADO());
			System.out.println("IDMEDIOPAGO" + aux.getIDMEDIOPAGO());
			System.out.println("IDMOTIVO" + aux.getIDMOTIVO());
			System.out.println("IDSITE" + aux.getIDSITE());
			System.out.println("IDTIPODOC" + aux.getIDTIPODOC());
			System.out.println("IDTRANSACCIONSITE" + aux.getIDTRANSACCIONSITE());
			System.out.println("MAIL" + aux.getMAIL());
			System.out.println("MEDIOPAGODESCRI" + aux.getMEDIOPAGODESCRI());
			System.out.println("MONTO" + aux.getMONTO());
			System.out.println("MOTIVO" + aux.getMOTIVO());
			System.out.println("MOTIVOADICIONAL" + aux.getMOTIVOADICIONAL());
			System.out.println("NRODOC" + aux.getNRODOC());
			System.out.println("NROPUERTA" + aux.getNROPUERTA());
			System.out.println("NROTARJ4" + aux.getNROTARJ4());
			System.out.println("NROTICKET" + aux.getNROTICKET());
			System.out.println("PARAMSITIO" + aux.getPARAMSITIO());
			System.out.println("SEXOTITULAR" + aux.getSEXOTITULAR());
			System.out.println("TIPODOC" + aux.getTIPODOC());
			System.out.println("TITULAR" + aux.getTITULAR());
			System.out.println("VALDOM" + aux.getVALDOM());	
		}
		
	}

}


package ar.com.decidir.api.authorize.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.decidir.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAuthorizeAnswerAnswerKey_QNAME = new QName("http://api.decidir.com.ar", "AnswerKey");
    private final static QName _GetAuthorizeAnswerRequestKey_QNAME = new QName("http://api.decidir.com.ar", "RequestKey");
    private final static QName _GetAuthorizeAnswerSession_QNAME = new QName("http://api.decidir.com.ar", "Session");
    private final static QName _ExecuteResponseAuthorizationKey_QNAME = new QName("http://api.decidir.com.ar", "AuthorizationKey");
    private final static QName _ExecuteResponseStatusMessage_QNAME = new QName("http://api.decidir.com.ar", "StatusMessage");
    private final static QName _ExecuteResponsePayload_QNAME = new QName("http://api.decidir.com.ar", "Payload");
    private final static QName _ExecuteResponseEncodingMethod_QNAME = new QName("http://api.decidir.com.ar", "EncodingMethod");
    private final static QName _SendAuthorizeRequestResponseURLRequest_QNAME = new QName("http://api.decidir.com.ar", "URL_Request");
    private final static QName _SendAuthorizeRequestResponsePublicRequestKey_QNAME = new QName("http://api.decidir.com.ar", "PublicRequestKey");
    private final static QName _SendAuthorizeRequestURLERROR_QNAME = new QName("http://api.decidir.com.ar", "URL_ERROR");
    private final static QName _SendAuthorizeRequestURLOK_QNAME = new QName("http://api.decidir.com.ar", "URL_OK");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.decidir.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     * 
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link SendAuthorizeRequest }
     * 
     */
    public SendAuthorizeRequest createSendAuthorizeRequest() {
        return new SendAuthorizeRequest();
    }

    /**
     * Create an instance of {@link GetAuthorizeAnswerResponse }
     * 
     */
    public GetAuthorizeAnswerResponse createGetAuthorizeAnswerResponse() {
        return new GetAuthorizeAnswerResponse();
    }

    /**
     * Create an instance of {@link Execute }
     * 
     */
    public Execute createExecute() {
        return new Execute();
    }

    /**
     * Create an instance of {@link SendAuthorizeRequestResponse }
     * 
     */
    public SendAuthorizeRequestResponse createSendAuthorizeRequestResponse() {
        return new SendAuthorizeRequestResponse();
    }

    /**
     * Create an instance of {@link GetAuthorizeAnswer }
     * 
     */
    public GetAuthorizeAnswer createGetAuthorizeAnswer() {
        return new GetAuthorizeAnswer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "AnswerKey", scope = GetAuthorizeAnswer.class)
    public JAXBElement<String> createGetAuthorizeAnswerAnswerKey(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerAnswerKey_QNAME, String.class, GetAuthorizeAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "RequestKey", scope = GetAuthorizeAnswer.class)
    public JAXBElement<String> createGetAuthorizeAnswerRequestKey(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerRequestKey_QNAME, String.class, GetAuthorizeAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "Session", scope = GetAuthorizeAnswer.class)
    public JAXBElement<String> createGetAuthorizeAnswerSession(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerSession_QNAME, String.class, GetAuthorizeAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "AuthorizationKey", scope = ExecuteResponse.class)
    public JAXBElement<String> createExecuteResponseAuthorizationKey(String value) {
        return new JAXBElement<String>(_ExecuteResponseAuthorizationKey_QNAME, String.class, ExecuteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "StatusMessage", scope = ExecuteResponse.class)
    public JAXBElement<String> createExecuteResponseStatusMessage(String value) {
        return new JAXBElement<String>(_ExecuteResponseStatusMessage_QNAME, String.class, ExecuteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "Payload", scope = ExecuteResponse.class)
    public JAXBElement<Object> createExecuteResponsePayload(Object value) {
        return new JAXBElement<Object>(_ExecuteResponsePayload_QNAME, Object.class, ExecuteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "EncodingMethod", scope = ExecuteResponse.class)
    public JAXBElement<String> createExecuteResponseEncodingMethod(String value) {
        return new JAXBElement<String>(_ExecuteResponseEncodingMethod_QNAME, String.class, ExecuteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "AuthorizationKey", scope = GetAuthorizeAnswerResponse.class)
    public JAXBElement<String> createGetAuthorizeAnswerResponseAuthorizationKey(String value) {
        return new JAXBElement<String>(_ExecuteResponseAuthorizationKey_QNAME, String.class, GetAuthorizeAnswerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "StatusMessage", scope = GetAuthorizeAnswerResponse.class)
    public JAXBElement<String> createGetAuthorizeAnswerResponseStatusMessage(String value) {
        return new JAXBElement<String>(_ExecuteResponseStatusMessage_QNAME, String.class, GetAuthorizeAnswerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "Payload", scope = GetAuthorizeAnswerResponse.class)
    public JAXBElement<Object> createGetAuthorizeAnswerResponsePayload(Object value) {
        return new JAXBElement<Object>(_ExecuteResponsePayload_QNAME, Object.class, GetAuthorizeAnswerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "EncodingMethod", scope = GetAuthorizeAnswerResponse.class)
    public JAXBElement<String> createGetAuthorizeAnswerResponseEncodingMethod(String value) {
        return new JAXBElement<String>(_ExecuteResponseEncodingMethod_QNAME, String.class, GetAuthorizeAnswerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "RequestKey", scope = SendAuthorizeRequestResponse.class)
    public JAXBElement<String> createSendAuthorizeRequestResponseRequestKey(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerRequestKey_QNAME, String.class, SendAuthorizeRequestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "StatusMessage", scope = SendAuthorizeRequestResponse.class)
    public JAXBElement<String> createSendAuthorizeRequestResponseStatusMessage(String value) {
        return new JAXBElement<String>(_ExecuteResponseStatusMessage_QNAME, String.class, SendAuthorizeRequestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "URL_Request", scope = SendAuthorizeRequestResponse.class)
    public JAXBElement<String> createSendAuthorizeRequestResponseURLRequest(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestResponseURLRequest_QNAME, String.class, SendAuthorizeRequestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "PublicRequestKey", scope = SendAuthorizeRequestResponse.class)
    public JAXBElement<String> createSendAuthorizeRequestResponsePublicRequestKey(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestResponsePublicRequestKey_QNAME, String.class, SendAuthorizeRequestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "Session", scope = SendAuthorizeRequest.class)
    public JAXBElement<String> createSendAuthorizeRequestSession(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerSession_QNAME, String.class, SendAuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "Payload", scope = SendAuthorizeRequest.class)
    public JAXBElement<Object> createSendAuthorizeRequestPayload(Object value) {
        return new JAXBElement<Object>(_ExecuteResponsePayload_QNAME, Object.class, SendAuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "EncodingMethod", scope = SendAuthorizeRequest.class)
    public JAXBElement<String> createSendAuthorizeRequestEncodingMethod(String value) {
        return new JAXBElement<String>(_ExecuteResponseEncodingMethod_QNAME, String.class, SendAuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "URL_ERROR", scope = SendAuthorizeRequest.class)
    public JAXBElement<String> createSendAuthorizeRequestURLERROR(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestURLERROR_QNAME, String.class, SendAuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "URL_OK", scope = SendAuthorizeRequest.class)
    public JAXBElement<String> createSendAuthorizeRequestURLOK(String value) {
        return new JAXBElement<String>(_SendAuthorizeRequestURLOK_QNAME, String.class, SendAuthorizeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "Session", scope = Execute.class)
    public JAXBElement<String> createExecuteSession(String value) {
        return new JAXBElement<String>(_GetAuthorizeAnswerSession_QNAME, String.class, Execute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "Payload", scope = Execute.class)
    public JAXBElement<String> createExecutePayload(String value) {
        return new JAXBElement<String>(_ExecuteResponsePayload_QNAME, String.class, Execute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.decidir.com.ar", name = "EncodingMethod", scope = Execute.class)
    public JAXBElement<String> createExecuteEncodingMethod(String value) {
        return new JAXBElement<String>(_ExecuteResponseEncodingMethod_QNAME, String.class, Execute.class, value);
    }

}

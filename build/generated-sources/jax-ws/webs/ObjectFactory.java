
package webs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webs package. 
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

    private final static QName _LoginResponse_QNAME = new QName("http://webs/", "LoginResponse");
    private final static QName _ProcesoDeposito_QNAME = new QName("http://webs/", "procesoDeposito");
    private final static QName _ProcesoPago_QNAME = new QName("http://webs/", "procesoPago");
    private final static QName _Registrar_QNAME = new QName("http://webs/", "Registrar");
    private final static QName _ProcesoDepositoResponse_QNAME = new QName("http://webs/", "procesoDepositoResponse");
    private final static QName _Login_QNAME = new QName("http://webs/", "Login");
    private final static QName _RegistrarResponse_QNAME = new QName("http://webs/", "RegistrarResponse");
    private final static QName _ObtencionDatos_QNAME = new QName("http://webs/", "obtencionDatos");
    private final static QName _ObtencionDatosResponse_QNAME = new QName("http://webs/", "obtencionDatosResponse");
    private final static QName _ProcesoPagoResponse_QNAME = new QName("http://webs/", "procesoPagoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ProcesoDeposito }
     * 
     */
    public ProcesoDeposito createProcesoDeposito() {
        return new ProcesoDeposito();
    }

    /**
     * Create an instance of {@link ProcesoPago }
     * 
     */
    public ProcesoPago createProcesoPago() {
        return new ProcesoPago();
    }

    /**
     * Create an instance of {@link ProcesoDepositoResponse }
     * 
     */
    public ProcesoDepositoResponse createProcesoDepositoResponse() {
        return new ProcesoDepositoResponse();
    }

    /**
     * Create an instance of {@link Registrar }
     * 
     */
    public Registrar createRegistrar() {
        return new Registrar();
    }

    /**
     * Create an instance of {@link RegistrarResponse }
     * 
     */
    public RegistrarResponse createRegistrarResponse() {
        return new RegistrarResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link ObtencionDatosResponse }
     * 
     */
    public ObtencionDatosResponse createObtencionDatosResponse() {
        return new ObtencionDatosResponse();
    }

    /**
     * Create an instance of {@link ProcesoPagoResponse }
     * 
     */
    public ProcesoPagoResponse createProcesoPagoResponse() {
        return new ProcesoPagoResponse();
    }

    /**
     * Create an instance of {@link ObtencionDatos }
     * 
     */
    public ObtencionDatos createObtencionDatos() {
        return new ObtencionDatos();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webs/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesoDeposito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webs/", name = "procesoDeposito")
    public JAXBElement<ProcesoDeposito> createProcesoDeposito(ProcesoDeposito value) {
        return new JAXBElement<ProcesoDeposito>(_ProcesoDeposito_QNAME, ProcesoDeposito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesoPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webs/", name = "procesoPago")
    public JAXBElement<ProcesoPago> createProcesoPago(ProcesoPago value) {
        return new JAXBElement<ProcesoPago>(_ProcesoPago_QNAME, ProcesoPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webs/", name = "Registrar")
    public JAXBElement<Registrar> createRegistrar(Registrar value) {
        return new JAXBElement<Registrar>(_Registrar_QNAME, Registrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesoDepositoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webs/", name = "procesoDepositoResponse")
    public JAXBElement<ProcesoDepositoResponse> createProcesoDepositoResponse(ProcesoDepositoResponse value) {
        return new JAXBElement<ProcesoDepositoResponse>(_ProcesoDepositoResponse_QNAME, ProcesoDepositoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webs/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webs/", name = "RegistrarResponse")
    public JAXBElement<RegistrarResponse> createRegistrarResponse(RegistrarResponse value) {
        return new JAXBElement<RegistrarResponse>(_RegistrarResponse_QNAME, RegistrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtencionDatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webs/", name = "obtencionDatos")
    public JAXBElement<ObtencionDatos> createObtencionDatos(ObtencionDatos value) {
        return new JAXBElement<ObtencionDatos>(_ObtencionDatos_QNAME, ObtencionDatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtencionDatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webs/", name = "obtencionDatosResponse")
    public JAXBElement<ObtencionDatosResponse> createObtencionDatosResponse(ObtencionDatosResponse value) {
        return new JAXBElement<ObtencionDatosResponse>(_ObtencionDatosResponse_QNAME, ObtencionDatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesoPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webs/", name = "procesoPagoResponse")
    public JAXBElement<ProcesoPagoResponse> createProcesoPagoResponse(ProcesoPagoResponse value) {
        return new JAXBElement<ProcesoPagoResponse>(_ProcesoPagoResponse_QNAME, ProcesoPagoResponse.class, null, value);
    }

}


package puc.pf.portal.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "IServicePortal", targetNamespace = "http://service.portal.pf.puc/", wsdlLocation = "http://192.168.0.106:8080/portal-servicos/IServicePortal?wsdl")
public class IServicePortal
    extends Service
{

    private final static URL ISERVICEPORTAL_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(puc.pf.portal.service.IServicePortal.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = puc.pf.portal.service.IServicePortal.class.getResource(".");
            url = new URL(baseUrl, "http://192.168.0.106:8080/portal-servicos/IServicePortal?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.0.106:8080/portal-servicos/IServicePortal?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ISERVICEPORTAL_WSDL_LOCATION = url;
    }

    public IServicePortal(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServicePortal() {
        super(ISERVICEPORTAL_WSDL_LOCATION, new QName("http://service.portal.pf.puc/", "IServicePortal"));
    }

    /**
     * 
     * @return
     *     returns Iserviceportal
     */
    @WebEndpoint(name = "IServicePortalPort")
    public Iserviceportal getIServicePortalPort() {
        return super.getPort(new QName("http://service.portal.pf.puc/", "IServicePortalPort"), Iserviceportal.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Iserviceportal
     */
    @WebEndpoint(name = "IServicePortalPort")
    public Iserviceportal getIServicePortalPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.portal.pf.puc/", "IServicePortalPort"), Iserviceportal.class, features);
    }

}

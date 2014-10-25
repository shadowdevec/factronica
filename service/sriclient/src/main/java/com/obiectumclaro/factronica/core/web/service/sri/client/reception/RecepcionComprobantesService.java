
package com.obiectumclaro.factronica.core.web.service.sri.client.reception;

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
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "RecepcionComprobantesService", targetNamespace = "http://ec.gob.sri.ws.recepcion", wsdlLocation = "https://celcer.sri.gob.ec/comprobantes-electronicos-ws/RecepcionComprobantes?wsdl")
public class RecepcionComprobantesService
    extends Service
{

    private final static URL RECEPCIONCOMPROBANTESSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(RecepcionComprobantesService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.obiectumclaro.factronica.core.web.service.sri.client.reception.RecepcionComprobantesService.class.getResource(".");
            url = new URL(baseUrl, "https://celcer.sri.gob.ec/comprobantes-electronicos-ws/RecepcionComprobantes?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://celcer.sri.gob.ec/comprobantes-electronicos-ws/RecepcionComprobantes?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        RECEPCIONCOMPROBANTESSERVICE_WSDL_LOCATION = url;
    }

    public RecepcionComprobantesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RecepcionComprobantesService() {
        super(RECEPCIONCOMPROBANTESSERVICE_WSDL_LOCATION, new QName("http://ec.gob.sri.ws.recepcion", "RecepcionComprobantesService"));
    }

    /**
     * 
     * @return
     *     returns RecepcionComprobantes
     */
    @WebEndpoint(name = "RecepcionComprobantesPort")
    public RecepcionComprobantes getRecepcionComprobantesPort() {
        return super.getPort(new QName("http://ec.gob.sri.ws.recepcion", "RecepcionComprobantesPort"), RecepcionComprobantes.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RecepcionComprobantes
     */
    @WebEndpoint(name = "RecepcionComprobantesPort")
    public RecepcionComprobantes getRecepcionComprobantesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ec.gob.sri.ws.recepcion", "RecepcionComprobantesPort"), RecepcionComprobantes.class, features);
    }

}

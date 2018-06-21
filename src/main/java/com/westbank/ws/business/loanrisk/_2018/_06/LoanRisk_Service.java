package com.westbank.ws.business.loanrisk._2018._06;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-22T08:17:28.810+10:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "LoanRisk",
                  targetNamespace = "urn:com:westbank:ws:business:LoanRisk:2018:06")
public class LoanRisk_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:com:westbank:ws:business:LoanRisk:2018:06", "LoanRisk");
    public final static QName LoanRiskPort = new QName("urn:com:westbank:ws:business:LoanRisk:2018:06", "LoanRiskPort");
    static {
        WSDL_LOCATION = null;
    }

    public LoanRisk_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LoanRisk_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoanRisk_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public LoanRisk_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LoanRisk_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LoanRisk_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns LoanRisk
     */
    @WebEndpoint(name = "LoanRiskPort")
    public LoanRisk getLoanRiskPort() {
        return super.getPort(LoanRiskPort, LoanRisk.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoanRisk
     */
    @WebEndpoint(name = "LoanRiskPort")
    public LoanRisk getLoanRiskPort(WebServiceFeature... features) {
        return super.getPort(LoanRiskPort, LoanRisk.class, features);
    }

}

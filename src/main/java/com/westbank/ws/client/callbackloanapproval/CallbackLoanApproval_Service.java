package com.westbank.ws.client.callbackloanapproval;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-25T22:00:16.362+10:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "CallbackLoanApproval",
                  targetNamespace = "urn:com:westbank:ws:client:CallbackLoanApproval")
public class CallbackLoanApproval_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:com:westbank:ws:client:CallbackLoanApproval", "CallbackLoanApproval");
    public final static QName CallbackLoanApprovalPort = new QName("urn:com:westbank:ws:client:CallbackLoanApproval", "CallbackLoanApprovalPort");
    static {
        WSDL_LOCATION = null;
    }

    public CallbackLoanApproval_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CallbackLoanApproval_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CallbackLoanApproval_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CallbackLoanApproval_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CallbackLoanApproval_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CallbackLoanApproval_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CallbackLoanApproval
     */
    @WebEndpoint(name = "CallbackLoanApprovalPort")
    public CallbackLoanApproval getCallbackLoanApprovalPort() {
        return super.getPort(CallbackLoanApprovalPort, CallbackLoanApproval.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CallbackLoanApproval
     */
    @WebEndpoint(name = "CallbackLoanApprovalPort")
    public CallbackLoanApproval getCallbackLoanApprovalPort(WebServiceFeature... features) {
        return super.getPort(CallbackLoanApprovalPort, CallbackLoanApproval.class, features);
    }

}

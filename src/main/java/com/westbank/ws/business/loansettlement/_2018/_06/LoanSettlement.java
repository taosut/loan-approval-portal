package com.westbank.ws.business.loansettlement._2018._06;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-22T08:17:28.636+10:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "urn:com:westbank:ws:business:LoanSettlement:2018:06", name = "LoanSettlement")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LoanSettlement {

    @WebMethod
    @WebResult(name = "LoanSettlementResponse", targetNamespace = "urn:com:westbank:ws:business:LoanSettlement:2018:06", partName = "response")
    public LoanSettlementResponse start(
        @WebParam(partName = "request", name = "LoanSettlementRequest", targetNamespace = "urn:com:westbank:ws:business:LoanSettlement:2018:06")
        LoanSettlementRequest request
    );
}

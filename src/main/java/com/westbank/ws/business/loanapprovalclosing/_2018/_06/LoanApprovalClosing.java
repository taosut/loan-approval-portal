package com.westbank.ws.business.loanapprovalclosing._2018._06;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-22T08:17:29.704+10:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "urn:com:westbank:ws:business:LoanApprovalClosing:2018:06", name = "LoanApprovalClosing")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LoanApprovalClosing {

    @WebMethod
    @WebResult(name = "LoanApprovalClosingResponse", targetNamespace = "urn:com:westbank:ws:business:LoanApprovalClosing:2018:06", partName = "response")
    public LoanApprovalClosingResponse close(
        @WebParam(partName = "request", name = "LoanApprovalClosingRequest", targetNamespace = "urn:com:westbank:ws:business:LoanApprovalClosing:2018:06")
        LoanApprovalClosingRequest request
    );
}

package com.westbank.ws.business.bankinformation._2018._06;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-22T08:17:29.827+10:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "urn:com:westbank:ws:business:BankInformation:2018:06", name = "BankInformation")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface BankInformation {

    @WebMethod
    @WebResult(name = "BankInformationResponse", targetNamespace = "urn:com:westbank:ws:business:BankInformation:2018:06", partName = "response")
    public BankInformationResponse retrieve(
        @WebParam(partName = "request", name = "BankInformationRequest", targetNamespace = "urn:com:westbank:ws:business:BankInformation:2018:06")
        BankInformationRequest request
    );
}

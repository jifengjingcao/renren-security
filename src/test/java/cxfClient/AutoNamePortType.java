package cxfClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-12-13T23:29:15.622+08:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://www.aurora-framework.org/schema", name = "autoName_portType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AutoNamePortType {

    @WebMethod(action = "execute")
    @WebResult(name = "RESPONSE", targetNamespace = "http://www.aurora-framework.org/schema", partName = "response_part")
    public RESPONSE execute(
            @WebParam(partName = "request_part", name = "REQUEST", targetNamespace = "http://www.aurora-framework.org/schema")
                    REQUEST requestPart
    );
}

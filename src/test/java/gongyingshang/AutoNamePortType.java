
package gongyingshang;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "autoName_portType", targetNamespace = "http://www.aurora-framework.org/schema")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AutoNamePortType {


    /**
     * 
     * @param requestPart
     * @return
     *     returns org.aurora_framework.schema.RESPONSE
     */
    @WebMethod(action = "execute")
    @WebResult(name = "RESPONSE", targetNamespace = "http://www.aurora-framework.org/schema", partName = "response_part")
    public RESPONSE execute(
            @WebParam(name = "REQUEST", targetNamespace = "http://www.aurora-framework.org/schema", partName = "request_part")
                    REQUEST requestPart);

}

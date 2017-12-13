package cxfClient;

import xmlRootElement.Boy;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * Created by wzf on 2017/12/13.
 */
public class Main {

/*    public static void main(String[] args) {
        AutoNameService autoNameService = new AutoNameService();
        AutoNamePortType autoNamePortType= autoNameService.getAutoNamePort();

        REQUEST request = new REQUEST();
        request = null;
        RESPONSE response=   autoNamePortType.execute(request);

        System.out.printf("1");
    }*/


    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(REQUEST.class);

        Marshaller marshaller = context.createMarshaller();
        Unmarshaller unmarshaller = context.createUnmarshaller();

        REQUEST request = new REQUEST();
        marshaller.marshal(request, System.out);
        System.out.println();

    /*    String xml = "<boy><name>David</name></boy>";
        REQUEST request1 = (REQUEST) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(request1.parameter);*/
    }
}

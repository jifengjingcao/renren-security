package xunjia;


/**
 * Created by wzf on 2017/12/14.
 */
public class Main {

    public static void main(String[] args) {
        AutoNameService autoNameService = new AutoNameService();
        AutoNamePortType autoNamePortType= autoNameService.getAutoNamePort();

        REQUEST request = new REQUEST();

        REQUEST.HEADER header = new REQUEST.HEADER();
        REQUEST.PARAMETER parameter = new REQUEST.PARAMETER();
        header.setBUSINESSGROUP("BG12682941");
        header.setSYSTEMCODE("BG12682941_SOA");
        header.setREQUESTID("123");
        header.setIFCATECODE("PUR_PO");
        header.setIFCODE("PUR_RFX_RESULT_EXP");
        header.setUSERNAME("37818227");
        header.setPASSWORD("96E79218965EB72C92A549DD5A330112");
        header.setBATCHNUM("1");
        header.setSEGNUM("1");
        header.setTOTALSEGCOUNT("1");

        parameter.setRFXNUMBER("");
        parameter.setCREADATEFROM("");
        parameter.setCREADATETO("");

        request.setHEADER(header);
        request.setPARAMETER(parameter);
        RESPONSE response=   autoNamePortType.execute(request);

        System.out.printf("1");
    }
}

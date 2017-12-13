
package cxfClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HEADER"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SYSTEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="REQUEST_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IF_CATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IF_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="USER_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="BATCH_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SEG_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TOTAL_SEG_COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PARAMETER"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CREA_DATE_FROM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CREA_DATE_TO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "parameter"
})
@XmlRootElement(name = "REQUEST")
public class REQUEST {

    @XmlElement(name = "HEADER", required = true)
    protected HEADER header;
    @XmlElement(name = "PARAMETER", required = true)
    protected PARAMETER parameter;

    /**
     * ��ȡheader���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HEADER }
     *     
     */
    public HEADER getHEADER() {
        return header;
    }

    /**
     * ����header���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HEADER }
     *     
     */
    public void setHEADER(HEADER value) {
        this.header = value;
    }

    /**
     * ��ȡparameter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PARAMETER }
     *     
     */
    public PARAMETER getPARAMETER() {
        return parameter;
    }

    /**
     * ����parameter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETER }
     *     
     */
    public void setPARAMETER(PARAMETER value) {
        this.parameter = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SYSTEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="REQUEST_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IF_CATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IF_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="USER_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="BATCH_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SEG_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TOTAL_SEG_COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "businessgroup",
        "systemcode",
        "requestid",
        "ifcatecode",
        "ifcode",
        "username",
        "password",
        "batchnum",
        "segnum",
        "totalsegcount"
    })
    public static class HEADER {

        @XmlElement(name = "BUSINESS_GROUP", required = true)
        protected String businessgroup;
        @XmlElement(name = "SYSTEM_CODE", required = true)
        protected String systemcode;
        @XmlElement(name = "REQUEST_ID", required = true)
        protected String requestid;
        @XmlElement(name = "IF_CATE_CODE", required = true)
        protected String ifcatecode;
        @XmlElement(name = "IF_CODE", required = true)
        protected String ifcode;
        @XmlElement(name = "USER_NAME", required = true)
        protected String username;
        @XmlElement(name = "PASSWORD", required = true)
        protected String password;
        @XmlElement(name = "BATCH_NUM", required = true)
        protected String batchnum;
        @XmlElement(name = "SEG_NUM", required = true)
        protected String segnum;
        @XmlElement(name = "TOTAL_SEG_COUNT", required = true)
        protected String totalsegcount;

        /**
         * ��ȡbusinessgroup���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBUSINESSGROUP() {
            return businessgroup;
        }

        /**
         * ����businessgroup���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBUSINESSGROUP(String value) {
            this.businessgroup = value;
        }

        /**
         * ��ȡsystemcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSYSTEMCODE() {
            return systemcode;
        }

        /**
         * ����systemcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSYSTEMCODE(String value) {
            this.systemcode = value;
        }

        /**
         * ��ȡrequestid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREQUESTID() {
            return requestid;
        }

        /**
         * ����requestid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREQUESTID(String value) {
            this.requestid = value;
        }

        /**
         * ��ȡifcatecode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIFCATECODE() {
            return ifcatecode;
        }

        /**
         * ����ifcatecode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIFCATECODE(String value) {
            this.ifcatecode = value;
        }

        /**
         * ��ȡifcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIFCODE() {
            return ifcode;
        }

        /**
         * ����ifcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIFCODE(String value) {
            this.ifcode = value;
        }

        /**
         * ��ȡusername���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSERNAME() {
            return username;
        }

        /**
         * ����username���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSERNAME(String value) {
            this.username = value;
        }

        /**
         * ��ȡpassword���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPASSWORD() {
            return password;
        }

        /**
         * ����password���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPASSWORD(String value) {
            this.password = value;
        }

        /**
         * ��ȡbatchnum���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBATCHNUM() {
            return batchnum;
        }

        /**
         * ����batchnum���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBATCHNUM(String value) {
            this.batchnum = value;
        }

        /**
         * ��ȡsegnum���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEGNUM() {
            return segnum;
        }

        /**
         * ����segnum���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEGNUM(String value) {
            this.segnum = value;
        }

        /**
         * ��ȡtotalsegcount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTOTALSEGCOUNT() {
            return totalsegcount;
        }

        /**
         * ����totalsegcount���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTOTALSEGCOUNT(String value) {
            this.totalsegcount = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CREA_DATE_FROM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CREA_DATE_TO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rfxnumber",
        "creadatefrom",
        "creadateto"
    })
    public static class PARAMETER {

        @XmlElement(name = "RFX_NUMBER", required = true)
        protected String rfxnumber;
        @XmlElement(name = "CREA_DATE_FROM", required = true)
        protected String creadatefrom;
        @XmlElement(name = "CREA_DATE_TO", required = true)
        protected String creadateto;

        /**
         * ��ȡrfxnumber���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRFXNUMBER() {
            return rfxnumber;
        }

        /**
         * ����rfxnumber���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRFXNUMBER(String value) {
            this.rfxnumber = value;
        }

        /**
         * ��ȡcreadatefrom���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCREADATEFROM() {
            return creadatefrom;
        }

        /**
         * ����creadatefrom���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCREADATEFROM(String value) {
            this.creadatefrom = value;
        }

        /**
         * ��ȡcreadateto���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCREADATETO() {
            return creadateto;
        }

        /**
         * ����creadateto���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCREADATETO(String value) {
            this.creadateto = value;
        }

    }

}

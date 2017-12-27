
package xunjia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HEADER">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SYSTEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="REQUEST_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IF_CATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IF_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="USER_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BATCH_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SEG_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TOTAL_SEG_COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PARAMETER">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CREA_DATE_FROM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CREA_DATE_TO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the header property.
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
     * Sets the value of the header property.
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
     * Gets the value of the parameter property.
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
     * Sets the value of the parameter property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SYSTEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="REQUEST_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IF_CATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IF_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="USER_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BATCH_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SEG_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TOTAL_SEG_COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
         * Gets the value of the businessgroup property.
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
         * Sets the value of the businessgroup property.
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
         * Gets the value of the systemcode property.
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
         * Sets the value of the systemcode property.
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
         * Gets the value of the requestid property.
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
         * Sets the value of the requestid property.
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
         * Gets the value of the ifcatecode property.
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
         * Sets the value of the ifcatecode property.
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
         * Gets the value of the ifcode property.
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
         * Sets the value of the ifcode property.
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
         * Gets the value of the username property.
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
         * Sets the value of the username property.
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
         * Gets the value of the password property.
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
         * Sets the value of the password property.
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
         * Gets the value of the batchnum property.
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
         * Sets the value of the batchnum property.
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
         * Gets the value of the segnum property.
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
         * Sets the value of the segnum property.
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
         * Gets the value of the totalsegcount property.
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
         * Sets the value of the totalsegcount property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CREA_DATE_FROM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CREA_DATE_TO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
         * Gets the value of the rfxnumber property.
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
         * Sets the value of the rfxnumber property.
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
         * Gets the value of the creadatefrom property.
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
         * Sets the value of the creadatefrom property.
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
         * Gets the value of the creadateto property.
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
         * Sets the value of the creadateto property.
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


package xunjia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="RESPONSE_CONTEXT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PUR_RFX_HEADERS">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="records">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="record">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RFX_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ISSUED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SOURCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RFX_METHOD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PAYMENT_TERM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PUR_RFX_LINES">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="records">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="record">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ITEM_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="UOM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="REQ_LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="REQ_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="INV_ORGANIZATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SUGGESTED_OPERATION" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ITEM_CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PUR_RFX_FB_LINES">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="records">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="record" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="SUGGESTED_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="VENDOR_SITE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PROMISED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="TAX_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="MIN_PURCHASE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="VALID_FB_RETAIL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="COMPANY_FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ALLOTTED_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="TOTEL_PIRCE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SYS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="VENDOR_CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SUGGESTED_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DELIVERY_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="MIN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="NEED_BY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PUR_RFX_QUOTATION">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="records">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="record" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="LADDER_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="LADDER_FROM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RESPONSE_HEADER">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BATCH_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SEG_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TOTAL_SEG_COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RESPONSE_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RESPONSE_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="success" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responsecontext",
    "responseheader"
})
@XmlRootElement(name = "RESPONSE")
public class RESPONSE {

    @XmlElement(name = "RESPONSE_CONTEXT", required = true)
    protected RESPONSECONTEXT responsecontext;
    @XmlElement(name = "RESPONSE_HEADER", required = true)
    protected RESPONSEHEADER responseheader;
    @XmlAttribute(name = "success")
    protected String success;

    /**
     * Gets the value of the responsecontext property.
     * 
     * @return
     *     possible object is
     *     {@link RESPONSECONTEXT }
     *     
     */
    public RESPONSECONTEXT getRESPONSECONTEXT() {
        return responsecontext;
    }

    /**
     * Sets the value of the responsecontext property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPONSECONTEXT }
     *     
     */
    public void setRESPONSECONTEXT(RESPONSECONTEXT value) {
        this.responsecontext = value;
    }

    /**
     * Gets the value of the responseheader property.
     * 
     * @return
     *     possible object is
     *     {@link RESPONSEHEADER }
     *     
     */
    public RESPONSEHEADER getRESPONSEHEADER() {
        return responseheader;
    }

    /**
     * Sets the value of the responseheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPONSEHEADER }
     *     
     */
    public void setRESPONSEHEADER(RESPONSEHEADER value) {
        this.responseheader = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccess(String value) {
        this.success = value;
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
     *         &lt;element name="PUR_RFX_HEADERS">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="records">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="record">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RFX_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ISSUED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SOURCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RFX_METHOD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PAYMENT_TERM" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PUR_RFX_LINES">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="records">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="record">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ITEM_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="UOM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="REQ_LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="REQ_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="INV_ORGANIZATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SUGGESTED_OPERATION" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ITEM_CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PUR_RFX_FB_LINES">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="records">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="record" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="SUGGESTED_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="VENDOR_SITE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PROMISED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="TAX_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="MIN_PURCHASE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="VALID_FB_RETAIL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="COMPANY_FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ALLOTTED_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="TOTEL_PIRCE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SYS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="VENDOR_CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SUGGESTED_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DELIVERY_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="MIN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="NEED_BY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PUR_RFX_QUOTATION">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="records">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="record" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="LADDER_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="LADDER_FROM" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "purrfxheaders",
        "purrfxlines",
        "purrfxfblines",
        "purrfxquotation"
    })
    public static class RESPONSECONTEXT {

        @XmlElement(name = "PUR_RFX_HEADERS", required = true)
        protected PURRFXHEADERS purrfxheaders;
        @XmlElement(name = "PUR_RFX_LINES", required = true)
        protected PURRFXLINES purrfxlines;
        @XmlElement(name = "PUR_RFX_FB_LINES", required = true)
        protected PURRFXFBLINES purrfxfblines;
        @XmlElement(name = "PUR_RFX_QUOTATION", required = true)
        protected PURRFXQUOTATION purrfxquotation;

        /**
         * Gets the value of the purrfxheaders property.
         * 
         * @return
         *     possible object is
         *     {@link PURRFXHEADERS }
         *     
         */
        public PURRFXHEADERS getPURRFXHEADERS() {
            return purrfxheaders;
        }

        /**
         * Sets the value of the purrfxheaders property.
         * 
         * @param value
         *     allowed object is
         *     {@link PURRFXHEADERS }
         *     
         */
        public void setPURRFXHEADERS(PURRFXHEADERS value) {
            this.purrfxheaders = value;
        }

        /**
         * Gets the value of the purrfxlines property.
         * 
         * @return
         *     possible object is
         *     {@link PURRFXLINES }
         *     
         */
        public PURRFXLINES getPURRFXLINES() {
            return purrfxlines;
        }

        /**
         * Sets the value of the purrfxlines property.
         * 
         * @param value
         *     allowed object is
         *     {@link PURRFXLINES }
         *     
         */
        public void setPURRFXLINES(PURRFXLINES value) {
            this.purrfxlines = value;
        }

        /**
         * Gets the value of the purrfxfblines property.
         * 
         * @return
         *     possible object is
         *     {@link PURRFXFBLINES }
         *     
         */
        public PURRFXFBLINES getPURRFXFBLINES() {
            return purrfxfblines;
        }

        /**
         * Sets the value of the purrfxfblines property.
         * 
         * @param value
         *     allowed object is
         *     {@link PURRFXFBLINES }
         *     
         */
        public void setPURRFXFBLINES(PURRFXFBLINES value) {
            this.purrfxfblines = value;
        }

        /**
         * Gets the value of the purrfxquotation property.
         * 
         * @return
         *     possible object is
         *     {@link PURRFXQUOTATION }
         *     
         */
        public PURRFXQUOTATION getPURRFXQUOTATION() {
            return purrfxquotation;
        }

        /**
         * Sets the value of the purrfxquotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PURRFXQUOTATION }
         *     
         */
        public void setPURRFXQUOTATION(PURRFXQUOTATION value) {
            this.purrfxquotation = value;
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
         *         &lt;element name="records">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="record" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="SUGGESTED_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="VENDOR_SITE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PROMISED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="TAX_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="MIN_PURCHASE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="VALID_FB_RETAIL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="COMPANY_FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ALLOTTED_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="TOTEL_PIRCE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SYS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="VENDOR_CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SUGGESTED_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DELIVERY_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="MIN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="NEED_BY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            "records"
        })
        public static class PURRFXFBLINES {

            @XmlElement(required = true)
            protected Records records;

            /**
             * Gets the value of the records property.
             * 
             * @return
             *     possible object is
             *     {@link Records }
             *     
             */
            public Records getRecords() {
                return records;
            }

            /**
             * Sets the value of the records property.
             * 
             * @param value
             *     allowed object is
             *     {@link Records }
             *     
             */
            public void setRecords(Records value) {
                this.records = value;
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
             *         &lt;element name="record" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="SUGGESTED_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="VENDOR_SITE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PROMISED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TAX_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="MIN_PURCHASE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="VALID_FB_RETAIL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="COMPANY_FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ALLOTTED_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TOTEL_PIRCE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SYS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="VENDOR_CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SUGGESTED_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DELIVERY_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="MIN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="NEED_BY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "record"
            })
            public static class Records {

                @XmlElement(required = true)
                protected List<Record> record;

                /**
                 * Gets the value of the record property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the record property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRecord().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Record }
                 * 
                 * 
                 */
                public List<Record> getRecord() {
                    if (record == null) {
                        record = new ArrayList<Record>();
                    }
                    return this.record;
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
                 *       &lt;attribute name="SUGGESTED_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="VENDOR_SITE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PROMISED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TAX_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="MIN_PURCHASE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="VALID_FB_RETAIL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="COMPANY_FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ALLOTTED_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TOTEL_PIRCE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SYS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="VENDOR_CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SUGGESTED_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DELIVERY_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="MIN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="NEED_BY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Record {

                    @XmlAttribute(name = "SUGGESTED_FLAG")
                    protected String suggestedflag;
                    @XmlAttribute(name = "VENDOR_SITE_CODE")
                    protected String vendorsitecode;
                    @XmlAttribute(name = "PROMISED_DATE")
                    protected String promiseddate;
                    @XmlAttribute(name = "RFX_FEEDBACK_LINE_ID")
                    protected String rfxfeedbacklineid;
                    @XmlAttribute(name = "TAX_TYPE_CODE")
                    protected String taxtypecode;
                    @XmlAttribute(name = "MIN_PURCHASE")
                    protected String minpurchase;
                    @XmlAttribute(name = "VALID_FB_RETAIL_PRICE")
                    protected String validfbretailprice;
                    @XmlAttribute(name = "COMPANY_FULL_NAME")
                    protected String companyfullname;
                    @XmlAttribute(name = "ALLOTTED_QUANTITY")
                    protected String allottedquantity;
                    @XmlAttribute(name = "TOTEL_PIRCE")
                    protected String totelpirce;
                    @XmlAttribute(name = "RFX_LINE_ID")
                    protected String rfxlineid;
                    @XmlAttribute(name = "SYS_DESC")
                    protected String sysdesc;
                    @XmlAttribute(name = "VENDOR_CONTACT_ID")
                    protected String vendorcontactid;
                    @XmlAttribute(name = "SUGGESTED_NOTE")
                    protected String suggestednote;
                    @XmlAttribute(name = "DELIVERY_CYCLE")
                    protected String deliverycycle;
                    @XmlAttribute(name = "MIN_PACKAGE")
                    protected String minpackage;
                    @XmlAttribute(name = "NEED_BY_DATE")
                    protected String needbydate;
                    @XmlAttribute(name = "VENDOR_CODE")
                    protected String vendorcode;

                    /**
                     * Gets the value of the suggestedflag property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSUGGESTEDFLAG() {
                        return suggestedflag;
                    }

                    /**
                     * Sets the value of the suggestedflag property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSUGGESTEDFLAG(String value) {
                        this.suggestedflag = value;
                    }

                    /**
                     * Gets the value of the vendorsitecode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVENDORSITECODE() {
                        return vendorsitecode;
                    }

                    /**
                     * Sets the value of the vendorsitecode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVENDORSITECODE(String value) {
                        this.vendorsitecode = value;
                    }

                    /**
                     * Gets the value of the promiseddate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPROMISEDDATE() {
                        return promiseddate;
                    }

                    /**
                     * Sets the value of the promiseddate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPROMISEDDATE(String value) {
                        this.promiseddate = value;
                    }

                    /**
                     * Gets the value of the rfxfeedbacklineid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRFXFEEDBACKLINEID() {
                        return rfxfeedbacklineid;
                    }

                    /**
                     * Sets the value of the rfxfeedbacklineid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRFXFEEDBACKLINEID(String value) {
                        this.rfxfeedbacklineid = value;
                    }

                    /**
                     * Gets the value of the taxtypecode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTAXTYPECODE() {
                        return taxtypecode;
                    }

                    /**
                     * Sets the value of the taxtypecode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTAXTYPECODE(String value) {
                        this.taxtypecode = value;
                    }

                    /**
                     * Gets the value of the minpurchase property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMINPURCHASE() {
                        return minpurchase;
                    }

                    /**
                     * Sets the value of the minpurchase property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMINPURCHASE(String value) {
                        this.minpurchase = value;
                    }

                    /**
                     * Gets the value of the validfbretailprice property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVALIDFBRETAILPRICE() {
                        return validfbretailprice;
                    }

                    /**
                     * Sets the value of the validfbretailprice property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVALIDFBRETAILPRICE(String value) {
                        this.validfbretailprice = value;
                    }

                    /**
                     * Gets the value of the companyfullname property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCOMPANYFULLNAME() {
                        return companyfullname;
                    }

                    /**
                     * Sets the value of the companyfullname property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCOMPANYFULLNAME(String value) {
                        this.companyfullname = value;
                    }

                    /**
                     * Gets the value of the allottedquantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getALLOTTEDQUANTITY() {
                        return allottedquantity;
                    }

                    /**
                     * Sets the value of the allottedquantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setALLOTTEDQUANTITY(String value) {
                        this.allottedquantity = value;
                    }

                    /**
                     * Gets the value of the totelpirce property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTOTELPIRCE() {
                        return totelpirce;
                    }

                    /**
                     * Sets the value of the totelpirce property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTOTELPIRCE(String value) {
                        this.totelpirce = value;
                    }

                    /**
                     * Gets the value of the rfxlineid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRFXLINEID() {
                        return rfxlineid;
                    }

                    /**
                     * Sets the value of the rfxlineid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRFXLINEID(String value) {
                        this.rfxlineid = value;
                    }

                    /**
                     * Gets the value of the sysdesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSYSDESC() {
                        return sysdesc;
                    }

                    /**
                     * Sets the value of the sysdesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSYSDESC(String value) {
                        this.sysdesc = value;
                    }

                    /**
                     * Gets the value of the vendorcontactid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVENDORCONTACTID() {
                        return vendorcontactid;
                    }

                    /**
                     * Sets the value of the vendorcontactid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVENDORCONTACTID(String value) {
                        this.vendorcontactid = value;
                    }

                    /**
                     * Gets the value of the suggestednote property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSUGGESTEDNOTE() {
                        return suggestednote;
                    }

                    /**
                     * Sets the value of the suggestednote property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSUGGESTEDNOTE(String value) {
                        this.suggestednote = value;
                    }

                    /**
                     * Gets the value of the deliverycycle property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDELIVERYCYCLE() {
                        return deliverycycle;
                    }

                    /**
                     * Sets the value of the deliverycycle property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDELIVERYCYCLE(String value) {
                        this.deliverycycle = value;
                    }

                    /**
                     * Gets the value of the minpackage property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMINPACKAGE() {
                        return minpackage;
                    }

                    /**
                     * Sets the value of the minpackage property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMINPACKAGE(String value) {
                        this.minpackage = value;
                    }

                    /**
                     * Gets the value of the needbydate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNEEDBYDATE() {
                        return needbydate;
                    }

                    /**
                     * Sets the value of the needbydate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNEEDBYDATE(String value) {
                        this.needbydate = value;
                    }

                    /**
                     * Gets the value of the vendorcode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVENDORCODE() {
                        return vendorcode;
                    }

                    /**
                     * Sets the value of the vendorcode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVENDORCODE(String value) {
                        this.vendorcode = value;
                    }

                }

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
         *         &lt;element name="records">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="record">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RFX_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ISSUED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SOURCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RFX_METHOD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PAYMENT_TERM" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            "records"
        })
        public static class PURRFXHEADERS {

            @XmlElement(required = true)
            protected Records records;

            /**
             * Gets the value of the records property.
             * 
             * @return
             *     possible object is
             *     {@link Records }
             *     
             */
            public Records getRecords() {
                return records;
            }

            /**
             * Sets the value of the records property.
             * 
             * @param value
             *     allowed object is
             *     {@link Records }
             *     
             */
            public void setRecords(Records value) {
                this.records = value;
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
             *         &lt;element name="record">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RFX_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ISSUED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SOURCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RFX_METHOD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PAYMENT_TERM" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "record"
            })
            public static class Records {

                @XmlElement(required = true)
                protected Record record;

                /**
                 * Gets the value of the record property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Record }
                 *     
                 */
                public Record getRecord() {
                    return record;
                }

                /**
                 * Sets the value of the record property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Record }
                 *     
                 */
                public void setRecord(Record value) {
                    this.record = value;
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
                 *       &lt;attribute name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RFX_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ISSUED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SOURCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RFX_METHOD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PAYMENT_TERM" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Record {

                    @XmlAttribute(name = "RFX_NUMBER")
                    protected String rfxnumber;
                    @XmlAttribute(name = "RFX_HEADER_ID")
                    protected String rfxheaderid;
                    @XmlAttribute(name = "COMMENTS")
                    protected String comments;
                    @XmlAttribute(name = "STATUS")
                    protected String status;
                    @XmlAttribute(name = "RFX_METHOD")
                    protected String rfxmethod;
                    @XmlAttribute(name = "ISSUED_DATE")
                    protected String issueddate;
                    @XmlAttribute(name = "SOURCE_TYPE")
                    protected String sourcetype;
                    @XmlAttribute(name = "RFX_METHOD_DESC")
                    protected String rfxmethoddesc;
                    @XmlAttribute(name = "PAYMENT_TERM")
                    protected String paymentterm;

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
                     * Gets the value of the rfxheaderid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRFXHEADERID() {
                        return rfxheaderid;
                    }

                    /**
                     * Sets the value of the rfxheaderid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRFXHEADERID(String value) {
                        this.rfxheaderid = value;
                    }

                    /**
                     * Gets the value of the comments property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCOMMENTS() {
                        return comments;
                    }

                    /**
                     * Sets the value of the comments property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCOMMENTS(String value) {
                        this.comments = value;
                    }

                    /**
                     * Gets the value of the status property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSTATUS() {
                        return status;
                    }

                    /**
                     * Sets the value of the status property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSTATUS(String value) {
                        this.status = value;
                    }

                    /**
                     * Gets the value of the rfxmethod property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRFXMETHOD() {
                        return rfxmethod;
                    }

                    /**
                     * Sets the value of the rfxmethod property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRFXMETHOD(String value) {
                        this.rfxmethod = value;
                    }

                    /**
                     * Gets the value of the issueddate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getISSUEDDATE() {
                        return issueddate;
                    }

                    /**
                     * Sets the value of the issueddate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setISSUEDDATE(String value) {
                        this.issueddate = value;
                    }

                    /**
                     * Gets the value of the sourcetype property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSOURCETYPE() {
                        return sourcetype;
                    }

                    /**
                     * Sets the value of the sourcetype property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSOURCETYPE(String value) {
                        this.sourcetype = value;
                    }

                    /**
                     * Gets the value of the rfxmethoddesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRFXMETHODDESC() {
                        return rfxmethoddesc;
                    }

                    /**
                     * Sets the value of the rfxmethoddesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRFXMETHODDESC(String value) {
                        this.rfxmethoddesc = value;
                    }

                    /**
                     * Gets the value of the paymentterm property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPAYMENTTERM() {
                        return paymentterm;
                    }

                    /**
                     * Sets the value of the paymentterm property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPAYMENTTERM(String value) {
                        this.paymentterm = value;
                    }

                }

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
         *         &lt;element name="records">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="record">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ITEM_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="UOM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="REQ_LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="REQ_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="INV_ORGANIZATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SUGGESTED_OPERATION" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ITEM_CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            "records"
        })
        public static class PURRFXLINES {

            @XmlElement(required = true)
            protected Records records;

            /**
             * Gets the value of the records property.
             * 
             * @return
             *     possible object is
             *     {@link Records }
             *     
             */
            public Records getRecords() {
                return records;
            }

            /**
             * Sets the value of the records property.
             * 
             * @param value
             *     allowed object is
             *     {@link Records }
             *     
             */
            public void setRecords(Records value) {
                this.records = value;
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
             *         &lt;element name="record">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ITEM_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="UOM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="REQ_LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="REQ_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="INV_ORGANIZATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SUGGESTED_OPERATION" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ITEM_CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "record"
            })
            public static class Records {

                @XmlElement(required = true)
                protected Record record;

                /**
                 * Gets the value of the record property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Record }
                 *     
                 */
                public Record getRecord() {
                    return record;
                }

                /**
                 * Sets the value of the record property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Record }
                 *     
                 */
                public void setRecord(Record value) {
                    this.record = value;
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
                 *       &lt;attribute name="ITEM_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="UOM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="REQ_LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="REQ_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="INV_ORGANIZATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SUGGESTED_OPERATION" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ITEM_CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Record {

                    @XmlAttribute(name = "ITEM_DESC")
                    protected String itemdesc;
                    @XmlAttribute(name = "RFX_HEADER_ID")
                    protected String rfxheaderid;
                    @XmlAttribute(name = "UOM_CODE")
                    protected String uomcode;
                    @XmlAttribute(name = "LINE_NUM")
                    protected String linenum;
                    @XmlAttribute(name = "REQ_LINE_NUM")
                    protected String reqlinenum;
                    @XmlAttribute(name = "RFX_LINE_ID")
                    protected String rfxlineid;
                    @XmlAttribute(name = "REQ_NUMBER")
                    protected String reqnumber;
                    @XmlAttribute(name = "INV_ORGANIZATION_CODE")
                    protected String invorganizationcode;
                    @XmlAttribute(name = "ITEM_CODE")
                    protected String itemcode;
                    @XmlAttribute(name = "SUGGESTED_OPERATION")
                    protected String suggestedoperation;
                    @XmlAttribute(name = "ITEM_CATEGORY_CODE")
                    protected String itemcategorycode;
                    @XmlAttribute(name = "QUANTITY")
                    protected String quantity;

                    /**
                     * Gets the value of the itemdesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getITEMDESC() {
                        return itemdesc;
                    }

                    /**
                     * Sets the value of the itemdesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setITEMDESC(String value) {
                        this.itemdesc = value;
                    }

                    /**
                     * Gets the value of the rfxheaderid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRFXHEADERID() {
                        return rfxheaderid;
                    }

                    /**
                     * Sets the value of the rfxheaderid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRFXHEADERID(String value) {
                        this.rfxheaderid = value;
                    }

                    /**
                     * Gets the value of the uomcode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUOMCODE() {
                        return uomcode;
                    }

                    /**
                     * Sets the value of the uomcode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUOMCODE(String value) {
                        this.uomcode = value;
                    }

                    /**
                     * Gets the value of the linenum property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLINENUM() {
                        return linenum;
                    }

                    /**
                     * Sets the value of the linenum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLINENUM(String value) {
                        this.linenum = value;
                    }

                    /**
                     * Gets the value of the reqlinenum property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getREQLINENUM() {
                        return reqlinenum;
                    }

                    /**
                     * Sets the value of the reqlinenum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setREQLINENUM(String value) {
                        this.reqlinenum = value;
                    }

                    /**
                     * Gets the value of the rfxlineid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRFXLINEID() {
                        return rfxlineid;
                    }

                    /**
                     * Sets the value of the rfxlineid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRFXLINEID(String value) {
                        this.rfxlineid = value;
                    }

                    /**
                     * Gets the value of the reqnumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getREQNUMBER() {
                        return reqnumber;
                    }

                    /**
                     * Sets the value of the reqnumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setREQNUMBER(String value) {
                        this.reqnumber = value;
                    }

                    /**
                     * Gets the value of the invorganizationcode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getINVORGANIZATIONCODE() {
                        return invorganizationcode;
                    }

                    /**
                     * Sets the value of the invorganizationcode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setINVORGANIZATIONCODE(String value) {
                        this.invorganizationcode = value;
                    }

                    /**
                     * Gets the value of the itemcode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getITEMCODE() {
                        return itemcode;
                    }

                    /**
                     * Sets the value of the itemcode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setITEMCODE(String value) {
                        this.itemcode = value;
                    }

                    /**
                     * Gets the value of the suggestedoperation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSUGGESTEDOPERATION() {
                        return suggestedoperation;
                    }

                    /**
                     * Sets the value of the suggestedoperation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSUGGESTEDOPERATION(String value) {
                        this.suggestedoperation = value;
                    }

                    /**
                     * Gets the value of the itemcategorycode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getITEMCATEGORYCODE() {
                        return itemcategorycode;
                    }

                    /**
                     * Sets the value of the itemcategorycode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setITEMCATEGORYCODE(String value) {
                        this.itemcategorycode = value;
                    }

                    /**
                     * Gets the value of the quantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQUANTITY() {
                        return quantity;
                    }

                    /**
                     * Sets the value of the quantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQUANTITY(String value) {
                        this.quantity = value;
                    }

                }

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
         *         &lt;element name="records">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="record" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="LADDER_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="LADDER_FROM" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            "records"
        })
        public static class PURRFXQUOTATION {

            @XmlElement(required = true)
            protected Records records;

            /**
             * Gets the value of the records property.
             * 
             * @return
             *     possible object is
             *     {@link Records }
             *     
             */
            public Records getRecords() {
                return records;
            }

            /**
             * Sets the value of the records property.
             * 
             * @param value
             *     allowed object is
             *     {@link Records }
             *     
             */
            public void setRecords(Records value) {
                this.records = value;
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
             *         &lt;element name="record" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="LADDER_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="LADDER_FROM" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "record"
            })
            public static class Records {

                @XmlElement(required = true)
                protected List<Record> record;

                /**
                 * Gets the value of the record property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the record property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRecord().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Record }
                 * 
                 * 
                 */
                public List<Record> getRecord() {
                    if (record == null) {
                        record = new ArrayList<Record>();
                    }
                    return this.record;
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
                 *       &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="LADDER_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="LADDER_FROM" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Record {

                    @XmlAttribute(name = "RFX_FEEDBACK_LINE_ID")
                    protected String rfxfeedbacklineid;
                    @XmlAttribute(name = "LADDER_PRICE")
                    protected String ladderprice;
                    @XmlAttribute(name = "LADDER_FROM")
                    protected String ladderfrom;

                    /**
                     * Gets the value of the rfxfeedbacklineid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRFXFEEDBACKLINEID() {
                        return rfxfeedbacklineid;
                    }

                    /**
                     * Sets the value of the rfxfeedbacklineid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRFXFEEDBACKLINEID(String value) {
                        this.rfxfeedbacklineid = value;
                    }

                    /**
                     * Gets the value of the ladderprice property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLADDERPRICE() {
                        return ladderprice;
                    }

                    /**
                     * Sets the value of the ladderprice property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLADDERPRICE(String value) {
                        this.ladderprice = value;
                    }

                    /**
                     * Gets the value of the ladderfrom property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLADDERFROM() {
                        return ladderfrom;
                    }

                    /**
                     * Sets the value of the ladderfrom property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLADDERFROM(String value) {
                        this.ladderfrom = value;
                    }

                }

            }

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
     *         &lt;element name="BATCH_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SEG_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TOTAL_SEG_COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RESPONSE_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RESPONSE_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "batchnum",
        "segnum",
        "totalsegcount",
        "responsestatus",
        "responsemessage"
    })
    public static class RESPONSEHEADER {

        @XmlElement(name = "BATCH_NUM", required = true)
        protected String batchnum;
        @XmlElement(name = "SEG_NUM", required = true)
        protected String segnum;
        @XmlElement(name = "TOTAL_SEG_COUNT", required = true)
        protected String totalsegcount;
        @XmlElement(name = "RESPONSE_STATUS", required = true)
        protected String responsestatus;
        @XmlElement(name = "RESPONSE_MESSAGE", required = true)
        protected String responsemessage;

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

        /**
         * Gets the value of the responsestatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRESPONSESTATUS() {
            return responsestatus;
        }

        /**
         * Sets the value of the responsestatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRESPONSESTATUS(String value) {
            this.responsestatus = value;
        }

        /**
         * Gets the value of the responsemessage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRESPONSEMESSAGE() {
            return responsemessage;
        }

        /**
         * Sets the value of the responsemessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRESPONSEMESSAGE(String value) {
            this.responsemessage = value;
        }

    }

}

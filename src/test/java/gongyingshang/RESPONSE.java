
package gongyingshang;

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
 *                   &lt;element name="PUR_QUALIFIED_VENDOR_LINES">
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
 *                                               &lt;attribute name="QUALIFIED_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PARENT_ELEMENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="QUALIFIED_LNS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE13" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ELEMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE14" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ELEMENT_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE11" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE12" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PARENT_ELEMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE10" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ELEMENT_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PARENT_ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="LAST_UPDATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="LEAF_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE9" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE8" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="LAST_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE7" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE6" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE20" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE19" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ELEMENT_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="EITF_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE16" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE15" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE18" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE17" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="EITF_INSTANCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                   &lt;element name="PUR_QUALIFIED_VENDOR_ABILITIES">
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
 *                                               &lt;attribute name="SPA_FINISH_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CATEGORY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CREATED_BY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PSA_EVALUATION_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SPA_EVALUATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="VENDOR_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ABILITY_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PSA_EVALUATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ABILITY_LNS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ABILITY_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DISPLAY_VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DEFINE_COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SUPPLY_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="BUSINESS_UNIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="APPROVE_COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SPA_EVALUATION_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PSA_FINISH_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="APPROVE_COMMENT_3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CATEGORY_UDF_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="EITF_ABILITY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SUPPLY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SUPPLY_STATUS_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="LAST_UPDATED_BY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="EITF_INSTANCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                   &lt;element name="PUR_QUALIFIED_VENDOR_HEADERS">
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
 *                                               &lt;attribute name="QUALIFIED_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="APPLY_REASON_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CREATED_BY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ELEMENT_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DATA_SOURCE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DATA_SOURCE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="LAST_UPDATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="COOPER_COMPANY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DATA_SOURCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SUBMIT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="COOPER_BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DELETE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CREATED_BY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="QUALIFIED_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SUBMIT_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="QUALIFIED_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DATA_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="OWNER_BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="FINAL_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="COMMENTS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="QUALIFIED_STATUS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SUBMIT_BY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE13" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE14" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE11" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE12" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="APPLY_REASON_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE10" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="VENDOR_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="COOPER_COMPANY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="COMMENTS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DELETE_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="BUSINESS_UNIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="VENDOR_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="FINAL_LEVEL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE9" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE8" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE7" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="LAST_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE6" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE20" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="FINAL_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE19" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="COOPER_COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE16" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE15" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE18" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ATTRIBUTE17" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="OWNER_COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *         &lt;element name="PUR_QUALIFIED_VENDOR_LINES">
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
     *                                     &lt;attribute name="QUALIFIED_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PARENT_ELEMENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="QUALIFIED_LNS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE13" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ELEMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE14" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ELEMENT_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE11" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE12" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PARENT_ELEMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE10" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ELEMENT_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PARENT_ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="LAST_UPDATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="LEAF_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE9" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE8" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="LAST_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE7" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE6" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE20" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE19" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ELEMENT_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="EITF_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE16" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE15" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE18" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE17" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="EITF_INSTANCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *         &lt;element name="PUR_QUALIFIED_VENDOR_ABILITIES">
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
     *                                     &lt;attribute name="SPA_FINISH_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CATEGORY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CREATED_BY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PSA_EVALUATION_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SPA_EVALUATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="VENDOR_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ABILITY_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PSA_EVALUATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ABILITY_LNS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ABILITY_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DISPLAY_VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DEFINE_COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SUPPLY_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="BUSINESS_UNIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="APPROVE_COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SPA_EVALUATION_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PSA_FINISH_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="APPROVE_COMMENT_3" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CATEGORY_UDF_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="EITF_ABILITY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SUPPLY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SUPPLY_STATUS_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="LAST_UPDATED_BY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="EITF_INSTANCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *         &lt;element name="PUR_QUALIFIED_VENDOR_HEADERS">
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
     *                                     &lt;attribute name="QUALIFIED_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="APPLY_REASON_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CREATED_BY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ELEMENT_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DATA_SOURCE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DATA_SOURCE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="LAST_UPDATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="COOPER_COMPANY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DATA_SOURCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SUBMIT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="COOPER_BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DELETE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CREATED_BY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="QUALIFIED_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SUBMIT_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="QUALIFIED_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DATA_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="OWNER_BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="FINAL_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="COMMENTS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="QUALIFIED_STATUS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SUBMIT_BY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE13" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE14" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE11" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE12" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="APPLY_REASON_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE10" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="VENDOR_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="COOPER_COMPANY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="COMMENTS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DELETE_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="BUSINESS_UNIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="VENDOR_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="FINAL_LEVEL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE9" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE8" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE7" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="LAST_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE6" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE20" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="FINAL_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE19" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="COOPER_COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE16" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE15" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE18" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ATTRIBUTE17" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="OWNER_COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "purqualifiedvendorlines",
        "purqualifiedvendorabilities",
        "purqualifiedvendorheaders"
    })
    public static class RESPONSECONTEXT {

        @XmlElement(name = "PUR_QUALIFIED_VENDOR_LINES", required = true)
        protected PURQUALIFIEDVENDORLINES purqualifiedvendorlines;
        @XmlElement(name = "PUR_QUALIFIED_VENDOR_ABILITIES", required = true)
        protected PURQUALIFIEDVENDORABILITIES purqualifiedvendorabilities;
        @XmlElement(name = "PUR_QUALIFIED_VENDOR_HEADERS", required = true)
        protected PURQUALIFIEDVENDORHEADERS purqualifiedvendorheaders;

        /**
         * Gets the value of the purqualifiedvendorlines property.
         * 
         * @return
         *     possible object is
         *     {@link PURQUALIFIEDVENDORLINES }
         *     
         */
        public PURQUALIFIEDVENDORLINES getPURQUALIFIEDVENDORLINES() {
            return purqualifiedvendorlines;
        }

        /**
         * Sets the value of the purqualifiedvendorlines property.
         * 
         * @param value
         *     allowed object is
         *     {@link PURQUALIFIEDVENDORLINES }
         *     
         */
        public void setPURQUALIFIEDVENDORLINES(PURQUALIFIEDVENDORLINES value) {
            this.purqualifiedvendorlines = value;
        }

        /**
         * Gets the value of the purqualifiedvendorabilities property.
         * 
         * @return
         *     possible object is
         *     {@link PURQUALIFIEDVENDORABILITIES }
         *     
         */
        public PURQUALIFIEDVENDORABILITIES getPURQUALIFIEDVENDORABILITIES() {
            return purqualifiedvendorabilities;
        }

        /**
         * Sets the value of the purqualifiedvendorabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link PURQUALIFIEDVENDORABILITIES }
         *     
         */
        public void setPURQUALIFIEDVENDORABILITIES(PURQUALIFIEDVENDORABILITIES value) {
            this.purqualifiedvendorabilities = value;
        }

        /**
         * Gets the value of the purqualifiedvendorheaders property.
         * 
         * @return
         *     possible object is
         *     {@link PURQUALIFIEDVENDORHEADERS }
         *     
         */
        public PURQUALIFIEDVENDORHEADERS getPURQUALIFIEDVENDORHEADERS() {
            return purqualifiedvendorheaders;
        }

        /**
         * Sets the value of the purqualifiedvendorheaders property.
         * 
         * @param value
         *     allowed object is
         *     {@link PURQUALIFIEDVENDORHEADERS }
         *     
         */
        public void setPURQUALIFIEDVENDORHEADERS(PURQUALIFIEDVENDORHEADERS value) {
            this.purqualifiedvendorheaders = value;
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
         *                           &lt;attribute name="SPA_FINISH_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CATEGORY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CREATED_BY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PSA_EVALUATION_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SPA_EVALUATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="VENDOR_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ABILITY_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PSA_EVALUATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ABILITY_LNS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ABILITY_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DISPLAY_VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DEFINE_COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SUPPLY_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="BUSINESS_UNIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="APPROVE_COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SPA_EVALUATION_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PSA_FINISH_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="APPROVE_COMMENT_3" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CATEGORY_UDF_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="EITF_ABILITY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SUPPLY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SUPPLY_STATUS_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="LAST_UPDATED_BY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="EITF_INSTANCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class PURQUALIFIEDVENDORABILITIES {

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
             *                 &lt;attribute name="SPA_FINISH_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CATEGORY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CREATED_BY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PSA_EVALUATION_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SPA_EVALUATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="VENDOR_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ABILITY_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PSA_EVALUATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ABILITY_LNS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ABILITY_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DISPLAY_VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DEFINE_COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SUPPLY_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="BUSINESS_UNIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="APPROVE_COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SPA_EVALUATION_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PSA_FINISH_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="APPROVE_COMMENT_3" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CATEGORY_UDF_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="EITF_ABILITY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SUPPLY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SUPPLY_STATUS_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="LAST_UPDATED_BY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="EITF_INSTANCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                 *       &lt;attribute name="SPA_FINISH_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CATEGORY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CREATED_BY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PSA_EVALUATION_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SPA_EVALUATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="VENDOR_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ABILITY_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PSA_EVALUATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ABILITY_LNS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ABILITY_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DISPLAY_VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DEFINE_COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SUPPLY_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="BUSINESS_UNIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="APPROVE_COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SPA_EVALUATION_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PSA_FINISH_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="APPROVE_COMMENT_3" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CATEGORY_UDF_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="EITF_ABILITY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SUPPLY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SUPPLY_STATUS_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="LAST_UPDATED_BY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="EITF_INSTANCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                    @XmlAttribute(name = "SPA_FINISH_DATE")
                    protected String spafinishdate;
                    @XmlAttribute(name = "CATEGORY_NAME")
                    protected String categoryname;
                    @XmlAttribute(name = "CREATED_BY_NAME")
                    protected String createdbyname;
                    @XmlAttribute(name = "PSA_EVALUATION_SCORE")
                    protected String psaevaluationscore;
                    @XmlAttribute(name = "EITF_HEADER_ID")
                    protected String eitfheaderid;
                    @XmlAttribute(name = "SPA_EVALUATION_LEVEL")
                    protected String spaevaluationlevel;
                    @XmlAttribute(name = "VENDOR_ID")
                    protected String vendorid;
                    @XmlAttribute(name = "ABILITY_HDS_CODE")
                    protected String abilityhdscode;
                    @XmlAttribute(name = "PSA_EVALUATION_LEVEL")
                    protected String psaevaluationlevel;
                    @XmlAttribute(name = "ABILITY_LNS_ID")
                    protected String abilitylnsid;
                    @XmlAttribute(name = "ABILITY_HDS_ID")
                    protected String abilityhdsid;
                    @XmlAttribute(name = "DISPLAY_VENDOR_CODE")
                    protected String displayvendorcode;
                    @XmlAttribute(name = "DEFINE_COMMENT")
                    protected String definecomment;
                    @XmlAttribute(name = "SUPPLY_FLAG")
                    protected String supplyflag;
                    @XmlAttribute(name = "BUSINESS_UNIT_ID")
                    protected String businessunitid;
                    @XmlAttribute(name = "FULL_NAME")
                    protected String fullname;
                    @XmlAttribute(name = "COMPANY_ID")
                    protected String companyid;
                    @XmlAttribute(name = "COMMENTS")
                    protected String comments;
                    @XmlAttribute(name = "APPROVE_COMMENT")
                    protected String approvecomment;
                    @XmlAttribute(name = "SPA_EVALUATION_SCORE")
                    protected String spaevaluationscore;
                    @XmlAttribute(name = "BUSINESS_GROUP")
                    protected String businessgroup;
                    @XmlAttribute(name = "PSA_FINISH_DATE")
                    protected String psafinishdate;
                    @XmlAttribute(name = "APPROVE_COMMENT_3")
                    protected String approvecomment3;
                    @XmlAttribute(name = "CATEGORY_CODE")
                    protected String categorycode;
                    @XmlAttribute(name = "CATEGORY_UDF_ID")
                    protected String categoryudfid;
                    @XmlAttribute(name = "EITF_ABILITY_ID")
                    protected String eitfabilityid;
                    @XmlAttribute(name = "SUPPLY_STATUS")
                    protected String supplystatus;
                    @XmlAttribute(name = "SUPPLY_STATUS_DISPLAY")
                    protected String supplystatusdisplay;
                    @XmlAttribute(name = "LAST_UPDATED_BY_NAME")
                    protected String lastupdatedbyname;
                    @XmlAttribute(name = "EITF_INSTANCE_ID")
                    protected String eitfinstanceid;

                    /**
                     * Gets the value of the spafinishdate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPAFINISHDATE() {
                        return spafinishdate;
                    }

                    /**
                     * Sets the value of the spafinishdate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPAFINISHDATE(String value) {
                        this.spafinishdate = value;
                    }

                    /**
                     * Gets the value of the categoryname property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCATEGORYNAME() {
                        return categoryname;
                    }

                    /**
                     * Sets the value of the categoryname property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCATEGORYNAME(String value) {
                        this.categoryname = value;
                    }

                    /**
                     * Gets the value of the createdbyname property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCREATEDBYNAME() {
                        return createdbyname;
                    }

                    /**
                     * Sets the value of the createdbyname property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCREATEDBYNAME(String value) {
                        this.createdbyname = value;
                    }

                    /**
                     * Gets the value of the psaevaluationscore property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPSAEVALUATIONSCORE() {
                        return psaevaluationscore;
                    }

                    /**
                     * Sets the value of the psaevaluationscore property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPSAEVALUATIONSCORE(String value) {
                        this.psaevaluationscore = value;
                    }

                    /**
                     * Gets the value of the eitfheaderid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEITFHEADERID() {
                        return eitfheaderid;
                    }

                    /**
                     * Sets the value of the eitfheaderid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEITFHEADERID(String value) {
                        this.eitfheaderid = value;
                    }

                    /**
                     * Gets the value of the spaevaluationlevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPAEVALUATIONLEVEL() {
                        return spaevaluationlevel;
                    }

                    /**
                     * Sets the value of the spaevaluationlevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPAEVALUATIONLEVEL(String value) {
                        this.spaevaluationlevel = value;
                    }

                    /**
                     * Gets the value of the vendorid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVENDORID() {
                        return vendorid;
                    }

                    /**
                     * Sets the value of the vendorid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVENDORID(String value) {
                        this.vendorid = value;
                    }

                    /**
                     * Gets the value of the abilityhdscode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getABILITYHDSCODE() {
                        return abilityhdscode;
                    }

                    /**
                     * Sets the value of the abilityhdscode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setABILITYHDSCODE(String value) {
                        this.abilityhdscode = value;
                    }

                    /**
                     * Gets the value of the psaevaluationlevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPSAEVALUATIONLEVEL() {
                        return psaevaluationlevel;
                    }

                    /**
                     * Sets the value of the psaevaluationlevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPSAEVALUATIONLEVEL(String value) {
                        this.psaevaluationlevel = value;
                    }

                    /**
                     * Gets the value of the abilitylnsid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getABILITYLNSID() {
                        return abilitylnsid;
                    }

                    /**
                     * Sets the value of the abilitylnsid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setABILITYLNSID(String value) {
                        this.abilitylnsid = value;
                    }

                    /**
                     * Gets the value of the abilityhdsid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getABILITYHDSID() {
                        return abilityhdsid;
                    }

                    /**
                     * Sets the value of the abilityhdsid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setABILITYHDSID(String value) {
                        this.abilityhdsid = value;
                    }

                    /**
                     * Gets the value of the displayvendorcode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDISPLAYVENDORCODE() {
                        return displayvendorcode;
                    }

                    /**
                     * Sets the value of the displayvendorcode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDISPLAYVENDORCODE(String value) {
                        this.displayvendorcode = value;
                    }

                    /**
                     * Gets the value of the definecomment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDEFINECOMMENT() {
                        return definecomment;
                    }

                    /**
                     * Sets the value of the definecomment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDEFINECOMMENT(String value) {
                        this.definecomment = value;
                    }

                    /**
                     * Gets the value of the supplyflag property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSUPPLYFLAG() {
                        return supplyflag;
                    }

                    /**
                     * Sets the value of the supplyflag property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSUPPLYFLAG(String value) {
                        this.supplyflag = value;
                    }

                    /**
                     * Gets the value of the businessunitid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBUSINESSUNITID() {
                        return businessunitid;
                    }

                    /**
                     * Sets the value of the businessunitid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBUSINESSUNITID(String value) {
                        this.businessunitid = value;
                    }

                    /**
                     * Gets the value of the fullname property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFULLNAME() {
                        return fullname;
                    }

                    /**
                     * Sets the value of the fullname property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFULLNAME(String value) {
                        this.fullname = value;
                    }

                    /**
                     * Gets the value of the companyid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCOMPANYID() {
                        return companyid;
                    }

                    /**
                     * Sets the value of the companyid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCOMPANYID(String value) {
                        this.companyid = value;
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
                     * Gets the value of the approvecomment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAPPROVECOMMENT() {
                        return approvecomment;
                    }

                    /**
                     * Sets the value of the approvecomment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAPPROVECOMMENT(String value) {
                        this.approvecomment = value;
                    }

                    /**
                     * Gets the value of the spaevaluationscore property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPAEVALUATIONSCORE() {
                        return spaevaluationscore;
                    }

                    /**
                     * Sets the value of the spaevaluationscore property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPAEVALUATIONSCORE(String value) {
                        this.spaevaluationscore = value;
                    }

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
                     * Gets the value of the psafinishdate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPSAFINISHDATE() {
                        return psafinishdate;
                    }

                    /**
                     * Sets the value of the psafinishdate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPSAFINISHDATE(String value) {
                        this.psafinishdate = value;
                    }

                    /**
                     * Gets the value of the approvecomment3 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAPPROVECOMMENT3() {
                        return approvecomment3;
                    }

                    /**
                     * Sets the value of the approvecomment3 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAPPROVECOMMENT3(String value) {
                        this.approvecomment3 = value;
                    }

                    /**
                     * Gets the value of the categorycode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCATEGORYCODE() {
                        return categorycode;
                    }

                    /**
                     * Sets the value of the categorycode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCATEGORYCODE(String value) {
                        this.categorycode = value;
                    }

                    /**
                     * Gets the value of the categoryudfid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCATEGORYUDFID() {
                        return categoryudfid;
                    }

                    /**
                     * Sets the value of the categoryudfid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCATEGORYUDFID(String value) {
                        this.categoryudfid = value;
                    }

                    /**
                     * Gets the value of the eitfabilityid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEITFABILITYID() {
                        return eitfabilityid;
                    }

                    /**
                     * Sets the value of the eitfabilityid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEITFABILITYID(String value) {
                        this.eitfabilityid = value;
                    }

                    /**
                     * Gets the value of the supplystatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSUPPLYSTATUS() {
                        return supplystatus;
                    }

                    /**
                     * Sets the value of the supplystatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSUPPLYSTATUS(String value) {
                        this.supplystatus = value;
                    }

                    /**
                     * Gets the value of the supplystatusdisplay property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSUPPLYSTATUSDISPLAY() {
                        return supplystatusdisplay;
                    }

                    /**
                     * Sets the value of the supplystatusdisplay property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSUPPLYSTATUSDISPLAY(String value) {
                        this.supplystatusdisplay = value;
                    }

                    /**
                     * Gets the value of the lastupdatedbyname property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLASTUPDATEDBYNAME() {
                        return lastupdatedbyname;
                    }

                    /**
                     * Sets the value of the lastupdatedbyname property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLASTUPDATEDBYNAME(String value) {
                        this.lastupdatedbyname = value;
                    }

                    /**
                     * Gets the value of the eitfinstanceid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEITFINSTANCEID() {
                        return eitfinstanceid;
                    }

                    /**
                     * Sets the value of the eitfinstanceid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEITFINSTANCEID(String value) {
                        this.eitfinstanceid = value;
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
         *                           &lt;attribute name="QUALIFIED_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="APPLY_REASON_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CREATED_BY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ELEMENT_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DATA_SOURCE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DATA_SOURCE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="LAST_UPDATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="COOPER_COMPANY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DATA_SOURCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SUBMIT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="COOPER_BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DELETE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CREATED_BY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="QUALIFIED_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SUBMIT_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="QUALIFIED_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DATA_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="OWNER_BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="FINAL_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="COMMENTS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="QUALIFIED_STATUS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SUBMIT_BY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE13" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE14" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE11" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE12" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="APPLY_REASON_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE10" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="VENDOR_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="COOPER_COMPANY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="COMMENTS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DELETE_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="BUSINESS_UNIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="VENDOR_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="FINAL_LEVEL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE9" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE8" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE7" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="LAST_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE6" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE20" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="FINAL_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE19" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="COOPER_COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE16" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE15" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE18" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE17" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="OWNER_COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class PURQUALIFIEDVENDORHEADERS {

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
             *                 &lt;attribute name="QUALIFIED_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="APPLY_REASON_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CREATED_BY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ELEMENT_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DATA_SOURCE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DATA_SOURCE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="LAST_UPDATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="COOPER_COMPANY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DATA_SOURCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SUBMIT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="COOPER_BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DELETE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CREATED_BY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="QUALIFIED_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SUBMIT_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="QUALIFIED_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DATA_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="OWNER_BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="FINAL_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="COMMENTS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="QUALIFIED_STATUS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SUBMIT_BY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE13" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE14" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE11" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE12" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="APPLY_REASON_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE10" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="VENDOR_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="COOPER_COMPANY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="COMMENTS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DELETE_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="BUSINESS_UNIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="VENDOR_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="FINAL_LEVEL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE9" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE8" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE7" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="LAST_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE6" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE20" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="FINAL_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE19" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="COOPER_COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE16" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE15" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE18" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE17" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="OWNER_COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                 *       &lt;attribute name="QUALIFIED_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="APPLY_REASON_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CREATED_BY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ELEMENT_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DATA_SOURCE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DATA_SOURCE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="LAST_UPDATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="COOPER_COMPANY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DATA_SOURCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SUBMIT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="COOPER_BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DELETE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CREATED_BY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="QUALIFIED_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SUBMIT_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="QUALIFIED_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DATA_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="OWNER_BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="FINAL_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="COMMENTS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="QUALIFIED_STATUS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SUBMIT_BY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE13" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE14" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE11" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE12" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="APPLY_REASON_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE10" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="VENDOR_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="COOPER_COMPANY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="COMMENTS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DELETE_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="BUSINESS_UNIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="VENDOR_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="FINAL_LEVEL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE9" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE8" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE7" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="LAST_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE6" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE20" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="FINAL_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE19" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="COOPER_COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE16" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE15" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE18" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE17" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="OWNER_COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                    @XmlAttribute(name = "QUALIFIED_HDS_ID")
                    protected String qualifiedhdsid;
                    @XmlAttribute(name = "APPLY_REASON_ID")
                    protected String applyreasonid;
                    @XmlAttribute(name = "CREATED_BY_DESC")
                    protected String createdbydesc;
                    @XmlAttribute(name = "ELEMENT_HDS_ID")
                    protected String elementhdsid;
                    @XmlAttribute(name = "DATA_SOURCE_NAME")
                    protected String datasourcename;
                    @XmlAttribute(name = "DATA_SOURCE_CODE")
                    protected String datasourcecode;
                    @XmlAttribute(name = "LAST_UPDATED_BY")
                    protected String lastupdatedby;
                    @XmlAttribute(name = "COOPER_COMPANY_CODE")
                    protected String coopercompanycode;
                    @XmlAttribute(name = "DATA_SOURCE_ID")
                    protected String datasourceid;
                    @XmlAttribute(name = "SUBMIT_DATE")
                    protected String submitdate;
                    @XmlAttribute(name = "COOPER_BUSINESS_GROUP")
                    protected String cooperbusinessgroup;
                    @XmlAttribute(name = "DELETE_DATE")
                    protected String deletedate;
                    @XmlAttribute(name = "CREATED_BY_CODE")
                    protected String createdbycode;
                    @XmlAttribute(name = "QUALIFIED_HDS_CODE")
                    protected String qualifiedhdscode;
                    @XmlAttribute(name = "SUBMIT_BY")
                    protected String submitby;
                    @XmlAttribute(name = "QUALIFIED_STATUS")
                    protected String qualifiedstatus;
                    @XmlAttribute(name = "DATA_SOURCE")
                    protected String datasource;
                    @XmlAttribute(name = "VENDOR_CODE")
                    protected String vendorcode;
                    @XmlAttribute(name = "OWNER_BUSINESS_GROUP")
                    protected String ownerbusinessgroup;
                    @XmlAttribute(name = "FINAL_SCORE")
                    protected String finalscore;
                    @XmlAttribute(name = "COMMENTS_DESC")
                    protected String commentsdesc;
                    @XmlAttribute(name = "QUALIFIED_STATUS_DESC")
                    protected String qualifiedstatusdesc;
                    @XmlAttribute(name = "SUBMIT_BY_DESC")
                    protected String submitbydesc;
                    @XmlAttribute(name = "ATTRIBUTE13")
                    protected String attribute13;
                    @XmlAttribute(name = "ATTRIBUTE14")
                    protected String attribute14;
                    @XmlAttribute(name = "ATTRIBUTE11")
                    protected String attribute11;
                    @XmlAttribute(name = "ATTRIBUTE12")
                    protected String attribute12;
                    @XmlAttribute(name = "APPLY_REASON_DESC")
                    protected String applyreasondesc;
                    @XmlAttribute(name = "ATTRIBUTE10")
                    protected String attribute10;
                    @XmlAttribute(name = "EITF_HEADER_ID")
                    protected String eitfheaderid;
                    @XmlAttribute(name = "VENDOR_ID")
                    protected String vendorid;
                    @XmlAttribute(name = "CREATED_BY")
                    protected String createdby;
                    @XmlAttribute(name = "COOPER_COMPANY_DESC")
                    protected String coopercompanydesc;
                    @XmlAttribute(name = "COMMENTS_ID")
                    protected String commentsid;
                    @XmlAttribute(name = "DELETE_BY")
                    protected String deleteby;
                    @XmlAttribute(name = "ATTRIBUTE3")
                    protected String attribute3;
                    @XmlAttribute(name = "ATTRIBUTE2")
                    protected String attribute2;
                    @XmlAttribute(name = "ATTRIBUTE1")
                    protected String attribute1;
                    @XmlAttribute(name = "BUSINESS_UNIT_ID")
                    protected String businessunitid;
                    @XmlAttribute(name = "VENDOR_DESC")
                    protected String vendordesc;
                    @XmlAttribute(name = "FINAL_LEVEL_DESC")
                    protected String finalleveldesc;
                    @XmlAttribute(name = "ATTRIBUTE9")
                    protected String attribute9;
                    @XmlAttribute(name = "ATTRIBUTE8")
                    protected String attribute8;
                    @XmlAttribute(name = "ATTRIBUTE7")
                    protected String attribute7;
                    @XmlAttribute(name = "CREATION_DATE")
                    protected String creationdate;
                    @XmlAttribute(name = "LAST_UPDATE_DATE")
                    protected String lastupdatedate;
                    @XmlAttribute(name = "ATTRIBUTE6")
                    protected String attribute6;
                    @XmlAttribute(name = "ATTRIBUTE20")
                    protected String attribute20;
                    @XmlAttribute(name = "ATTRIBUTE5")
                    protected String attribute5;
                    @XmlAttribute(name = "FINAL_LEVEL")
                    protected String finallevel;
                    @XmlAttribute(name = "ATTRIBUTE4")
                    protected String attribute4;
                    @XmlAttribute(name = "ATTRIBUTE19")
                    protected String attribute19;
                    @XmlAttribute(name = "COOPER_COMPANY_ID")
                    protected String coopercompanyid;
                    @XmlAttribute(name = "ATTRIBUTE16")
                    protected String attribute16;
                    @XmlAttribute(name = "ATTRIBUTE15")
                    protected String attribute15;
                    @XmlAttribute(name = "ATTRIBUTE18")
                    protected String attribute18;
                    @XmlAttribute(name = "ATTRIBUTE17")
                    protected String attribute17;
                    @XmlAttribute(name = "OWNER_COMPANY_ID")
                    protected String ownercompanyid;

                    /**
                     * Gets the value of the qualifiedhdsid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQUALIFIEDHDSID() {
                        return qualifiedhdsid;
                    }

                    /**
                     * Sets the value of the qualifiedhdsid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQUALIFIEDHDSID(String value) {
                        this.qualifiedhdsid = value;
                    }

                    /**
                     * Gets the value of the applyreasonid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAPPLYREASONID() {
                        return applyreasonid;
                    }

                    /**
                     * Sets the value of the applyreasonid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAPPLYREASONID(String value) {
                        this.applyreasonid = value;
                    }

                    /**
                     * Gets the value of the createdbydesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCREATEDBYDESC() {
                        return createdbydesc;
                    }

                    /**
                     * Sets the value of the createdbydesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCREATEDBYDESC(String value) {
                        this.createdbydesc = value;
                    }

                    /**
                     * Gets the value of the elementhdsid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getELEMENTHDSID() {
                        return elementhdsid;
                    }

                    /**
                     * Sets the value of the elementhdsid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setELEMENTHDSID(String value) {
                        this.elementhdsid = value;
                    }

                    /**
                     * Gets the value of the datasourcename property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDATASOURCENAME() {
                        return datasourcename;
                    }

                    /**
                     * Sets the value of the datasourcename property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDATASOURCENAME(String value) {
                        this.datasourcename = value;
                    }

                    /**
                     * Gets the value of the datasourcecode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDATASOURCECODE() {
                        return datasourcecode;
                    }

                    /**
                     * Sets the value of the datasourcecode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDATASOURCECODE(String value) {
                        this.datasourcecode = value;
                    }

                    /**
                     * Gets the value of the lastupdatedby property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLASTUPDATEDBY() {
                        return lastupdatedby;
                    }

                    /**
                     * Sets the value of the lastupdatedby property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLASTUPDATEDBY(String value) {
                        this.lastupdatedby = value;
                    }

                    /**
                     * Gets the value of the coopercompanycode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCOOPERCOMPANYCODE() {
                        return coopercompanycode;
                    }

                    /**
                     * Sets the value of the coopercompanycode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCOOPERCOMPANYCODE(String value) {
                        this.coopercompanycode = value;
                    }

                    /**
                     * Gets the value of the datasourceid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDATASOURCEID() {
                        return datasourceid;
                    }

                    /**
                     * Sets the value of the datasourceid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDATASOURCEID(String value) {
                        this.datasourceid = value;
                    }

                    /**
                     * Gets the value of the submitdate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSUBMITDATE() {
                        return submitdate;
                    }

                    /**
                     * Sets the value of the submitdate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSUBMITDATE(String value) {
                        this.submitdate = value;
                    }

                    /**
                     * Gets the value of the cooperbusinessgroup property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCOOPERBUSINESSGROUP() {
                        return cooperbusinessgroup;
                    }

                    /**
                     * Sets the value of the cooperbusinessgroup property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCOOPERBUSINESSGROUP(String value) {
                        this.cooperbusinessgroup = value;
                    }

                    /**
                     * Gets the value of the deletedate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDELETEDATE() {
                        return deletedate;
                    }

                    /**
                     * Sets the value of the deletedate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDELETEDATE(String value) {
                        this.deletedate = value;
                    }

                    /**
                     * Gets the value of the createdbycode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCREATEDBYCODE() {
                        return createdbycode;
                    }

                    /**
                     * Sets the value of the createdbycode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCREATEDBYCODE(String value) {
                        this.createdbycode = value;
                    }

                    /**
                     * Gets the value of the qualifiedhdscode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQUALIFIEDHDSCODE() {
                        return qualifiedhdscode;
                    }

                    /**
                     * Sets the value of the qualifiedhdscode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQUALIFIEDHDSCODE(String value) {
                        this.qualifiedhdscode = value;
                    }

                    /**
                     * Gets the value of the submitby property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSUBMITBY() {
                        return submitby;
                    }

                    /**
                     * Sets the value of the submitby property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSUBMITBY(String value) {
                        this.submitby = value;
                    }

                    /**
                     * Gets the value of the qualifiedstatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQUALIFIEDSTATUS() {
                        return qualifiedstatus;
                    }

                    /**
                     * Sets the value of the qualifiedstatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQUALIFIEDSTATUS(String value) {
                        this.qualifiedstatus = value;
                    }

                    /**
                     * Gets the value of the datasource property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDATASOURCE() {
                        return datasource;
                    }

                    /**
                     * Sets the value of the datasource property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDATASOURCE(String value) {
                        this.datasource = value;
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

                    /**
                     * Gets the value of the ownerbusinessgroup property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOWNERBUSINESSGROUP() {
                        return ownerbusinessgroup;
                    }

                    /**
                     * Sets the value of the ownerbusinessgroup property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOWNERBUSINESSGROUP(String value) {
                        this.ownerbusinessgroup = value;
                    }

                    /**
                     * Gets the value of the finalscore property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFINALSCORE() {
                        return finalscore;
                    }

                    /**
                     * Sets the value of the finalscore property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFINALSCORE(String value) {
                        this.finalscore = value;
                    }

                    /**
                     * Gets the value of the commentsdesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCOMMENTSDESC() {
                        return commentsdesc;
                    }

                    /**
                     * Sets the value of the commentsdesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCOMMENTSDESC(String value) {
                        this.commentsdesc = value;
                    }

                    /**
                     * Gets the value of the qualifiedstatusdesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQUALIFIEDSTATUSDESC() {
                        return qualifiedstatusdesc;
                    }

                    /**
                     * Sets the value of the qualifiedstatusdesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQUALIFIEDSTATUSDESC(String value) {
                        this.qualifiedstatusdesc = value;
                    }

                    /**
                     * Gets the value of the submitbydesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSUBMITBYDESC() {
                        return submitbydesc;
                    }

                    /**
                     * Sets the value of the submitbydesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSUBMITBYDESC(String value) {
                        this.submitbydesc = value;
                    }

                    /**
                     * Gets the value of the attribute13 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE13() {
                        return attribute13;
                    }

                    /**
                     * Sets the value of the attribute13 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE13(String value) {
                        this.attribute13 = value;
                    }

                    /**
                     * Gets the value of the attribute14 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE14() {
                        return attribute14;
                    }

                    /**
                     * Sets the value of the attribute14 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE14(String value) {
                        this.attribute14 = value;
                    }

                    /**
                     * Gets the value of the attribute11 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE11() {
                        return attribute11;
                    }

                    /**
                     * Sets the value of the attribute11 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE11(String value) {
                        this.attribute11 = value;
                    }

                    /**
                     * Gets the value of the attribute12 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE12() {
                        return attribute12;
                    }

                    /**
                     * Sets the value of the attribute12 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE12(String value) {
                        this.attribute12 = value;
                    }

                    /**
                     * Gets the value of the applyreasondesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAPPLYREASONDESC() {
                        return applyreasondesc;
                    }

                    /**
                     * Sets the value of the applyreasondesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAPPLYREASONDESC(String value) {
                        this.applyreasondesc = value;
                    }

                    /**
                     * Gets the value of the attribute10 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE10() {
                        return attribute10;
                    }

                    /**
                     * Sets the value of the attribute10 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE10(String value) {
                        this.attribute10 = value;
                    }

                    /**
                     * Gets the value of the eitfheaderid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEITFHEADERID() {
                        return eitfheaderid;
                    }

                    /**
                     * Sets the value of the eitfheaderid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEITFHEADERID(String value) {
                        this.eitfheaderid = value;
                    }

                    /**
                     * Gets the value of the vendorid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVENDORID() {
                        return vendorid;
                    }

                    /**
                     * Sets the value of the vendorid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVENDORID(String value) {
                        this.vendorid = value;
                    }

                    /**
                     * Gets the value of the createdby property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCREATEDBY() {
                        return createdby;
                    }

                    /**
                     * Sets the value of the createdby property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCREATEDBY(String value) {
                        this.createdby = value;
                    }

                    /**
                     * Gets the value of the coopercompanydesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCOOPERCOMPANYDESC() {
                        return coopercompanydesc;
                    }

                    /**
                     * Sets the value of the coopercompanydesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCOOPERCOMPANYDESC(String value) {
                        this.coopercompanydesc = value;
                    }

                    /**
                     * Gets the value of the commentsid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCOMMENTSID() {
                        return commentsid;
                    }

                    /**
                     * Sets the value of the commentsid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCOMMENTSID(String value) {
                        this.commentsid = value;
                    }

                    /**
                     * Gets the value of the deleteby property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDELETEBY() {
                        return deleteby;
                    }

                    /**
                     * Sets the value of the deleteby property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDELETEBY(String value) {
                        this.deleteby = value;
                    }

                    /**
                     * Gets the value of the attribute3 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE3() {
                        return attribute3;
                    }

                    /**
                     * Sets the value of the attribute3 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE3(String value) {
                        this.attribute3 = value;
                    }

                    /**
                     * Gets the value of the attribute2 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE2() {
                        return attribute2;
                    }

                    /**
                     * Sets the value of the attribute2 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE2(String value) {
                        this.attribute2 = value;
                    }

                    /**
                     * Gets the value of the attribute1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE1() {
                        return attribute1;
                    }

                    /**
                     * Sets the value of the attribute1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE1(String value) {
                        this.attribute1 = value;
                    }

                    /**
                     * Gets the value of the businessunitid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBUSINESSUNITID() {
                        return businessunitid;
                    }

                    /**
                     * Sets the value of the businessunitid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBUSINESSUNITID(String value) {
                        this.businessunitid = value;
                    }

                    /**
                     * Gets the value of the vendordesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVENDORDESC() {
                        return vendordesc;
                    }

                    /**
                     * Sets the value of the vendordesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVENDORDESC(String value) {
                        this.vendordesc = value;
                    }

                    /**
                     * Gets the value of the finalleveldesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFINALLEVELDESC() {
                        return finalleveldesc;
                    }

                    /**
                     * Sets the value of the finalleveldesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFINALLEVELDESC(String value) {
                        this.finalleveldesc = value;
                    }

                    /**
                     * Gets the value of the attribute9 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE9() {
                        return attribute9;
                    }

                    /**
                     * Sets the value of the attribute9 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE9(String value) {
                        this.attribute9 = value;
                    }

                    /**
                     * Gets the value of the attribute8 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE8() {
                        return attribute8;
                    }

                    /**
                     * Sets the value of the attribute8 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE8(String value) {
                        this.attribute8 = value;
                    }

                    /**
                     * Gets the value of the attribute7 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE7() {
                        return attribute7;
                    }

                    /**
                     * Sets the value of the attribute7 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE7(String value) {
                        this.attribute7 = value;
                    }

                    /**
                     * Gets the value of the creationdate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCREATIONDATE() {
                        return creationdate;
                    }

                    /**
                     * Sets the value of the creationdate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCREATIONDATE(String value) {
                        this.creationdate = value;
                    }

                    /**
                     * Gets the value of the lastupdatedate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLASTUPDATEDATE() {
                        return lastupdatedate;
                    }

                    /**
                     * Sets the value of the lastupdatedate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLASTUPDATEDATE(String value) {
                        this.lastupdatedate = value;
                    }

                    /**
                     * Gets the value of the attribute6 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE6() {
                        return attribute6;
                    }

                    /**
                     * Sets the value of the attribute6 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE6(String value) {
                        this.attribute6 = value;
                    }

                    /**
                     * Gets the value of the attribute20 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE20() {
                        return attribute20;
                    }

                    /**
                     * Sets the value of the attribute20 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE20(String value) {
                        this.attribute20 = value;
                    }

                    /**
                     * Gets the value of the attribute5 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE5() {
                        return attribute5;
                    }

                    /**
                     * Sets the value of the attribute5 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE5(String value) {
                        this.attribute5 = value;
                    }

                    /**
                     * Gets the value of the finallevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFINALLEVEL() {
                        return finallevel;
                    }

                    /**
                     * Sets the value of the finallevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFINALLEVEL(String value) {
                        this.finallevel = value;
                    }

                    /**
                     * Gets the value of the attribute4 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE4() {
                        return attribute4;
                    }

                    /**
                     * Sets the value of the attribute4 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE4(String value) {
                        this.attribute4 = value;
                    }

                    /**
                     * Gets the value of the attribute19 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE19() {
                        return attribute19;
                    }

                    /**
                     * Sets the value of the attribute19 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE19(String value) {
                        this.attribute19 = value;
                    }

                    /**
                     * Gets the value of the coopercompanyid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCOOPERCOMPANYID() {
                        return coopercompanyid;
                    }

                    /**
                     * Sets the value of the coopercompanyid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCOOPERCOMPANYID(String value) {
                        this.coopercompanyid = value;
                    }

                    /**
                     * Gets the value of the attribute16 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE16() {
                        return attribute16;
                    }

                    /**
                     * Sets the value of the attribute16 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE16(String value) {
                        this.attribute16 = value;
                    }

                    /**
                     * Gets the value of the attribute15 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE15() {
                        return attribute15;
                    }

                    /**
                     * Sets the value of the attribute15 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE15(String value) {
                        this.attribute15 = value;
                    }

                    /**
                     * Gets the value of the attribute18 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE18() {
                        return attribute18;
                    }

                    /**
                     * Sets the value of the attribute18 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE18(String value) {
                        this.attribute18 = value;
                    }

                    /**
                     * Gets the value of the attribute17 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE17() {
                        return attribute17;
                    }

                    /**
                     * Sets the value of the attribute17 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE17(String value) {
                        this.attribute17 = value;
                    }

                    /**
                     * Gets the value of the ownercompanyid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOWNERCOMPANYID() {
                        return ownercompanyid;
                    }

                    /**
                     * Sets the value of the ownercompanyid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOWNERCOMPANYID(String value) {
                        this.ownercompanyid = value;
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
         *                           &lt;attribute name="QUALIFIED_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PARENT_ELEMENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="QUALIFIED_LNS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE13" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ELEMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE14" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ELEMENT_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE11" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE12" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PARENT_ELEMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE10" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ELEMENT_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PARENT_ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="LAST_UPDATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="LEAF_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE9" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE8" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="LAST_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE7" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE6" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE20" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE19" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ELEMENT_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="EITF_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE16" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE15" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE18" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ATTRIBUTE17" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="EITF_INSTANCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class PURQUALIFIEDVENDORLINES {

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
             *                 &lt;attribute name="QUALIFIED_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PARENT_ELEMENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="QUALIFIED_LNS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE13" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ELEMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE14" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ELEMENT_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE11" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE12" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PARENT_ELEMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE10" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ELEMENT_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PARENT_ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="LAST_UPDATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="LEAF_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE9" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE8" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="LAST_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE7" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE6" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE20" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE19" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ELEMENT_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="EITF_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE16" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE15" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE18" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ATTRIBUTE17" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="EITF_INSTANCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                 *       &lt;attribute name="QUALIFIED_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PARENT_ELEMENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="QUALIFIED_LNS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE13" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ELEMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE14" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ELEMENT_HDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE11" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE12" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PARENT_ELEMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="EITF_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE10" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ELEMENT_HDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PARENT_ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="LAST_UPDATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="LEAF_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE9" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE8" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="LAST_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE7" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE6" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE20" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE19" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ELEMENT_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="EITF_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE16" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE15" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE18" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ATTRIBUTE17" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="EITF_INSTANCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                    @XmlAttribute(name = "QUALIFIED_HDS_ID")
                    protected String qualifiedhdsid;
                    @XmlAttribute(name = "PARENT_ELEMENT_CODE")
                    protected String parentelementcode;
                    @XmlAttribute(name = "QUALIFIED_LNS_ID")
                    protected String qualifiedlnsid;
                    @XmlAttribute(name = "ATTRIBUTE13")
                    protected String attribute13;
                    @XmlAttribute(name = "ELEMENT_NAME")
                    protected String elementname;
                    @XmlAttribute(name = "ATTRIBUTE14")
                    protected String attribute14;
                    @XmlAttribute(name = "ELEMENT_HDS_CODE")
                    protected String elementhdscode;
                    @XmlAttribute(name = "ATTRIBUTE11")
                    protected String attribute11;
                    @XmlAttribute(name = "ATTRIBUTE12")
                    protected String attribute12;
                    @XmlAttribute(name = "PARENT_ELEMENT_NAME")
                    protected String parentelementname;
                    @XmlAttribute(name = "EITF_HEADER_ID")
                    protected String eitfheaderid;
                    @XmlAttribute(name = "ATTRIBUTE10")
                    protected String attribute10;
                    @XmlAttribute(name = "ELEMENT_HDS_ID")
                    protected String elementhdsid;
                    @XmlAttribute(name = "CREATED_BY")
                    protected String createdby;
                    @XmlAttribute(name = "PARENT_ELEMENT_ID")
                    protected String parentelementid;
                    @XmlAttribute(name = "LAST_UPDATED_BY")
                    protected String lastupdatedby;
                    @XmlAttribute(name = "LEAF_FLAG")
                    protected String leafflag;
                    @XmlAttribute(name = "ATTRIBUTE3")
                    protected String attribute3;
                    @XmlAttribute(name = "ATTRIBUTE2")
                    protected String attribute2;
                    @XmlAttribute(name = "ATTRIBUTE1")
                    protected String attribute1;
                    @XmlAttribute(name = "SCORE")
                    protected String score;
                    @XmlAttribute(name = "COMMENTS")
                    protected String comments;
                    @XmlAttribute(name = "ATTRIBUTE9")
                    protected String attribute9;
                    @XmlAttribute(name = "ATTRIBUTE8")
                    protected String attribute8;
                    @XmlAttribute(name = "LAST_UPDATE_DATE")
                    protected String lastupdatedate;
                    @XmlAttribute(name = "CREATION_DATE")
                    protected String creationdate;
                    @XmlAttribute(name = "ATTRIBUTE7")
                    protected String attribute7;
                    @XmlAttribute(name = "ATTRIBUTE6")
                    protected String attribute6;
                    @XmlAttribute(name = "ATTRIBUTE20")
                    protected String attribute20;
                    @XmlAttribute(name = "ATTRIBUTE5")
                    protected String attribute5;
                    @XmlAttribute(name = "ATTRIBUTE4")
                    protected String attribute4;
                    @XmlAttribute(name = "ATTRIBUTE19")
                    protected String attribute19;
                    @XmlAttribute(name = "ELEMENT_SCORE")
                    protected String elementscore;
                    @XmlAttribute(name = "EITF_LINE_ID")
                    protected String eitflineid;
                    @XmlAttribute(name = "ATTRIBUTE16")
                    protected String attribute16;
                    @XmlAttribute(name = "ATTRIBUTE15")
                    protected String attribute15;
                    @XmlAttribute(name = "ATTRIBUTE18")
                    protected String attribute18;
                    @XmlAttribute(name = "ATTRIBUTE17")
                    protected String attribute17;
                    @XmlAttribute(name = "EITF_INSTANCE_ID")
                    protected String eitfinstanceid;

                    /**
                     * Gets the value of the qualifiedhdsid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQUALIFIEDHDSID() {
                        return qualifiedhdsid;
                    }

                    /**
                     * Sets the value of the qualifiedhdsid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQUALIFIEDHDSID(String value) {
                        this.qualifiedhdsid = value;
                    }

                    /**
                     * Gets the value of the parentelementcode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPARENTELEMENTCODE() {
                        return parentelementcode;
                    }

                    /**
                     * Sets the value of the parentelementcode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPARENTELEMENTCODE(String value) {
                        this.parentelementcode = value;
                    }

                    /**
                     * Gets the value of the qualifiedlnsid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQUALIFIEDLNSID() {
                        return qualifiedlnsid;
                    }

                    /**
                     * Sets the value of the qualifiedlnsid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQUALIFIEDLNSID(String value) {
                        this.qualifiedlnsid = value;
                    }

                    /**
                     * Gets the value of the attribute13 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE13() {
                        return attribute13;
                    }

                    /**
                     * Sets the value of the attribute13 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE13(String value) {
                        this.attribute13 = value;
                    }

                    /**
                     * Gets the value of the elementname property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getELEMENTNAME() {
                        return elementname;
                    }

                    /**
                     * Sets the value of the elementname property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setELEMENTNAME(String value) {
                        this.elementname = value;
                    }

                    /**
                     * Gets the value of the attribute14 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE14() {
                        return attribute14;
                    }

                    /**
                     * Sets the value of the attribute14 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE14(String value) {
                        this.attribute14 = value;
                    }

                    /**
                     * Gets the value of the elementhdscode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getELEMENTHDSCODE() {
                        return elementhdscode;
                    }

                    /**
                     * Sets the value of the elementhdscode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setELEMENTHDSCODE(String value) {
                        this.elementhdscode = value;
                    }

                    /**
                     * Gets the value of the attribute11 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE11() {
                        return attribute11;
                    }

                    /**
                     * Sets the value of the attribute11 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE11(String value) {
                        this.attribute11 = value;
                    }

                    /**
                     * Gets the value of the attribute12 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE12() {
                        return attribute12;
                    }

                    /**
                     * Sets the value of the attribute12 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE12(String value) {
                        this.attribute12 = value;
                    }

                    /**
                     * Gets the value of the parentelementname property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPARENTELEMENTNAME() {
                        return parentelementname;
                    }

                    /**
                     * Sets the value of the parentelementname property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPARENTELEMENTNAME(String value) {
                        this.parentelementname = value;
                    }

                    /**
                     * Gets the value of the eitfheaderid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEITFHEADERID() {
                        return eitfheaderid;
                    }

                    /**
                     * Sets the value of the eitfheaderid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEITFHEADERID(String value) {
                        this.eitfheaderid = value;
                    }

                    /**
                     * Gets the value of the attribute10 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE10() {
                        return attribute10;
                    }

                    /**
                     * Sets the value of the attribute10 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE10(String value) {
                        this.attribute10 = value;
                    }

                    /**
                     * Gets the value of the elementhdsid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getELEMENTHDSID() {
                        return elementhdsid;
                    }

                    /**
                     * Sets the value of the elementhdsid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setELEMENTHDSID(String value) {
                        this.elementhdsid = value;
                    }

                    /**
                     * Gets the value of the createdby property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCREATEDBY() {
                        return createdby;
                    }

                    /**
                     * Sets the value of the createdby property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCREATEDBY(String value) {
                        this.createdby = value;
                    }

                    /**
                     * Gets the value of the parentelementid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPARENTELEMENTID() {
                        return parentelementid;
                    }

                    /**
                     * Sets the value of the parentelementid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPARENTELEMENTID(String value) {
                        this.parentelementid = value;
                    }

                    /**
                     * Gets the value of the lastupdatedby property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLASTUPDATEDBY() {
                        return lastupdatedby;
                    }

                    /**
                     * Sets the value of the lastupdatedby property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLASTUPDATEDBY(String value) {
                        this.lastupdatedby = value;
                    }

                    /**
                     * Gets the value of the leafflag property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLEAFFLAG() {
                        return leafflag;
                    }

                    /**
                     * Sets the value of the leafflag property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLEAFFLAG(String value) {
                        this.leafflag = value;
                    }

                    /**
                     * Gets the value of the attribute3 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE3() {
                        return attribute3;
                    }

                    /**
                     * Sets the value of the attribute3 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE3(String value) {
                        this.attribute3 = value;
                    }

                    /**
                     * Gets the value of the attribute2 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE2() {
                        return attribute2;
                    }

                    /**
                     * Sets the value of the attribute2 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE2(String value) {
                        this.attribute2 = value;
                    }

                    /**
                     * Gets the value of the attribute1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE1() {
                        return attribute1;
                    }

                    /**
                     * Sets the value of the attribute1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE1(String value) {
                        this.attribute1 = value;
                    }

                    /**
                     * Gets the value of the score property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSCORE() {
                        return score;
                    }

                    /**
                     * Sets the value of the score property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSCORE(String value) {
                        this.score = value;
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
                     * Gets the value of the attribute9 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE9() {
                        return attribute9;
                    }

                    /**
                     * Sets the value of the attribute9 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE9(String value) {
                        this.attribute9 = value;
                    }

                    /**
                     * Gets the value of the attribute8 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE8() {
                        return attribute8;
                    }

                    /**
                     * Sets the value of the attribute8 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE8(String value) {
                        this.attribute8 = value;
                    }

                    /**
                     * Gets the value of the lastupdatedate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLASTUPDATEDATE() {
                        return lastupdatedate;
                    }

                    /**
                     * Sets the value of the lastupdatedate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLASTUPDATEDATE(String value) {
                        this.lastupdatedate = value;
                    }

                    /**
                     * Gets the value of the creationdate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCREATIONDATE() {
                        return creationdate;
                    }

                    /**
                     * Sets the value of the creationdate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCREATIONDATE(String value) {
                        this.creationdate = value;
                    }

                    /**
                     * Gets the value of the attribute7 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE7() {
                        return attribute7;
                    }

                    /**
                     * Sets the value of the attribute7 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE7(String value) {
                        this.attribute7 = value;
                    }

                    /**
                     * Gets the value of the attribute6 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE6() {
                        return attribute6;
                    }

                    /**
                     * Sets the value of the attribute6 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE6(String value) {
                        this.attribute6 = value;
                    }

                    /**
                     * Gets the value of the attribute20 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE20() {
                        return attribute20;
                    }

                    /**
                     * Sets the value of the attribute20 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE20(String value) {
                        this.attribute20 = value;
                    }

                    /**
                     * Gets the value of the attribute5 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE5() {
                        return attribute5;
                    }

                    /**
                     * Sets the value of the attribute5 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE5(String value) {
                        this.attribute5 = value;
                    }

                    /**
                     * Gets the value of the attribute4 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE4() {
                        return attribute4;
                    }

                    /**
                     * Sets the value of the attribute4 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE4(String value) {
                        this.attribute4 = value;
                    }

                    /**
                     * Gets the value of the attribute19 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE19() {
                        return attribute19;
                    }

                    /**
                     * Sets the value of the attribute19 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE19(String value) {
                        this.attribute19 = value;
                    }

                    /**
                     * Gets the value of the elementscore property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getELEMENTSCORE() {
                        return elementscore;
                    }

                    /**
                     * Sets the value of the elementscore property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setELEMENTSCORE(String value) {
                        this.elementscore = value;
                    }

                    /**
                     * Gets the value of the eitflineid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEITFLINEID() {
                        return eitflineid;
                    }

                    /**
                     * Sets the value of the eitflineid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEITFLINEID(String value) {
                        this.eitflineid = value;
                    }

                    /**
                     * Gets the value of the attribute16 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE16() {
                        return attribute16;
                    }

                    /**
                     * Sets the value of the attribute16 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE16(String value) {
                        this.attribute16 = value;
                    }

                    /**
                     * Gets the value of the attribute15 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE15() {
                        return attribute15;
                    }

                    /**
                     * Sets the value of the attribute15 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE15(String value) {
                        this.attribute15 = value;
                    }

                    /**
                     * Gets the value of the attribute18 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE18() {
                        return attribute18;
                    }

                    /**
                     * Sets the value of the attribute18 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE18(String value) {
                        this.attribute18 = value;
                    }

                    /**
                     * Gets the value of the attribute17 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTE17() {
                        return attribute17;
                    }

                    /**
                     * Sets the value of the attribute17 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTE17(String value) {
                        this.attribute17 = value;
                    }

                    /**
                     * Gets the value of the eitfinstanceid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEITFINSTANCEID() {
                        return eitfinstanceid;
                    }

                    /**
                     * Sets the value of the eitfinstanceid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEITFINSTANCEID(String value) {
                        this.eitfinstanceid = value;
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

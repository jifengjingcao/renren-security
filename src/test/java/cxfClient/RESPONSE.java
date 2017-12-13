
package cxfClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="RESPONSE_CONTEXT"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PUR_RFX_HEADERS"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="records"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="record"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="RFX_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="ISSUED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="SOURCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="RFX_METHOD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="PAYMENT_TERM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PUR_RFX_LINES"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="records"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="record"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="ITEM_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="UOM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="REQ_LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="REQ_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="INV_ORGANIZATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="SUGGESTED_OPERATION" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="ITEM_CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PUR_RFX_FB_LINES"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="records"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="record" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="SUGGESTED_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="VENDOR_SITE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="PROMISED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="TAX_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="MIN_PURCHASE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="VALID_FB_RETAIL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="COMPANY_FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="ALLOTTED_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="TOTEL_PIRCE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="SYS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="VENDOR_CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="SUGGESTED_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="DELIVERY_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="MIN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="NEED_BY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PUR_RFX_QUOTATION"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="records"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="record" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="LADDER_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="LADDER_FROM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESPONSE_HEADER"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BATCH_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SEG_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TOTAL_SEG_COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RESPONSE_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RESPONSE_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="success" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * ��ȡresponsecontext���Ե�ֵ��
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
     * ����responsecontext���Ե�ֵ��
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
     * ��ȡresponseheader���Ե�ֵ��
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
     * ����responseheader���Ե�ֵ��
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
     * ��ȡsuccess���Ե�ֵ��
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
     * ����success���Ե�ֵ��
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PUR_RFX_HEADERS"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="records"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="record"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="RFX_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="ISSUED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="SOURCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="RFX_METHOD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="PAYMENT_TERM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PUR_RFX_LINES"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="records"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="record"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="ITEM_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="UOM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="REQ_LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="REQ_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="INV_ORGANIZATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="SUGGESTED_OPERATION" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="ITEM_CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PUR_RFX_FB_LINES"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="records"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="record" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="SUGGESTED_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="VENDOR_SITE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="PROMISED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="TAX_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="MIN_PURCHASE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="VALID_FB_RETAIL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="COMPANY_FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="ALLOTTED_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="TOTEL_PIRCE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="SYS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="VENDOR_CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="SUGGESTED_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="DELIVERY_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="MIN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="NEED_BY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PUR_RFX_QUOTATION"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="records"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="record" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="LADDER_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="LADDER_FROM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
         * ��ȡpurrfxheaders���Ե�ֵ��
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
         * ����purrfxheaders���Ե�ֵ��
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
         * ��ȡpurrfxlines���Ե�ֵ��
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
         * ����purrfxlines���Ե�ֵ��
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
         * ��ȡpurrfxfblines���Ե�ֵ��
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
         * ����purrfxfblines���Ե�ֵ��
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
         * ��ȡpurrfxquotation���Ե�ֵ��
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
         * ����purrfxquotation���Ե�ֵ��
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
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="records"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="record" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="SUGGESTED_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="VENDOR_SITE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="PROMISED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="TAX_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="MIN_PURCHASE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="VALID_FB_RETAIL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="COMPANY_FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="ALLOTTED_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="TOTEL_PIRCE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="SYS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="VENDOR_CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="SUGGESTED_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="DELIVERY_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="MIN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="NEED_BY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
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
            "records"
        })
        public static class PURRFXFBLINES {

            @XmlElement(required = true)
            protected Records records;

            /**
             * ��ȡrecords���Ե�ֵ��
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
             * ����records���Ե�ֵ��
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
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="record" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="SUGGESTED_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="VENDOR_SITE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="PROMISED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="TAX_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="MIN_PURCHASE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="VALID_FB_RETAIL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="COMPANY_FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="ALLOTTED_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="TOTEL_PIRCE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="SYS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="VENDOR_CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="SUGGESTED_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="DELIVERY_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="MIN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="NEED_BY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                 * <p>anonymous complex type�� Java �ࡣ
                 * 
                 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="SUGGESTED_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="VENDOR_SITE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="PROMISED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="TAX_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="MIN_PURCHASE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="VALID_FB_RETAIL_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="COMPANY_FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="ALLOTTED_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="TOTEL_PIRCE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="SYS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="VENDOR_CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="SUGGESTED_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="DELIVERY_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="MIN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="NEED_BY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="VENDOR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
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
                     * ��ȡsuggestedflag���Ե�ֵ��
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
                     * ����suggestedflag���Ե�ֵ��
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
                     * ��ȡvendorsitecode���Ե�ֵ��
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
                     * ����vendorsitecode���Ե�ֵ��
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
                     * ��ȡpromiseddate���Ե�ֵ��
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
                     * ����promiseddate���Ե�ֵ��
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
                     * ��ȡrfxfeedbacklineid���Ե�ֵ��
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
                     * ����rfxfeedbacklineid���Ե�ֵ��
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
                     * ��ȡtaxtypecode���Ե�ֵ��
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
                     * ����taxtypecode���Ե�ֵ��
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
                     * ��ȡminpurchase���Ե�ֵ��
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
                     * ����minpurchase���Ե�ֵ��
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
                     * ��ȡvalidfbretailprice���Ե�ֵ��
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
                     * ����validfbretailprice���Ե�ֵ��
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
                     * ��ȡcompanyfullname���Ե�ֵ��
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
                     * ����companyfullname���Ե�ֵ��
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
                     * ��ȡallottedquantity���Ե�ֵ��
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
                     * ����allottedquantity���Ե�ֵ��
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
                     * ��ȡtotelpirce���Ե�ֵ��
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
                     * ����totelpirce���Ե�ֵ��
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
                     * ��ȡrfxlineid���Ե�ֵ��
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
                     * ����rfxlineid���Ե�ֵ��
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
                     * ��ȡsysdesc���Ե�ֵ��
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
                     * ����sysdesc���Ե�ֵ��
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
                     * ��ȡvendorcontactid���Ե�ֵ��
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
                     * ����vendorcontactid���Ե�ֵ��
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
                     * ��ȡsuggestednote���Ե�ֵ��
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
                     * ����suggestednote���Ե�ֵ��
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
                     * ��ȡdeliverycycle���Ե�ֵ��
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
                     * ����deliverycycle���Ե�ֵ��
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
                     * ��ȡminpackage���Ե�ֵ��
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
                     * ����minpackage���Ե�ֵ��
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
                     * ��ȡneedbydate���Ե�ֵ��
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
                     * ����needbydate���Ե�ֵ��
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
                     * ��ȡvendorcode���Ե�ֵ��
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
                     * ����vendorcode���Ե�ֵ��
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
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="records"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="record"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="RFX_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="ISSUED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="SOURCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="RFX_METHOD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="PAYMENT_TERM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
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
            "records"
        })
        public static class PURRFXHEADERS {

            @XmlElement(required = true)
            protected Records records;

            /**
             * ��ȡrecords���Ե�ֵ��
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
             * ����records���Ե�ֵ��
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
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="record"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="RFX_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="ISSUED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="SOURCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="RFX_METHOD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="PAYMENT_TERM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                "record"
            })
            public static class Records {

                @XmlElement(required = true)
                protected Record record;

                /**
                 * ��ȡrecord���Ե�ֵ��
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
                 * ����record���Ե�ֵ��
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
                 * <p>anonymous complex type�� Java �ࡣ
                 * 
                 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="RFX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="RFX_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="ISSUED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="SOURCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="RFX_METHOD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="PAYMENT_TERM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
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
                     * ��ȡrfxheaderid���Ե�ֵ��
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
                     * ����rfxheaderid���Ե�ֵ��
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
                     * ��ȡcomments���Ե�ֵ��
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
                     * ����comments���Ե�ֵ��
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
                     * ��ȡstatus���Ե�ֵ��
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
                     * ����status���Ե�ֵ��
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
                     * ��ȡrfxmethod���Ե�ֵ��
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
                     * ����rfxmethod���Ե�ֵ��
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
                     * ��ȡissueddate���Ե�ֵ��
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
                     * ����issueddate���Ե�ֵ��
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
                     * ��ȡsourcetype���Ե�ֵ��
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
                     * ����sourcetype���Ե�ֵ��
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
                     * ��ȡrfxmethoddesc���Ե�ֵ��
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
                     * ����rfxmethoddesc���Ե�ֵ��
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
                     * ��ȡpaymentterm���Ե�ֵ��
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
                     * ����paymentterm���Ե�ֵ��
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
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="records"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="record"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="ITEM_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="UOM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="REQ_LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="REQ_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="INV_ORGANIZATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="SUGGESTED_OPERATION" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="ITEM_CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
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
            "records"
        })
        public static class PURRFXLINES {

            @XmlElement(required = true)
            protected Records records;

            /**
             * ��ȡrecords���Ե�ֵ��
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
             * ����records���Ե�ֵ��
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
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="record"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="ITEM_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="UOM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="REQ_LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="REQ_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="INV_ORGANIZATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="SUGGESTED_OPERATION" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="ITEM_CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                "record"
            })
            public static class Records {

                @XmlElement(required = true)
                protected Record record;

                /**
                 * ��ȡrecord���Ե�ֵ��
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
                 * ����record���Ե�ֵ��
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
                 * <p>anonymous complex type�� Java �ࡣ
                 * 
                 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="ITEM_DESC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="RFX_HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="UOM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="REQ_LINE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="RFX_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="REQ_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="INV_ORGANIZATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="ITEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="SUGGESTED_OPERATION" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="ITEM_CATEGORY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
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
                     * ��ȡitemdesc���Ե�ֵ��
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
                     * ����itemdesc���Ե�ֵ��
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
                     * ��ȡrfxheaderid���Ե�ֵ��
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
                     * ����rfxheaderid���Ե�ֵ��
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
                     * ��ȡuomcode���Ե�ֵ��
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
                     * ����uomcode���Ե�ֵ��
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
                     * ��ȡlinenum���Ե�ֵ��
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
                     * ����linenum���Ե�ֵ��
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
                     * ��ȡreqlinenum���Ե�ֵ��
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
                     * ����reqlinenum���Ե�ֵ��
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
                     * ��ȡrfxlineid���Ե�ֵ��
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
                     * ����rfxlineid���Ե�ֵ��
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
                     * ��ȡreqnumber���Ե�ֵ��
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
                     * ����reqnumber���Ե�ֵ��
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
                     * ��ȡinvorganizationcode���Ե�ֵ��
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
                     * ����invorganizationcode���Ե�ֵ��
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
                     * ��ȡitemcode���Ե�ֵ��
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
                     * ����itemcode���Ե�ֵ��
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
                     * ��ȡsuggestedoperation���Ե�ֵ��
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
                     * ����suggestedoperation���Ե�ֵ��
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
                     * ��ȡitemcategorycode���Ե�ֵ��
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
                     * ����itemcategorycode���Ե�ֵ��
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
                     * ��ȡquantity���Ե�ֵ��
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
                     * ����quantity���Ե�ֵ��
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
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="records"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="record" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="LADDER_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="LADDER_FROM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
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
            "records"
        })
        public static class PURRFXQUOTATION {

            @XmlElement(required = true)
            protected Records records;

            /**
             * ��ȡrecords���Ե�ֵ��
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
             * ����records���Ե�ֵ��
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
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="record" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="LADDER_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="LADDER_FROM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                 * <p>anonymous complex type�� Java �ࡣ
                 * 
                 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="RFX_FEEDBACK_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="LADDER_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="LADDER_FROM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
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
                     * ��ȡrfxfeedbacklineid���Ե�ֵ��
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
                     * ����rfxfeedbacklineid���Ե�ֵ��
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
                     * ��ȡladderprice���Ե�ֵ��
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
                     * ����ladderprice���Ե�ֵ��
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
                     * ��ȡladderfrom���Ե�ֵ��
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
                     * ����ladderfrom���Ե�ֵ��
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BATCH_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SEG_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TOTAL_SEG_COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RESPONSE_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RESPONSE_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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

        /**
         * ��ȡresponsestatus���Ե�ֵ��
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
         * ����responsestatus���Ե�ֵ��
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
         * ��ȡresponsemessage���Ե�ֵ��
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
         * ����responsemessage���Ե�ֵ��
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


package bee.generated.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNotBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidNotAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "certificateID",
    "subject",
    "validNotBefore",
    "validNotAfter"
})
@XmlRootElement(name = "CreateCertificate", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class CreateCertificate {

    @XmlElement(name = "CertificateID", namespace = "http://www.onvif.org/ver10/device/wsdl")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String certificateID;
    @XmlElement(name = "Subject", namespace = "http://www.onvif.org/ver10/device/wsdl")
    protected String subject;
    @XmlElement(name = "ValidNotBefore", namespace = "http://www.onvif.org/ver10/device/wsdl")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validNotBefore;
    @XmlElement(name = "ValidNotAfter", namespace = "http://www.onvif.org/ver10/device/wsdl")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validNotAfter;

    /**
     * Gets the value of the certificateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateID() {
        return certificateID;
    }

    /**
     * Sets the value of the certificateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateID(String value) {
        this.certificateID = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the validNotBefore property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidNotBefore() {
        return validNotBefore;
    }

    /**
     * Sets the value of the validNotBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidNotBefore(XMLGregorianCalendar value) {
        this.validNotBefore = value;
    }

    /**
     * Gets the value of the validNotAfter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidNotAfter() {
        return validNotAfter;
    }

    /**
     * Sets the value of the validNotAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidNotAfter(XMLGregorianCalendar value) {
        this.validNotAfter = value;
    }

}


package bee.generated.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


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
 *         &lt;element name="UploadUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" form="qualified"/>
 *         &lt;element name="ExpectedDownTime" type="{http://www.w3.org/2001/XMLSchema}duration" form="qualified"/>
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
    "uploadUri",
    "expectedDownTime"
})
@XmlRootElement(name = "StartSystemRestoreResponse", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class StartSystemRestoreResponse {

    @XmlElement(name = "UploadUri", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uploadUri;
    @XmlElement(name = "ExpectedDownTime", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected Duration expectedDownTime;

    /**
     * Gets the value of the uploadUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadUri() {
        return uploadUri;
    }

    /**
     * Sets the value of the uploadUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadUri(String value) {
        this.uploadUri = value;
    }

    /**
     * Gets the value of the expectedDownTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpectedDownTime() {
        return expectedDownTime;
    }

    /**
     * Sets the value of the expectedDownTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpectedDownTime(Duration value) {
        this.expectedDownTime = value;
    }

}

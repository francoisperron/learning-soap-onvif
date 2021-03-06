
package bee.generated.client;

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
 *         &lt;element name="Pkcs10Request" type="{http://www.onvif.org/ver10/schema}BinaryData" form="qualified"/>
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
    "pkcs10Request"
})
@XmlRootElement(name = "GetPkcs10RequestResponse", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class GetPkcs10RequestResponse {

    @XmlElement(name = "Pkcs10Request", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected BinaryData pkcs10Request;

    /**
     * Gets the value of the pkcs10Request property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryData }
     *     
     */
    public BinaryData getPkcs10Request() {
        return pkcs10Request;
    }

    /**
     * Sets the value of the pkcs10Request property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryData }
     *     
     */
    public void setPkcs10Request(BinaryData value) {
        this.pkcs10Request = value;
    }

}

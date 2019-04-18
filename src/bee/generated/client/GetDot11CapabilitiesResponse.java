
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
 *         &lt;element name="Capabilities" type="{http://www.onvif.org/ver10/schema}Dot11Capabilities" form="qualified"/>
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
    "capabilities"
})
@XmlRootElement(name = "GetDot11CapabilitiesResponse", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class GetDot11CapabilitiesResponse {

    @XmlElement(name = "Capabilities", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected Dot11Capabilities capabilities;

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Dot11Capabilities }
     *     
     */
    public Dot11Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11Capabilities }
     *     
     */
    public void setCapabilities(Dot11Capabilities value) {
        this.capabilities = value;
    }

}

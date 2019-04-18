
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
 *         &lt;element name="DiscoveryMode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
    "discoveryMode"
})
@XmlRootElement(name = "GetDiscoveryModeResponse", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class GetDiscoveryModeResponse {

    @XmlElement(name = "DiscoveryMode", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected String discoveryMode;

    /**
     * Gets the value of the discoveryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveryMode() {
        return discoveryMode;
    }

    /**
     * Sets the value of the discoveryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveryMode(String value) {
        this.discoveryMode = value;
    }

}

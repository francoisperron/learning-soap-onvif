
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
 *         &lt;element name="FromDHCP" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
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
    "fromDHCP"
})
@XmlRootElement(name = "SetHostnameFromDHCP", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class SetHostnameFromDHCP {

    @XmlElement(name = "FromDHCP", namespace = "http://www.onvif.org/ver10/device/wsdl")
    protected boolean fromDHCP;

    /**
     * Gets the value of the fromDHCP property.
     * 
     */
    public boolean isFromDHCP() {
        return fromDHCP;
    }

    /**
     * Sets the value of the fromDHCP property.
     * 
     */
    public void setFromDHCP(boolean value) {
        this.fromDHCP = value;
    }

}

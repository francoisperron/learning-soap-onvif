
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
 *         &lt;element name="RebootNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
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
    "rebootNeeded"
})
@XmlRootElement(name = "SetNetworkInterfacesResponse", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class SetNetworkInterfacesResponse {

    @XmlElement(name = "RebootNeeded", namespace = "http://www.onvif.org/ver10/device/wsdl")
    protected boolean rebootNeeded;

    /**
     * Gets the value of the rebootNeeded property.
     * 
     */
    public boolean isRebootNeeded() {
        return rebootNeeded;
    }

    /**
     * Sets the value of the rebootNeeded property.
     * 
     */
    public void setRebootNeeded(boolean value) {
        this.rebootNeeded = value;
    }

}

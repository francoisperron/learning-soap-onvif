
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
 *         &lt;element name="RemoteUser" type="{http://www.onvif.org/ver10/schema}RemoteUser" minOccurs="0" form="qualified"/>
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
    "remoteUser"
})
@XmlRootElement(name = "SetRemoteUser", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class SetRemoteUser {

    @XmlElement(name = "RemoteUser", namespace = "http://www.onvif.org/ver10/device/wsdl")
    protected RemoteUser remoteUser;

    /**
     * Gets the value of the remoteUser property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteUser }
     *     
     */
    public RemoteUser getRemoteUser() {
        return remoteUser;
    }

    /**
     * Sets the value of the remoteUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteUser }
     *     
     */
    public void setRemoteUser(RemoteUser value) {
        this.remoteUser = value;
    }

}

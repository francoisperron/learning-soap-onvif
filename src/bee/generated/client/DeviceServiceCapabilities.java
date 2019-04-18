
package bee.generated.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceServiceCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceServiceCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Network" type="{http://www.onvif.org/ver10/device/wsdl}NetworkCapabilities" form="qualified"/>
 *         &lt;element name="Security" type="{http://www.onvif.org/ver10/device/wsdl}SecurityCapabilities" form="qualified"/>
 *         &lt;element name="System" type="{http://www.onvif.org/ver10/device/wsdl}SystemCapabilities" form="qualified"/>
 *         &lt;element name="Misc" type="{http://www.onvif.org/ver10/device/wsdl}MiscCapabilities" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceServiceCapabilities", namespace = "http://www.onvif.org/ver10/device/wsdl", propOrder = {
    "network",
    "security",
    "system",
    "misc"
})
public class DeviceServiceCapabilities {

    @XmlElement(name = "Network", required = true)
    protected NetworkCapabilities network;
    @XmlElement(name = "Security", required = true)
    protected SecurityCapabilities security;
    @XmlElement(name = "System", required = true)
    protected SystemCapabilities system;
    @XmlElement(name = "Misc")
    protected MiscCapabilities misc;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkCapabilities }
     *     
     */
    public NetworkCapabilities getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCapabilities }
     *     
     */
    public void setNetwork(NetworkCapabilities value) {
        this.network = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCapabilities }
     *     
     */
    public SecurityCapabilities getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCapabilities }
     *     
     */
    public void setSecurity(SecurityCapabilities value) {
        this.security = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link SystemCapabilities }
     *     
     */
    public SystemCapabilities getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemCapabilities }
     *     
     */
    public void setSystem(SystemCapabilities value) {
        this.system = value;
    }

    /**
     * Gets the value of the misc property.
     * 
     * @return
     *     possible object is
     *     {@link MiscCapabilities }
     *     
     */
    public MiscCapabilities getMisc() {
        return misc;
    }

    /**
     * Sets the value of the misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscCapabilities }
     *     
     */
    public void setMisc(MiscCapabilities value) {
        this.misc = value;
    }

}

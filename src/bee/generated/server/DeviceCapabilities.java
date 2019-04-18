
package bee.generated.server;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for DeviceCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="Network" type="{http://www.onvif.org/ver10/schema}NetworkCapabilities" minOccurs="0"/>
 *         &lt;element name="System" type="{http://www.onvif.org/ver10/schema}SystemCapabilities" minOccurs="0"/>
 *         &lt;element name="IO" type="{http://www.onvif.org/ver10/schema}IOCapabilities" minOccurs="0"/>
 *         &lt;element name="Security" type="{http://www.onvif.org/ver10/schema}SecurityCapabilities" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}DeviceCapabilitiesExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceCapabilities", propOrder = {
    "xAddr",
    "network",
    "system",
    "io",
    "security",
    "extension"
})
public class DeviceCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "Network")
    protected NetworkCapabilities2 network;
    @XmlElement(name = "System")
    protected SystemCapabilities2 system;
    @XmlElement(name = "IO")
    protected IOCapabilities io;
    @XmlElement(name = "Security")
    protected SecurityCapabilities2 security;
    @XmlElement(name = "Extension")
    protected DeviceCapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the xAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAddr() {
        return xAddr;
    }

    /**
     * Sets the value of the xAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAddr(String value) {
        this.xAddr = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkCapabilities2 }
     *     
     */
    public NetworkCapabilities2 getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCapabilities2 }
     *     
     */
    public void setNetwork(NetworkCapabilities2 value) {
        this.network = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link SystemCapabilities2 }
     *     
     */
    public SystemCapabilities2 getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemCapabilities2 }
     *     
     */
    public void setSystem(SystemCapabilities2 value) {
        this.system = value;
    }

    /**
     * Gets the value of the io property.
     * 
     * @return
     *     possible object is
     *     {@link IOCapabilities }
     *     
     */
    public IOCapabilities getIO() {
        return io;
    }

    /**
     * Sets the value of the io property.
     * 
     * @param value
     *     allowed object is
     *     {@link IOCapabilities }
     *     
     */
    public void setIO(IOCapabilities value) {
        this.io = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCapabilities2 }
     *     
     */
    public SecurityCapabilities2 getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCapabilities2 }
     *     
     */
    public void setSecurity(SecurityCapabilities2 value) {
        this.security = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCapabilitiesExtension }
     *     
     */
    public DeviceCapabilitiesExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCapabilitiesExtension }
     *     
     */
    public void setExtension(DeviceCapabilitiesExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}

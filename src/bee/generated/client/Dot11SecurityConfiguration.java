
package bee.generated.client;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for Dot11SecurityConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dot11SecurityConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSK" type="{http://www.onvif.org/ver10/schema}Dot11PSKSet" minOccurs="0"/>
 *         &lt;element name="Dot1X" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}Dot11SecurityConfigurationExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dot11SecurityConfiguration", propOrder = {
    "mode",
    "algorithm",
    "psk",
    "dot1X",
    "extension"
})
public class Dot11SecurityConfiguration {

    @XmlElement(name = "Mode", required = true)
    protected String mode;
    @XmlElement(name = "Algorithm")
    protected String algorithm;
    @XmlElement(name = "PSK")
    protected Dot11PSKSet psk;
    @XmlElement(name = "Dot1X")
    protected String dot1X;
    @XmlElement(name = "Extension")
    protected Dot11SecurityConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the psk property.
     * 
     * @return
     *     possible object is
     *     {@link Dot11PSKSet }
     *     
     */
    public Dot11PSKSet getPSK() {
        return psk;
    }

    /**
     * Sets the value of the psk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11PSKSet }
     *     
     */
    public void setPSK(Dot11PSKSet value) {
        this.psk = value;
    }

    /**
     * Gets the value of the dot1X property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDot1X() {
        return dot1X;
    }

    /**
     * Sets the value of the dot1X property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDot1X(String value) {
        this.dot1X = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Dot11SecurityConfigurationExtension }
     *     
     */
    public Dot11SecurityConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11SecurityConfigurationExtension }
     *     
     */
    public void setExtension(Dot11SecurityConfigurationExtension value) {
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

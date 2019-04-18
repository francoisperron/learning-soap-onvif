
package bee.generated.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for AnalyticsEngineControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyticsEngineControl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       &lt;sequence>
 *         &lt;element name="EngineToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EngineConfigToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InputToken" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="ReceiverToken" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration" minOccurs="0"/>
 *         &lt;element name="Subscription" type="{http://www.onvif.org/ver10/schema}Config"/>
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticsEngineControl", propOrder = {
    "engineToken",
    "engineConfigToken",
    "inputToken",
    "receiverToken",
    "multicast",
    "subscription",
    "mode",
    "any"
})
public class AnalyticsEngineControl
    extends ConfigurationEntity
{

    @XmlElement(name = "EngineToken", required = true)
    protected String engineToken;
    @XmlElement(name = "EngineConfigToken", required = true)
    protected String engineConfigToken;
    @XmlElement(name = "InputToken", required = true)
    protected List<String> inputToken;
    @XmlElement(name = "ReceiverToken", required = true)
    protected List<String> receiverToken;
    @XmlElement(name = "Multicast")
    protected MulticastConfiguration multicast;
    @XmlElement(name = "Subscription", required = true)
    protected Config subscription;
    @XmlElement(name = "Mode", required = true)
    protected String mode;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the engineToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineToken() {
        return engineToken;
    }

    /**
     * Sets the value of the engineToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineToken(String value) {
        this.engineToken = value;
    }

    /**
     * Gets the value of the engineConfigToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineConfigToken() {
        return engineConfigToken;
    }

    /**
     * Sets the value of the engineConfigToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineConfigToken(String value) {
        this.engineConfigToken = value;
    }

    /**
     * Gets the value of the inputToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInputToken() {
        if (inputToken == null) {
            inputToken = new ArrayList<String>();
        }
        return this.inputToken;
    }

    /**
     * Gets the value of the receiverToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReceiverToken() {
        if (receiverToken == null) {
            receiverToken = new ArrayList<String>();
        }
        return this.receiverToken;
    }

    /**
     * Gets the value of the multicast property.
     * 
     * @return
     *     possible object is
     *     {@link MulticastConfiguration }
     *     
     */
    public MulticastConfiguration getMulticast() {
        return multicast;
    }

    /**
     * Sets the value of the multicast property.
     * 
     * @param value
     *     allowed object is
     *     {@link MulticastConfiguration }
     *     
     */
    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Config }
     *     
     */
    public Config getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Config }
     *     
     */
    public void setSubscription(Config value) {
        this.subscription = value;
    }

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
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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

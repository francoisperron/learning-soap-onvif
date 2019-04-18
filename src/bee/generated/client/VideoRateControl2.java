
package bee.generated.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for VideoRateControl2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoRateControl2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ConstantBitRate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl2", propOrder = {
    "frameRateLimit",
    "bitrateLimit",
    "any"
})
public class VideoRateControl2 {

    @XmlElement(name = "FrameRateLimit")
    protected float frameRateLimit;
    @XmlElement(name = "BitrateLimit")
    protected int bitrateLimit;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "ConstantBitRate")
    protected Boolean constantBitRate;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the frameRateLimit property.
     * 
     */
    public float getFrameRateLimit() {
        return frameRateLimit;
    }

    /**
     * Sets the value of the frameRateLimit property.
     * 
     */
    public void setFrameRateLimit(float value) {
        this.frameRateLimit = value;
    }

    /**
     * Gets the value of the bitrateLimit property.
     * 
     */
    public int getBitrateLimit() {
        return bitrateLimit;
    }

    /**
     * Sets the value of the bitrateLimit property.
     * 
     */
    public void setBitrateLimit(int value) {
        this.bitrateLimit = value;
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
     * Gets the value of the constantBitRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstantBitRate() {
        return constantBitRate;
    }

    /**
     * Sets the value of the constantBitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstantBitRate(Boolean value) {
        this.constantBitRate = value;
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

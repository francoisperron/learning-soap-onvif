
package bee.generated.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Exposure20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exposure20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Window" type="{http://www.onvif.org/ver10/schema}Rectangle" minOccurs="0"/>
 *         &lt;element name="MinExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="MaxExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="MinGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="MaxGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="MinIris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="MaxIris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Gain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Iris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exposure20", propOrder = {
    "mode",
    "priority",
    "window",
    "minExposureTime",
    "maxExposureTime",
    "minGain",
    "maxGain",
    "minIris",
    "maxIris",
    "exposureTime",
    "gain",
    "iris"
})
public class Exposure20 {

    @XmlElement(name = "Mode", required = true)
    protected String mode;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "Window")
    protected Rectangle window;
    @XmlElement(name = "MinExposureTime")
    protected Float minExposureTime;
    @XmlElement(name = "MaxExposureTime")
    protected Float maxExposureTime;
    @XmlElement(name = "MinGain")
    protected Float minGain;
    @XmlElement(name = "MaxGain")
    protected Float maxGain;
    @XmlElement(name = "MinIris")
    protected Float minIris;
    @XmlElement(name = "MaxIris")
    protected Float maxIris;
    @XmlElement(name = "ExposureTime")
    protected Float exposureTime;
    @XmlElement(name = "Gain")
    protected Float gain;
    @XmlElement(name = "Iris")
    protected Float iris;

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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the window property.
     * 
     * @return
     *     possible object is
     *     {@link Rectangle }
     *     
     */
    public Rectangle getWindow() {
        return window;
    }

    /**
     * Sets the value of the window property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectangle }
     *     
     */
    public void setWindow(Rectangle value) {
        this.window = value;
    }

    /**
     * Gets the value of the minExposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinExposureTime() {
        return minExposureTime;
    }

    /**
     * Sets the value of the minExposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinExposureTime(Float value) {
        this.minExposureTime = value;
    }

    /**
     * Gets the value of the maxExposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxExposureTime() {
        return maxExposureTime;
    }

    /**
     * Sets the value of the maxExposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxExposureTime(Float value) {
        this.maxExposureTime = value;
    }

    /**
     * Gets the value of the minGain property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinGain() {
        return minGain;
    }

    /**
     * Sets the value of the minGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinGain(Float value) {
        this.minGain = value;
    }

    /**
     * Gets the value of the maxGain property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxGain() {
        return maxGain;
    }

    /**
     * Sets the value of the maxGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxGain(Float value) {
        this.maxGain = value;
    }

    /**
     * Gets the value of the minIris property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinIris() {
        return minIris;
    }

    /**
     * Sets the value of the minIris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinIris(Float value) {
        this.minIris = value;
    }

    /**
     * Gets the value of the maxIris property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxIris() {
        return maxIris;
    }

    /**
     * Sets the value of the maxIris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxIris(Float value) {
        this.maxIris = value;
    }

    /**
     * Gets the value of the exposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExposureTime() {
        return exposureTime;
    }

    /**
     * Sets the value of the exposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExposureTime(Float value) {
        this.exposureTime = value;
    }

    /**
     * Gets the value of the gain property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGain() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGain(Float value) {
        this.gain = value;
    }

    /**
     * Gets the value of the iris property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIris() {
        return iris;
    }

    /**
     * Sets the value of the iris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIris(Float value) {
        this.iris = value;
    }

}

package bee.generated.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JpegOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JpegOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResolutionsAvailable" type="{http://www.onvif.org/ver10/schema}VideoResolution" maxOccurs="unbounded"/>
 *         &lt;element name="FrameRateRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         &lt;element name="EncodingIntervalRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JpegOptions", propOrder = {
    "resolutionsAvailable",
    "frameRateRange",
    "encodingIntervalRange"
})
@XmlSeeAlso({
    JpegOptions2 .class
})
public class JpegOptions {

    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution> resolutionsAvailable;
    @XmlElement(name = "FrameRateRange", required = true)
    protected IntRange frameRateRange;
    @XmlElement(name = "EncodingIntervalRange", required = true)
    protected IntRange encodingIntervalRange;

    /**
     * Gets the value of the resolutionsAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolutionsAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolutionsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoResolution }
     * 
     * 
     */
    public List<VideoResolution> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<VideoResolution>();
        }
        return this.resolutionsAvailable;
    }

    /**
     * Gets the value of the frameRateRange property.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getFrameRateRange() {
        return frameRateRange;
    }

    /**
     * Sets the value of the frameRateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setFrameRateRange(IntRange value) {
        this.frameRateRange = value;
    }

    /**
     * Gets the value of the encodingIntervalRange property.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getEncodingIntervalRange() {
        return encodingIntervalRange;
    }

    /**
     * Sets the value of the encodingIntervalRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setEncodingIntervalRange(IntRange value) {
        this.encodingIntervalRange = value;
    }

}

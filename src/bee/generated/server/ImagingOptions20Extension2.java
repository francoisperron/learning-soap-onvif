
package bee.generated.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImagingOptions20Extension2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImagingOptions20Extension2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IrCutFilterAutoAdjustment" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustmentOptions" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingOptions20Extension3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingOptions20Extension2", propOrder = {
    "irCutFilterAutoAdjustment",
    "extension"
})
public class ImagingOptions20Extension2 {

    @XmlElement(name = "IrCutFilterAutoAdjustment")
    protected IrCutFilterAutoAdjustmentOptions irCutFilterAutoAdjustment;
    @XmlElement(name = "Extension")
    protected ImagingOptions20Extension3 extension;

    /**
     * Gets the value of the irCutFilterAutoAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link IrCutFilterAutoAdjustmentOptions }
     *     
     */
    public IrCutFilterAutoAdjustmentOptions getIrCutFilterAutoAdjustment() {
        return irCutFilterAutoAdjustment;
    }

    /**
     * Sets the value of the irCutFilterAutoAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrCutFilterAutoAdjustmentOptions }
     *     
     */
    public void setIrCutFilterAutoAdjustment(IrCutFilterAutoAdjustmentOptions value) {
        this.irCutFilterAutoAdjustment = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ImagingOptions20Extension3 }
     *     
     */
    public ImagingOptions20Extension3 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingOptions20Extension3 }
     *     
     */
    public void setExtension(ImagingOptions20Extension3 value) {
        this.extension = value;
    }

}

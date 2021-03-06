
package bee.generated.server;

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
 *         &lt;element name="SupportInformation" type="{http://www.onvif.org/ver10/schema}SupportInformation"/>
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
    "supportInformation"
})
@XmlRootElement(name = "GetSystemSupportInformationResponse", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class GetSystemSupportInformationResponse {

    @XmlElement(name = "SupportInformation", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected SupportInformation supportInformation;

    /**
     * Gets the value of the supportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SupportInformation }
     *     
     */
    public SupportInformation getSupportInformation() {
        return supportInformation;
    }

    /**
     * Sets the value of the supportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportInformation }
     *     
     */
    public void setSupportInformation(SupportInformation value) {
        this.supportInformation = value;
    }

}

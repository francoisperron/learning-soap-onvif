
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
 *         &lt;element name="SystemDateAndTime" type="{http://www.onvif.org/ver10/schema}SystemDateTime" form="qualified"/>
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
    "systemDateAndTime"
})
@XmlRootElement(name = "GetSystemDateAndTimeResponse", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class GetSystemDateAndTimeResponse {

    @XmlElement(name = "SystemDateAndTime", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected SystemDateTime systemDateAndTime;

    /**
     * Gets the value of the systemDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDateTime }
     *     
     */
    public SystemDateTime getSystemDateAndTime() {
        return systemDateAndTime;
    }

    /**
     * Sets the value of the systemDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDateTime }
     *     
     */
    public void setSystemDateAndTime(SystemDateTime value) {
        this.systemDateAndTime = value;
    }

}

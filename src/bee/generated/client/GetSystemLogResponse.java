
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
 *         &lt;element name="SystemLog" type="{http://www.onvif.org/ver10/schema}SystemLog" form="qualified"/>
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
    "systemLog"
})
@XmlRootElement(name = "GetSystemLogResponse", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class GetSystemLogResponse {

    @XmlElement(name = "SystemLog", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected SystemLog systemLog;

    /**
     * Gets the value of the systemLog property.
     * 
     * @return
     *     possible object is
     *     {@link SystemLog }
     *     
     */
    public SystemLog getSystemLog() {
        return systemLog;
    }

    /**
     * Sets the value of the systemLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLog }
     *     
     */
    public void setSystemLog(SystemLog value) {
        this.systemLog = value;
    }

}

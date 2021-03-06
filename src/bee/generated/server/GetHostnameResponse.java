
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
 *         &lt;element name="HostnameInformation" type="{http://www.onvif.org/ver10/schema}HostnameInformation"/>
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
    "hostnameInformation"
})
@XmlRootElement(name = "GetHostnameResponse", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class GetHostnameResponse {

    @XmlElement(name = "HostnameInformation", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected HostnameInformation hostnameInformation;

    /**
     * Gets the value of the hostnameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HostnameInformation }
     *     
     */
    public HostnameInformation getHostnameInformation() {
        return hostnameInformation;
    }

    /**
     * Sets the value of the hostnameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostnameInformation }
     *     
     */
    public void setHostnameInformation(HostnameInformation value) {
        this.hostnameInformation = value;
    }

}

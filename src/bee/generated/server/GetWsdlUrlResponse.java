
package bee.generated.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="WsdlUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
    "wsdlUrl"
})
@XmlRootElement(name = "GetWsdlUrlResponse", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class GetWsdlUrlResponse {

    @XmlElement(name = "WsdlUrl", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String wsdlUrl;

    /**
     * Gets the value of the wsdlUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdlUrl() {
        return wsdlUrl;
    }

    /**
     * Sets the value of the wsdlUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdlUrl(String value) {
        this.wsdlUrl = value;
    }

}

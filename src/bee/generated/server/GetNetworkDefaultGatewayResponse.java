
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
 *         &lt;element name="NetworkGateway" type="{http://www.onvif.org/ver10/schema}NetworkGateway"/>
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
    "networkGateway"
})
@XmlRootElement(name = "GetNetworkDefaultGatewayResponse", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class GetNetworkDefaultGatewayResponse {

    @XmlElement(name = "NetworkGateway", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected NetworkGateway networkGateway;

    /**
     * Gets the value of the networkGateway property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkGateway }
     *     
     */
    public NetworkGateway getNetworkGateway() {
        return networkGateway;
    }

    /**
     * Sets the value of the networkGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkGateway }
     *     
     */
    public void setNetworkGateway(NetworkGateway value) {
        this.networkGateway = value;
    }

}


package bee.generated.server;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="NetworkProtocols" type="{http://www.onvif.org/ver10/schema}NetworkProtocol" maxOccurs="unbounded"/>
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
    "networkProtocols"
})
@XmlRootElement(name = "SetNetworkProtocols", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class SetNetworkProtocols {

    @XmlElement(name = "NetworkProtocols", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected List<NetworkProtocol> networkProtocols;

    /**
     * Gets the value of the networkProtocols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkProtocols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkProtocols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkProtocol }
     * 
     * 
     */
    public List<NetworkProtocol> getNetworkProtocols() {
        if (networkProtocols == null) {
            networkProtocols = new ArrayList<NetworkProtocol>();
        }
        return this.networkProtocols;
    }

}

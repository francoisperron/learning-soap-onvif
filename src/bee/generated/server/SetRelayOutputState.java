
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
 *         &lt;element name="RelayOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         &lt;element name="LogicalState" type="{http://www.onvif.org/ver10/schema}RelayLogicalState"/>
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
    "relayOutputToken",
    "logicalState"
})
@XmlRootElement(name = "SetRelayOutputState", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class SetRelayOutputState {

    @XmlElement(name = "RelayOutputToken", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected String relayOutputToken;
    @XmlElement(name = "LogicalState", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    @XmlSchemaType(name = "string")
    protected RelayLogicalState logicalState;

    /**
     * Gets the value of the relayOutputToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayOutputToken() {
        return relayOutputToken;
    }

    /**
     * Sets the value of the relayOutputToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayOutputToken(String value) {
        this.relayOutputToken = value;
    }

    /**
     * Gets the value of the logicalState property.
     * 
     * @return
     *     possible object is
     *     {@link RelayLogicalState }
     *     
     */
    public RelayLogicalState getLogicalState() {
        return logicalState;
    }

    /**
     * Sets the value of the logicalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayLogicalState }
     *     
     */
    public void setLogicalState(RelayLogicalState value) {
        this.logicalState = value;
    }

}


package bee.generated.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDot11CapabilitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDot11CapabilitiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Capabilities" type="{http://www.onvif.org/ver10/schema}Dot11Capabilities" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDot11CapabilitiesResponse", namespace = "http://bee/", propOrder = {
    "_return"
})
public class GetDot11CapabilitiesResponse2 {

    @XmlElement(name = "return", namespace = "")
    protected GetDot11CapabilitiesResponse2 .Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDot11CapabilitiesResponse2 .Return }
     *     
     */
    public GetDot11CapabilitiesResponse2 .Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDot11CapabilitiesResponse2 .Return }
     *     
     */
    public void setReturn(GetDot11CapabilitiesResponse2 .Return value) {
        this._return = value;
    }


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
     *         &lt;element name="Capabilities" type="{http://www.onvif.org/ver10/schema}Dot11Capabilities" form="qualified"/>
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
        "capabilities"
    })
    public static class Return {

        @XmlElement(name = "Capabilities", namespace = "http://bee/", required = true)
        protected Dot11Capabilities capabilities;

        /**
         * Gets the value of the capabilities property.
         * 
         * @return
         *     possible object is
         *     {@link Dot11Capabilities }
         *     
         */
        public Dot11Capabilities getCapabilities() {
            return capabilities;
        }

        /**
         * Sets the value of the capabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link Dot11Capabilities }
         *     
         */
        public void setCapabilities(Dot11Capabilities value) {
            this.capabilities = value;
        }

    }

}

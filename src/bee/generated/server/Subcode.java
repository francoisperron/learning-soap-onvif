
package bee.generated.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for subcode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subcode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="Subcode" type="{http://www.w3.org/2003/05/soap-envelope}subcode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subcode", namespace = "http://www.w3.org/2003/05/soap-envelope", propOrder = {
    "value",
    "subcode"
})
public class Subcode {

    @XmlElement(name = "Value", required = true)
    protected QName value;
    @XmlElement(name = "Subcode")
    protected Subcode subcode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setValue(QName value) {
        this.value = value;
    }

    /**
     * Gets the value of the subcode property.
     * 
     * @return
     *     possible object is
     *     {@link Subcode }
     *     
     */
    public Subcode getSubcode() {
        return subcode;
    }

    /**
     * Sets the value of the subcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subcode }
     *     
     */
    public void setSubcode(Subcode value) {
        this.subcode = value;
    }

}

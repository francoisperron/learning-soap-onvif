
package bee.generated.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setSystemDateAndTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setSystemDateAndTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.onvif.org/ver10/schema}SetDateTimeType" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="arg2" type="{http://www.onvif.org/ver10/schema}TimeZone" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.onvif.org/ver10/schema}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSystemDateAndTime", namespace = "http://bee/", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class SetSystemDateAndTime2 {

    @XmlElement(namespace = "")
    @XmlSchemaType(name = "string")
    protected SetDateTimeType arg0;
    @XmlElement(namespace = "")
    protected boolean arg1;
    @XmlElement(namespace = "")
    protected TimeZone arg2;
    @XmlElement(namespace = "")
    protected DateTime arg3;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link SetDateTimeType }
     *     
     */
    public SetDateTimeType getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetDateTimeType }
     *     
     */
    public void setArg0(SetDateTimeType value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     */
    public boolean isArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     */
    public void setArg1(boolean value) {
        this.arg1 = value;
    }

    /**
     * Gets the value of the arg2 property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getArg2() {
        return arg2;
    }

    /**
     * Sets the value of the arg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setArg2(TimeZone value) {
        this.arg2 = value;
    }

    /**
     * Gets the value of the arg3 property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getArg3() {
        return arg3;
    }

    /**
     * Sets the value of the arg3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setArg3(DateTime value) {
        this.arg3 = value;
    }

}

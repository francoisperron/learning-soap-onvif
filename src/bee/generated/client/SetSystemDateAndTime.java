
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
 *         &lt;element name="DateTimeType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="DaylightSavings" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="TimeZone" type="{http://www.onvif.org/ver10/schema}TimeZone" minOccurs="0" form="qualified"/>
 *         &lt;element name="UTCDateTime" type="{http://www.onvif.org/ver10/schema}DateTime" minOccurs="0" form="qualified"/>
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
    "dateTimeType",
    "daylightSavings",
    "timeZone",
    "utcDateTime"
})
@XmlRootElement(name = "SetSystemDateAndTime", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class SetSystemDateAndTime {

    @XmlElement(name = "DateTimeType", namespace = "http://www.onvif.org/ver10/device/wsdl", required = true)
    protected String dateTimeType;
    @XmlElement(name = "DaylightSavings", namespace = "http://www.onvif.org/ver10/device/wsdl")
    protected boolean daylightSavings;
    @XmlElement(name = "TimeZone", namespace = "http://www.onvif.org/ver10/device/wsdl")
    protected TimeZone timeZone;
    @XmlElement(name = "UTCDateTime", namespace = "http://www.onvif.org/ver10/device/wsdl")
    protected DateTime utcDateTime;

    /**
     * Gets the value of the dateTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeType() {
        return dateTimeType;
    }

    /**
     * Sets the value of the dateTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeType(String value) {
        this.dateTimeType = value;
    }

    /**
     * Gets the value of the daylightSavings property.
     * 
     */
    public boolean isDaylightSavings() {
        return daylightSavings;
    }

    /**
     * Sets the value of the daylightSavings property.
     * 
     */
    public void setDaylightSavings(boolean value) {
        this.daylightSavings = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the utcDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getUTCDateTime() {
        return utcDateTime;
    }

    /**
     * Sets the value of the utcDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setUTCDateTime(DateTime value) {
        this.utcDateTime = value;
    }

}


package bee.generated.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiverState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReceiverState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotConnected"/>
 *     &lt;enumeration value="Connecting"/>
 *     &lt;enumeration value="Connected"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReceiverState")
@XmlEnum
public enum ReceiverState {

    @XmlEnumValue("NotConnected")
    NOT_CONNECTED("NotConnected"),
    @XmlEnumValue("Connecting")
    CONNECTING("Connecting"),
    @XmlEnumValue("Connected")
    CONNECTED("Connected"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ReceiverState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiverState fromValue(String v) {
        for (ReceiverState c: ReceiverState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

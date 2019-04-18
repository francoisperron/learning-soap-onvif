
package bee.generated.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiverMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReceiverMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AutoConnect"/>
 *     &lt;enumeration value="AlwaysConnect"/>
 *     &lt;enumeration value="NeverConnect"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReceiverMode")
@XmlEnum
public enum ReceiverMode {

    @XmlEnumValue("AutoConnect")
    AUTO_CONNECT("AutoConnect"),
    @XmlEnumValue("AlwaysConnect")
    ALWAYS_CONNECT("AlwaysConnect"),
    @XmlEnumValue("NeverConnect")
    NEVER_CONNECT("NeverConnect"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ReceiverMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiverMode fromValue(String v) {
        for (ReceiverMode c: ReceiverMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

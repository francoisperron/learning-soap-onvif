
package bee.generated.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dot11SecurityMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dot11SecurityMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="WEP"/>
 *     &lt;enumeration value="PSK"/>
 *     &lt;enumeration value="Dot1X"/>
 *     &lt;enumeration value="Extended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dot11SecurityMode")
@XmlEnum
public enum Dot11SecurityMode {

    @XmlEnumValue("None")
    NONE("None"),
    WEP("WEP"),
    PSK("PSK"),
    @XmlEnumValue("Dot1X")
    DOT_1_X("Dot1X"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    Dot11SecurityMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dot11SecurityMode fromValue(String v) {
        for (Dot11SecurityMode c: Dot11SecurityMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package bee.generated.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetDateTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetDateTimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="NTP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetDateTimeType")
@XmlEnum
public enum SetDateTimeType {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    NTP("NTP");
    private final String value;

    SetDateTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetDateTimeType fromValue(String v) {
        for (SetDateTimeType c: SetDateTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

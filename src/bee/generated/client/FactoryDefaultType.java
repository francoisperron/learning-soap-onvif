
package bee.generated.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FactoryDefaultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FactoryDefaultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hard"/>
 *     &lt;enumeration value="Soft"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FactoryDefaultType")
@XmlEnum
public enum FactoryDefaultType {

    @XmlEnumValue("Hard")
    HARD("Hard"),
    @XmlEnumValue("Soft")
    SOFT("Soft");
    private final String value;

    FactoryDefaultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FactoryDefaultType fromValue(String v) {
        for (FactoryDefaultType c: FactoryDefaultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package bee.generated.server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RotateMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RotateMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OFF"/>
 *     &lt;enumeration value="ON"/>
 *     &lt;enumeration value="AUTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RotateMode")
@XmlEnum
public enum RotateMode {


    /**
     * Enable the Rotate feature. Degree of rotation is specified Degree parameter.
     * 
     */
    OFF,

    /**
     * Disable the Rotate feature.
     * 
     */
    ON,

    /**
     * Rotate feature is automatically activated by the device.
     * 
     */
    AUTO;

    public String value() {
        return name();
    }

    public static RotateMode fromValue(String v) {
        return valueOf(v);
    }

}

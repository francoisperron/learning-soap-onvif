
package bee.generated.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Queued"/>
 *     &lt;enumeration value="Searching"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchState")
@XmlEnum
public enum SearchState {

    @XmlEnumValue("Queued")
    QUEUED("Queued"),
    @XmlEnumValue("Searching")
    SEARCHING("Searching"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SearchState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchState fromValue(String v) {
        for (SearchState c: SearchState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

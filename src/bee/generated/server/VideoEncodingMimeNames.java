
package bee.generated.server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoEncodingMimeNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoEncodingMimeNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JPEG"/>
 *     &lt;enumeration value="MPV4-ES"/>
 *     &lt;enumeration value="H264"/>
 *     &lt;enumeration value="H265"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoEncodingMimeNames")
@XmlEnum
public enum VideoEncodingMimeNames {

    JPEG("JPEG"),
    @XmlEnumValue("MPV4-ES")
    MPV_4_ES("MPV4-ES"),
    @XmlEnumValue("H264")
    H_264("H264"),
    @XmlEnumValue("H265")
    H_265("H265");
    private final String value;

    VideoEncodingMimeNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoEncodingMimeNames fromValue(String v) {
        for (VideoEncodingMimeNames c: VideoEncodingMimeNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

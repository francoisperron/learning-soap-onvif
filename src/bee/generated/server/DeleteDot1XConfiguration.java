
package bee.generated.server;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Dot1XConfigurationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded" minOccurs="0"/>
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
    "dot1XConfigurationToken"
})
@XmlRootElement(name = "DeleteDot1XConfiguration", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class DeleteDot1XConfiguration {

    @XmlElement(name = "Dot1XConfigurationToken", namespace = "http://www.onvif.org/ver10/device/wsdl")
    protected List<String> dot1XConfigurationToken;

    /**
     * Gets the value of the dot1XConfigurationToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dot1XConfigurationToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDot1XConfigurationToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDot1XConfigurationToken() {
        if (dot1XConfigurationToken == null) {
            dot1XConfigurationToken = new ArrayList<String>();
        }
        return this.dot1XConfigurationToken;
    }

}


package bee.generated.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for UnrecognizedPolicyRequestFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnrecognizedPolicyRequestFaultType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/wsrf/bf-2}BaseFaultType">
 *       &lt;sequence>
 *         &lt;element name="UnrecognizedPolicy" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnrecognizedPolicyRequestFaultType", namespace = "http://docs.oasis-open.org/wsn/b-2", propOrder = {
    "unrecognizedPolicy"
})
public class UnrecognizedPolicyRequestFaultType
    extends BaseFaultType
{

    @XmlElement(name = "UnrecognizedPolicy")
    protected List<QName> unrecognizedPolicy;

    /**
     * Gets the value of the unrecognizedPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrecognizedPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrecognizedPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getUnrecognizedPolicy() {
        if (unrecognizedPolicy == null) {
            unrecognizedPolicy = new ArrayList<QName>();
        }
        return this.unrecognizedPolicy;
    }

}

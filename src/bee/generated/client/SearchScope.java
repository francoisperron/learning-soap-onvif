
package bee.generated.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for SearchScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncludedSources" type="{http://www.onvif.org/ver10/schema}SourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludedRecordings" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecordingInformationFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}SearchScopeExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchScope", propOrder = {
    "includedSources",
    "includedRecordings",
    "recordingInformationFilter",
    "extension"
})
public class SearchScope {

    @XmlElement(name = "IncludedSources")
    protected List<SourceReference> includedSources;
    @XmlElement(name = "IncludedRecordings")
    protected List<String> includedRecordings;
    @XmlElement(name = "RecordingInformationFilter")
    protected String recordingInformationFilter;
    @XmlElement(name = "Extension")
    protected SearchScopeExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the includedSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceReference }
     * 
     * 
     */
    public List<SourceReference> getIncludedSources() {
        if (includedSources == null) {
            includedSources = new ArrayList<SourceReference>();
        }
        return this.includedSources;
    }

    /**
     * Gets the value of the includedRecordings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedRecordings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedRecordings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludedRecordings() {
        if (includedRecordings == null) {
            includedRecordings = new ArrayList<String>();
        }
        return this.includedRecordings;
    }

    /**
     * Gets the value of the recordingInformationFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingInformationFilter() {
        return recordingInformationFilter;
    }

    /**
     * Sets the value of the recordingInformationFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordingInformationFilter(String value) {
        this.recordingInformationFilter = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SearchScopeExtension }
     *     
     */
    public SearchScopeExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScopeExtension }
     *     
     */
    public void setExtension(SearchScopeExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}

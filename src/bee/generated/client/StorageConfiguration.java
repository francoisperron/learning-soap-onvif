
package bee.generated.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageConfiguration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://www.onvif.org/ver10/device/wsdl}StorageConfigurationData" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageConfiguration", namespace = "http://www.onvif.org/ver10/device/wsdl", propOrder = {
    "data"
})
public class StorageConfiguration
    extends DeviceEntity
{

    @XmlElement(name = "Data", required = true)
    protected StorageConfigurationData data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link StorageConfigurationData }
     *     
     */
    public StorageConfigurationData getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageConfigurationData }
     *     
     */
    public void setData(StorageConfigurationData value) {
        this.data = value;
    }

}

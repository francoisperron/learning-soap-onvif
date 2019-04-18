
package bee.generated.client;

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
 *         &lt;element name="CertificateStatus" type="{http://www.onvif.org/ver10/schema}CertificateStatus" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
    "certificateStatus"
})
@XmlRootElement(name = "SetCertificatesStatus", namespace = "http://www.onvif.org/ver10/device/wsdl")
public class SetCertificatesStatus {

    @XmlElement(name = "CertificateStatus", namespace = "http://www.onvif.org/ver10/device/wsdl")
    protected List<CertificateStatus> certificateStatus;

    /**
     * Gets the value of the certificateStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificateStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificateStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateStatus }
     * 
     * 
     */
    public List<CertificateStatus> getCertificateStatus() {
        if (certificateStatus == null) {
            certificateStatus = new ArrayList<CertificateStatus>();
        }
        return this.certificateStatus;
    }

}

package bee.generated.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="TopicExpression" type="{http://docs.oasis-open.org/wsn/b-2}TopicExpressionType" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="FixedTopicSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="TopicExpressionDialect" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="TopicSet" type="{http://docs.oasis-open.org/wsn/t-1}TopicSetType" minOccurs="0" form="qualified"/>
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
    "topicExpression",
    "fixedTopicSet",
    "topicExpressionDialect",
    "topicSet"
})
@XmlRootElement(name = "NotificationProducerRP", namespace = "http://docs.oasis-open.org/wsn/b-2")
public class NotificationProducerRP {

    @XmlElement(name = "TopicExpression", namespace = "http://docs.oasis-open.org/wsn/b-2")
    protected List<TopicExpressionType> topicExpression;
    @XmlElement(name = "FixedTopicSet", namespace = "http://docs.oasis-open.org/wsn/b-2", defaultValue = "true")
    protected Boolean fixedTopicSet;
    @XmlElement(name = "TopicExpressionDialect", namespace = "http://docs.oasis-open.org/wsn/b-2")
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicExpressionDialect;
    @XmlElement(name = "TopicSet", namespace = "http://docs.oasis-open.org/wsn/b-2")
    protected TopicSetType topicSet;

    /**
     * Gets the value of the topicExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopicExpressionType }
     * 
     * 
     */
    public List<TopicExpressionType> getTopicExpression() {
        if (topicExpression == null) {
            topicExpression = new ArrayList<TopicExpressionType>();
        }
        return this.topicExpression;
    }

    /**
     * Gets the value of the fixedTopicSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedTopicSet() {
        return fixedTopicSet;
    }

    /**
     * Sets the value of the fixedTopicSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedTopicSet(Boolean value) {
        this.fixedTopicSet = value;
    }

    /**
     * Gets the value of the topicExpressionDialect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicExpressionDialect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicExpressionDialect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTopicExpressionDialect() {
        if (topicExpressionDialect == null) {
            topicExpressionDialect = new ArrayList<String>();
        }
        return this.topicExpressionDialect;
    }

    /**
     * Gets the value of the topicSet property.
     * 
     * @return
     *     possible object is
     *     {@link TopicSetType }
     *     
     */
    public TopicSetType getTopicSet() {
        return topicSet;
    }

    /**
     * Sets the value of the topicSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicSetType }
     *     
     */
    public void setTopicSet(TopicSetType value) {
        this.topicSet = value;
    }

}


package systemic.sif3.infra.common.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for alert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reporter" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="cause" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="exchange">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="REQUEST"/>
 *               &lt;enumeration value="RESPONSE"/>
 *               &lt;enumeration value="EVENT"/>
 *               &lt;enumeration value="TIMEOUT"/>
 *               &lt;enumeration value="OTHER"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="level">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value=" INFO"/>
 *               &lt;enumeration value="STATECHANGE"/>
 *               &lt;enumeration value="WARNING"/>
 *               &lt;enumeration value="ERROR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="messageID" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="internal" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.sifassociation.org/infrastructure/3.0}uuidType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alert", namespace = "http://www.sifassociation.org/infrastructure/3.0", propOrder = {
    "reporter",
    "cause",
    "exchange",
    "level",
    "description",
    "messageID",
    "body",
    "error",
    "xpath",
    "category",
    "code",
    "internal"
})
public class Alert {

    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reporter;
    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cause;
    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String exchange;
    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String level;
    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String messageID;
    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0")
    protected Object body;
    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0")
    protected String error;
    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String xpath;
    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0")
    @XmlSchemaType(name = "unsignedInt")
    protected long category;
    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0")
    @XmlSchemaType(name = "unsignedInt")
    protected long code;
    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internal;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the value of the reporter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporter() {
        return reporter;
    }

    /**
     * Sets the value of the reporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporter(String value) {
        this.reporter = value;
    }

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCause(String value) {
        this.cause = value;
    }

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchange(String value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBody(Object value) {
        this.body = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpath() {
        return xpath;
    }

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpath(String value) {
        this.xpath = value;
    }

    /**
     * Gets the value of the category property.
     * 
     */
    public long getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     */
    public void setCategory(long value) {
        this.category = value;
    }

    /**
     * Gets the value of the code property.
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(long value) {
        this.code = value;
    }

    /**
     * Gets the value of the internal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternal() {
        return internal;
    }

    /**
     * Sets the value of the internal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternal(String value) {
        this.internal = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}

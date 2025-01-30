
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ApiVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsValidAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Language" type="{http://api.frenoy.net/TabTAPI}SupportedLanguages"/&gt;
 *         &lt;element name="Database" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RequestorIp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConsumedTicks" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CurrentQuota" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="AllowedQuota" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PhpVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DbVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "TestResponse")
public class TestResponse {

    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "ApiVersion", required = true)
    protected String apiVersion;
    @XmlElement(name = "IsValidAccount")
    protected boolean isValidAccount;
    @XmlElement(name = "Language", required = true)
    @XmlSchemaType(name = "string")
    protected SupportedLanguages language;
    @XmlElement(name = "Database", required = true)
    protected String database;
    @XmlElement(name = "RequestorIp", required = true)
    protected String requestorIp;
    @XmlElement(name = "ConsumedTicks", required = true)
    protected BigInteger consumedTicks;
    @XmlElement(name = "CurrentQuota", required = true)
    protected BigInteger currentQuota;
    @XmlElement(name = "AllowedQuota", required = true)
    protected BigInteger allowedQuota;
    @XmlElement(name = "PhpVersion")
    protected String phpVersion;
    @XmlElement(name = "DbVersion")
    protected String dbVersion;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the apiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiVersion(String value) {
        this.apiVersion = value;
    }

    /**
     * Gets the value of the isValidAccount property.
     * 
     */
    public boolean isIsValidAccount() {
        return isValidAccount;
    }

    /**
     * Sets the value of the isValidAccount property.
     * 
     */
    public void setIsValidAccount(boolean value) {
        this.isValidAccount = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedLanguages }
     *     
     */
    public SupportedLanguages getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedLanguages }
     *     
     */
    public void setLanguage(SupportedLanguages value) {
        this.language = value;
    }

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabase(String value) {
        this.database = value;
    }

    /**
     * Gets the value of the requestorIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorIp() {
        return requestorIp;
    }

    /**
     * Sets the value of the requestorIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorIp(String value) {
        this.requestorIp = value;
    }

    /**
     * Gets the value of the consumedTicks property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsumedTicks() {
        return consumedTicks;
    }

    /**
     * Sets the value of the consumedTicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsumedTicks(BigInteger value) {
        this.consumedTicks = value;
    }

    /**
     * Gets the value of the currentQuota property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentQuota() {
        return currentQuota;
    }

    /**
     * Sets the value of the currentQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentQuota(BigInteger value) {
        this.currentQuota = value;
    }

    /**
     * Gets the value of the allowedQuota property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAllowedQuota() {
        return allowedQuota;
    }

    /**
     * Sets the value of the allowedQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAllowedQuota(BigInteger value) {
        this.allowedQuota = value;
    }

    /**
     * Gets the value of the phpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhpVersion() {
        return phpVersion;
    }

    /**
     * Sets the value of the phpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhpVersion(String value) {
        this.phpVersion = value;
    }

    /**
     * Gets the value of the dbVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * Sets the value of the dbVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbVersion(String value) {
        this.dbVersion = value;
    }

}

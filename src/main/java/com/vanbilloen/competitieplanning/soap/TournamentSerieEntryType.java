
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TournamentSerieEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TournamentSerieEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ResultEntries" type="{http://api.frenoy.net/TabTAPI}IndividualMatchResultEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationEntries" type="{http://api.frenoy.net/TabTAPI}TournamentRegistrationEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TournamentSerieEntryType", propOrder = {
    "uniqueIndex",
    "name",
    "resultCount",
    "resultEntries",
    "registrationCount",
    "registrationEntries"
})
public class TournamentSerieEntryType {

    @XmlElement(name = "UniqueIndex", required = true)
    protected BigInteger uniqueIndex;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ResultCount")
    protected BigInteger resultCount;
    @XmlElement(name = "ResultEntries")
    protected List<IndividualMatchResultEntryType> resultEntries;
    @XmlElement(name = "RegistrationCount")
    protected BigInteger registrationCount;
    @XmlElement(name = "RegistrationEntries")
    protected List<TournamentRegistrationEntryType> registrationEntries;

    /**
     * Gets the value of the uniqueIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUniqueIndex() {
        return uniqueIndex;
    }

    /**
     * Sets the value of the uniqueIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUniqueIndex(BigInteger value) {
        this.uniqueIndex = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultCount(BigInteger value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the resultEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the resultEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualMatchResultEntryType }
     * 
     * 
     */
    public List<IndividualMatchResultEntryType> getResultEntries() {
        if (resultEntries == null) {
            resultEntries = new ArrayList<IndividualMatchResultEntryType>();
        }
        return this.resultEntries;
    }

    /**
     * Gets the value of the registrationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegistrationCount() {
        return registrationCount;
    }

    /**
     * Sets the value of the registrationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegistrationCount(BigInteger value) {
        this.registrationCount = value;
    }

    /**
     * Gets the value of the registrationEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the registrationEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TournamentRegistrationEntryType }
     * 
     * 
     */
    public List<TournamentRegistrationEntryType> getRegistrationEntries() {
        if (registrationEntries == null) {
            registrationEntries = new ArrayList<TournamentRegistrationEntryType>();
        }
        return this.registrationEntries;
    }

}

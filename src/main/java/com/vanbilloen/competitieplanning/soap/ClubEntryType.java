
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClubEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClubEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UniqueIndex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VenueCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="VenueEntries" type="{http://api.frenoy.net/TabTAPI}VenueEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClubEntryType", propOrder = {
    "uniqueIndex",
    "name",
    "longName",
    "category",
    "categoryName",
    "venueCount",
    "venueEntries"
})
public class ClubEntryType {

    @XmlElement(name = "UniqueIndex", required = true)
    protected String uniqueIndex;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "LongName", required = true)
    protected String longName;
    @XmlElement(name = "Category", required = true)
    protected BigInteger category;
    @XmlElement(name = "CategoryName", required = true)
    protected String categoryName;
    @XmlElement(name = "VenueCount")
    protected BigInteger venueCount;
    @XmlElement(name = "VenueEntries")
    protected List<VenueEntryType> venueEntries;

    /**
     * Gets the value of the uniqueIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueIndex() {
        return uniqueIndex;
    }

    /**
     * Sets the value of the uniqueIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueIndex(String value) {
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
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategory(BigInteger value) {
        this.category = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the venueCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVenueCount() {
        return venueCount;
    }

    /**
     * Sets the value of the venueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVenueCount(BigInteger value) {
        this.venueCount = value;
    }

    /**
     * Gets the value of the venueEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the venueEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVenueEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VenueEntryType }
     * 
     * 
     */
    public List<VenueEntryType> getVenueEntries() {
        if (venueEntries == null) {
            venueEntries = new ArrayList<VenueEntryType>();
        }
        return this.venueEntries;
    }

}


package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlayerCategoryEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlayerCategoryEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RankingCategory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="IsGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GroupMembers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StrictSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="StrictMinimumAge" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="StrictMaximumAge" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlayerCategoryEntryType", propOrder = {
    "uniqueIndex",
    "name",
    "shortName",
    "rankingCategory",
    "isGroup",
    "groupMembers",
    "sex",
    "strictSex",
    "minimumAge",
    "maximumAge",
    "strictMinimumAge",
    "strictMaximumAge"
})
public class PlayerCategoryEntryType {

    @XmlElement(name = "UniqueIndex", required = true)
    protected BigInteger uniqueIndex;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ShortName", required = true)
    protected String shortName;
    @XmlElement(name = "RankingCategory", required = true)
    protected BigInteger rankingCategory;
    @XmlElement(name = "IsGroup")
    protected Boolean isGroup;
    @XmlElement(name = "GroupMembers")
    protected String groupMembers;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "StrictSex")
    protected String strictSex;
    @XmlElement(name = "MinimumAge")
    protected BigInteger minimumAge;
    @XmlElement(name = "MaximumAge")
    protected BigInteger maximumAge;
    @XmlElement(name = "StrictMinimumAge")
    protected BigInteger strictMinimumAge;
    @XmlElement(name = "StrictMaximumAge")
    protected BigInteger strictMaximumAge;

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
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the rankingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRankingCategory() {
        return rankingCategory;
    }

    /**
     * Sets the value of the rankingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRankingCategory(BigInteger value) {
        this.rankingCategory = value;
    }

    /**
     * Gets the value of the isGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGroup() {
        return isGroup;
    }

    /**
     * Sets the value of the isGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGroup(Boolean value) {
        this.isGroup = value;
    }

    /**
     * Gets the value of the groupMembers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMembers() {
        return groupMembers;
    }

    /**
     * Sets the value of the groupMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMembers(String value) {
        this.groupMembers = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the strictSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrictSex() {
        return strictSex;
    }

    /**
     * Sets the value of the strictSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrictSex(String value) {
        this.strictSex = value;
    }

    /**
     * Gets the value of the minimumAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumAge() {
        return minimumAge;
    }

    /**
     * Sets the value of the minimumAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumAge(BigInteger value) {
        this.minimumAge = value;
    }

    /**
     * Gets the value of the maximumAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumAge() {
        return maximumAge;
    }

    /**
     * Sets the value of the maximumAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumAge(BigInteger value) {
        this.maximumAge = value;
    }

    /**
     * Gets the value of the strictMinimumAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStrictMinimumAge() {
        return strictMinimumAge;
    }

    /**
     * Sets the value of the strictMinimumAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStrictMinimumAge(BigInteger value) {
        this.strictMinimumAge = value;
    }

    /**
     * Gets the value of the strictMaximumAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStrictMaximumAge() {
        return strictMaximumAge;
    }

    /**
     * Sets the value of the strictMaximumAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStrictMaximumAge(BigInteger value) {
        this.strictMaximumAge = value;
    }

}

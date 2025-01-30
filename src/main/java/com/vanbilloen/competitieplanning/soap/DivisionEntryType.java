
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DivisionEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DivisionEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="DivisionId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DivisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DivisionCategory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MatchType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PlayerCategory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DivisionEntryType", propOrder = {

})
public class DivisionEntryType {

    @XmlElement(name = "DivisionId", required = true)
    protected BigInteger divisionId;
    @XmlElement(name = "DivisionName")
    protected String divisionName;
    @XmlElement(name = "DivisionCategory", required = true)
    protected BigInteger divisionCategory;
    @XmlElement(name = "Level", required = true)
    protected BigInteger level;
    @XmlElement(name = "MatchType", required = true)
    protected BigInteger matchType;
    @XmlElement(name = "PlayerCategory", required = true)
    protected BigInteger playerCategory;

    /**
     * Gets the value of the divisionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDivisionId() {
        return divisionId;
    }

    /**
     * Sets the value of the divisionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDivisionId(BigInteger value) {
        this.divisionId = value;
    }

    /**
     * Gets the value of the divisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisionName() {
        return divisionName;
    }

    /**
     * Sets the value of the divisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisionName(String value) {
        this.divisionName = value;
    }

    /**
     * Gets the value of the divisionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDivisionCategory() {
        return divisionCategory;
    }

    /**
     * Sets the value of the divisionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDivisionCategory(BigInteger value) {
        this.divisionCategory = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel(BigInteger value) {
        this.level = value;
    }

    /**
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchType(BigInteger value) {
        this.matchType = value;
    }

    /**
     * Gets the value of the playerCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayerCategory() {
        return playerCategory;
    }

    /**
     * Sets the value of the playerCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayerCategory(BigInteger value) {
        this.playerCategory = value;
    }

}

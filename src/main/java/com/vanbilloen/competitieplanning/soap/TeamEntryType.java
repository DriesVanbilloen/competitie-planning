
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeamEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="TeamId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Team" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DivisionId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DivisionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DivisionCategory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MatchType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamEntryType", propOrder = {

})
public class TeamEntryType {

    @XmlElement(name = "TeamId", required = true)
    protected String teamId;
    @XmlElement(name = "Team", required = true)
    protected String team;
    @XmlElement(name = "DivisionId", required = true)
    protected BigInteger divisionId;
    @XmlElement(name = "DivisionName", required = true)
    protected String divisionName;
    @XmlElement(name = "DivisionCategory", required = true)
    protected BigInteger divisionCategory;
    @XmlElement(name = "MatchType", required = true)
    protected BigInteger matchType;

    /**
     * Gets the value of the teamId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * Sets the value of the teamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamId(String value) {
        this.teamId = value;
    }

    /**
     * Gets the value of the team property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam(String value) {
        this.team = value;
    }

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

}

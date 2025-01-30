
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
 *         &lt;element name="Credentials" type="{http://api.frenoy.net/TabTAPI}CredentialsType" minOccurs="0"/&gt;
 *         &lt;element name="DivisionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Club" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Team" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DivisionCategory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Season" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="WeekName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ShowDivisionName" type="{http://api.frenoy.net/TabTAPI}ShowDivisionNameType" minOccurs="0"/&gt;
 *         &lt;element name="YearDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="YearDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="WithDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MatchUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlRootElement(name = "GetMatchesRequest")
public class GetMatchesRequest {

    @XmlElement(name = "Credentials")
    protected CredentialsType credentials;
    @XmlElement(name = "DivisionId")
    protected BigInteger divisionId;
    @XmlElement(name = "Club")
    protected String club;
    @XmlElement(name = "Team")
    protected String team;
    @XmlElement(name = "DivisionCategory")
    protected BigInteger divisionCategory;
    @XmlElement(name = "Season")
    protected BigInteger season;
    @XmlElement(name = "WeekName")
    protected String weekName;
    @XmlElement(name = "Level")
    protected BigInteger level;
    @XmlElement(name = "ShowDivisionName")
    @XmlSchemaType(name = "string")
    protected ShowDivisionNameType showDivisionName;
    @XmlElement(name = "YearDateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar yearDateFrom;
    @XmlElement(name = "YearDateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar yearDateTo;
    @XmlElement(name = "WithDetails")
    protected Boolean withDetails;
    @XmlElement(name = "MatchId")
    protected String matchId;
    @XmlElement(name = "MatchUniqueId")
    protected String matchUniqueId;

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialsType }
     *     
     */
    public CredentialsType getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialsType }
     *     
     */
    public void setCredentials(CredentialsType value) {
        this.credentials = value;
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
     * Gets the value of the club property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClub() {
        return club;
    }

    /**
     * Sets the value of the club property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClub(String value) {
        this.club = value;
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
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeason(BigInteger value) {
        this.season = value;
    }

    /**
     * Gets the value of the weekName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekName() {
        return weekName;
    }

    /**
     * Sets the value of the weekName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekName(String value) {
        this.weekName = value;
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
     * Gets the value of the showDivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link ShowDivisionNameType }
     *     
     */
    public ShowDivisionNameType getShowDivisionName() {
        return showDivisionName;
    }

    /**
     * Sets the value of the showDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowDivisionNameType }
     *     
     */
    public void setShowDivisionName(ShowDivisionNameType value) {
        this.showDivisionName = value;
    }

    /**
     * Gets the value of the yearDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearDateFrom() {
        return yearDateFrom;
    }

    /**
     * Sets the value of the yearDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearDateFrom(XMLGregorianCalendar value) {
        this.yearDateFrom = value;
    }

    /**
     * Gets the value of the yearDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearDateTo() {
        return yearDateTo;
    }

    /**
     * Sets the value of the yearDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearDateTo(XMLGregorianCalendar value) {
        this.yearDateTo = value;
    }

    /**
     * Gets the value of the withDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithDetails() {
        return withDetails;
    }

    /**
     * Sets the value of the withDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithDetails(Boolean value) {
        this.withDetails = value;
    }

    /**
     * Gets the value of the matchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchId() {
        return matchId;
    }

    /**
     * Sets the value of the matchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchId(String value) {
        this.matchId = value;
    }

    /**
     * Gets the value of the matchUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchUniqueId() {
        return matchUniqueId;
    }

    /**
     * Sets the value of the matchUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchUniqueId(String value) {
        this.matchUniqueId = value;
    }

}

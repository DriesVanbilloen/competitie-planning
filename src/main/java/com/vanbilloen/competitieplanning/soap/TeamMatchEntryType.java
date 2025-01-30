
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamMatchEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeamMatchEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="DivisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MatchId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WeekName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="Venue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="VenueClub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VenueEntry" type="{http://api.frenoy.net/TabTAPI}VenueEntryType" minOccurs="0"/&gt;
 *         &lt;element name="HomeClub" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HomeTeam" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AwayClub" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AwayTeam" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MatchUniqueId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NextWeekName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousWeekName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsHomeForfeited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAwayForfeited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MatchDetails" type="{http://api.frenoy.net/TabTAPI}TeamMatchDetailsEntryType" minOccurs="0"/&gt;
 *         &lt;element name="DivisionId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DivisionCategory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="IsHomeWithdrawn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAwayWithdrawn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsValidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamMatchEntryType", propOrder = {

})
public class TeamMatchEntryType {

    @XmlElement(name = "DivisionName")
    protected String divisionName;
    @XmlElement(name = "MatchId", required = true)
    protected String matchId;
    @XmlElement(name = "WeekName", required = true)
    protected String weekName;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Venue")
    protected BigInteger venue;
    @XmlElement(name = "VenueClub")
    protected String venueClub;
    @XmlElement(name = "VenueEntry")
    protected VenueEntryType venueEntry;
    @XmlElement(name = "HomeClub", required = true)
    protected String homeClub;
    @XmlElement(name = "HomeTeam", required = true)
    protected String homeTeam;
    @XmlElement(name = "AwayClub", required = true)
    protected String awayClub;
    @XmlElement(name = "AwayTeam", required = true)
    protected String awayTeam;
    @XmlElement(name = "Score")
    protected String score;
    @XmlElement(name = "MatchUniqueId")
    protected BigInteger matchUniqueId;
    @XmlElement(name = "NextWeekName")
    protected String nextWeekName;
    @XmlElement(name = "PreviousWeekName")
    protected String previousWeekName;
    @XmlElement(name = "IsHomeForfeited")
    protected Boolean isHomeForfeited;
    @XmlElement(name = "IsAwayForfeited")
    protected Boolean isAwayForfeited;
    @XmlElement(name = "MatchDetails")
    protected TeamMatchDetailsEntryType matchDetails;
    @XmlElement(name = "DivisionId", required = true)
    protected BigInteger divisionId;
    @XmlElement(name = "DivisionCategory", required = true)
    protected BigInteger divisionCategory;
    @XmlElement(name = "IsHomeWithdrawn")
    protected String isHomeWithdrawn;
    @XmlElement(name = "IsAwayWithdrawn")
    protected String isAwayWithdrawn;
    @XmlElement(name = "IsValidated")
    protected Boolean isValidated;
    @XmlElement(name = "IsLocked")
    protected Boolean isLocked;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the venue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVenue() {
        return venue;
    }

    /**
     * Sets the value of the venue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVenue(BigInteger value) {
        this.venue = value;
    }

    /**
     * Gets the value of the venueClub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenueClub() {
        return venueClub;
    }

    /**
     * Sets the value of the venueClub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenueClub(String value) {
        this.venueClub = value;
    }

    /**
     * Gets the value of the venueEntry property.
     * 
     * @return
     *     possible object is
     *     {@link VenueEntryType }
     *     
     */
    public VenueEntryType getVenueEntry() {
        return venueEntry;
    }

    /**
     * Sets the value of the venueEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link VenueEntryType }
     *     
     */
    public void setVenueEntry(VenueEntryType value) {
        this.venueEntry = value;
    }

    /**
     * Gets the value of the homeClub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeClub() {
        return homeClub;
    }

    /**
     * Sets the value of the homeClub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeClub(String value) {
        this.homeClub = value;
    }

    /**
     * Gets the value of the homeTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeTeam() {
        return homeTeam;
    }

    /**
     * Sets the value of the homeTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeTeam(String value) {
        this.homeTeam = value;
    }

    /**
     * Gets the value of the awayClub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwayClub() {
        return awayClub;
    }

    /**
     * Sets the value of the awayClub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwayClub(String value) {
        this.awayClub = value;
    }

    /**
     * Gets the value of the awayTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwayTeam() {
        return awayTeam;
    }

    /**
     * Sets the value of the awayTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwayTeam(String value) {
        this.awayTeam = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
    }

    /**
     * Gets the value of the matchUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchUniqueId() {
        return matchUniqueId;
    }

    /**
     * Sets the value of the matchUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchUniqueId(BigInteger value) {
        this.matchUniqueId = value;
    }

    /**
     * Gets the value of the nextWeekName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextWeekName() {
        return nextWeekName;
    }

    /**
     * Sets the value of the nextWeekName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextWeekName(String value) {
        this.nextWeekName = value;
    }

    /**
     * Gets the value of the previousWeekName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousWeekName() {
        return previousWeekName;
    }

    /**
     * Sets the value of the previousWeekName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousWeekName(String value) {
        this.previousWeekName = value;
    }

    /**
     * Gets the value of the isHomeForfeited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHomeForfeited() {
        return isHomeForfeited;
    }

    /**
     * Sets the value of the isHomeForfeited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHomeForfeited(Boolean value) {
        this.isHomeForfeited = value;
    }

    /**
     * Gets the value of the isAwayForfeited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAwayForfeited() {
        return isAwayForfeited;
    }

    /**
     * Sets the value of the isAwayForfeited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAwayForfeited(Boolean value) {
        this.isAwayForfeited = value;
    }

    /**
     * Gets the value of the matchDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TeamMatchDetailsEntryType }
     *     
     */
    public TeamMatchDetailsEntryType getMatchDetails() {
        return matchDetails;
    }

    /**
     * Sets the value of the matchDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamMatchDetailsEntryType }
     *     
     */
    public void setMatchDetails(TeamMatchDetailsEntryType value) {
        this.matchDetails = value;
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
     * Gets the value of the isHomeWithdrawn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHomeWithdrawn() {
        return isHomeWithdrawn;
    }

    /**
     * Sets the value of the isHomeWithdrawn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHomeWithdrawn(String value) {
        this.isHomeWithdrawn = value;
    }

    /**
     * Gets the value of the isAwayWithdrawn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAwayWithdrawn() {
        return isAwayWithdrawn;
    }

    /**
     * Sets the value of the isAwayWithdrawn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAwayWithdrawn(String value) {
        this.isAwayWithdrawn = value;
    }

    /**
     * Gets the value of the isValidated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidated() {
        return isValidated;
    }

    /**
     * Sets the value of the isValidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidated(Boolean value) {
        this.isValidated = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
    }

}

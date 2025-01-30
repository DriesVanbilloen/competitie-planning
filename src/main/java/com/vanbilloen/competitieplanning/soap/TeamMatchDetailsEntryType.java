
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamMatchDetailsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeamMatchDetailsEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DetailsCreated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="HomeCaptain" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AwayCaptain" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Referee" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="HallCommissioner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="HomePlayers" type="{http://api.frenoy.net/TabTAPI}TeamMatchPlayerListType" minOccurs="0"/&gt;
 *         &lt;element name="AwayPlayers" type="{http://api.frenoy.net/TabTAPI}TeamMatchPlayerListType" minOccurs="0"/&gt;
 *         &lt;element name="IndividualMatchResults" type="{http://api.frenoy.net/TabTAPI}IndividualMatchResultEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MatchSystem" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="HomeScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AwayScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CommentCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CommentEntries" type="{http://api.frenoy.net/TabTAPI}CommentEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamMatchDetailsEntryType", propOrder = {
    "detailsCreated",
    "startTime",
    "endTime",
    "homeCaptain",
    "awayCaptain",
    "referee",
    "hallCommissioner",
    "homePlayers",
    "awayPlayers",
    "individualMatchResults",
    "matchSystem",
    "homeScore",
    "awayScore",
    "commentCount",
    "commentEntries"
})
public class TeamMatchDetailsEntryType {

    @XmlElement(name = "DetailsCreated")
    protected boolean detailsCreated;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "HomeCaptain")
    protected BigInteger homeCaptain;
    @XmlElement(name = "AwayCaptain")
    protected BigInteger awayCaptain;
    @XmlElement(name = "Referee")
    protected BigInteger referee;
    @XmlElement(name = "HallCommissioner")
    protected BigInteger hallCommissioner;
    @XmlElement(name = "HomePlayers")
    protected TeamMatchPlayerListType homePlayers;
    @XmlElement(name = "AwayPlayers")
    protected TeamMatchPlayerListType awayPlayers;
    @XmlElement(name = "IndividualMatchResults")
    protected List<IndividualMatchResultEntryType> individualMatchResults;
    @XmlElement(name = "MatchSystem", required = true)
    protected BigInteger matchSystem;
    @XmlElement(name = "HomeScore")
    protected BigInteger homeScore;
    @XmlElement(name = "AwayScore")
    protected BigInteger awayScore;
    @XmlElement(name = "CommentCount")
    protected BigInteger commentCount;
    @XmlElement(name = "CommentEntries")
    protected List<CommentEntryType> commentEntries;

    /**
     * Gets the value of the detailsCreated property.
     * 
     */
    public boolean isDetailsCreated() {
        return detailsCreated;
    }

    /**
     * Sets the value of the detailsCreated property.
     * 
     */
    public void setDetailsCreated(boolean value) {
        this.detailsCreated = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the homeCaptain property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHomeCaptain() {
        return homeCaptain;
    }

    /**
     * Sets the value of the homeCaptain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHomeCaptain(BigInteger value) {
        this.homeCaptain = value;
    }

    /**
     * Gets the value of the awayCaptain property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAwayCaptain() {
        return awayCaptain;
    }

    /**
     * Sets the value of the awayCaptain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAwayCaptain(BigInteger value) {
        this.awayCaptain = value;
    }

    /**
     * Gets the value of the referee property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferee() {
        return referee;
    }

    /**
     * Sets the value of the referee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferee(BigInteger value) {
        this.referee = value;
    }

    /**
     * Gets the value of the hallCommissioner property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHallCommissioner() {
        return hallCommissioner;
    }

    /**
     * Sets the value of the hallCommissioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHallCommissioner(BigInteger value) {
        this.hallCommissioner = value;
    }

    /**
     * Gets the value of the homePlayers property.
     * 
     * @return
     *     possible object is
     *     {@link TeamMatchPlayerListType }
     *     
     */
    public TeamMatchPlayerListType getHomePlayers() {
        return homePlayers;
    }

    /**
     * Sets the value of the homePlayers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamMatchPlayerListType }
     *     
     */
    public void setHomePlayers(TeamMatchPlayerListType value) {
        this.homePlayers = value;
    }

    /**
     * Gets the value of the awayPlayers property.
     * 
     * @return
     *     possible object is
     *     {@link TeamMatchPlayerListType }
     *     
     */
    public TeamMatchPlayerListType getAwayPlayers() {
        return awayPlayers;
    }

    /**
     * Sets the value of the awayPlayers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamMatchPlayerListType }
     *     
     */
    public void setAwayPlayers(TeamMatchPlayerListType value) {
        this.awayPlayers = value;
    }

    /**
     * Gets the value of the individualMatchResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the individualMatchResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualMatchResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualMatchResultEntryType }
     * 
     * 
     */
    public List<IndividualMatchResultEntryType> getIndividualMatchResults() {
        if (individualMatchResults == null) {
            individualMatchResults = new ArrayList<IndividualMatchResultEntryType>();
        }
        return this.individualMatchResults;
    }

    /**
     * Gets the value of the matchSystem property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchSystem() {
        return matchSystem;
    }

    /**
     * Sets the value of the matchSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchSystem(BigInteger value) {
        this.matchSystem = value;
    }

    /**
     * Gets the value of the homeScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHomeScore() {
        return homeScore;
    }

    /**
     * Sets the value of the homeScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHomeScore(BigInteger value) {
        this.homeScore = value;
    }

    /**
     * Gets the value of the awayScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAwayScore() {
        return awayScore;
    }

    /**
     * Sets the value of the awayScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAwayScore(BigInteger value) {
        this.awayScore = value;
    }

    /**
     * Gets the value of the commentCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCommentCount() {
        return commentCount;
    }

    /**
     * Sets the value of the commentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCommentCount(BigInteger value) {
        this.commentCount = value;
    }

    /**
     * Gets the value of the commentEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the commentEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentEntryType }
     * 
     * 
     */
    public List<CommentEntryType> getCommentEntries() {
        if (commentEntries == null) {
            commentEntries = new ArrayList<CommentEntryType>();
        }
        return this.commentEntries;
    }

}


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
 * <p>Java class for PlayerResultEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlayerResultEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="UniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ranking" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Result" type="{http://api.frenoy.net/TabTAPI}ResultType"/&gt;
 *         &lt;element name="SetFor" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SetAgainst" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CompetitionType" type="{http://api.frenoy.net/TabTAPI}CompetitionType"/&gt;
 *         &lt;element name="Club" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MatchUniqueId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TournamentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TournamentSerieName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TeamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RankingEvaluationCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="RankingEvaluationEntries" type="{http://api.frenoy.net/TabTAPI}PlayerRankingEvaluationEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RankingEvaluationCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlayerResultEntryType", propOrder = {
    "date",
    "uniqueIndex",
    "firstName",
    "lastName",
    "ranking",
    "result",
    "setFor",
    "setAgainst",
    "competitionType",
    "club",
    "matchId",
    "matchUniqueId",
    "tournamentName",
    "tournamentSerieName",
    "teamName",
    "rankingEvaluationCount",
    "rankingEvaluationEntries",
    "rankingEvaluationCategory"
})
public class PlayerResultEntryType {

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "UniqueIndex", required = true)
    protected BigInteger uniqueIndex;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "Ranking", required = true)
    protected String ranking;
    @XmlElement(name = "Result", required = true)
    @XmlSchemaType(name = "string")
    protected ResultType result;
    @XmlElement(name = "SetFor", required = true)
    protected BigInteger setFor;
    @XmlElement(name = "SetAgainst", required = true)
    protected BigInteger setAgainst;
    @XmlElement(name = "CompetitionType", required = true)
    @XmlSchemaType(name = "string")
    protected CompetitionType competitionType;
    @XmlElement(name = "Club")
    protected String club;
    @XmlElement(name = "MatchId")
    protected String matchId;
    @XmlElement(name = "MatchUniqueId")
    protected BigInteger matchUniqueId;
    @XmlElement(name = "TournamentName")
    protected String tournamentName;
    @XmlElement(name = "TournamentSerieName")
    protected String tournamentSerieName;
    @XmlElement(name = "TeamName")
    protected String teamName;
    @XmlElement(name = "RankingEvaluationCount")
    protected BigInteger rankingEvaluationCount;
    @XmlElement(name = "RankingEvaluationEntries")
    protected List<PlayerRankingEvaluationEntryType> rankingEvaluationEntries;
    @XmlElement(name = "RankingEvaluationCategory")
    protected String rankingEvaluationCategory;

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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the ranking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRanking() {
        return ranking;
    }

    /**
     * Sets the value of the ranking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRanking(String value) {
        this.ranking = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResult(ResultType value) {
        this.result = value;
    }

    /**
     * Gets the value of the setFor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSetFor() {
        return setFor;
    }

    /**
     * Sets the value of the setFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSetFor(BigInteger value) {
        this.setFor = value;
    }

    /**
     * Gets the value of the setAgainst property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSetAgainst() {
        return setAgainst;
    }

    /**
     * Sets the value of the setAgainst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSetAgainst(BigInteger value) {
        this.setAgainst = value;
    }

    /**
     * Gets the value of the competitionType property.
     * 
     * @return
     *     possible object is
     *     {@link CompetitionType }
     *     
     */
    public CompetitionType getCompetitionType() {
        return competitionType;
    }

    /**
     * Sets the value of the competitionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetitionType }
     *     
     */
    public void setCompetitionType(CompetitionType value) {
        this.competitionType = value;
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
     * Gets the value of the tournamentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTournamentName() {
        return tournamentName;
    }

    /**
     * Sets the value of the tournamentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTournamentName(String value) {
        this.tournamentName = value;
    }

    /**
     * Gets the value of the tournamentSerieName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTournamentSerieName() {
        return tournamentSerieName;
    }

    /**
     * Sets the value of the tournamentSerieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTournamentSerieName(String value) {
        this.tournamentSerieName = value;
    }

    /**
     * Gets the value of the teamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * Gets the value of the rankingEvaluationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRankingEvaluationCount() {
        return rankingEvaluationCount;
    }

    /**
     * Sets the value of the rankingEvaluationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRankingEvaluationCount(BigInteger value) {
        this.rankingEvaluationCount = value;
    }

    /**
     * Gets the value of the rankingEvaluationEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rankingEvaluationEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRankingEvaluationEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlayerRankingEvaluationEntryType }
     * 
     * 
     */
    public List<PlayerRankingEvaluationEntryType> getRankingEvaluationEntries() {
        if (rankingEvaluationEntries == null) {
            rankingEvaluationEntries = new ArrayList<PlayerRankingEvaluationEntryType>();
        }
        return this.rankingEvaluationEntries;
    }

    /**
     * Gets the value of the rankingEvaluationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankingEvaluationCategory() {
        return rankingEvaluationCategory;
    }

    /**
     * Sets the value of the rankingEvaluationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankingEvaluationCategory(String value) {
        this.rankingEvaluationCategory = value;
    }

}

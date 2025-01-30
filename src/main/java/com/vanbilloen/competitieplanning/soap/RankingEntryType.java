
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RankingEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RankingEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Team" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GamesPlayed" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="GamesWon" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="GamesLost" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="GamesDraw" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="GamesWO" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="IndividualMatchesWon" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="IndividualMatchesLost" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="IndividualSetsWon" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="IndividualSetsLost" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TeamClub" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RankingEntryType", propOrder = {

})
public class RankingEntryType {

    @XmlElement(name = "Position", required = true)
    protected BigInteger position;
    @XmlElement(name = "Team", required = true)
    protected String team;
    @XmlElement(name = "GamesPlayed", required = true)
    protected BigInteger gamesPlayed;
    @XmlElement(name = "GamesWon", required = true)
    protected BigInteger gamesWon;
    @XmlElement(name = "GamesLost", required = true)
    protected BigInteger gamesLost;
    @XmlElement(name = "GamesDraw", required = true)
    protected BigInteger gamesDraw;
    @XmlElement(name = "GamesWO", required = true)
    protected BigInteger gamesWO;
    @XmlElement(name = "IndividualMatchesWon", required = true)
    protected BigInteger individualMatchesWon;
    @XmlElement(name = "IndividualMatchesLost", required = true)
    protected BigInteger individualMatchesLost;
    @XmlElement(name = "IndividualSetsWon", required = true)
    protected BigInteger individualSetsWon;
    @XmlElement(name = "IndividualSetsLost", required = true)
    protected BigInteger individualSetsLost;
    @XmlElement(name = "Points", required = true)
    protected BigInteger points;
    @XmlElement(name = "TeamClub", required = true)
    protected String teamClub;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
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
     * Gets the value of the gamesPlayed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGamesPlayed() {
        return gamesPlayed;
    }

    /**
     * Sets the value of the gamesPlayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGamesPlayed(BigInteger value) {
        this.gamesPlayed = value;
    }

    /**
     * Gets the value of the gamesWon property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGamesWon() {
        return gamesWon;
    }

    /**
     * Sets the value of the gamesWon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGamesWon(BigInteger value) {
        this.gamesWon = value;
    }

    /**
     * Gets the value of the gamesLost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGamesLost() {
        return gamesLost;
    }

    /**
     * Sets the value of the gamesLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGamesLost(BigInteger value) {
        this.gamesLost = value;
    }

    /**
     * Gets the value of the gamesDraw property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGamesDraw() {
        return gamesDraw;
    }

    /**
     * Sets the value of the gamesDraw property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGamesDraw(BigInteger value) {
        this.gamesDraw = value;
    }

    /**
     * Gets the value of the gamesWO property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGamesWO() {
        return gamesWO;
    }

    /**
     * Sets the value of the gamesWO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGamesWO(BigInteger value) {
        this.gamesWO = value;
    }

    /**
     * Gets the value of the individualMatchesWon property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndividualMatchesWon() {
        return individualMatchesWon;
    }

    /**
     * Sets the value of the individualMatchesWon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndividualMatchesWon(BigInteger value) {
        this.individualMatchesWon = value;
    }

    /**
     * Gets the value of the individualMatchesLost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndividualMatchesLost() {
        return individualMatchesLost;
    }

    /**
     * Sets the value of the individualMatchesLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndividualMatchesLost(BigInteger value) {
        this.individualMatchesLost = value;
    }

    /**
     * Gets the value of the individualSetsWon property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndividualSetsWon() {
        return individualSetsWon;
    }

    /**
     * Sets the value of the individualSetsWon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndividualSetsWon(BigInteger value) {
        this.individualSetsWon = value;
    }

    /**
     * Gets the value of the individualSetsLost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndividualSetsLost() {
        return individualSetsLost;
    }

    /**
     * Sets the value of the individualSetsLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndividualSetsLost(BigInteger value) {
        this.individualSetsLost = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPoints(BigInteger value) {
        this.points = value;
    }

    /**
     * Gets the value of the teamClub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamClub() {
        return teamClub;
    }

    /**
     * Sets the value of the teamClub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamClub(String value) {
        this.teamClub = value;
    }

}

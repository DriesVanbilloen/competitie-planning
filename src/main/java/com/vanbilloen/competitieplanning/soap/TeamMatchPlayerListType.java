
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamMatchPlayerListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeamMatchPlayerListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlayerCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DoubleTeamCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Players" type="{http://api.frenoy.net/TabTAPI}TeamMatchPlayerEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DoubleTeams" type="{http://api.frenoy.net/TabTAPI}TeamMatchDoubleTeamEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamMatchPlayerListType", propOrder = {
    "playerCount",
    "doubleTeamCount",
    "players",
    "doubleTeams"
})
public class TeamMatchPlayerListType {

    @XmlElement(name = "PlayerCount", required = true)
    protected BigInteger playerCount;
    @XmlElement(name = "DoubleTeamCount", required = true)
    protected BigInteger doubleTeamCount;
    @XmlElement(name = "Players")
    protected List<TeamMatchPlayerEntryType> players;
    @XmlElement(name = "DoubleTeams")
    protected List<TeamMatchDoubleTeamEntryType> doubleTeams;

    /**
     * Gets the value of the playerCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayerCount() {
        return playerCount;
    }

    /**
     * Sets the value of the playerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayerCount(BigInteger value) {
        this.playerCount = value;
    }

    /**
     * Gets the value of the doubleTeamCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoubleTeamCount() {
        return doubleTeamCount;
    }

    /**
     * Sets the value of the doubleTeamCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoubleTeamCount(BigInteger value) {
        this.doubleTeamCount = value;
    }

    /**
     * Gets the value of the players property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the players property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlayers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMatchPlayerEntryType }
     * 
     * 
     */
    public List<TeamMatchPlayerEntryType> getPlayers() {
        if (players == null) {
            players = new ArrayList<TeamMatchPlayerEntryType>();
        }
        return this.players;
    }

    /**
     * Gets the value of the doubleTeams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the doubleTeams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoubleTeams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMatchDoubleTeamEntryType }
     * 
     * 
     */
    public List<TeamMatchDoubleTeamEntryType> getDoubleTeams() {
        if (doubleTeams == null) {
            doubleTeams = new ArrayList<TeamMatchDoubleTeamEntryType>();
        }
        return this.doubleTeams;
    }

}


package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence&gt;
 *         &lt;element name="MatchCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TeamMatchesEntries" type="{http://api.frenoy.net/TabTAPI}TeamMatchEntryType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "matchCount",
    "teamMatchesEntries"
})
@XmlRootElement(name = "GetMatchesResponse")
public class GetMatchesResponse {

    @XmlElement(name = "MatchCount", required = true)
    protected BigInteger matchCount;
    @XmlElement(name = "TeamMatchesEntries", required = true)
    protected List<TeamMatchEntryType> teamMatchesEntries;

    /**
     * Gets the value of the matchCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchCount() {
        return matchCount;
    }

    /**
     * Sets the value of the matchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchCount(BigInteger value) {
        this.matchCount = value;
    }

    /**
     * Gets the value of the teamMatchesEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the teamMatchesEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamMatchesEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMatchEntryType }
     * 
     * 
     */
    public List<TeamMatchEntryType> getTeamMatchesEntries() {
        if (teamMatchesEntries == null) {
            teamMatchesEntries = new ArrayList<TeamMatchEntryType>();
        }
        return this.teamMatchesEntries;
    }

}

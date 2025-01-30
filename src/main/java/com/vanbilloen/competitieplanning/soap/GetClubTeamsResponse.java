
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
 *         &lt;element name="ClubName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TeamCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TeamEntries" type="{http://api.frenoy.net/TabTAPI}TeamEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "clubName",
    "teamCount",
    "teamEntries"
})
@XmlRootElement(name = "GetClubTeamsResponse")
public class GetClubTeamsResponse {

    @XmlElement(name = "ClubName", required = true)
    protected String clubName;
    @XmlElement(name = "TeamCount", required = true)
    protected BigInteger teamCount;
    @XmlElement(name = "TeamEntries")
    protected List<TeamEntryType> teamEntries;

    /**
     * Gets the value of the clubName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubName() {
        return clubName;
    }

    /**
     * Sets the value of the clubName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubName(String value) {
        this.clubName = value;
    }

    /**
     * Gets the value of the teamCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTeamCount() {
        return teamCount;
    }

    /**
     * Sets the value of the teamCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTeamCount(BigInteger value) {
        this.teamCount = value;
    }

    /**
     * Gets the value of the teamEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the teamEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamEntryType }
     * 
     * 
     */
    public List<TeamEntryType> getTeamEntries() {
        if (teamEntries == null) {
            teamEntries = new ArrayList<TeamEntryType>();
        }
        return this.teamEntries;
    }

}

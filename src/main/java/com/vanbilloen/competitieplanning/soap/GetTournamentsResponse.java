
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
 *         &lt;element name="TournamentCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TournamentEntries" type="{http://api.frenoy.net/TabTAPI}TournamentEntryType" maxOccurs="unbounded"/&gt;
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
    "tournamentCount",
    "tournamentEntries"
})
@XmlRootElement(name = "GetTournamentsResponse")
public class GetTournamentsResponse {

    @XmlElement(name = "TournamentCount", required = true)
    protected BigInteger tournamentCount;
    @XmlElement(name = "TournamentEntries", required = true)
    protected List<TournamentEntryType> tournamentEntries;

    /**
     * Gets the value of the tournamentCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTournamentCount() {
        return tournamentCount;
    }

    /**
     * Sets the value of the tournamentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTournamentCount(BigInteger value) {
        this.tournamentCount = value;
    }

    /**
     * Gets the value of the tournamentEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tournamentEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTournamentEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TournamentEntryType }
     * 
     * 
     */
    public List<TournamentEntryType> getTournamentEntries() {
        if (tournamentEntries == null) {
            tournamentEntries = new ArrayList<TournamentEntryType>();
        }
        return this.tournamentEntries;
    }

}

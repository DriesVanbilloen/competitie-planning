
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
 *         &lt;element name="CurrentSeason" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CurrentSeasonName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SeasonEntries" type="{http://api.frenoy.net/TabTAPI}SeasonEntryType" maxOccurs="unbounded"/&gt;
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
    "currentSeason",
    "currentSeasonName",
    "seasonEntries"
})
@XmlRootElement(name = "GetSeasonsResponse")
public class GetSeasonsResponse {

    @XmlElement(name = "CurrentSeason", required = true)
    protected BigInteger currentSeason;
    @XmlElement(name = "CurrentSeasonName", required = true)
    protected String currentSeasonName;
    @XmlElement(name = "SeasonEntries", required = true)
    protected List<SeasonEntryType> seasonEntries;

    /**
     * Gets the value of the currentSeason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentSeason() {
        return currentSeason;
    }

    /**
     * Sets the value of the currentSeason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentSeason(BigInteger value) {
        this.currentSeason = value;
    }

    /**
     * Gets the value of the currentSeasonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentSeasonName() {
        return currentSeasonName;
    }

    /**
     * Sets the value of the currentSeasonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentSeasonName(String value) {
        this.currentSeasonName = value;
    }

    /**
     * Gets the value of the seasonEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the seasonEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeasonEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeasonEntryType }
     * 
     * 
     */
    public List<SeasonEntryType> getSeasonEntries() {
        if (seasonEntries == null) {
            seasonEntries = new ArrayList<SeasonEntryType>();
        }
        return this.seasonEntries;
    }

}

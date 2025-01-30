
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
 *         &lt;element name="MatchSystemCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MatchSystemEntries" type="{http://api.frenoy.net/TabTAPI}MatchSystemEntryType" maxOccurs="unbounded"/&gt;
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
    "matchSystemCount",
    "matchSystemEntries"
})
@XmlRootElement(name = "GetMatchSystemsResponse")
public class GetMatchSystemsResponse {

    @XmlElement(name = "MatchSystemCount", required = true)
    protected BigInteger matchSystemCount;
    @XmlElement(name = "MatchSystemEntries", required = true)
    protected List<MatchSystemEntryType> matchSystemEntries;

    /**
     * Gets the value of the matchSystemCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchSystemCount() {
        return matchSystemCount;
    }

    /**
     * Sets the value of the matchSystemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchSystemCount(BigInteger value) {
        this.matchSystemCount = value;
    }

    /**
     * Gets the value of the matchSystemEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the matchSystemEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchSystemEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchSystemEntryType }
     * 
     * 
     */
    public List<MatchSystemEntryType> getMatchSystemEntries() {
        if (matchSystemEntries == null) {
            matchSystemEntries = new ArrayList<MatchSystemEntryType>();
        }
        return this.matchSystemEntries;
    }

}

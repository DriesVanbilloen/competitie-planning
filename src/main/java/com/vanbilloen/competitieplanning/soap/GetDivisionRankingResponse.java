
package com.vanbilloen.competitieplanning.soap;

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
 *         &lt;element name="DivisionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RankingEntries" type="{http://api.frenoy.net/TabTAPI}RankingEntryType" maxOccurs="unbounded"/&gt;
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
    "divisionName",
    "rankingEntries"
})
@XmlRootElement(name = "GetDivisionRankingResponse")
public class GetDivisionRankingResponse {

    @XmlElement(name = "DivisionName", required = true)
    protected String divisionName;
    @XmlElement(name = "RankingEntries", required = true)
    protected List<RankingEntryType> rankingEntries;

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
     * Gets the value of the rankingEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rankingEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRankingEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RankingEntryType }
     * 
     * 
     */
    public List<RankingEntryType> getRankingEntries() {
        if (rankingEntries == null) {
            rankingEntries = new ArrayList<RankingEntryType>();
        }
        return this.rankingEntries;
    }

}

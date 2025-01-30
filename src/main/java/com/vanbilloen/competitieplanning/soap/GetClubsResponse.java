
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
 *         &lt;element name="ClubCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ClubEntries" type="{http://api.frenoy.net/TabTAPI}ClubEntryType" maxOccurs="unbounded"/&gt;
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
    "clubCount",
    "clubEntries"
})
@XmlRootElement(name = "GetClubsResponse")
public class GetClubsResponse {

    @XmlElement(name = "ClubCount", required = true)
    protected BigInteger clubCount;
    @XmlElement(name = "ClubEntries", required = true)
    protected List<ClubEntryType> clubEntries;

    /**
     * Gets the value of the clubCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClubCount() {
        return clubCount;
    }

    /**
     * Sets the value of the clubCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClubCount(BigInteger value) {
        this.clubCount = value;
    }

    /**
     * Gets the value of the clubEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the clubEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClubEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClubEntryType }
     * 
     * 
     */
    public List<ClubEntryType> getClubEntries() {
        if (clubEntries == null) {
            clubEntries = new ArrayList<ClubEntryType>();
        }
        return this.clubEntries;
    }

}

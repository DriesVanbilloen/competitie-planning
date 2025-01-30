
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
 *         &lt;element name="PlayerCategoryCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PlayerCategoryEntries" type="{http://api.frenoy.net/TabTAPI}PlayerCategoryEntryType" maxOccurs="unbounded"/&gt;
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
    "playerCategoryCount",
    "playerCategoryEntries"
})
@XmlRootElement(name = "GetPlayerCategoriesResponse")
public class GetPlayerCategoriesResponse {

    @XmlElement(name = "PlayerCategoryCount", required = true)
    protected BigInteger playerCategoryCount;
    @XmlElement(name = "PlayerCategoryEntries", required = true)
    protected List<PlayerCategoryEntryType> playerCategoryEntries;

    /**
     * Gets the value of the playerCategoryCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayerCategoryCount() {
        return playerCategoryCount;
    }

    /**
     * Sets the value of the playerCategoryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayerCategoryCount(BigInteger value) {
        this.playerCategoryCount = value;
    }

    /**
     * Gets the value of the playerCategoryEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the playerCategoryEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlayerCategoryEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlayerCategoryEntryType }
     * 
     * 
     */
    public List<PlayerCategoryEntryType> getPlayerCategoryEntries() {
        if (playerCategoryEntries == null) {
            playerCategoryEntries = new ArrayList<PlayerCategoryEntryType>();
        }
        return this.playerCategoryEntries;
    }

}

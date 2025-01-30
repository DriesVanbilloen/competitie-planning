
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualMatchResultEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualMatchResultEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="HomePlayerMatchIndex" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="HomePlayerUniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="AwayPlayerMatchIndex" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="AwayPlayerUniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="HomeSetCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AwaySetCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IsHomeForfeited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAwayForfeited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Scores" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HomePlayer" type="{http://api.frenoy.net/TabTAPI}TeamMatchPlayerEntryType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="AwayPlayer" type="{http://api.frenoy.net/TabTAPI}TeamMatchPlayerEntryType" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualMatchResultEntryType", propOrder = {
    "position",
    "homePlayerMatchIndex",
    "homePlayerUniqueIndex",
    "awayPlayerMatchIndex",
    "awayPlayerUniqueIndex",
    "homeSetCount",
    "awaySetCount",
    "isHomeForfeited",
    "isAwayForfeited",
    "scores",
    "homePlayer",
    "awayPlayer"
})
public class IndividualMatchResultEntryType {

    @XmlElement(name = "Position")
    protected BigInteger position;
    @XmlElement(name = "HomePlayerMatchIndex")
    protected List<BigInteger> homePlayerMatchIndex;
    @XmlElement(name = "HomePlayerUniqueIndex")
    protected List<BigInteger> homePlayerUniqueIndex;
    @XmlElement(name = "AwayPlayerMatchIndex")
    protected List<BigInteger> awayPlayerMatchIndex;
    @XmlElement(name = "AwayPlayerUniqueIndex")
    protected List<BigInteger> awayPlayerUniqueIndex;
    @XmlElement(name = "HomeSetCount")
    protected BigInteger homeSetCount;
    @XmlElement(name = "AwaySetCount")
    protected BigInteger awaySetCount;
    @XmlElement(name = "IsHomeForfeited")
    protected Boolean isHomeForfeited;
    @XmlElement(name = "IsAwayForfeited")
    protected Boolean isAwayForfeited;
    @XmlElement(name = "Scores")
    protected String scores;
    @XmlElement(name = "HomePlayer")
    protected List<TeamMatchPlayerEntryType> homePlayer;
    @XmlElement(name = "AwayPlayer")
    protected List<TeamMatchPlayerEntryType> awayPlayer;

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
     * Gets the value of the homePlayerMatchIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the homePlayerMatchIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomePlayerMatchIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getHomePlayerMatchIndex() {
        if (homePlayerMatchIndex == null) {
            homePlayerMatchIndex = new ArrayList<BigInteger>();
        }
        return this.homePlayerMatchIndex;
    }

    /**
     * Gets the value of the homePlayerUniqueIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the homePlayerUniqueIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomePlayerUniqueIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getHomePlayerUniqueIndex() {
        if (homePlayerUniqueIndex == null) {
            homePlayerUniqueIndex = new ArrayList<BigInteger>();
        }
        return this.homePlayerUniqueIndex;
    }

    /**
     * Gets the value of the awayPlayerMatchIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the awayPlayerMatchIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwayPlayerMatchIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getAwayPlayerMatchIndex() {
        if (awayPlayerMatchIndex == null) {
            awayPlayerMatchIndex = new ArrayList<BigInteger>();
        }
        return this.awayPlayerMatchIndex;
    }

    /**
     * Gets the value of the awayPlayerUniqueIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the awayPlayerUniqueIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwayPlayerUniqueIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getAwayPlayerUniqueIndex() {
        if (awayPlayerUniqueIndex == null) {
            awayPlayerUniqueIndex = new ArrayList<BigInteger>();
        }
        return this.awayPlayerUniqueIndex;
    }

    /**
     * Gets the value of the homeSetCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHomeSetCount() {
        return homeSetCount;
    }

    /**
     * Sets the value of the homeSetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHomeSetCount(BigInteger value) {
        this.homeSetCount = value;
    }

    /**
     * Gets the value of the awaySetCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAwaySetCount() {
        return awaySetCount;
    }

    /**
     * Sets the value of the awaySetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAwaySetCount(BigInteger value) {
        this.awaySetCount = value;
    }

    /**
     * Gets the value of the isHomeForfeited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHomeForfeited() {
        return isHomeForfeited;
    }

    /**
     * Sets the value of the isHomeForfeited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHomeForfeited(Boolean value) {
        this.isHomeForfeited = value;
    }

    /**
     * Gets the value of the isAwayForfeited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAwayForfeited() {
        return isAwayForfeited;
    }

    /**
     * Sets the value of the isAwayForfeited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAwayForfeited(Boolean value) {
        this.isAwayForfeited = value;
    }

    /**
     * Gets the value of the scores property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScores() {
        return scores;
    }

    /**
     * Sets the value of the scores property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScores(String value) {
        this.scores = value;
    }

    /**
     * Gets the value of the homePlayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the homePlayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomePlayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMatchPlayerEntryType }
     * 
     * 
     */
    public List<TeamMatchPlayerEntryType> getHomePlayer() {
        if (homePlayer == null) {
            homePlayer = new ArrayList<TeamMatchPlayerEntryType>();
        }
        return this.homePlayer;
    }

    /**
     * Gets the value of the awayPlayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the awayPlayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwayPlayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMatchPlayerEntryType }
     * 
     * 
     */
    public List<TeamMatchPlayerEntryType> getAwayPlayer() {
        if (awayPlayer == null) {
            awayPlayer = new ArrayList<TeamMatchPlayerEntryType>();
        }
        return this.awayPlayer;
    }

}

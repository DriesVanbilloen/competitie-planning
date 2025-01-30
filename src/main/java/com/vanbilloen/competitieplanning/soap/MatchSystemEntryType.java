
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchSystemEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchSystemEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SingleMatchCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DoubleMatchCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SetCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PointCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ForcedDoubleTeams" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubstituteCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TeamMatchCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TeamMatchDefinitionEntries" type="{http://api.frenoy.net/TabTAPI}TeamMatchDefinitionEntryType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchSystemEntryType", propOrder = {
    "uniqueIndex",
    "name",
    "singleMatchCount",
    "doubleMatchCount",
    "setCount",
    "pointCount",
    "forcedDoubleTeams",
    "substituteCount",
    "teamMatchCount",
    "teamMatchDefinitionEntries"
})
public class MatchSystemEntryType {

    @XmlElement(name = "UniqueIndex", required = true)
    protected BigInteger uniqueIndex;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "SingleMatchCount", required = true)
    protected BigInteger singleMatchCount;
    @XmlElement(name = "DoubleMatchCount", required = true)
    protected BigInteger doubleMatchCount;
    @XmlElement(name = "SetCount", required = true)
    protected BigInteger setCount;
    @XmlElement(name = "PointCount", required = true)
    protected BigInteger pointCount;
    @XmlElement(name = "ForcedDoubleTeams")
    protected boolean forcedDoubleTeams;
    @XmlElement(name = "SubstituteCount", required = true)
    protected BigInteger substituteCount;
    @XmlElement(name = "TeamMatchCount", required = true)
    protected BigInteger teamMatchCount;
    @XmlElement(name = "TeamMatchDefinitionEntries", required = true)
    protected List<TeamMatchDefinitionEntryType> teamMatchDefinitionEntries;

    /**
     * Gets the value of the uniqueIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUniqueIndex() {
        return uniqueIndex;
    }

    /**
     * Sets the value of the uniqueIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUniqueIndex(BigInteger value) {
        this.uniqueIndex = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the singleMatchCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSingleMatchCount() {
        return singleMatchCount;
    }

    /**
     * Sets the value of the singleMatchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSingleMatchCount(BigInteger value) {
        this.singleMatchCount = value;
    }

    /**
     * Gets the value of the doubleMatchCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoubleMatchCount() {
        return doubleMatchCount;
    }

    /**
     * Sets the value of the doubleMatchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoubleMatchCount(BigInteger value) {
        this.doubleMatchCount = value;
    }

    /**
     * Gets the value of the setCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSetCount() {
        return setCount;
    }

    /**
     * Sets the value of the setCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSetCount(BigInteger value) {
        this.setCount = value;
    }

    /**
     * Gets the value of the pointCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointCount() {
        return pointCount;
    }

    /**
     * Sets the value of the pointCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointCount(BigInteger value) {
        this.pointCount = value;
    }

    /**
     * Gets the value of the forcedDoubleTeams property.
     * 
     */
    public boolean isForcedDoubleTeams() {
        return forcedDoubleTeams;
    }

    /**
     * Sets the value of the forcedDoubleTeams property.
     * 
     */
    public void setForcedDoubleTeams(boolean value) {
        this.forcedDoubleTeams = value;
    }

    /**
     * Gets the value of the substituteCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubstituteCount() {
        return substituteCount;
    }

    /**
     * Sets the value of the substituteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubstituteCount(BigInteger value) {
        this.substituteCount = value;
    }

    /**
     * Gets the value of the teamMatchCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTeamMatchCount() {
        return teamMatchCount;
    }

    /**
     * Sets the value of the teamMatchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTeamMatchCount(BigInteger value) {
        this.teamMatchCount = value;
    }

    /**
     * Gets the value of the teamMatchDefinitionEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the teamMatchDefinitionEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamMatchDefinitionEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMatchDefinitionEntryType }
     * 
     * 
     */
    public List<TeamMatchDefinitionEntryType> getTeamMatchDefinitionEntries() {
        if (teamMatchDefinitionEntries == null) {
            teamMatchDefinitionEntries = new ArrayList<TeamMatchDefinitionEntryType>();
        }
        return this.teamMatchDefinitionEntries;
    }

}

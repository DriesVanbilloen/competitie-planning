
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamMatchDoubleTeamEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeamMatchDoubleTeamEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Team" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsForfeited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamMatchDoubleTeamEntryType", propOrder = {
    "position",
    "team",
    "isForfeited"
})
public class TeamMatchDoubleTeamEntryType {

    @XmlElement(name = "Position")
    protected BigInteger position;
    @XmlElement(name = "Team", required = true)
    protected String team;
    @XmlElement(name = "IsForfeited")
    protected Boolean isForfeited;

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
     * Gets the value of the team property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam(String value) {
        this.team = value;
    }

    /**
     * Gets the value of the isForfeited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForfeited() {
        return isForfeited;
    }

    /**
     * Sets the value of the isForfeited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForfeited(Boolean value) {
        this.isForfeited = value;
    }

}

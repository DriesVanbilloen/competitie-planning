
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamMatchDefinitionEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeamMatchDefinitionEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="HomePlayerIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AwayPlayerIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AllowSubstitute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamMatchDefinitionEntryType", propOrder = {
    "position",
    "type",
    "homePlayerIndex",
    "awayPlayerIndex",
    "allowSubstitute"
})
public class TeamMatchDefinitionEntryType {

    @XmlElement(name = "Position", required = true)
    protected BigInteger position;
    @XmlElement(name = "Type", required = true)
    protected BigInteger type;
    @XmlElement(name = "HomePlayerIndex")
    protected BigInteger homePlayerIndex;
    @XmlElement(name = "AwayPlayerIndex")
    protected BigInteger awayPlayerIndex;
    @XmlElement(name = "AllowSubstitute")
    protected Boolean allowSubstitute;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setType(BigInteger value) {
        this.type = value;
    }

    /**
     * Gets the value of the homePlayerIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHomePlayerIndex() {
        return homePlayerIndex;
    }

    /**
     * Sets the value of the homePlayerIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHomePlayerIndex(BigInteger value) {
        this.homePlayerIndex = value;
    }

    /**
     * Gets the value of the awayPlayerIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAwayPlayerIndex() {
        return awayPlayerIndex;
    }

    /**
     * Sets the value of the awayPlayerIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAwayPlayerIndex(BigInteger value) {
        this.awayPlayerIndex = value;
    }

    /**
     * Gets the value of the allowSubstitute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowSubstitute() {
        return allowSubstitute;
    }

    /**
     * Sets the value of the allowSubstitute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowSubstitute(Boolean value) {
        this.allowSubstitute = value;
    }

}

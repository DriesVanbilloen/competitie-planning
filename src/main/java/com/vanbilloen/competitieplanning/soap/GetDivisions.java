
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;all&gt;
 *         &lt;element name="Credentials" type="{http://api.frenoy.net/TabTAPI}CredentialsType" minOccurs="0"/&gt;
 *         &lt;element name="Season" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ShowDivisionName" type="{http://api.frenoy.net/TabTAPI}ShowDivisionNameType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "GetDivisions")
public class GetDivisions {

    @XmlElement(name = "Credentials")
    protected CredentialsType credentials;
    @XmlElement(name = "Season")
    protected BigInteger season;
    @XmlElement(name = "Level")
    protected BigInteger level;
    @XmlElement(name = "ShowDivisionName")
    @XmlSchemaType(name = "string")
    protected ShowDivisionNameType showDivisionName;

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialsType }
     *     
     */
    public CredentialsType getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialsType }
     *     
     */
    public void setCredentials(CredentialsType value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeason(BigInteger value) {
        this.season = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel(BigInteger value) {
        this.level = value;
    }

    /**
     * Gets the value of the showDivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link ShowDivisionNameType }
     *     
     */
    public ShowDivisionNameType getShowDivisionName() {
        return showDivisionName;
    }

    /**
     * Sets the value of the showDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowDivisionNameType }
     *     
     */
    public void setShowDivisionName(ShowDivisionNameType value) {
        this.showDivisionName = value;
    }

}

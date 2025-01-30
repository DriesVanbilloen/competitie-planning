
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
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
 *       &lt;all&gt;
 *         &lt;element name="Credentials" type="{http://api.frenoy.net/TabTAPI}CredentialsType" minOccurs="0"/&gt;
 *         &lt;element name="DivisionId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="WeekName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RankingSystem" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlRootElement(name = "GetDivisionRankingRequest")
public class GetDivisionRankingRequest {

    @XmlElement(name = "Credentials")
    protected CredentialsType credentials;
    @XmlElement(name = "DivisionId", required = true)
    protected BigInteger divisionId;
    @XmlElement(name = "WeekName")
    protected String weekName;
    @XmlElement(name = "RankingSystem")
    protected BigInteger rankingSystem;

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
     * Gets the value of the divisionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDivisionId() {
        return divisionId;
    }

    /**
     * Sets the value of the divisionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDivisionId(BigInteger value) {
        this.divisionId = value;
    }

    /**
     * Gets the value of the weekName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekName() {
        return weekName;
    }

    /**
     * Sets the value of the weekName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekName(String value) {
        this.weekName = value;
    }

    /**
     * Gets the value of the rankingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRankingSystem() {
        return rankingSystem;
    }

    /**
     * Sets the value of the rankingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRankingSystem(BigInteger value) {
        this.rankingSystem = value;
    }

}

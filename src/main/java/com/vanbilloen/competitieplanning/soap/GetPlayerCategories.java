
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
 *         &lt;element name="Season" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="UniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ShortNameSearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RankingCategory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlRootElement(name = "GetPlayerCategories")
public class GetPlayerCategories {

    @XmlElement(name = "Credentials")
    protected CredentialsType credentials;
    @XmlElement(name = "Season")
    protected BigInteger season;
    @XmlElement(name = "UniqueIndex")
    protected BigInteger uniqueIndex;
    @XmlElement(name = "ShortNameSearch")
    protected String shortNameSearch;
    @XmlElement(name = "RankingCategory")
    protected BigInteger rankingCategory;

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
     * Gets the value of the shortNameSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortNameSearch() {
        return shortNameSearch;
    }

    /**
     * Sets the value of the shortNameSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortNameSearch(String value) {
        this.shortNameSearch = value;
    }

    /**
     * Gets the value of the rankingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRankingCategory() {
        return rankingCategory;
    }

    /**
     * Sets the value of the rankingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRankingCategory(BigInteger value) {
        this.rankingCategory = value;
    }

}

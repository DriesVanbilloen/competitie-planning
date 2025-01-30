
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
 *         &lt;element name="TournamentUniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="WithResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithRegistrations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlRootElement(name = "GetTournaments")
public class GetTournaments {

    @XmlElement(name = "Credentials")
    protected CredentialsType credentials;
    @XmlElement(name = "Season")
    protected BigInteger season;
    @XmlElement(name = "TournamentUniqueIndex")
    protected BigInteger tournamentUniqueIndex;
    @XmlElement(name = "WithResults")
    protected Boolean withResults;
    @XmlElement(name = "WithRegistrations")
    protected Boolean withRegistrations;

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
     * Gets the value of the tournamentUniqueIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTournamentUniqueIndex() {
        return tournamentUniqueIndex;
    }

    /**
     * Sets the value of the tournamentUniqueIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTournamentUniqueIndex(BigInteger value) {
        this.tournamentUniqueIndex = value;
    }

    /**
     * Gets the value of the withResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithResults() {
        return withResults;
    }

    /**
     * Sets the value of the withResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithResults(Boolean value) {
        this.withResults = value;
    }

    /**
     * Gets the value of the withRegistrations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithRegistrations() {
        return withRegistrations;
    }

    /**
     * Sets the value of the withRegistrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithRegistrations(Boolean value) {
        this.withRegistrations = value;
    }

}

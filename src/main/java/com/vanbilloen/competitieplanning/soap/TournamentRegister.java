
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
 *         &lt;element name="Credentials" type="{http://api.frenoy.net/TabTAPI}CredentialsType"/&gt;
 *         &lt;element name="TournamentUniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SerieUniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PlayerUniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="Unregister" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NotifyPlayer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "credentials",
    "tournamentUniqueIndex",
    "serieUniqueIndex",
    "playerUniqueIndex",
    "unregister",
    "notifyPlayer"
})
@XmlRootElement(name = "TournamentRegister")
public class TournamentRegister {

    @XmlElement(name = "Credentials", required = true)
    protected CredentialsType credentials;
    @XmlElement(name = "TournamentUniqueIndex")
    protected BigInteger tournamentUniqueIndex;
    @XmlElement(name = "SerieUniqueIndex", required = true)
    protected BigInteger serieUniqueIndex;
    @XmlElement(name = "PlayerUniqueIndex")
    protected List<BigInteger> playerUniqueIndex;
    @XmlElement(name = "Unregister")
    protected Boolean unregister;
    @XmlElement(name = "NotifyPlayer")
    protected Boolean notifyPlayer;

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
     * Gets the value of the serieUniqueIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSerieUniqueIndex() {
        return serieUniqueIndex;
    }

    /**
     * Sets the value of the serieUniqueIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSerieUniqueIndex(BigInteger value) {
        this.serieUniqueIndex = value;
    }

    /**
     * Gets the value of the playerUniqueIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the playerUniqueIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlayerUniqueIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getPlayerUniqueIndex() {
        if (playerUniqueIndex == null) {
            playerUniqueIndex = new ArrayList<BigInteger>();
        }
        return this.playerUniqueIndex;
    }

    /**
     * Gets the value of the unregister property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnregister() {
        return unregister;
    }

    /**
     * Sets the value of the unregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnregister(Boolean value) {
        this.unregister = value;
    }

    /**
     * Gets the value of the notifyPlayer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyPlayer() {
        return notifyPlayer;
    }

    /**
     * Sets the value of the notifyPlayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyPlayer(Boolean value) {
        this.notifyPlayer = value;
    }

}

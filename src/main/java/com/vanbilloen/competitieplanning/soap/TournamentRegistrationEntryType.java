
package com.vanbilloen.competitieplanning.soap;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TournamentRegistrationEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TournamentRegistrationEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UniqueIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Member" type="{http://api.frenoy.net/TabTAPI}MemberEntryType"/&gt;
 *         &lt;element name="Club" type="{http://api.frenoy.net/TabTAPI}ClubEntryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TournamentRegistrationEntryType", propOrder = {
    "uniqueIndex",
    "registrationDate",
    "member",
    "club"
})
public class TournamentRegistrationEntryType {

    @XmlElement(name = "UniqueIndex", required = true)
    protected BigInteger uniqueIndex;
    @XmlElement(name = "RegistrationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "Member", required = true)
    protected MemberEntryType member;
    @XmlElement(name = "Club", required = true)
    protected ClubEntryType club;

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
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link MemberEntryType }
     *     
     */
    public MemberEntryType getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberEntryType }
     *     
     */
    public void setMember(MemberEntryType value) {
        this.member = value;
    }

    /**
     * Gets the value of the club property.
     * 
     * @return
     *     possible object is
     *     {@link ClubEntryType }
     *     
     */
    public ClubEntryType getClub() {
        return club;
    }

    /**
     * Sets the value of the club property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClubEntryType }
     *     
     */
    public void setClub(ClubEntryType value) {
        this.club = value;
    }

}


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
 *         &lt;element name="MemberCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MemberEntries" type="{http://api.frenoy.net/TabTAPI}MemberEntryType" maxOccurs="unbounded"/&gt;
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
    "memberCount",
    "memberEntries"
})
@XmlRootElement(name = "GetMembersResponse")
public class GetMembersResponse {

    @XmlElement(name = "MemberCount", required = true)
    protected BigInteger memberCount;
    @XmlElement(name = "MemberEntries", required = true)
    protected List<MemberEntryType> memberEntries;

    /**
     * Gets the value of the memberCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemberCount() {
        return memberCount;
    }

    /**
     * Sets the value of the memberCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberCount(BigInteger value) {
        this.memberCount = value;
    }

    /**
     * Gets the value of the memberEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the memberEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberEntryType }
     * 
     * 
     */
    public List<MemberEntryType> getMemberEntries() {
        if (memberEntries == null) {
            memberEntries = new ArrayList<MemberEntryType>();
        }
        return this.memberEntries;
    }

}

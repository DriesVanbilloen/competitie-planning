
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
 *         &lt;element name="DivisionCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DivisionEntries" type="{http://api.frenoy.net/TabTAPI}DivisionEntryType" maxOccurs="unbounded"/&gt;
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
    "divisionCount",
    "divisionEntries"
})
@XmlRootElement(name = "GetDivisionsResponse")
public class GetDivisionsResponse {

    @XmlElement(name = "DivisionCount", required = true)
    protected BigInteger divisionCount;
    @XmlElement(name = "DivisionEntries", required = true)
    protected List<DivisionEntryType> divisionEntries;

    /**
     * Gets the value of the divisionCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDivisionCount() {
        return divisionCount;
    }

    /**
     * Sets the value of the divisionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDivisionCount(BigInteger value) {
        this.divisionCount = value;
    }

    /**
     * Gets the value of the divisionEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the divisionEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivisionEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DivisionEntryType }
     * 
     * 
     */
    public List<DivisionEntryType> getDivisionEntries() {
        if (divisionEntries == null) {
            divisionEntries = new ArrayList<DivisionEntryType>();
        }
        return this.divisionEntries;
    }

}

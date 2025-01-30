
package com.vanbilloen.competitieplanning.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlayerRankingEvaluationEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlayerRankingEvaluationEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EvaluationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EvaluationValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlayerRankingEvaluationEntryType", propOrder = {
    "evaluationType",
    "evaluationValue"
})
public class PlayerRankingEvaluationEntryType {

    @XmlElement(name = "EvaluationType", required = true)
    protected String evaluationType;
    @XmlElement(name = "EvaluationValue", required = true)
    protected String evaluationValue;

    /**
     * Gets the value of the evaluationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationType() {
        return evaluationType;
    }

    /**
     * Sets the value of the evaluationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationType(String value) {
        this.evaluationType = value;
    }

    /**
     * Gets the value of the evaluationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationValue() {
        return evaluationValue;
    }

    /**
     * Sets the value of the evaluationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationValue(String value) {
        this.evaluationValue = value;
    }

}

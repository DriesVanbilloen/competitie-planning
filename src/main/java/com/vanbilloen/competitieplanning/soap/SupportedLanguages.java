
package com.vanbilloen.competitieplanning.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedLanguages.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SupportedLanguages"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="en"/&gt;
 *     &lt;enumeration value="fr"/&gt;
 *     &lt;enumeration value="nl"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupportedLanguages")
@XmlEnum
public enum SupportedLanguages {

    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("nl")
    NL("nl");
    private final String value;

    SupportedLanguages(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupportedLanguages fromValue(String v) {
        for (SupportedLanguages c: SupportedLanguages.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

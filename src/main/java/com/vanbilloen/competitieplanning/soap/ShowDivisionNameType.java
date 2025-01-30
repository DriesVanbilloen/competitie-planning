
package com.vanbilloen.competitieplanning.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShowDivisionNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShowDivisionNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="yes"/&gt;
 *     &lt;enumeration value="short"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShowDivisionNameType")
@XmlEnum
public enum ShowDivisionNameType {

    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("yes")
    YES("yes"),
    @XmlEnumValue("short")
    SHORT("short");
    private final String value;

    ShowDivisionNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShowDivisionNameType fromValue(String v) {
        for (ShowDivisionNameType c: ShowDivisionNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

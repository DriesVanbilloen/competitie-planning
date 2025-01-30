
package com.vanbilloen.competitieplanning.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResultType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResultType")
@XmlEnum
public enum ResultType {

    V,
    D;

    public String value() {
        return name();
    }

    public static ResultType fromValue(String v) {
        return valueOf(v);
    }

}

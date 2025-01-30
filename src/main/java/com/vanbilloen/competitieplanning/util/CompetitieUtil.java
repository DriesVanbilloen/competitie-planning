package com.vanbilloen.competitieplanning.util;

import java.math.BigInteger;

import org.apache.commons.lang3.StringUtils;

public class CompetitieUtil {

    private CompetitieUtil() {
        throw new UnsupportedOperationException(" Cannot create instance of a util class");
    }

    public static BigInteger getSeasonFromString(String season) {
        if (StringUtils.isBlank(season) && season.length() != 2) {
            return null;
        }
        return BigInteger.valueOf(Long.parseLong(season));
    }
}

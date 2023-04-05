package org.example;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

public class StringUtils {

    private StringUtils() {}
    public static boolean isPositiveNumber(String str) {
        if (!NumberUtils.isCreatable(str)) {
            return false;
        }
        Number number = NumberUtils.createNumber(str);
        BigDecimal bigDecimal = new BigDecimal(number.toString());
        return bigDecimal.signum() == 1;
    }
}

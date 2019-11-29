package com.treetory.dsltest.util;

public class UndiscriminationStringUtil {

    public static String doUndiscrimination(String value) {

        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.replace(1, sb.length()-1, "*");

        return sb.toString();
    }

}

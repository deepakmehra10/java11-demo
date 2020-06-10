package com.knolx.pattern;

import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {
        var pattern = Pattern.compile("^[A-Z]*$").asMatchPredicate();
        boolean deepak = pattern.test("DEEP");
        System.out.println(deepak);
    }
}

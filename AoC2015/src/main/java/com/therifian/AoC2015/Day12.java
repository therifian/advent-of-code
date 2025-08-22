package com.therifian.AoC2015;

public class Day12 {

    public static int part1(String input) {
        int sum = 0;
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]) && i > 0 && chars[i-1] == '-') {
                sum -= Character.getNumericValue(chars[i]);
            } else if (Character.isDigit(chars[i])) {
                sum += Character.getNumericValue(chars[i]);
            }
        }
        return sum;
    }
}

package com.therifian.AoC2015;

public class Day12 {

    public static int part1(String input) {
        int sum = 0;
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]) && i > 0 && chars[i-1] == '-') {
                int number = Day12.number(chars, i);
                sum -= number;
                i += String.valueOf(number).length();
            } else if (Character.isDigit(chars[i])) {
                int number = Day12.number(chars, i);
                sum += number;
                i += String.valueOf(number).length();
            }
        }
        return sum;
    }

    private static int number(char[] input, int i) {
        for (int j = i; j < input.length; j++) {
            if  (!Character.isDigit(input[j])) {
                String value = new String(input, i, j - i);
                return Integer.parseInt(value);
            }
        }
        return 0;
    }
}

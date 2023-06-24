package com.therifian.AoC2015;

public class Day01 {

    public static int part1(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') count++;
            if (text.charAt(i) == ')') count--;
        }
        return count;
    }

    public static int part2(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') count++;
            if (text.charAt(i) == ')') count--;
            if (count == -1) {
                count = i + 1;
                break;
            }
        }
        return count;
    }

}

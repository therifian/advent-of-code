package com.therifian.AoC2015;

public class Day01 {

    public static int solve(String text) {

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') count++;
            if (text.charAt(i) == ')') count--;
        }
        return count;
    }

}

package com.therifian.AoC2015;

import java.util.concurrent.atomic.AtomicInteger;

public class Day10 {

    public static int part1(String input, int times) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        for (int i = 0; i < times; i++) {
            String str = lookAndSay(sb.toString());
            sb.setLength(0);
            sb.append(str);
        }

        return sb.length();
    }

    public static int part2(String input, int times) {
        return part1(input, times);
    }

    private static String lookAndSay(String input) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            char c = input.charAt(i);
            int length = 0;
            String str = input.substring(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) length++;
                else break;
            }
            sb.append(length).append(c);
            i += length;
        }

        return sb.toString();
    }

}
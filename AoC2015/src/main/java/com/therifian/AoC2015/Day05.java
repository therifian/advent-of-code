package com.therifian.AoC2015;

public class Day05 {

    public static boolean part1(String text) {

        if (text.contains("ab") || text.contains("cd") || text.contains("pq") || text.contains("xy"))
            return false;

        boolean doubleLetter = false;
        int vowels = 0;

        for (int i = 0; i < text.length(); i++) {
            if (i < text.length() - 1 && !doubleLetter)
                if (text.charAt(i) == text.charAt(i+1)) doubleLetter = true;

            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') vowels++;
        }

        return doubleLetter && vowels >= 3;
    }

    public static boolean part2(String text) {

        boolean pair = false;
        boolean repeat = false;

        for (int i = 0; i < text.length() - 2; i++) {
            if (text.charAt(i) == text.charAt(i+2)) repeat = true;
            StringBuilder researched = new StringBuilder();
            researched.append(text.charAt(i)).append(text.charAt(i+1));
            if (i < text.length() - 3) {
                for (int j = i+2; j < text.length() - 1 ; j++) {
                    StringBuilder current = new StringBuilder();
                    current.append(text.charAt(j)).append(text.charAt(j+1));
                    if (researched.toString().contentEquals(current) ) pair = true;
                }
            }
        }
        return pair && repeat;
    }
}

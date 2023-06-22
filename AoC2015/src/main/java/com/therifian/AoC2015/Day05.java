package com.therifian.AoC2015;

public class Day05 {

    public static boolean solve(String text) {

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
}

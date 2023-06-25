package com.therifian.AoC2015;

public class Day08 {

    public static int part1(String input) {
        int sumLiteral = 0 , sumMemory = 0;
        String[] lines = input.split("\n");

        for (String line: lines) {
            sumLiteral += line.length();
            int chars = 0, i = 0;
            while (i < line.length()) {
                char current = line.charAt(i);
                if (current == '\\' && i < line.length() - 1) {
                    if(line.charAt(i + 1) == '\\') i += 2;
                    else if(line.charAt(i + 1) == '"') i += 2;
                    else if(line.charAt(i + 1) == 'x') i += 4;
                } else i++;
                chars++;
            }
            sumMemory += chars - 2;
        }

        return sumLiteral - sumMemory;
    }
}
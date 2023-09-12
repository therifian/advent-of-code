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

    public static int part2(String input) {
        int sumLiteral = 0 , sumEncoded = 0;
        String[] lines = input.split("\n");
        StringBuilder encoded = new StringBuilder();

        for (String line: lines) {
            sumLiteral += line.length();
            StringBuilder str = new StringBuilder();
            int i = 0;
            str.append('"');
            while (i < line.length()) {
                char current = line.charAt(i);
                switch (current) {
                    case '"':
                        str.append('\\').append('"');
                        break;
                    case '\\':
                        str.append("\\").append("\\");
                        break;
                    default:
                        str.append(current);
                        break;
                }
                i++;
            }
            str.append('"');
            sumEncoded += str.length();
            System.out.println(str);
            encoded.append(str).append("\n");
        }
        System.out.println(encoded);
        System.out.println(sumEncoded);
        System.out.println(sumLiteral);
        return  sumEncoded- sumLiteral;
    }
}
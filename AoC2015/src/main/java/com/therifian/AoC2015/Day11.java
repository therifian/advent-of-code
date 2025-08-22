package com.therifian.AoC2015;

public class Day11 {

    private final static char ASCII_A = 97;
    private final static char ASCII_I = 105;
    private final static char ASCII_L = 108;
    private final static char ASCII_O = 111;
    private final static char ASCII_Z = 122;


    public static String part1(String input) {
        char[] password = input.toCharArray();


        do {
            for (int i = password.length - 1; i >= 0; i--) {
                if (password[i] == ASCII_Z) {
                    password[i] = ASCII_A;
                    for (int j = i + 1; j < password.length; j++) password[j] = ASCII_A;
                } else {
                    password[i]++;
                    if (password[i] == ASCII_I || password[i] == ASCII_L || password[i] == ASCII_O) {
                        password[i]++;
                        for (int j = i + 1; j < password.length; j++) password[j] = ASCII_A;
                    }
                    break;
                }
            }
        } while (!isPasswordValid(password));

        return new String(password);
    }


    private static boolean isPasswordValid(char[] password) {
        boolean consecutive = false;
        int pairs = 0;
        for (int i = 0; i < password.length; i++) {
            if (password[i] == ASCII_I || password[i] == ASCII_L || password[i] == ASCII_O) return false;

            if (!consecutive && i < password.length - 2) {
                if (password[i] == password[i + 1] - 1 && password[i] == password[i + 2] - 2) {
                    consecutive = true;
                }
            }

            if (i < password.length - 1 && password[i] == password[i + 1] ) {
                if (i > 0 && password[i] != password[i - 1])
                    pairs++;
            }
        }

        return consecutive && pairs >= 2;
    }

}

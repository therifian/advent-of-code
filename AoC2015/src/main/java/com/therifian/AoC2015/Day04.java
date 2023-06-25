package com.therifian.AoC2015;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Day04 {

    public static int part1(String text) {
        int i = 0;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            do {
                String value = text + i;
                md.update(value.getBytes());
                byte[] digest = md.digest();

                if (digest[0] == 0 && digest[1] == 0 && (digest[2] & 0xFF) < 0x10) break;
                i++;
            } while (true);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return i;
    }

    public static int part2(String text) {
        int i = 0;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            do {
                String value = text + i;
                md.update(value.getBytes());
                byte[] digest = md.digest();

                if (digest[0] == 0 && digest[1] == 0 && digest[2] == 0) break;
                i++;
            } while (true);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return i;
    }
}

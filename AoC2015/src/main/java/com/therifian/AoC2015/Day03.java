package com.therifian.AoC2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Day03 {

    public static int solve(String text) {
        Set<List<Integer>> houses = new HashSet<>();

        int x = 0;
        int y = 0;
        houses.add(List.of(x, y));

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '<') x--;
            if (text.charAt(i) == '>') x++;
            if (text.charAt(i) == '^') y++;
            if (text.charAt(i) == 'v') y--;
            houses.add(List.of(x, y));
        }

        return houses.size();
    }
}

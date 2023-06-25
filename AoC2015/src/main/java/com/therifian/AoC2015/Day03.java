package com.therifian.AoC2015;

import java.util.*;

public class Day03 {

    private static Set<List<Integer>> houses(String input) {
        Set<List<Integer>> houses = new HashSet<>();

        int x = 0;
        int y = 0;
        houses.add(List.of(x, y));

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '<') x--;
            if (input.charAt(i) == '>') x++;
            if (input.charAt(i) == '^') y++;
            if (input.charAt(i) == 'v') y--;
            houses.add(List.of(x, y));
        }

        return houses;
    }

    public static int part1(String input) {
        return houses(input).size();
    }

    public static int part2(String input) {
        StringBuilder santaLocations = new StringBuilder();
        StringBuilder robotLocations = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) santaLocations.append(input.charAt(i));
            else robotLocations.append(input.charAt(i));
        }

        Set<List<Integer>> santaHouses = houses(santaLocations.toString());
        Set<List<Integer>>  robotHouses = houses(robotLocations.toString());

        robotHouses.removeAll(santaHouses);
        return santaHouses.size() + robotHouses.size();
    }
}

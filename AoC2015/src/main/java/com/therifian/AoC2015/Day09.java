package com.therifian.AoC2015;

import java.util.*;

public class Day09 {

    public static int part1(String input) {
        return Collections.min(resolution(input));
    }

    public static int part2(String input) {
        return Collections.max(resolution(input));
    }

    private static List<List<String>> permutations(List<String> list) {

        if (list.size() == 0) {
            List<List<String>> result = new ArrayList<List<String>>();
            result.add(new ArrayList<String>());
            return result;
        }

        List<List<String>> result = new ArrayList<List<String>>();
        String first = list.remove(0);

        List<List<String>> permutations = permutations(list);

        for (List<String> permutation : permutations) {
            for (int i = 0; i <= permutation.size(); i++) {
                List<String> temp = new ArrayList<String>(permutation);
                temp.add(i, first);
                result.add(temp);
            }
        }

        return result;
    }

    private static List<Integer> resolution(String input) {
        String[] locations = input.split("\n");
        Map<String, Integer> citiesDistance = new HashMap<>();
        List<String> cities = new ArrayList<>();

        for (String location: locations) {
            String[] distance = location.split(" = ");

            if (!cities.contains(distance[0].split(" to ")[0])) cities.add(distance[0].split(" to ")[0]);
            else if (!cities.contains(distance[0].split(" to ")[1])) cities.add(distance[0].split(" to ")[1]);

            citiesDistance.put(distance[0], Integer.parseInt(distance[1]));
            citiesDistance.put(distance[0].split(" to ")[1] + " to " + distance[0].split(" to ")[0],
                    Integer.parseInt(distance[1]));
        }

        List<Integer> distances =  new ArrayList<>();

        for (List<String> permutation : permutations(cities)) {
            int distance = 0;
            for (int i = 0; i < permutation.size() - 1; i++) {
                distance += citiesDistance.get(permutation.get(i) + " to " + permutation.get(i + 1));
            }
            distances.add(distance);
        }

        return distances;
    }
}
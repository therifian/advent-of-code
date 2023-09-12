package com.therifian.AoC2015;

import java.util.HashMap;
import java.util.Map;

public class Day07 {

    public static int part1(String input, String researched) {
        return resolution(input, false, researched).get(researched);
    }

    public static int part2(String input, String researched) {
        return resolution(input, true, researched).get(researched);
    }

    private static Map<String, Integer> resolution(String input, boolean override, String researched) {
        Map<String, Integer> wires = new HashMap<>();
        String[] instructions = input.split("\n");

        for (String instruction : instructions) {
            String[] arr = instruction.split(" ");
            if (arr.length == 3) wires.put(arr[2], -1);
            else if (arr.length == 4) wires.put(arr[3], -1);
            else if (arr.length == 5) wires.put(arr[4], -1);
        }

        if (override)
            wires.put("b", part1(input, researched));

        int length = instructions.length;

        do {
            for (int i = 0; i < instructions.length; i++) {
                if (instructions[i] == null) continue;
                String[] arr = instructions[i].split(" ");
                if (arr.length == 3) {
                    if (Character.isDigit(arr[0].charAt(0))) {
                        wires.put(arr[2], Integer.parseInt(arr[0]));
                        instructions[i] = null;
                        length--;
                    } else if (wires.get(arr[0]) != -1) {
                        wires.put(arr[2], wires.get(arr[0]));
                        instructions[i] = null;
                        length--;
                    }
                } else if (arr.length == 4) {
                    if (Character.isDigit(arr[1].charAt(0))) {
                        wires.put(arr[3], ~Integer.parseInt(arr[1]) & 0xffff);
                        instructions[i] = null;
                        length--;
                    } else if (wires.get(arr[1]) != -1) {
                        wires.put(arr[3], ~wires.get(arr[1]) & 0xffff);
                        instructions[i] = null;
                        length--;
                    }
                } else if (arr.length == 5) {
                    if (!Character.isDigit(arr[2].charAt(0)) && (wires.get(arr[2]) != -1 && Character.isDigit(arr[0].charAt(0)))) {
                        wires.put(arr[4], bitwise(wires.get(arr[2]), Integer.parseInt(arr[0]), arr[1]));
                        instructions[i] = null;
                        length--;
                    } else if (!Character.isDigit(arr[0].charAt(0)) &&  (wires.get(arr[0]) != -1 && Character.isDigit(arr[2].charAt(0)))) {
                        wires.put(arr[4], bitwise(wires.get(arr[0]), Integer.parseInt(arr[2]), arr[1]));
                        instructions[i] = null;
                        length--;
                    }  else if (!Character.isDigit(arr[0].charAt(0)) && !Character.isDigit(arr[2].charAt(0)) && wires.get(arr[0]) != -1 && wires.get(arr[2]) != -1) {
                        wires.put(arr[4], bitwise(wires.get(arr[0]), wires.get(arr[2]), arr[1]));
                        instructions[i] = null;
                        length--;
                    }
                }
            }
        } while (length != 0);

        return wires;
    }

    private static int bitwise(int left, int right, String op) {
        int result = 0;
        switch (op) {
            case "AND":
                result = left & right;
                break;
            case "OR":
                result = left | right;
                break;
            case "LSHIFT":
                result = left << right;
                break;
            case "RSHIFT":
                result = left >> right;
                break;
            default:
                break;
        }
        return result;
    }
}

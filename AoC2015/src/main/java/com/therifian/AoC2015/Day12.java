package com.therifian.AoC2015;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Day12 {

    public static int part1(String input) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root;
        try {
            root = mapper.readTree(input);
            return sum(root, false);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int part2(String input) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root;
        try {
            root = mapper.readTree(input);
            return sum(root, true);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return 0;
    }
    private static int sum(JsonNode node, boolean skip) {
        if (node.isNumber()) return node.asInt();
        if (node.isArray()) {
            int sum = 0;
            for (JsonNode child : node) sum += Day12.sum(child, skip);
            return sum;
        }
        if (node.isObject()) {
            int sum = 0;
            if (skip) {
                for (JsonNode child : node) {
                    if (child.isTextual() && child.asText().equals("red")) return 0;
                }
            }
            for (JsonNode child : node) sum += Day12.sum(child, skip);
            return sum;
        }
        return 0;
    }

}

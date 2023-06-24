package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day07Test {

    private final static String input = "123 -> x\n" +
            "456 -> y\n" +
            "x AND y -> d\n" +
            "x OR y -> e\n" +
            "x LSHIFT 2 -> f\n" +
            "y RSHIFT 2 -> g\n" +
            "NOT x -> h\n" +
            "NOT y -> i";

    @Test
    void testD() {
        assertEquals(72, Day07.part1(input).get("d"));
    }

    @Test
    void testE() {
        assertEquals(507, Day07.part1(input).get("e"));
    }

    @Test
    void testF() {
        assertEquals(492, Day07.part1(input).get("f"));
    }

    @Test
    void testG() {
        assertEquals(114, Day07.part1(input).get("g"));
    }

    @Test
    void testH() {
        assertEquals(65412, Day07.part1(input).get("h"));
    }

    @Test
    void testI() {
        assertEquals(65079, Day07.part1(input).get("i"));
    }

    @Test
    void testX() {
        assertEquals(123, Day07.part1(input).get("x"));
    }

    @Test
    void testY() {
        assertEquals(456, Day07.part1(input).get("y"));
    }

}

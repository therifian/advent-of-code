package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day08Test {

    @Test
    void test1() {
        String input = "\"\"\n" +
                "\"abc\"\n" +
                "\"aaa\\\"aaa\"\n" +
                "\"\\x27\"";
        assertEquals(12, Day08.part1(input));
    }

    @Test
    void test2() {
        String input = "\"\"\n" +
                "\"abc\"\n" +
                "\"aaa\\\"aaa\"\n" +
                "\"\\x27\"";
        assertEquals(19, Day08.part2(input));
    }
}

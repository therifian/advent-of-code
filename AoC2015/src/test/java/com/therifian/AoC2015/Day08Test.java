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
}

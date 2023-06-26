package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day09Test {

    private final String input = "London to Dublin = 464\n" +
            "London to Belfast = 518\n" +
            "Dublin to Belfast = 141";

    @Test
    void test1() {
        assertEquals(605, Day09.part1(input));
    }

    @Test
    void test2() {
        assertEquals(982, Day09.part2(input));
    }
}

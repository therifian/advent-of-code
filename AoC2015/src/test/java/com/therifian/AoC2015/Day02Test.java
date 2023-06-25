package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test {

    @Test
    void test() {
        assertEquals(58, Day02.part1(2, 3, 4));
    }

    @Test
    void test2() {
        assertEquals(43, Day02.part1(1, 1, 10));
    }

    @Test
    void test3() {
        assertEquals(34, Day02.part2(2, 3, 4));
    }

    @Test
    void test4() {
        assertEquals(14, Day02.part2(1, 1, 10));
    }
}

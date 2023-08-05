package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day06Test {

    @Test
    void test() {
        assertEquals(1_000_000, Day06.part1("turn on 0,0 through 999,999"));
    }

    @Test
    void test2() {
        assertEquals(999_000, Day06.part1("toggle 0,0 through 999,0"));
    }

    @Test
    void test3() {
        assertEquals(998_996, Day06.part1("turn off 499,499 through 500,500"));
    }
}

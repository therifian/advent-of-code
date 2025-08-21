package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day11Test {

    @Test
    void test1() {
        assertEquals("abcdffaa", Day11.part1("abcdefgh"));
    }

    @Test
    void test2() {
        assertEquals("ghjaabcc", Day11.part1("ghijklmn"));
    }

    @Test
    void test3() {
        assertEquals("hepxxyzz", Day11.part1("hepxcrrq"));
    }

    @Test
    void test4() {
        assertEquals("heqaabcc", Day11.part1("hepxxyzz"));
    }
}

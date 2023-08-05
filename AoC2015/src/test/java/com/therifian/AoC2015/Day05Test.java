package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Day05Test {

    @Test
    void test() {
        assertTrue(Day05.part1("ugknbfddgicrmopn"));
    }

    @Test
    void test2() {
        assertTrue(Day05.part1("aaa"));
    }

    @Test
    void test3() {
        assertFalse(Day05.part1("jchzalrnumimnmhp"));
    }

    @Test
    void test4() {
        assertFalse(Day05.part1("haegwjzuvuyypxyu"));
    }

    @Test
    void test5() {
        assertFalse(Day05.part1("dvszwmarrgswjxmb"));
    }

    @Test
    void test6() {
        assertTrue(Day05.part2("qjhvhtzxzqqjkmpb"));
    }

    @Test
    void test7() {
        assertTrue(Day05.part2("xxyxx"));
    }

    @Test
    void test8() {
        assertFalse(Day05.part2("uurcxstgmygtbstg"));
    }

    @Test
    void test9() {
        assertFalse(Day05.part2("ieodomkazucvgmuy"));
    }
}

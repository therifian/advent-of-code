package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Day05Test {

    @Test
    void test() {
        assertTrue(Day05.solve("ugknbfddgicrmopn"));
    }

    @Test
    void test2() {
        assertTrue(Day05.solve("aaa"));
    }

    @Test
    void test3() {
        assertFalse(Day05.solve("jchzalrnumimnmhp"));
    }

    @Test
    void test4() {
        assertFalse(Day05.solve("haegwjzuvuyypxyu"));
    }

    @Test
    void test5() {
        assertFalse(Day05.solve("dvszwmarrgswjxmb"));
    }
}

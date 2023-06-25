package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day03Test {

    @Test
    void test() {
        assertEquals(2, Day03.part1(">"));
    }

    @Test
    void test2() {
        assertEquals(4, Day03.part1("^>v<"));
    }

    @Test
    void test3() {
        assertEquals(2, Day03.part1("^v^v^v^v^v"));
    }

    @Test
    void test4() {
        assertEquals(3, Day03.part2("^v"));
    }

    @Test
    void test5() {
        assertEquals(3, Day03.part2("^>v<"));
    }

    @Test
    void test6() {
        assertEquals(11, Day03.part2("^v^v^v^v^v"));
    }

}

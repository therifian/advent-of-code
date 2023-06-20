package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day03Test {

    @Test
    void test() {
        assertEquals(2, Day03.solve(">"));
    }

    @Test
    void test2() {
        assertEquals(4, Day03.solve("^>v<"));
    }

    @Test
    void test3() {
        assertEquals(2, Day03.solve("^v^v^v^v^v"));
    }
}

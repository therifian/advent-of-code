package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test {

    @Test
    void test() {
        assertEquals(58, Day02.solve(2, 3, 4));
    }

    @Test
    void test2() {
        assertEquals(43, Day02.solve(1, 1, 10));
    }
}

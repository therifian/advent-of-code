package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day04Test {

    @Test
    void test() {
        assertEquals(609043, Day04.solve("abcdef"));
    }

    @Test
    void test2() {
        assertEquals(1048970, Day04.solve("pqrstuv"));
    }

}

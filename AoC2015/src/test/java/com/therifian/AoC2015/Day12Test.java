package com.therifian.AoC2015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day12Test {

    @Test
    void test1() {
        assertEquals(6, Day12.part1("[1,2,3]"));
    }

    @Test
    void test2() {
        assertEquals(6, Day12.part1("{\"a\":2,\"b\":4}"));
    }

    @Test
    void test3() {
        assertEquals(3, Day12.part1("{\"a\":{\"b\":4},\"c\":-1}"));
    }

    @Test
    void test4() {
        assertEquals(0, Day12.part1("{\"a\":[-1,1]}"));
    }

    @Test
    void test5() {
        assertEquals(0, Day12.part1("[-1,{\"a\":1}]"));
    }

    @Test
    void test6() {
        assertEquals(0, Day12.part1("[]"));

    }

    @Test
    void test7() {
        assertEquals(0, Day12.part1("{}"));
    }

    @Test
    void test8() {
        assertEquals(3, Day12.part1("[[[3]]]"));
    }
}

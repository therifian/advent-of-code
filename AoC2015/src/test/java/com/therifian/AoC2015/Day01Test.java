package com.therifian.AoC2015;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class Day01Test {

    @Test
    void equalsTwo() {
        assertEquals(0, Day01.part1("(())"));
    }

    @Test
    void equalsTwo2() {
        assertEquals(0, Day01.part1("()()"));
    }

    @Test
    void equalsThree() {
        assertEquals(3, Day01.part1("((("));
    }

    @Test
    void equalsThree2() {
        assertEquals(3, Day01.part1("(()(()("));
    }

    @Test
    void equalsThree3() {
        assertEquals(3, Day01.part1("))((((("));
    }

    @Test
    void equalsMinusOne() {
        assertEquals(-1, Day01.part1("())"));
    }

    @Test
    void equalsMinusOne2() {
        assertEquals(-1, Day01.part1("))("));
    }

    @Test
    void equalsMinusThree() {
        assertEquals(-3, Day01.part1(")())())"));
    }

    @Test
    void equalsMinusThree2() {
        assertEquals(-3, Day01.part1(")))"));
    }

    @Test
    void basementP1() {
        assertEquals(1, Day01.part2(")"));
    }

    @Test
    void basementP2() {
        assertEquals(5, Day01.part2("()())"));
    }
}

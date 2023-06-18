package com.therifian.AoC2015;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class Day01Test {

    @Test
    void equalsTwo() {
        assertEquals(0, Day01.solve("(())"));
    }

    @Test
    void equalsTwo2() {
        assertEquals(0, Day01.solve("()()"));
    }

    @Test
    void equalsThree() {
        assertEquals(3, Day01.solve("((("));
    }

    @Test
    void equalsThree2() {
        assertEquals(3, Day01.solve("(()(()("));
    }

    @Test
    void equalsThree3() {
        assertEquals(3, Day01.solve("))((((("));
    }

    @Test
    void equalsMinusOne() {
        assertEquals(-1, Day01.solve("())"));
    }

    @Test
    void equalsMinusOne2() {
        assertEquals(-1, Day01.solve("))("));
    }

    @Test
    void equalsMinusThree() {
        assertEquals(-3, Day01.solve(")())())"));
    }

    @Test
    void equalsMinusThree2() {
        assertEquals(-3, Day01.solve(")))"));
    }
}

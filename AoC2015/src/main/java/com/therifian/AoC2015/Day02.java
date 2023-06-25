package com.therifian.AoC2015;

import java.util.Arrays;

public class Day02 {

    public static int part1(int l, int w, int h) {
        int[] arr = {l*w, w*h, h*l};
        Arrays.sort(arr);
        return 2*arr[0] + 2*arr[1] + 2*arr[2] + arr[0];
    }

    public static int part2(int l, int w, int h) {
        int[] arr = {l, w, h};
        Arrays.sort(arr);
        return (2*arr[0] + 2*arr[1]) + (arr[0]*arr[1]*arr[2]);
    }
}

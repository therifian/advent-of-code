package com.therifian.AoC2015;

import java.util.Arrays;

public class Day02 {

    public static int solve(int l, int w, int h) {
        int [] arr = {l*w, w*h, h*l};
        Arrays.sort(arr);
        return 2*arr[0] + 2*arr[1] + 2*arr[2] + arr[0];
    }
}

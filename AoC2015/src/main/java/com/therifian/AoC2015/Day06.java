package com.therifian.AoC2015;

public class Day06 {

    private static final boolean[][] grid = new boolean[1000][1000];

    public static int solve(String text) {
        int on = 0, x1 = 0, y1 = 0 , x2 = 0, y2 = 0;
        boolean turnOn = false, turnOff = false, toggle = false;

        String[] s = text.split(" through ");
        String[] s2 = s[0].split(" ");

        if (s2.length == 3) {
            if (s2[1].contains("on")) turnOn = true;
            else if (s2[1].contains("off")) turnOff = true;

            String[] s3 = s2[2].split(",");
            x1 = Integer.parseInt(s3[0]);
            y1 = Integer.parseInt(s3[1]);

        } else if (s2.length == 2) {
            toggle = true;

            String[] s3 = s2[1].split(",");
            x1 = Integer.parseInt(s3[0]);
            y1 = Integer.parseInt(s3[1]);
        }

        String[] s3 = s[1].split(",");
        x2 = Integer.parseInt(s3[0]);
        y2 = Integer.parseInt(s3[1]);

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (i >= x1 && i <= x2 && j >= y1 && j <= y2) {
                    if (turnOn) grid[i][j] = true;
                    if (turnOff) grid[i][j] = false;
                    if (toggle) grid[i][j] = !grid[i][j];
                }
                if (grid[i][j]) on++;

            }
        }

        return on;
    }
}

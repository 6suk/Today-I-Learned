package cote_202306;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/161990
프로그래머스 - Lv1
 */

import java.util.Arrays;

public class Date_0603_02 {

    // 더 간단하게 생각해보기 T-T
    public int[] solution(String[] wallpaper) {
        int minX = 51, minY = 51, maxX = -1, maxY = -1;

        for (int x = 0; x < wallpaper.length; x++) {
            for (int y = 0; y < wallpaper[x].length(); y++) {
                if (wallpaper[x].charAt(y) == '#') {
                    minX = Math.min(minX, x);
                    minY = Math.min(minY, y);
                    maxX = Math.max(maxX, x);
                    maxY = Math.max(maxY, y);
                }
            }
        }

        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }

    // 통과
    public int[] solution1(String[] wallpaper) {
        Coordinate c = new Coordinate();

        for (int x = 0; x < wallpaper.length; x++) {
            if (wallpaper[x].contains("#")) {
                c.setX(x);

                for (int y = 0; y < wallpaper[x].length(); y++) {
                    if (wallpaper[x].charAt(y) == '#') c.setY(y);
                }
            }
        }

        return c.getXY();
    }

    public static void main(String[] args) {
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....#"};
        System.out.println(Arrays.toString(new Date_0603_02().solution(wallpaper)));
    }
}

class Coordinate {
    private int minX;
    private int minY;
    private int maxX;
    private int maxY;

    public Coordinate() {
        this.minX = 51;
        this.minY = 51;
    }

    public void setX(int x) {
        if (x < this.minX) this.minX = x;
        if (x > this.maxX) this.maxX = x;
    }

    public void setY(int y) {
        if (y < this.minY) this.minY = y;
        if (y > this.maxY) this.maxY = y;
    }

    public int[] getXY() {
        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }

    @Override
    public String toString() {
        return "min : " + minX + ", " + minY
                + "\n" + "max : " + (maxX + 1) + ", " + (maxY + 1);
    }
}
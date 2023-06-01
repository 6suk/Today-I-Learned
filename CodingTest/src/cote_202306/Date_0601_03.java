package cote_202306;

import java.util.Arrays;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/172928
 */
public class Date_0601_03 {
    public int[] solution(String[] park, String[] routes) {
        int start_x = 0;
        int start_y = 0;

        // 시작 좌표 탐색
        for (int x = 0; x < park.length; x++) {
            String[] arr = park[x].split("");

            for (int y = 0; y < arr.length; y++) {
                if (arr[y].equals("S")) {
                    start_x = x;
                    start_y = y;
                }
            }
        }

        // 루트 탐색
        for (String r : routes) {
            String[] arr = r.split(" ");
            int n = Integer.parseInt(arr[1]);
            boolean ck = true;

            switch (arr[0]) {
                case "E":   // E : (X, Y+n)
                    if (start_y + n < park[start_x].length()) {
                        for (int i = 1; i <= n; i++) {
                            if (park[start_x].charAt(start_y + i) == 'X') {
                                ck = false;
                                break;
                            }
                        }
                        if (ck) start_y += n;
                    }
                    break;

                case "W":   // W : (X, Y-n)
                    if (start_y - n >= 0) {
                        for (int i = 1; i <= n; i++) {
                            if (park[start_x].charAt(start_y - i) == 'X') {
                                ck = false;
                                break;
                            }
                        }
                        if (ck) start_y -= n;
                    }
                    break;

                case "S":   // S : (X+n, Y)
                    if (start_x + n < park.length) {
                        for (int i = 1; i <= n; i++) {
                            if (park[start_x + i].charAt(start_y) == 'X') {
                                ck = false;
                                break;
                            }
                        }
                        if (ck) start_x += n;
                    }
                    break;

                case "N":   // N : (X-n, Y)
                    if (start_x - n >= 0) {
                        for (int i = 1; i <= n; i++) {
                            if (park[start_x - i].charAt(start_y) == 'X') {
                                ck = false;
                                break;
                            }
                        }
                        if (ck) start_x -= n;
                    }
                    break;
            }
        }

        return new int[]{start_x, start_y};
    }

    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 4","S 4","W 4", "N 4"};

        System.out.println(Arrays.toString(new Date_0601_03().solution(park, routes)));
    }
}

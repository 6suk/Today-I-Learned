package cote_202305;

import java.util.Arrays;

public class Pro_86491 {

    // 제출 (성공)
    public int solution1(int[][] sizes) {
        int[] wBox = new int[sizes.length];
        int[] hBox = new int[sizes.length];

        int index = 0;
        for (int[] wh : sizes) {
            int w = wh[0];
            int h = wh[1];

            if (w < h) {
                w = h;
                h = wh[0];
            }

            wBox[index] = w;
            hBox[index] = h;
            index++;
        }

        int wMax = Arrays.stream(wBox).max().getAsInt();
        int hMax = Arrays.stream(hBox).max().getAsInt();

        return wMax * hMax;
    }

    // 참고
    public int solution(int[][] sizes) {
        int w = 0, h = 0;

        for (int[] wh : sizes) {
            // Math.max 두 인자 중 큰 값을 리턴
            // input w 와 h 중 큰 값을 리턴 -> 저장된 w와 비교 더 큰 값을 저장
            w = Math.max(w, Math.max(wh[0], wh[1]));
            // input w 와 h 중 작은 값을 리턴 -> 저장된 h와 비교 더 큰 값을 저장
            h = Math.max(h, Math.min(wh[0], wh[1]));
        }

        return w * h;
    }


    public static void main(String[] args) {
        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
//        int[][] arr = {{10, 7},{12, 3},{8, 15},{14, 7},{5, 15}};
        System.out.println(new Pro_86491().solution(arr));
    }
}

package backjoon_202212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1. 평균 출력
 * 2. + 크기 순서대로 늘어 놓았을 때 중앙값 출력
 */

public class Main_2587 {
    public static int[] numBox = new int[5];
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            numBox[i] = Integer.parseInt(br.readLine());
            sum += numBox[i];
        }

        Arrays.sort(numBox);
        System.out.println(sum / 5);
        System.out.println(numBox[2]);
    }

}

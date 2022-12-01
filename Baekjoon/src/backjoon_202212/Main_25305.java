package backjoon_202212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * 1. 응시자 수 / 합격자 수
 * 2. 각 학생의 점수
 */

public class Main_25305 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] nk = Stream.of(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] score = Stream.of(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).sorted().toArray();
        br.close();
        int n = nk[0];
        int k = nk[1];

        if (n <= k) {
            System.out.println(score[0]);
        } else {
            int result = score[score.length - k];
            System.out.println(result);
        }
    }
}

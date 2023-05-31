package cote_202305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro_12928 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public int newSolution(int n) {
        int answer = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
            if (n % i == 0) System.out.println(i);
        }

        return answer + n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        br.close();
        int a = new Pro_12928().solution(input);
        int b = new Pro_12928().newSolution(input);
//        System.out.println(a);
        System.out.println(b);
    }
}

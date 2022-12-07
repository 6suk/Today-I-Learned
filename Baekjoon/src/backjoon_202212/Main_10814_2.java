package backjoon_202212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10814_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder[] sbb = new StringBuilder[201];
        for (int i = 0; i < sbb.length; i++)
            sbb[i] = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            int age = Integer.parseInt(tmp[0]);
            String name = tmp[1];

            sbb[age].append(age).append(" ").append(name).append("\n");
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for (StringBuilder a : sbb) sb.append(a);
        System.out.println(sb);

    }
}

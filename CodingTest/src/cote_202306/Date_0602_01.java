package cote_202306;

/*
https://www.acmicpc.net/problem/10815
백준 - 실버5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Date_0602_01 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        Set<String> cardSet = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toSet());
        br.readLine();
        String[] find = br.readLine().split(" ");
        br.close();

        StringBuilder sb = new StringBuilder();
        int index = 1;

        // 탐색
        for (String a : find) {
            if (cardSet.contains(a)) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            if (index != find.length) sb.append(" ");
            index++;
        }

        System.out.println(sb);
    }
}

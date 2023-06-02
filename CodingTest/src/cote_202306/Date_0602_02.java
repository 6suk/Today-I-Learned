package cote_202306;

/*
https://www.acmicpc.net/problem/14425
백준 - 실버3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Date_0602_02 {

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashSet<String> groupS = new HashSet<>();

        // 집합 S HashSet에 넣기
        for(int i = 0; i < nm[0]; i++){
            groupS.add(br.readLine());
        }

        // 탐색 및 카운트
        int cnt = 0;
        for(int i = 0; i < nm[1]; i++){
            if(groupS.contains(br.readLine())) cnt++;
        }

        br.close();
        System.out.println(cnt);
    }

}

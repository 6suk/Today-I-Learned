package cote_202305;

import java.io.*;

public class Main_10988_02 {
    /*알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.

    팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.

    level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(br.readLine());

        boolean result = sb.toString().equals(sb.reverse().toString());

        bw.write((result ? 1 : 0) + "\n");
        bw.flush();
        bw.close();
        br.close();

    }
}

package cote_202212;

import java.io.*;
import java.util.Arrays;

public class Main_10989 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
        br.close();

        Arrays.sort(arr);
        for(int a : arr) sb.append(a).append("\n");
        System.out.println(sb);

    }
}

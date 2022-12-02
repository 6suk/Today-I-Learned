package backjoon_202212;

import java.io.*;
import java.util.*;

public class Main_2751 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) list.add(Integer.parseInt(br.readLine()));
        br.close();

        Collections.sort(list);
        list.forEach(x -> sb.append(x).append("\n"));
        System.out.println(sb);
    }
}

package cote_202212;

import java.io.*;
import java.util.*;

public class Main_1181 {

    public  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        List<String> strList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            strList.add(br.readLine());
        }
        br.close();

        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length() == 0 ? o1.compareTo(o2) : o1.length() - o2.length();
        StringBuilder sb = new StringBuilder();

        strList.stream().distinct().sorted(comparator).forEach(x -> sb.append(x).append("\n"));
        System.out.println(sb);

    }
}

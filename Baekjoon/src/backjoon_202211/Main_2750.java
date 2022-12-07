package backjoon_202211;

import java.io.*;
import java.util.*;

public class Main_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        list.stream().sorted().forEach(System.out::println);
    }
}

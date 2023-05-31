package cote_202212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1427 {
    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        br.close();

        String[] split = input.split("");
        Arrays.sort(split);
        for (int i = split.length - 1; i >= 0; i--) System.out.print(split[i]);
    }

}

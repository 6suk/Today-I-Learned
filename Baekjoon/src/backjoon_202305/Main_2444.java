package backjoon_202305;

import java.io.*;

public class Main_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= num; i++) {
            for (int k = 0; k < num - i; k++) {
                bw.write(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        for (int i = num - 1; i >= 0; i--) {
            for (int k = 0; k < num - i; k++) {
                bw.write(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }
}

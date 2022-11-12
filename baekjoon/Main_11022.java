package baekjoon;

import java.io.*;
import java.util.*;

public class Main_11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			String c = "Case #" + (i + 1) + ": ";
			bw.write(c + a + " + " + b + " = " + (a + b) + "\n");

		}
		br.close();

		bw.flush();
		bw.close();
	}

}

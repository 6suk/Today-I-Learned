package cote_202211;

import java.io.*;
import java.util.*;

public class Main_15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			stk = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			bw.write(a + b + "\n");
		}

		br.close();
		bw.flush();
		bw.close();

	}

}

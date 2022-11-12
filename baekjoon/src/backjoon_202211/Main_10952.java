package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main_10952 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		boolean run = true;

		while (run) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 0 && b == 0)
				break;
			System.out.println((a + b));

//			bw.write((a + b)+"\n");
//			run = (a == 0 && b == 0);
		}

		br.close();
//		bw.flush();
//		bw.close();
	}

}

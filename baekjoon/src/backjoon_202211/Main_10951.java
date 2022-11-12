package baekjoon;

import java.io.*;
import java.util.*;

/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

public class Main_10951 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String str = "";
		
		while ((str = br.readLine()) != null && !str.isEmpty()) {
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write((a + b) + "\n");
			bw.flush();
		}
		
		br.close();
		bw.close();
	}

}

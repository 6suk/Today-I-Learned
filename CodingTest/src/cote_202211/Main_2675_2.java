package cote_202211;

import java.io.*;
import java.util.*;

/**
 * 입력받은 문자열 S의 각 문자를 R번 반복해 새 문자열 P출력
 * 
 * 1. 테스트 케이스의 개수 T (1 <= T <= 1000) 2. 문자 반복 횟수 R ( 1<= R <=8 ) 3. 문자열 S ( 1 <=
 * S < 20 )
 *
 */
public class Main_2675_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int t = Integer.valueOf(br.readLine());

		while (t > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int r = Integer.valueOf(st.nextToken());
			String s = st.nextToken();
			t--;
			int plus = 0;
			for (int i = 0; i < s.length(); i++) {
				for (int k = 0; k < r; k++) {
					sb.append(s.charAt(plus));
				}
				plus++;
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}

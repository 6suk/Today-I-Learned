package backjoon_202211;

import java.io.*;
import java.util.*;

/**
 * 입력받은 문자열 S의 각 문자를 R번 반복해 새 문자열 P출력
 * 
 * 1. 테스트 케이스의 개수 T (1 <= T <= 1000)
 * 2. 문자 반복 횟수 R ( 1<= R <=8 )
 * 3. 문자열 S ( 1 <= S < 20 )
 *
 */
public class Main_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());

		int[] rBox = new int[t];
		String[] sBox = new String[t];
		
		for (int i = 0; i < t; i++) {
			String[] tmp = br.readLine().split(" ");
			rBox[i] = Integer.valueOf(tmp[0]);
			sBox[i] = tmp[1];
		}
		br.close();

		for(int i = 0; i < t; i++) {
			print(rBox[i], sBox[i]);
		}

	}

	public static void print(int r, String s) throws IOException {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for (int k = 0; k < r; k++)
				sb.append(c);
		}
		System.out.println(sb);
	}
}

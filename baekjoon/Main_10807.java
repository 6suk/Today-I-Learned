package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 * 1. 정수의 개수 n
 * 2. 정수 입력(공백 구분)
 * 3. 찾으려는 정수 v
 * 4. 입력된 n개의 정수 중에 v가 몇 개 인지 출력
 * 
 */

public class Main_10807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(br.readLine());
		int count = 0;
		
		while(st.hasMoreElements()) {
			int a = Integer.parseInt(st.nextToken());
			if(a == v)
				count++;
		}
		br.close();
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}

package cote_202211;

import java.io.*;
import java.util.*;

/**
 * 
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * 1. N과 X 입력
 * 2. N개의 A(정수)
 * 3. X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력.
 *
 */

public class Main_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		StringTokenizer a = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		while (a.hasMoreElements()) {
			int b = Integer.parseInt(a.nextToken());
			if(b < x)
				sb.append(b+" ");
		}
		br.close();
		sb.trimToSize();
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
	}

}

package backjoon_202211;

import java.io.*;
import java.util.*;

/**
 * 
 * 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰
 * 수라고 말할 것이다. 1. 첫째 줄에 두수 A, B가 주어진다.
 * 
 */

public class Main_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		br.close();

		StringBuilder sb = new StringBuilder();

		for (int i = 6; i >= 0; i--) {
			sb.append(a.charAt(i));
		}
		
		StringTokenizer st = new StringTokenizer(sb.toString(), " ");
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		System.out.println(Math.max(c, b));
	}
}

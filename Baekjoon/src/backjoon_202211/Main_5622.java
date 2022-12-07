package backjoon_202211;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * 숫자 1 = 2초 ABC = 3
 *
 */

public class Main_5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };
		String callNum = br.readLine();
		int result = 0;

		for (int i = 0; i < callNum.length(); i++) {
			int b = callNum.charAt(i) - 65;
			result += a[b];
		}

		System.out.println(result);

	}
}

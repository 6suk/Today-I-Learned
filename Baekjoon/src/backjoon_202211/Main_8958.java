package backjoon_202211;

import java.io.*;
import java.util.*;

/**
 * 
 * [OX퀴즈] 1. 테스트 케이스의 개수 (0~80) 2. 각 테스트 케이스는 한줄로 이루어져있다. (OOXXOXXOOO)
 *
 */

public class Main_8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.valueOf(br.readLine());
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), "X");
			List<Integer> tmp = new ArrayList<>();
			while (st.hasMoreTokens()) {
				tmp.add(st.nextToken().length());
			}
			result.add(getOSum(tmp));
		}
		br.close();
		result.forEach(x -> System.out.println(x));
	}
	public static int getOSum(List<Integer> tmp) {
		int sum = 0;
		for (int a : tmp)
			for (int i = a; i > 0; i--)
				sum += i;
		return sum;
	}
}

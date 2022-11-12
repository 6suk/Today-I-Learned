package baekjoon;

import java.io.*;
import java.util.*;

/**
 * 
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 *
 */

public class Main_3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> hs = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {
			int tmp = Integer.parseInt(br.readLine());
			int modulo = tmp % 42;
			hs.add(modulo);
		}
		System.out.println(hs.size());
		br.close();
		
	}
}

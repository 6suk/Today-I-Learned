package cote_202211;

import java.io.*;
import java.util.*;

/**
 * 
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력 1. 첫째줄엔 숫자의 개수 1<= N <= 100 2. 숫가 N개가
 * 공백없이 주어진다.
 *
 */

public class Main_11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); // N : 사용하지 않을거기 때문에 선언X
		String numStr = br.readLine(); // 입력되는 숫자만 사용
		
		List<String> list = Arrays.asList(numStr.split(""));
		int sum = list.stream()
				.mapToInt(x -> Integer.valueOf(x))
				.reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
}

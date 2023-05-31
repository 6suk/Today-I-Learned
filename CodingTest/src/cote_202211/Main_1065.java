package cote_202211;

import java.io.*;
import java.util.*;

/**
 * 
 * 정수 X의 각 자리가 등차수열을 이룬다면, 그 수는 한수라고 한다. N이 주어졌을 때 1 <= a <= N 인 한수의 개수를 출력
 *
 */

public class Main_1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.valueOf(br.readLine());
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (getCount(i))
				count++;
		}
		System.out.println(count);
	}

	public static boolean getCount(int i) {
		if (i == 1000)
			return false;
		if (i < 100)
			return true;

		int num = i;
		List<Integer> list = new ArrayList<>();

		while (num != 0) {
			list.add(num % 10);
			num /= 10;
		}

		return list.get(0) - list.get(1) == list.get(1) - list.get(2);
	}
}

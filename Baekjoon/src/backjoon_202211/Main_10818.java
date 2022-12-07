package backjoon_202211;

import java.io.*;
import java.util.*;

/**
 * 
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 1. 정수의 개수 N
 * 2. N개의 정수 (공백)
 * 3. 최솟값과 최댓값을 공백으로 구분해 출력
 *
 */

public class Main_10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		int[] aBox = new int[a];

		for (int i = 0; i < a; i++) {
			aBox[i] = Integer.parseInt(st.nextToken());
		}

		int min = aBox[0];
		int max = aBox[0];

		for (int num : aBox) {
			if (num < min)
				min = num;
			if (num > max)
				max = num;
		}

		System.out.println(min + " " + max);
	}
}

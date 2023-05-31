package cote_202211;

import java.io.*;
import java.util.*;

/**
 * 
 * [평균은 넘겠지]
 * 1. 테스트 케이스의 개수 C
 * 2. 학생의 수 N + N개의 점수
 * 3. 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 *
 */

public class Main_4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.valueOf(br.readLine());
		StringTokenizer st;

		for (int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.valueOf(st.nextToken());
			int sum = 0;
			List<Integer> scores = new ArrayList<>();

			while (st.hasMoreTokens()) {
				int score = Integer.valueOf(st.nextToken());
				sum += score;
				scores.add(score);
			}

			Double scoresAvg = (double) sum / n;
			int count = 0;
			for (int a : scores) {
				if (a > scoresAvg)
					count++;
			}

			Double result = ((double) count / n) * 100;
			System.out.println(String.format("%.3f", result) + "%");
		}
		br.close();
	}
}

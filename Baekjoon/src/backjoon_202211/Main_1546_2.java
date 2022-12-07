package backjoon_202211;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 
 * 점수/M*100 1. 시험 본 과목의 개수 N 2. 현재 성적 ( 가장 큰 점수가 M)
 *
 */

public class Main_1546_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double n = Double.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		List<Integer> scores = new ArrayList<>();

		int max = 0;
		while (st.hasMoreTokens()) {
			int tmp = Integer.valueOf(st.nextToken());
			scores.add(tmp);
			max = Math.max(max, tmp);
		}

		float newScore = 0.0F;
		for (int score : scores) 
			newScore += ((float)score) / max * 100;
	
		System.out.println(newScore / n);
	}
}

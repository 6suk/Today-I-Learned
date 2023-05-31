package cote_202211;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 
 * 점수/M*100 1. 시험 본 과목의 개수 N 2. 현재 성적 ( 가장 큰 점수가 M)
 *
 */

public class Main_1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double n = Double.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		List<Double> scores = new ArrayList<>();

		while (st.hasMoreTokens()) {
			double tmp = Double.valueOf(st.nextToken());
			scores.add(tmp);
		}

		Double maxScore = (double) scores.indexOf(0);
		for (double num : scores) {
			if (maxScore < num)
				maxScore = num;
		}

		double newScore = 0.0;
		for (double score : scores) {
			newScore += score / maxScore * 100;
		}
		System.out.println(newScore / n);
	}
}

package baekjoon;

import java.io.*;

/**
 * 
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 *
 */

public class Main_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] numBox = new int[9];
		int max = 0, index = 0;

		for (int i = 0; i < numBox.length; i++) {
			int num = Integer.parseInt(br.readLine());
			numBox[i] = num;
			if (max < num) {
				max = num;
				index = i + 1;
			}
		}
		br.close();
		bw.write(max + "\n");
		bw.write(index + "\n");
		bw.flush();
		bw.close();
	}
}

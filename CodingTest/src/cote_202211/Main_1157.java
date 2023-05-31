package cote_202211;

import java.io.*;

public class Main_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] box = new int[26];
		String str = br.readLine().toUpperCase();
		br.close();
		int max = 0, cnt = 0, result = 0;

		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 65;
			box[index] += 1;
			if (max < box[index]) {
				max = box[index];
				result = str.charAt(i);
			}
		}

		for (int a : box) {
			if (cnt + 65 != result && a == max) {
				result = 63;
				break;
			}
			cnt++;
		}
		System.out.println((char) result);
	}
}

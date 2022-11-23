package backjoon_202211;

import java.io.*;

public class Main_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.valueOf(br.readLine());
		int count = 0;

		for (int i = 0; i < loop; i++) {
			count += getCount(br.readLine());
		}
		br.close();
		System.out.println(count);
	}

	public static int getCount(String str) {
		boolean[] c = new boolean[26];
		
		for (int i = 1; i < str.length(); i++) {
			int a = str.charAt(i-1);
			int b = str.charAt(i);
			if (a != b && c[b - 97] == true) {
				return 0;
			} else if (a == b || a != b) {
				c[a - 97] = true;
				c[b - 97] = true;
			}
		}
		return 1;
		
	}
//	public static int getCount(String str) {
//		boolean[] c = new boolean[26];
//		int tmp = 0, cnt = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//			int a = str.charAt(i);
//			if (tmp != a && c[a - 97] == true) {
//				return 0;
//			} else if (tmp == a || tmp != a) {
//				c[a - 97] = true;
//				tmp = a;
//				cnt++;
//			}
//		}
//		if (cnt == str.length()) {
//			return 1;
//		}
//		return 0;
//
//	}
}

package backjoon_202211;

import java.io.*;
import java.util.*;

/**
 * 
 * 알파벳 소문자로만 이루어진 단어 S 입력 알파벳 순서대로 등장하는 위치 (index) 출력 알파벳이 단어에 포함되어 있지 않다면 -1 출력
 *
 */

public class Main_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		int[] oxBox = new int[26];
		Arrays.fill(oxBox, -1);

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			oxBox[getIndex(a)] = str.indexOf(a);
		}
		print(oxBox);
	}

	public static int getIndex(char a) {
		List<Character> azBox = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
				'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
		return azBox.indexOf(a);
	}

	public static void print(int[] box) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int a : box)
			bw.write(a + " ");
		bw.flush();
		bw.close();
	}
}

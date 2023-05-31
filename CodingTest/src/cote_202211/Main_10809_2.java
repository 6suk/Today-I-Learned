package cote_202211;

import java.io.*;
import java.util.*;

/**
 * 
 * 알파벳 소문자로만 이루어진 단어 S 입력 알파벳 순서대로 등장하는 위치 (index) 출력 알파벳이 단어에 포함되어 있지 않다면 -1 출력
 *
 */

public class Main_10809_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char re = 'a';
		System.out.println((int)re);
		String str = br.readLine();
		br.close();
		int[] azBox = new int[26];
		Arrays.fill(azBox, -1);

		for (int i = 0; i < str.length(); i++) {
			int azBoxIndex = str.charAt(i) - 97;
			if(azBox[azBoxIndex] == -1)
				azBox[azBoxIndex] = i;
		}
		print(azBox);
	}
	
	public static void print(int[] box) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int a : box)
			bw.write(a + " ");
		bw.flush();
		bw.close();
	}
	
	
}

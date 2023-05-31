package cote_202211;

import java.io.IOException;
import java.util.Scanner;


public class Main_1712 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int v = sc.nextInt();
		int p = sc.nextInt();
		sc.close();
		
		int q = 0;

		if (v >= p) {
			System.out.println(-1);
		} else {
			q = f / (p - v);
			System.out.println(q + 1);
		}

	}
}

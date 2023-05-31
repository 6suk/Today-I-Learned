package cote_202211;

import java.util.Scanner;

public class Main_10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] box = new int[t];

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			box[i] = a + b;
		}
		
		for (int a : box) {
			System.out.println(a);
		}
		
		sc.close();

	}

}

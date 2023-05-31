package cote_202211;

import java.util.Scanner;

public class Main_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] box = new int[n];
		int result = 0;

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			box[i] = a * b;
		}
		sc.close();
		
		for (int a : box) {
			result += a;
		}

		if (result == x)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}

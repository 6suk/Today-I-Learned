package baekjoon;

import java.util.Scanner;

public class Main_2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

		int m = b + c;
		
		if (m >= 60) {
			a += (m / 60);
			b = m % 60;
		} else
			b = m;
		
		if (a > 23) {
			a -= 24;
		}
		System.out.printf("%d %d%n", a, b);
		
	}

}

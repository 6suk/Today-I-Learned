package backjoon_202211;

import java.util.Scanner;

public class Main_2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();

		int result = 0;

		if (a == b) {
			result = 1000 + a * 100;
			if (a == c)
				result = 10000 + a * 1000; // 1번
		} else if (a == c) {
			result = 1000 + a * 100;
		} else if (b == c) {
			result = 1000 + b * 100;
		} else if (a > b && a > c) {
			result = a * 100;
		} else if (b > c || b < c) {
			result = (b > c) ? b * 100 : c * 100;
		}
		System.out.println(result);

	}
}

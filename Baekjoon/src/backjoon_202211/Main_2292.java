package backjoon_202211;

import java.util.Scanner;

public class Main_2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int x = 1;
		int n = 1;

		if (a == 1) {
			System.out.println(1);
			return;
		}
		while (true) {
			x += (6 * n);
			n++;
			if (x >= a)
				break;
		}
		System.out.println(n);
	}
}

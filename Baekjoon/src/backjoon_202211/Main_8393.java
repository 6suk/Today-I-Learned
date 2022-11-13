package backjoon_202211;

import java.util.Scanner;

public class Main_8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i <= t; i++) {
			result += i;
		}
		System.out.println(result);
		
	}
}

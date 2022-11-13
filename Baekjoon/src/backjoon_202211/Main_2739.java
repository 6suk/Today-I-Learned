package backjoon_202211;

import java.util.Scanner;

public class Main_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			int mul = a * i;
			System.out.printf("%d * %d = %d%n",a,i,mul);
		}
		
		
	}

}

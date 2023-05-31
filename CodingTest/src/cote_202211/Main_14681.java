package cote_202211;

import java.util.Scanner;

public class Main_14681 {

	public static void main(String[] args) {
		// X > 0 , y > 0 = 1
		// X < 0 , y > 0 = 2
		// X < 0 , Y < 0 = 3
		// X > 0 , Y < 0 = 4
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), Y = sc.nextInt();
		
		int result = 0;
		if(X > 0) {
			if(Y > 0) {
				result = 1;
			}else
				result = 4;
		}else {
			if(Y > 0) {
				result = 2;
			}else
				result = 3;
		}
		System.out.println(result);
	}

}

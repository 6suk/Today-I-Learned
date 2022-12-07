package backjoon_202211;

import java.util.Scanner;

public class Main_2753 {

	public static void main(String[] args) {
		// 윤년 구하기
		// 4의 배수 100의 배수가 아닐때 또는 400의 배수일때
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		int result = 0;
		if(year % 4 == 0 && year % 100 != 0) {
			result = 1;
		} else if(year % 400 == 0) {
			result = 1;
		}
		System.out.println(result);
	}

}

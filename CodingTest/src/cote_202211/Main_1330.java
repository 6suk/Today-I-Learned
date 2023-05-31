package cote_202211;

import java.util.Scanner;

public class Main_1330 {

	public static void main(String[] args) {
//		두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		
		/** 두 수 입력 받고, 공백을 기준으로 나누기*/
		Scanner sc = new Scanner(System.in);
//		String scanStr = sc.nextLine();
		String[] numStr = (sc.nextLine()).split(" ");
		sc.close();
		
		/** 입력받은 수 int로 변환*/
		int num1 = Integer.parseInt(numStr[0]);
		int num2 = Integer.parseInt(numStr[1]);
		
		String result = "";
		
		if(num1 > num2)
			result = ">";
		else if (num1 < num2)
			result = "<";
		else if (num1 == num2)
			result = "==";

		System.out.println(result);

		
	}

}

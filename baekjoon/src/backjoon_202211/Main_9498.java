package baekjoon;

import java.util.Scanner;

public class Main_9498 {

	public static void main(String[] args) {
		// 90 ~ 100 A
		// 80 ~ 89 B
		// 70 ~ 79 C
		// 60 ~ 69 D
		// 나머지 F
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		char grade;
		
		if(score == 100 || score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println(grade);
		
	}

}

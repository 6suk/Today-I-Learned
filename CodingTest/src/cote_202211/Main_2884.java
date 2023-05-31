package cote_202211;

import java.util.Scanner;

public class Main_2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String[] time = (sc.nextLine()).split(" ");
//		int H = Integer.parseInt(time[0]);
//		int M = Integer.parseInt(time[1]);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		// M - 45 <= 0 --> M + 15 --> H - 1
		
		if(M < 45) {
			M = 60 - (45 - M); //-------> 요부분이 문제였음
			H -= 1;
			if(H < 0) {
				H = 23;
			}	
		}else {
			M -= 45;
		}
		
		System.out.printf("%d %d",H,M);
	}

}

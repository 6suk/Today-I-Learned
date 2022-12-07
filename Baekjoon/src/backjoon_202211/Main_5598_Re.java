package backjoon_202211;

import java.io.*;

/**
 * 
 * 1 ~ 30번 학생 / 28명 제출 -> 제출 안한 2명의 출석번호 1. 한 줄에 하나씩 28줄 입력 2. 제출하지 않은 출석번호 2명
 * (작은 수 먼저 출력)
 * 
 *
 */

public class Main_5598_Re {
	public static final int PASS = 1;
	public static final int NON_PASS = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] stuNumBox = new int[30];

		for (int i = 0; i < 28; i++) {
			stuNumBox[Integer.valueOf(br.readLine()) - 1] = 1;
		}
		br.close();

		for (int i = 0; i < stuNumBox.length; i++) {
			if (stuNumBox[i] == NON_PASS)
				System.out.println(i + 1);
		}
	}
}

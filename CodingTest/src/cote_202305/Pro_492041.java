package cote_202305;

import java.util.Scanner;

public class Pro_492041 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

/* 17번 코드와 동일 */
//        for (int k = 0; k < a; k++) {
//            sb.append("*");
//        }
        sb.append("*".repeat(Math.max(0, a)));


        for (int i = 0; i < b; i++) {
            System.out.println(sb);
        }
    }
}

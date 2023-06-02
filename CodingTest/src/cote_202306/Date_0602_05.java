package cote_202306;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/136798
프로그래머스 - Lv1
 */

public class Date_0602_05 {

    public int solution(int number, int limit, int power) {
        int result = 0;
        // 1 ~ number 반복
        for (int p = 1; p <= number; p++) {

            // 약수의 개수
            int cnt = 0;
            for (int i = 1; i * i <= p; i++) {
                if (i * i == p) cnt++;
                else if (p % i == 0) cnt += 2;

                // limit을 넘어가면 power로 변경
                if (cnt > limit) {
                    cnt = power;
                    break;
                }
            }
            result += cnt;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power = 2;

        System.out.println(new Date_0602_05().solution(number, limit, power));
    }

}

package cote_202306;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/134240
프로그래머스 - Lv1
 */

public class Date_0603_01 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));  // repeat() : 문자열 반복

            /* 위의 식과 동일
            for(int f = 0; f < food[i]/2; f++){
                sb.append(i);
            }
             */
        }

        if(sb.length() > 0) return sb.toString() + 0 + sb.reverse();
        return "";
    }

    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(new Date_0603_01().solution(arr));
    }
}

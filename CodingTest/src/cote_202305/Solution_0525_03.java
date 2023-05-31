package cote_202305;

/**
 * 점의 위치 구하기
 * */

public class Solution_0525_03 {
    public int solution(int[] dot) {
        int x = dot[0], y = dot[1];
        int answer = 0;


        if (x < 0) {
            if (y < 0) {
                answer = 3;
            } else {
                answer = 2;
            }
        } else {
            if (y >= 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_0525_03 play = new Solution_0525_03();
        int[] dot = {-7, 9};
        System.out.println(play.solution(dot));
    }
}

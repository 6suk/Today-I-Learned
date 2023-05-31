package cote_202305;

/*피자 나눠먹기(1)*/

public class Solution_0525_04 {
    public int solution(int n) {
        return n % 7 > 0 ? n / 7 + 1 : n / 7;
    }

    public static void main(String[] args) {
        Solution_0525_04 test = new Solution_0525_04();
        System.out.println(test.solution(26));
    }
}

package cote_202305;

/*
 * 2023-05-31
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */
public class Pro_147355 {
    public int solution(String t, String p) {
        int n = p.length(), cnt = 0;
        long p_int = Long.parseLong(p);

        for (int i = 0; i <= t.length() - n; i++) {
            if(t.charAt(i) > p.charAt(0)) continue;
            long sub = Long.parseLong(t.substring(i, i + n));
            if (sub <= p_int) cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        String t = "3141592331415923314159233141592331415923";
        String p = "2123456783";

        System.out.println(new Pro_147355().solution(t, p));
    }
}

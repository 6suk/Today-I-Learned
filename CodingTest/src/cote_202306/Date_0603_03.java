package cote_202306;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/150370
프로그래머스 - Lv1
 */

import java.time.LocalDate;
import java.util.*;

public class Date_0603_03 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        CalcDate a = new CalcDate(today, terms);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            if (!a.getStatus(privacies[i])) result.add(i + 1);
        }

        return result.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        String today = "2020.01.01";
        String[] terms = {"Z 100", "D 1"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        System.out.println(Arrays.toString(new Date_0603_03().solution(today, terms, privacies)));
    }
}

class CalcDate {
    private final LocalDate today;
    private final HashMap<String, Integer> terms = new HashMap<>();


    /**
     * today 및 약관 종류 저장
     *
     * @param today "YYYY.MM.DD" 형태로 오늘 날짜를 나타냅니다.
     * @param terms 약관 종류와 유효기간을 공백 하나로 구분한 문자열
     */
    public CalcDate(String today, String[] terms) {
        // today
        int[] td = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();
        this.today = LocalDate.of(td[0], td[1], td[2]);

        // terms
        for (String t : terms) {
            String[] arr = t.split(" ");
            this.terms.put(arr[0], Integer.parseInt(arr[1]));
        }
    }

    /**
     * 파기해야 할 개인정보 구분
     *
     * @param info 개인정보의 수집 일자와 약관 종류를 공백 하나로 구분한 문자열
     * @return 만료 시 false 반환
     */
    public boolean getStatus(String info) {
        String[] arr = info.split(" "); // 날짜,약관종류 분리
        String[] ymd = arr[0].split("\\."); // yy.mm.dd 분리

        int term = terms.get(arr[1]);  // 약관 종류
        int d = Integer.parseInt(ymd[2]) - 1;
        int m = Integer.parseInt(ymd[1]) + term;
        int y = Integer.parseInt(ymd[0]);

        if (d == 0) {
            d = 28;
            m--;
        }

        if (m > 12) {
            y += m / 12;
            m = m % 12;

            if (m == 0) {
                m = 12;
                y--;
            }
        }

        // today > getStatus : 1 반환 (false / 만료)
        // today == getStatus : 0 반환 (true)
        // today < getStatus : -1 반환 (true)
        return today.compareTo(LocalDate.of(y, m, d)) <= 0;
    }
}

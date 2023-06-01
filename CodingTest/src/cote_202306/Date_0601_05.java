package cote_202306;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/142086
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date_0601_05 {
    public int[] solution(String s) {
        List<Character> list = new ArrayList<>();
        int[] result = new int[s.length()];
        int i = 0;

        // 순서대로 리스트에 넣으면서 비교
        for (char x : s.toCharArray()) {
            if (list.contains(x)) result[i] = i - list.lastIndexOf(x);
            else result[i] = list.indexOf(x); // -1 반환

            i++;
            list.add(x);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "sssss";
        System.out.println(Arrays.toString(new Date_0601_05().solution(s)));
    }
}

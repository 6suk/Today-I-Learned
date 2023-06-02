package cote_202306;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/135808
프로그래머스 - Lv1
 */

public class Date_0602_06 {

    // 제출 및 성공
    public int solution(int k, int m, int[] score) {
        TreeMap<Integer, Integer> map = new TreeMap<>((o1, o2) -> o2 - o1); // 내림차순 정렬
        for (int s : score) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int price = 0;

        while (!map.isEmpty()) {
            // 가장 높은 등급 먼저 꺼내기
            Map.Entry<Integer, Integer> prev = map.pollFirstEntry();

            // m개씩 나눠진다면 해당 등급만큼 price 더하기
            if (prev.getValue() / m > 0) {
                price += (prev.getValue() / m) * prev.getKey() * m;
            }

            // m을 나눈(또는 못나눈) 나머지 다음 등급에게 넘기기
            if (!map.isEmpty()) {
                int next = map.firstKey();
                map.put(next, map.get(next) + prev.getValue() % m);
            }
        }

        return price;
    }

    // 간단하게도 생각해보기!
    public int solution_any(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }

    public static void main(String[] args) {
        int k = 3, m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 0, 0};
        System.out.println(new Date_0602_06().solution(k, m, score));
    }
}

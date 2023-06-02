package cote_202306;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/138477
프로그래머스 - Lv1
 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class Date_0602_04 {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> rank = new PriorityQueue<>();
        int[] result = new int[score.length];
        int day = 0;

        for(int x : score){
            if(k > day){
                rank.add(x);
            } else if(x > rank.peek()){
                rank.poll();
                rank.add(x);
            }
            result[day++] = rank.peek();
        }
        return result;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(new Date_0602_04().solution(k, score)));
    }

}

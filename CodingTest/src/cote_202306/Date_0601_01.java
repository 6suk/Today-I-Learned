package cote_202306;

import java.util.Arrays;
import java.util.Stack;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class Date_0601_01 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int j : arr) {
            if (stack.isEmpty() || stack.peek() != j) stack.push(j);
        }

        return stack.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(new Date_0601_01().solution(arr)));
    }
}

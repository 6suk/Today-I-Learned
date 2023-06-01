package cote_202306;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */

import java.util.Stack;

public class Date_0601_02 {

    // 정확도 통과, 효율성1 통과, 효율성2 실패
    boolean solution1(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0 || s.charAt(s.length() - 1) == '(') return false;

        for (char c : s.toCharArray()) {
            if (stack.isEmpty() && c == ')') return false;
            if (!stack.isEmpty() && stack.peek() - c == -1) stack.pop();
            else stack.push(c);
        }

        return stack.isEmpty();
    }

    // 전체 통과
    boolean solution(String s) {
        int cnt = 0;

        for (char c : s.toCharArray()) {
            cnt += c == '(' ? 1 : -1;

            // cnt가 음수의 경우 ')'로 시작이기 때문에 false 반환
            if(cnt < 0) return false;
        }

        return cnt == 0;
    }

    public static void main(String[] args) {
        String s = "((((((())))))(()";
        System.out.println(new Date_0601_02().solution(s));
    }
}

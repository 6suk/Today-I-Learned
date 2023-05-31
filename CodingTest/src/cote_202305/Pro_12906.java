package cote_202305;

import java.util.Arrays;
import java.util.Stack;

public class Pro_12906 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int j : arr) {
            if (stack.isEmpty() || stack.peek() != j) stack.push(j);
        }

        return stack.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(new Pro_12906().solution(arr)));
    }
}

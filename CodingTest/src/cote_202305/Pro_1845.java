package cote_202305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Pro_1845 {
    public int solution(int[] nums) {
        int answer = (int) Arrays.stream(nums).distinct().count();
        if (nums.length / 2 < answer) answer = nums.length / 2;
        return answer;
    }

    public int newSolution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        return hs.size() > nums.length / 2 ? nums.length : hs.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(new Pro_1845().solution(input));
        br.close();

        int b = new Pro_1845().newSolution(input);
        System.out.println("new : " + b);
    }
}

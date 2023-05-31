package cote_202305;

import java.util.*;

public class Solution_0525_01 {


    public int[] solution(int[] arr) {

        ArrayList<Integer> tmpArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                tmpArr.add(arr[i]);
            } else {
                if (arr[i] != tmpArr.get(tmpArr.size() - 1)) {
                    tmpArr.add(arr[i]);
                }
            }
        }

        int[] answer = new int[tmpArr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = tmpArr.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Solution_0525_01 play = new Solution_0525_01();
        int[] result = play.solution(arr);
        System.out.println(Arrays.toString(result));
    }
}



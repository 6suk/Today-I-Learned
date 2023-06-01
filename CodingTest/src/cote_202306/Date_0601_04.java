package cote_202306;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/160586
 */

import java.util.Arrays;
import java.util.HashMap;

public class Date_0601_04 {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> map = new HashMap<>();

        // key별 횟수 매핑
        for (String s : keymap) {
            for (int k = 0; k < s.length(); k++) {
                char key = s.charAt(k);
                if (!map.containsKey(key)) {
                    map.put(key, k);
                    continue;
                }

                if (k < map.get(key)) {
                    map.put(key, k);
                }
            }
        }

        int[] result = new int[targets.length];

        // targets 총합 계산
        for (int i = 0; i < targets.length; i++) {
            int cnt = 0;
            for (char t : targets[i].toCharArray()) {
                if (!map.containsKey(t)) { // Keymap에 없을 경우
                    cnt = -1;
                    break;
                }
                cnt += map.get(t) + 1;
            }
            result[i] = cnt;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"G", "ABCD", "AABB"};

        System.out.println(Arrays.toString(new Date_0601_04().solution(keymap, targets)));
    }
}

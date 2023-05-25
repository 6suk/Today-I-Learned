package backjoon_202305;

import java.util.HashMap;
import java.util.Map;

public class Pro_42576 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String key : completion) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (String key : participant) {
            if (map.containsKey(key) && map.get(key) > 0) {
                map.replace(key, map.get(key) - 1);
            } else {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String result = new Pro_42576().solution(participant, completion);
        System.out.println(result);
    }
}

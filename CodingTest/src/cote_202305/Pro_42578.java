package cote_202305;

import java.util.HashMap;

public class Pro_42578 {
    public int solution(String[][] clothes) {
        int result = 1;

        HashMap<String, Integer> map = new HashMap<>();
        for (String[] x : clothes) {    // map에 카테고리별로 카운트해 담기
            map.put(x[1], map.getOrDefault(x[1], 0) + 1);
        }

        for (String key : map.keySet()) {   // 카테고리별 경우의 수
            result *= map.get(key) + 1;    // 입지 않았을 때 추가
        }
        return result - 1; // 모두 입지 않았을 때 제외
    }

    public static void main(String[] args) {
        String[][] input = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        String[][] input = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(new Pro_42578().solution(input));
    }
}

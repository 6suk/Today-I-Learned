package cote_202305;

import java.util.Arrays;
import java.util.HashMap;

public class Pro_176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] result = new int[photo.length];

        for(int i = 0; i < photo.length; i++){
            int cnt = 0;
            for(String p_name : photo[i]){
                if(map.containsKey(p_name)){
                    cnt += map.get(p_name);
                }
            }
            result[i] = cnt;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(new Pro_176963().solution(name, yearning, photo)));
    }
}

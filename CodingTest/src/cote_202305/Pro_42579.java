package cote_202305;

import java.util.*;


public class Pro_42579 {

    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> category = new HashMap<>();
        HashMap<String, Integer> play = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String cate = genres[i];
            category.put(cate, category.getOrDefault(cate, 0) + plays[i]);
            play.put(i + ":" + cate, plays[i]);
        }

        // 장르별 Sort
        List<String> cateSort = new ArrayList<>(category.keySet());
        cateSort.sort((x, y) -> category.get(y) - category.get(x));

        // 고유번호별 Sort
        List<String> playSort = new ArrayList<>(play.keySet());
        playSort.sort((x, y) -> !Objects.equals(play.get(y), play.get(x)) ?
                play.get(y) - play.get(x) :
                Integer.parseInt(x.split(":")[0]) - Integer.parseInt(y.split(":")[0]));

        int cnt;
        Stack<Integer> result = new Stack<>();

        for (String key : cateSort) {
            cnt = 0;
            for (String p_key : playSort) {
                String[] num = p_key.split(":");
                if (num[1].equals(key) && cnt < 2) {
                    cnt++;
                    result.push(Integer.parseInt(num[0]));
                }
            }
        }
        return result.stream().mapToInt(x -> x).toArray();
    }


    public static void main(String[] args) {
        String[] a = {"classic", "pop", "pop", "classic", "classic", "pop", "popop", "test"};
        int[] b = {500, 600, 600, 150, 800, 2500, 900, 300};
        System.out.println(Arrays.toString(new Pro_42579().solution(a, b)));
    }
}

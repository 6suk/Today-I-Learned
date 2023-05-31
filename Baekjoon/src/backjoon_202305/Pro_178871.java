package backjoon_202305;

import java.util.Arrays;
import java.util.HashMap;

public class Pro_178871 {
    public String[] solution(String[] players, String[] callings) {
        String[] result = new String[players.length];
        HashMap<String, Integer> player = new HashMap<>();
        HashMap<Integer, String> rank = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            player.put(players[i], i);
            rank.put(i, players[i]);
        }

        for (String calling : callings) {
            // 호명된 선수의 랭킹
            int curRank = player.get(calling);
            // 호명된 선수의 전 선수
            String prevName = rank.get(player.get(calling) - 1);

            // 스왑
            rank.put(curRank - 1, calling);
            rank.put(curRank, prevName);
            player.put(prevName, curRank);
            player.put(calling, curRank - 1);
        }

        for (int i = 0; i < players.length; i++) {
            result[i] = rank.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai"};
        System.out.println(Arrays.toString(new Pro_178871().solution(players, callings)));
    }
}

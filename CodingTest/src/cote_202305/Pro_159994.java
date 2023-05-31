package cote_202305;

/*
 * 2023-05-31
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */

public class Pro_159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String a : goal) {
            for (String b : cards1) {
                if (a.equals(b)) sb1.append(b);
            }
            for (String c : cards2) {
                if (a.equals(c)) sb2.append(c);
            }
        }

        if (String.join("", cards1).contains(sb1.toString()) &&
                String.join("", cards2).contains(sb2.toString())) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        String[] card1 = {"i", "want", "to"};
        String[] card2 = {"drink", "water"};
        String[] goal = {"i", "drink", "water"};

        System.out.println(new Pro_159994().solution(card1, card2, goal));
    }

}

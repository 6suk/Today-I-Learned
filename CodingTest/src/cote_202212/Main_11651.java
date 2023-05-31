package cote_202212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main_11651 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int input = Integer.parseInt(br.readLine());
        List<NumberBox> list = new ArrayList<>();
        NumberBox numberBox = new NumberBox();

        for (int i = 0; i < input; i++) {
            String[] tmp = br.readLine().split(" ");
            int x = Integer.parseInt(tmp[0]);
            int y = Integer.parseInt(tmp[1]);
            list.add(new NumberBox(x, y));
        }

        list.sort(numberBox);
        StringBuilder sb = new StringBuilder();
        for (NumberBox num : list) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }

    static class NumberBox implements Comparator<NumberBox> {
        int x, y;

        public NumberBox() {
        }

        public NumberBox(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }

        @Override
        public int compare(NumberBox o1, NumberBox o2) {
            return o1.y - o2.y == 0 ? o1.x - o2.x : o1.y - o2.y;
        }
    }

}

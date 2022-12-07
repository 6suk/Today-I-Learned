package backjoon_202212;

import java.io.*;
import java.util.*;

public class Main_10814 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        List<Member> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            list.add(new Member(i,Integer.parseInt(tmp[0]),tmp[1]));
        }
        br.close();

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        list.forEach(x -> sb.append(x).append("\n"));
        System.out.println(sb);
    }
}

class Member implements Comparable<Member> {
    int index;
    int age;
    String name;

    public Member(int index, int age, String name) {
        this.index = index;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Member o) {
        return this.age - o.age == 0 ? this.index - o.index : this.age - o.age;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }
}

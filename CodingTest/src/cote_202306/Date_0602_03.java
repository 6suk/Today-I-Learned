package cote_202306;

/*
★ BST ★ 추후 컬렉션을 이용하지 않고 직접 진행해보기 (3244ms)

https://www.acmicpc.net/problem/18870
백준 - 실버2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Date_0602_03 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        br.close();

        // 기존 Sort + Contains 기능을 사용했으나 풀이 시간초과 - O(n)
        // TreeMap을 이용해 BST(Binary Search Tree)로 탐색 - O(log n)
        TreeMap<Integer, Index> treeMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            if (treeMap.get(arr[i]) == null) {
                treeMap.put(arr[i], new Index(i));
            } else {
                treeMap.get(arr[i]).setIndex(i);
            }
        }

        String[] result = new String[n];
        int cnt = 0;

        for (Integer a : treeMap.keySet()) {
            List<Integer> index = treeMap.get(a).getIndex();
            for (Integer integer : index) {
                result[integer] = cnt + "";
            }
            cnt++;
        }

        System.out.println(String.join(" ", result));
    }
}

class Index {
    private final List<Integer> index;

    public Index(int index) {
        List<Integer> indexList = new ArrayList<>();
        indexList.add(index);

        this.index = indexList;
    }

    public List<Integer> getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index.add(index);
    }

    @Override
    public String toString() {
        return index + " ";
    }
}


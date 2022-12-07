package backjoon_202211;

import java.util.ArrayList;
import java.util.List;

public class Main_4673 {

	public static void main(String[] args) {
		int[] numBox = new int[10001];
		boolean[] b = new boolean[10001];

		for (int i = 1; i < numBox.length; i++) {
			try {
				numBox[nonSelfNum(i)] = nonSelfNum(i);
			} catch (ArrayIndexOutOfBoundsException e) {
			}
		}

		List<Integer> selfNumBox = new ArrayList<>();

		for (int i = 1; i < numBox.length; i++) {
			if (numBox[i] == 0) {
				selfNumBox.add(i);
			}
		}
		selfNumBox.forEach(x -> System.out.println(x));

	}

	static int nonSelfNum(int i) {
		int sum = 0;
		int num = i;

		while (true) {
			sum += num % 10;
			num /= 10;
			if (num == 0)
				break;
		}
		return sum + i;
	}

}

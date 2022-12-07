package backjoon_202211;

public class Main_4673_2 {
	
	static final boolean SELF_NUMBER = false;
	static final boolean NON_SELF_NUMBER = true;
	
	public static void main(String[] args) {
		boolean[] numBox = new boolean[10001];

		for (int i = 1; i < 10001; i++) {
			if(nonSelfNum(i) < 10001)
				numBox[nonSelfNum(i)] = NON_SELF_NUMBER;
		}
		
		for (int i = 1; i < numBox.length; i++) {
			if (numBox[i] == SELF_NUMBER) {
				System.out.println(i);
			}
		}
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

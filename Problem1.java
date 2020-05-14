public class Problem1 {

	static boolean checkMultiple(int num, int mult) {
		return num % mult == 0;
	}

	public static void main(String[] args) {
		int count = 0;
		int max = 1000;
		for (int i = 0; i < max; i ++) {
			if (checkMultiple(i, 3) || checkMultiple(i, 5)) {
				count += i;
			};
		}
		System.out.println(count);

	}
}

public class Problem5 {

	static boolean checkMod(int i) {
		for (int n = 1; n < 21; n++) {
			if ((i % n) != 0) {
				return false;
			}
		}
		return true;
	}

	static int getNum() {
		int i = 1;
		while (!checkMod(i)) {
			i++;
		}
		return i;
	}

	public static void main(String[] args) {
		System.out.println(getNum());
	}
}

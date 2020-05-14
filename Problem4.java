public class Problem4 {

	static int checkPalindrome(int i, int j) {
		int product = i * j;
		int length = String.valueOf(product).length();
		for (int n = 0; n < length; n++) {
			// check first against last
			int a = Integer.parseInt(Integer.toString(product).substring(n, n + 1));
			int b = Integer.parseInt(Integer.toString(product).substring(length - n - 1, length - n));
			if (a == b) {
				if (n == length / 2) {
					return product;
				}
			} else {
				return -1;
			}
		}
		return -1;
	}

	static int getNumbers() {
		int currentHighest = 0;
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				int product = checkPalindrome(i, j);
				if (product > currentHighest) {
					currentHighest = product;
				}
			}
		}
		return currentHighest;
	}

	public static void main(String[] args) {
		System.out.println(getNumbers());
	}
}

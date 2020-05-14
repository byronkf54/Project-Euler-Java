public class Problem2 {

	static void getFibSeq() {
		int prev = 1;
		int current = 2;
		int next = current + prev;
		int count = 0;
		while (next < 4000000) {
			if (current % 2 == 0) {
				count += current;
			}
			next = current + prev;
			prev = current;
			current = next;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		getFibSeq();
	}
}

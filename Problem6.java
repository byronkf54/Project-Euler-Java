public class Problem6 {

	static int sumOfSquares() {
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum += i * i;
		}
		return sum;
	}

	static int squareOfSum() {
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
		return sum * sum;
	}

	public static void main(String[] args) {
		int sumSq = sumOfSquares();
		int sqSum = squareOfSum();
		System.out.println(sqSum - sumSq);
	}
}

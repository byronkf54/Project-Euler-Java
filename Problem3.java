public class Problem3 {

	static void findPrimeFactors(long n) {
		int p = 2;
		do {
			if (n % p == 0) {
				System.out.println(p);
				n = n / p;
			}
			else {
				p++;
			}
		} while (n > p);
		System.out.println(p);
	}

	public static void main(String[] args) {
		long n = 600851475143L;
		findPrimeFactors(n);
	}
}

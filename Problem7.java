public class Problem7 {

	static void sieveOfEratosthenes(int n)
	{
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<n;i++)
			prime[i] = true;

		for(int p = 2; p*p <=n; p++)
		{
			// If prime[p] is not changed, then it is a prime
			if(prime[p] == true)
			{
				// Update all multiples of p
				for(int i = p*2; i <= n; i += p)
					prime[i] = false;
			}
		}

		// Print all prime numbers
		int count = 0;
		for(int i = 2; i <= n; i++)
		{
			if(prime[i]) {
				count++;
				if (count == 10001) {
					System.out.println(i);
				}

			}
		}
	}

	// Driver Program to test above function
	public static void main(String[] args)
	{
		int n = 10000000;
		sieveOfEratosthenes(n);
	}
}

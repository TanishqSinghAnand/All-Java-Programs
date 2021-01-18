// Program to check whether 
// a given number is left 
// truncatable prime or not. 
import java.io.*; 

class GFG { 
		
	// Function to calculate x 
	// raised to the power y 
	static int power(int x,int y) 
	{ 
		if (y == 0) 
			return 1; 
		else if (y%2 == 0) 
			return power(x, y/2) 
				*power(x, y/2); 
		else
			return x*power(x, y/2) 
				*power(x, y/2); 
	} 
	
	// Generate all prime 
	// numbers less than n. 
	static void sieveOfEratosthenes 
				(int n, boolean isPrime[]) 
	{ 
		
		// Initialize all entries of boolean 
		// array as true. A value in isPrime[i] 
		// will finally be false if i is Not 
		// a prime, else true bool isPrime[n+1]; 
		isPrime[0] = isPrime[1] = false; 
		for (int i = 2; i <= n; i++) 
			isPrime[i] = true; 
	
		for (int p = 2; p*p <= n; p++) 
		{ 
			// If isPrime[p] is not changed, 
			// then it is a prime 
			if (isPrime[p] == true) 
			{ 
				
				// Update all multiples of p 
				for (int i = p*2; i <= n; i += p) 
					isPrime[i] = false; 
			} 
		} 
	} 
	
	// Returns true if n is 
	// right-truncatable, else false 
	static boolean leftTruPrime(int n) 
	{ 
		int temp = n, cnt = 0, temp1; 
	
		// Counting number of digits in the 
		// input number and checking whether 
		// it contains 0 as digit or not. 
		while (temp != 0) 
		{ 
			// counting number of digits. 
			cnt++; 
	
			temp1 = temp%10; 
			
			// checking whether digit is 
			// 0 or not 
			if (temp1 == 0) 
				return false; 
			temp = temp/10; 
		} 
	
		// Generating primes using Sieve 
		boolean isPrime[] = new boolean[n+1]; 
		sieveOfEratosthenes(n, isPrime); 
	
		// Checking whether the number 
		// remains prime when the leading 
		// ("left") digit is successively removed 
		for (int i = cnt; i > 0; i--) 
		{ 
			// Checking number by successively 
			// removing leading ("left") digit. 
			/* n=113, cnt=3 
			i=3 mod=1000 n%mod=113 
			i=2 mod=100 n%mod=13 
			i=3 mod=10 n%mod=3 */
			int mod = power(10,i); 
	
			if (!isPrime[n%mod]) 
				return false; 
		} 
		
		// if remains prime, return true 
		return true; 
	} 
	
	// Driver program 
	public static void main(String args[]) 
	{ 
		int n = 113; 
	
		if (leftTruPrime(n)) 
			System.out.println 
				(n+" is left truncatable prime"); 
		else
			System.out.println 
				(n+" is not left truncatable prime"); 
	} 
} 

/*This code is contributed by Nikita Tiwari.*/

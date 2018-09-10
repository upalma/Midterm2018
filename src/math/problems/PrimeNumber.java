package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int counter = 0;
		for(int i=2; i<1000000; i++){
			if(i==2){
				System.out.println(i);
			}else{
				if(isPrime(i)){
					counter++;
					System.out.println(i);
				}else{
					System.out.println("Non-Prime: " + i);
					System.out.println("Total nonPrime numbers: "+(i-counter));
				}
			}

		}
		System.out.println("Total Prime Numbers: " + counter);

	}

	public static boolean isPrime(int n){
		if(n%2==0)return false;
		for(int i=3; i*i<=n; i+=2){
			if(n%i==0) return false;
		}
		return true;
	}

}


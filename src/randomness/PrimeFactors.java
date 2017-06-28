package randomness;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println(largestPrimeFactor(600851475143L));
	}

	public static long largestPrimeFactor(long i){
		long retVal = 0;
		for(int j = 2; j <= Math.sqrt(i); j++){
			if(i % j == 0 && largestPrimeFactor(j) > retVal){
				retVal = largestPrimeFactor(j);
			}
		}
		if(retVal == 0){
			return i;
		}
		else{
			return retVal;
		}
	}
	
}

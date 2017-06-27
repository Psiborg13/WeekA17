package randomness;

public class Fibonacci {

	public static void main(String[] args) throws InterruptedException {
		boolean running = true;
		long sum = 0;
		int i = 1;
		while(running){
			long fib = fib(i);
			if(fib > 4000000){
				running = false;
			}
			else if(fib%2==0){
				sum+=fib;	
			}
			i++;
		}
		System.out.println(sum);
	}
	
	public static int fib(int i){
		if(i == 1 || i == 2){
			return 1;
		}
		else{
			return fib(i-1)+fib(i-2);
		}
	}

}

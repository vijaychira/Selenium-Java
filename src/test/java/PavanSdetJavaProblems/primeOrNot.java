package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class primeOrNot {
	@Test(priority=1,enabled=false)
	public void primeNumberOrNot() {
		int num = 3;
		boolean isPrime = true; //default
		for (int i=2; i<=Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("This is a prime number");
		} else {
			System.out.println("This number is not prime");
		}
	}
	@Test(priority=2,enabled=true)
	public void primeNumberOrNot2() {
		int number=5;
		int count=0;
		if(number>1) {
			for (int i = 1; i <=number; i++) {
				if(number%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("The given number is a primeNumber");
			}
			else {
				System.out.println("The given number is not a primeNumber");
			}
		}
		else {
			System.out.println("The given number is not a primeNumber");
		}
	}
}

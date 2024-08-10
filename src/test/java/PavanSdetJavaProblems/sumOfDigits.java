package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class sumOfDigits {
	@Test
	public void sumOfDigits1() {
		int number=12345;
		int sum=0;
		while(number!=0) {
			int s=number%10;
			sum=sum+s;
			number=number/10;
		}System.out.println(sum);
		
	}
	
}

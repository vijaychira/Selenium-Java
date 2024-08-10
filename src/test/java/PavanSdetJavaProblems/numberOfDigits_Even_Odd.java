package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class numberOfDigits_Even_Odd {
	@Test(priority=1,enabled=true)
	public void numberOfDigits_Even_odd() {
		int number=496978349;
		int numberOfDigits=0;
		int numOfEven=0;
		int numOfOdd=0;
		while(number!=0) {
			int lastDigit=number%10;//we will use % to get the last digit of the given number
			if(lastDigit%2==0) {
				numOfEven++;
				}
			else {
				numOfOdd++;	
			}
			number=number/10;
			numberOfDigits++;
		}System.out.println("Total no of Digits = "+numberOfDigits);
		System.out.println("number of even are = "+numOfEven++);
		System.out.println("number of odd are = "+numOfOdd++);
	}
}

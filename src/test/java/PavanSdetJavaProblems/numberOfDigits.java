package PavanSdetJavaProblems;

import java.util.concurrent.atomic.AtomicBoolean;

import org.testng.annotations.Test;

public class numberOfDigits {
	@Test(priority=1,enabled=true)
	public void numberOfDigits1() {
		int number=596929;
		int numOfDigits=0;
		while(number!=0) {
			number=number/10;
			numOfDigits++;
		}
		System.out.println(numOfDigits);
	}
}

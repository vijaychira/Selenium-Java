package PavanSdetJavaProblems;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class randomNumbersAndStrings {
	@Test(priority=1,enabled=false)
	public void randomNumbersAndString1() {
		Random random=new Random();
		int number=random.nextInt(100);
		double doubl=random.nextDouble(100);
		System.out.println(number);
		System.out.println(doubl);
	}
	@Test(priority=2,enabled=true)
	public void apacheCommonsLang() {
		//Apache commons language, used to generate random numbers and Strings, important
				String num=RandomStringUtils.randomNumeric(4);
				System.out.println(num);
				
				String alphabet=RandomStringUtils.randomAlphabetic(5);
				System.out.println(alphabet);
	}
}

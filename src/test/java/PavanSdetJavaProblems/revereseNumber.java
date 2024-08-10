package PavanSdetJavaProblems;


import org.testng.annotations.Test;

public class revereseNumber {
	@Test(priority = 1,enabled=false)
	public void reverseNumber1() {
		int number=675943;
		int reverseNumber=0;
		while(number!=0) {
			reverseNumber=reverseNumber*10+number%10;
			number=number/10;
			System.out.println(reverseNumber);
		}
	}
	@Test(priority = 2,enabled=false)
	public void revereseNumber2() {
		int number=123456;
		StringBuffer sb=new StringBuffer(String.valueOf(number));
		System.out.println(sb.reverse());	
	}
	@Test(priority = 3,enabled=true)
	public void revereseNumber3() {
		int number=123456;
		StringBuilder sb=new StringBuilder();
		sb.append(number);
		System.out.println(sb.reverse());
		
	}
}

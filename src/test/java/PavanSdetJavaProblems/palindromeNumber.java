package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class palindromeNumber {
	@Test(priority=1,enabled=false)
	public static void palindromeNumber1() {
		int number=12321;
		int tempnumber=number;
		int rev=0;
		while(tempnumber!=0) {
			rev=rev*10+tempnumber%10;
			tempnumber=tempnumber/10;
		}	
		if(number==rev) {
			System.out.println("The given number is a palindrome number");
		}else
			System.out.println("The given number is not a palindrome Number");
	}
	@Test(priority=2,enabled=true)
	public static void palindromeString() {
		String word="BOOB";
		String tempword=word;
		String rev="";
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		System.out.println(rev);
		if(word.equals(rev)) {
			System.out.println("The given word is a palindrome String");
		}else
			System.out.println("The given word is not a palindrome String");
	}
}

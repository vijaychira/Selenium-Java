package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class largestNumber {
	@Test(priority=1,enabled=false)
	public void largestNumber() {
		int a =40;
		int b=20;
		int c=30;
		if(a>b&&a>c)
			System.out.println(a);
		else if(b>a&&b>c)
			System.out.println(b);
		else if (c>a&&c>b)
			System.out.println(c);
	}
	@Test(priority=2,enabled=true)
	public void largestNumber2() {
		int a =40;
		int b=20;
		int c=30;
		int largest =a>b?a:b;
		int finalLargest=c>largest?c:largest;
		System.out.println(finalLargest);
		//single statement for ternary operator
		int modifiedlargest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(modifiedlargest);
	}
}
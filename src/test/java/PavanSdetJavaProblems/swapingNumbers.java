package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class swapingNumbers {
	int a =30; int b=40;
	@Test(priority=1,enabled=false)
	public void swapNumber1() { //using third variable
		
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println(a+" "+b);
	}
	@Test(priority=2,enabled=false)
	public void swapnumber2() {//using + and - without using third variable
		a=a+b;  
		b=a-b;
		a=a-b;	
		System.out.println(a+" "+b);
	}
	@Test(priority=3,enabled=false)
	public void swapnumber3() {//using + and - without using third variable
		a=a*b;  
		b=a/b;
		a=a/b;	
		System.out.println(a+" "+b);
	}	
	@Test(priority=4,enabled=false)
	public void swapNumber4() {
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a+" "+b);
	}
	@Test(priority=5,enabled=true)
	public void swapNumber5() {
		b=a+b-(a=b);
		System.out.println(a+" "+b);
	}
}
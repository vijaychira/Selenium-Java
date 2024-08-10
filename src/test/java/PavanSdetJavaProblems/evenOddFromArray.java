package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class evenOddFromArray {
	@Test(priority=1,enabled=true)
	public void EvenOddNumbersFromArray() {
		int a[]= {1,2,3,4,5,6};
		System.out.println("Even numbers");
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
				System.out.println(a[i]);}
		System.out.println("---------------------------------------");
		System.out.println("Odd Numbers");
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
	}
	@Test(priority=2,enabled=true)
	public void EvenOddNumbersFromArr() { //forEach
		int a[]= {1,2,3,4,5,6};
		System.out.println("Even numbers");
		for (int i:a) {
			if(i%2==0)
				System.out.println(i);}
		System.out.println("---------------------------------------");
		System.out.println("Odd Numbers");
		for (int i:a) {
			if(i%2!=0)
				System.out.println(i);
		}
	}
}

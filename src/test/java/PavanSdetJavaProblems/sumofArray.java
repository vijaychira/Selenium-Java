package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class sumofArray {
	@Test(priority=1,enabled=false)
	public void sumofArrayNumbers() {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}System.out.println(sum);
	}
		@Test(priority=2,enabled=true)
		public void sumofArrayNumbers2() { //forEach
			int a[]= {1,2,3,4,5,6};
			int sum=0;
			for (int arr:a) {
				sum=sum+arr;
			}System.out.println(sum);
		}
}

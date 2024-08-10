package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class missingNumInArray {
	@Test
	public void missingNumberInArray() {
		//prereq=no duplicate values
		int a[]= {1,2,3,4,6,7};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		int sum2=0;
		for (int i =1; i<=a.length+1; i++) {
			sum2=sum2+i;
		}
		System.out.println(sum2-sum);
	}
}

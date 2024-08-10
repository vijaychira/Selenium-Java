package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class maxAndMinOfArray {
	@Test
	public void maxMinElementOfArray() {
		int a[]= {2,385,34,85,1,356,8};
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(max<a[i])
				max=a[i];
		}System.out.println("MaxValue "+max);
		
		for (int i = 0; i < a.length; i++) {
			if(min>a[i])
				min=a[i];
		}System.out.println("MinValue "+min);
	}
}

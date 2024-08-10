package PavanSdetJavaProblems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArraysEqualOrNot {
	@Test(priority=1,enabled=false)
	public void ArrayEqualOrNot() {
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		boolean status=Arrays.equals(a, b);
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("arrays are not equal");
		}
	}
	@Test(priority=2,enabled=true)
	public void ArrayEqualOrNot2() {
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		boolean status=true;

		if(a.length==b.length) {
			for (int i = 0; i < a.length; i++) {
				if(a[i]!=b[i]) {
					status=false;
				}
			}
		}else {
			status=false;
		}
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
}

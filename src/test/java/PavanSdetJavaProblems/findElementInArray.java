package PavanSdetJavaProblems;

import java.util.Iterator;

import org.testng.annotations.Test;

public class findElementInArray {
	@Test(priority=1,enabled=true)
	public void linearSearch() {
		int a[]= {79,56,34,65,78,122,54,34,66};
		int searchElement=65;
		boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==searchElement) {
				System.out.println("Element found at: "+i);
				flag=true;
				break;}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
	}
}

package PavanSdetJavaProblems;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class sortingByBuiltInMethods {
	@Test(priority=1,enabled=true)
	public void builtInSortinElement() {
		int a[]= {89,56,43,56,33,88,77,11,33,4,5,7,32,9,8,};
		
		Arrays.sort(a); //approach1
		Arrays.parallelSort(a); //approach2
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}System.out.println();
		System.out.println("----------------------------------");
		//descending order
		Integer b[]= {89,56,43,56,33,88,77,11,33,4,5,7,32,9,8,};
		Arrays.sort(b,(Collections.reverseOrder()));
		System.out.println(Arrays.toString(b));
	
	}
}

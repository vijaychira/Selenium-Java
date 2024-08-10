package PavanSdetJavaProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import org.bouncycastle.tsp.ers.SortedHashList;
import org.testng.annotations.Test;

public class findTheElementByBinary {
	@Test(priority=1,enabled=false)
	public void byBinarySearch() {
		int a[]= {1,2,3,4,7,8,9,10,11,12,13,14,15,16,17,18};
		boolean flag=false;
		int element=16;
		int first=0;
		int last=a.length-1;
		
		while(first<=last) {
			int m=(first+last)/2;
			if(a[m]==element) {
				System.out.println("Element is found");
				flag=true;
				break;
			}
			if(a[m]<element) {
				first=m+1;
			}
			if(a[m]>element) {
				last=m-1;
			}
		}

		if(flag==false) {
			System.out.println("Element not Found");
		}
	}
	@Test(priority=2,enabled=true)
	public void byBinarySearch2() {
		int a[]= {1,2,3,4,7,8,9,10,11,12,13,14,15,16,17,18};
		System.out.println(Arrays.binarySearch(a, 12));
	}
}

package PavanSdetJavaProblems;

import java.util.Arrays;
import java.util.HashSet;

import org.testng.annotations.Test;

public class FindDuplicateValueArray {
	@Test(priority=1,enabled=true)
	public void findDuplicate1() {
		String []s= {"java","c","c++","cat","cat","JasonHuggins","java"};
		boolean flag=false;
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[i]==s[j])
					System.out.println(s[i]);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Duplicate elements not found");
		}
	}
	@Test(priority=1,enabled=false)
	public void findDuplicate2() {
//		String []s= {"java","c","c++","cat","cat","JasonHuggins","java"};
		int []s= {1,2,3,4,5,6,7,8,6};
		boolean flag=false;
//		HashSet<String> hs=new HashSet<String>();
		HashSet<Integer> hs=new HashSet<Integer>();

		for(Integer a:s) {
			if(hs.add(a)==false) {
				System.out.println(a);
			}
		}
	}
}

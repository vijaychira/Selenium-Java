package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class reverseString {
	@Test(priority=1,enabled=false) //using concatenate operator
	public void revereseString1() {
		String str="WOLF";
		String rev="";
		int length=str.length(); //length of String
		for (int i=length-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	@Test(priority=2,enabled=true) //using char array
	public void revereseString2() {
		String str="WOLF";
		String rev="";
		char a[]=str.toCharArray();
		for (int i =a.length-1; i >=0;i--) {
			rev=rev+a[i];
		}System.out.println(rev);	
	}
	@Test(priority=3,enabled=false) //using StringBuffer
	public void revereseString3() {
		String str="WOLF";
		String rev="";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}

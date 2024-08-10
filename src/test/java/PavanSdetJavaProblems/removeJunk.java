package PavanSdetJavaProblems;

import org.testng.annotations.Test;

public class removeJunk {
	@Test(priority=1,enabled=false)
	public void removeJunkFromString() {
		String s="!@#$%^&*()_+)(*&^%$#@! latin string 0987654321";
		s=s.replaceAll("[a-zA-Z0-9^]", "");
		System.out.println(s);
	}
	
	@Test(priority=1,enabled=true)
	public void removeSpaceFromString() {
		String s="Java  is   the most       valueble language in the    world";
		s=s.replaceAll("\\s", "");
		System.out.println(s);
	}

}

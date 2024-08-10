package PavanSdetJavaProblems;

import org.checkerframework.checker.units.qual.Length;
import org.testng.annotations.Test;

public class countCharacterOccurence {
	@Test(priority=1,enabled=true)
	public void countOccurenceOfCharacter() {
		String s="Java programming Java oops";
		int before=s.length();
		int after=s.replace("a","").length();
		System.out.println("No of a in statement is "+(before-after) );		
	}
}

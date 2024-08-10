package PavanSdetJavaProblems;
import org.testng.annotations.Test;

public class fibanacci {
	@Test
	public void fibanacciSeries() {
		int num1=0;
		int num2=1;
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum=num1+num2;
			System.out.println(sum+" ");
			num1=num2;num2=sum;
		}
	}
}

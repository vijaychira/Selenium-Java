package PavanSdetJavaProblems;
import java.util.Arrays;
import org.testng.annotations.Test;

public class bubblesort {
	@Test(priority=1,enabled=true)
	public void bubbleSortElement() {
		int a[]= {89,56,43,56,33,88,77,11,33,4,5,7,32,9,8,};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1]) {
					int element=a[j];
					a[j]=a[j+1];
					a[j+1]=element;
				}
			}
		}System.out.println(Arrays.toString(a));
	}
}

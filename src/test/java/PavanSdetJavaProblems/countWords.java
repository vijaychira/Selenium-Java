package PavanSdetJavaProblems;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class countWords {
	@Test(priority=1,enabled=true)
	public void countNoOfWords() {
		String s="Wolf is in the town";
		int numberOfWords=1;
		for (int i = 0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				numberOfWords++;
			}
		}System.out.println(numberOfWords);
		
	}
}

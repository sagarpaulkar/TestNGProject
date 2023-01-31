package VerificationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void test1() {
		
		String str ="Hello";
		Assert.assertEquals(str, "Hi");
		System.out.println(str);
		Assert.assertEquals(str, "Hello");
	}

	
	@Test
	public void test2() {
		System.out.println("Executing test2");
	}
}

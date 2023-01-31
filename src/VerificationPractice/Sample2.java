package VerificationPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample2 {

	// 2. Soft Assert :- softassert class method  ==> nonstatic
	
	
		@Test
		public void test1() {
			
			String str ="Hello";
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(str, "Hi");
			System.out.println(str);
			soft.assertEquals(str, "Hello");
			soft.assertAll();
		}

		
		@Test
		public void test2() {
			System.out.println("Executing test2");
		}
}

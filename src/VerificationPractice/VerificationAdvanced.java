package VerificationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationAdvanced {

	// 1. AssertEquals():- TC will pass when actual and expected result will match.
	
//		@Test
//		public void test1() {
//			String Actual = "Hi";
//			String Expected ="Hi";
//			Assert.assertEquals(Actual, Expected);
//		}
		
		// 2. AssertnotEquals():- TC will pass when actual and expected result will not match.
		
//		@Test
//		public void test2() {
//			String Actual = "Hello";
//			String Expected ="Hi";
//			Assert.assertNotEquals(Actual, Expected);
//		}
		
		// 5. AssertNull() :- TC will pass when the field is empty.
		
//		@Test
//		public void test3() {
//			String Actual =null;
//			Assert.assertNull(Actual);
//		}
		
		// 6.  AssertnotNull:- TC will pass when the field is not empty.
		
		@Test
		public void test3() {
			String Actual =null;
			Assert.assertNotNull(Actual);
		}
}

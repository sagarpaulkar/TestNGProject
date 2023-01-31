package Basics;

import org.testng.annotations.Test;

public class IntroductionToTestng {

	// 1. testng basic concept  ==> alphabetical order   ==> executional flow manage
	
		// openurl ==> login ==> logout
		
		
		
		@Test(priority = 2)
		public void login() {
			System.out.println("Logged in to the application");
		}
		
		@Test(priority = 3)
		public void logout() {
			System.out.println("Logged out from the application");
		}
		
		@Test(priority = 1)
		public void openUrl() {
			System.out.println("Url is opened");
		}
		
		// output :- 
		// Regular console  ==> 
		// testng console ==> output ==> methods ==> @Test annotation
		// emailable report ==> every time whenever you will run the program you need to refresh the project
		// test-output
		// priority can be negative, zero , postive, any positive number ==> sequence ==> overlapping XX
	
	
}

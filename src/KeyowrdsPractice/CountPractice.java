package KeyowrdsPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CountPractice {

	@BeforeMethod
	public void login() {
		System.out.println("Logged in to the application");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logged out from the application");
	}
	
	@Test (priority = 1)
	public void notificationpage() {
		System.out.println("Testing notification page");
	}
	
	@Test (invocationCount = 5,priority = 2)
	public void homepage() {
		System.out.println("Testing home page");
	}
	
}

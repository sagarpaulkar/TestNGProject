package KeyowrdsPractice;

import org.testng.annotations.Test;

public class EnabledFalsePractice {

	
	@Test(priority = 1)
	public void openurl() {
		System.out.println("Url opened");
	}
	
	@Test(priority = 2, dependsOnMethods = "openurl")
	public void login() {
		System.out.println("Logged in to the application");
	}
	
	@Test(priority = 3,enabled = false)
	public void logout() {
		System.out.println("Logged out from the application");
	}
}

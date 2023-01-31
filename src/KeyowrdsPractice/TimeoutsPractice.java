package KeyowrdsPractice;

import org.testng.annotations.Test;

public class TimeoutsPractice {

	@Test(priority = 1,timeOut = 5000)
	public void openurl() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Url opened");
	}
	
	@Test(priority = 2, dependsOnMethods = "openurl")
	public void login() {
		System.out.println("Logged in to the application");
	}
	
	@Test(priority = 3)
	public void logout() {
		System.out.println("Logged out from the application");
	}
}

package PomwithPagefactoryConceptsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {

	// Test Class  ==> main method  ==> testng annotations  ==> execution flow
	
		WebDriver driver;
		
		@BeforeClass
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@Test
		public void FacebookRegistrationPageTest() {
			
			RegistrationPage rgpage = new RegistrationPage(driver);
			rgpage.ClickFacebookSignupLink();
			rgpage.VerifyFacebookRegistrationPageFblogo();
			rgpage.VerifyFacebookRegistrationPageAllreadyAccount();
			rgpage.SetFacebookRegistrationPageFirstname();
			rgpage.SetFacebookRegistrationPageLastname();
			rgpage.SetFacebookRegistrationPageMobileEmail();
			rgpage.SetFacebookRegistrationPagePassword();
			rgpage.SetFacebookRegistrationPageBirthDate();
			rgpage.SetFacebookRegistrationPageBirthMonth();
			rgpage.SetFacebookRegistrationPageBirthYear();
			rgpage.SetFacebookRegistrationPageGender("MALE");
			rgpage.ClickFacebookRegistrationPageSubmitBtn();
		}
		
		@AfterClass
		public void teardown() {
			driver.close();
		}
}

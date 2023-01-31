package PomwithPagefactoryConceptsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

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
	public void FacebookLoginPageTest_positive() {
		LoginPage Lp = new LoginPage(driver);
		Lp.VerifyFacebookLoginPageFblogo();
		Lp.VerifyFacebookLoginPageTagline();
		Lp.VerifyFacebookLoginPageCreateNewAccount();
		Lp.VerifyFacebookLoginPageForgotPasswordLink();
		Lp.VerifyFacebookLoginPageFooterlinks();
		Lp.SetFacebookLoginPageUsername("test");
		Lp.SetFacebookLoginPagePassword("test@123");
		Lp.ClickFacebookLoginPageLoginBtn();
		
	}
	
	@Test
	public void FacebookLoginPageTest_negative() {
		LoginPage Lp = new LoginPage(driver);
		Lp.VerifyFacebookLoginPageFblogo();
		Lp.VerifyFacebookLoginPageTagline();
		Lp.VerifyFacebookLoginPageCreateNewAccount();
		Lp.VerifyFacebookLoginPageForgotPasswordLink();
		Lp.VerifyFacebookLoginPageFooterlinks();
		Lp.SetFacebookLoginPageUsername("test");
		Lp.SetFacebookLoginPagePassword("test@123");
		Lp.ClickFacebookLoginPageLoginBtn();
		
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}

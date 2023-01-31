package Insta;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InstagramTest {

WebDriver driver;
	
	@BeforeClass
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sagar Paulkar\\\\Desktop\\\\SeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test 
	public void InstagramSignupPageTest() {
		InstagramPage ip = new InstagramPage(driver);
//		ip.VerifyInstagramImage();
//		ip.VerifySignupText();
		ip.SetMobileorEmail();
		ip.SetFullname();
		ip.SetUserName();
		ip.SetPassword();
		ip.VerifysignupButton();
	}
	@AfterClass
	public void teardown() {
		driver.close();
}
}

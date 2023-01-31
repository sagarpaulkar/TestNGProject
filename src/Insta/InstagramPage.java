package Insta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramPage {

	@FindBy(xpath="//i[@aria-label='Instagram']")private WebElement image;
	@FindBy(xpath="//h2[text()='Sign up to see photos and videos from your friends.']")private WebElement text;
	@FindBy(xpath="//input[@name='emailOrPhone']")private WebElement mobileoremail;
	@FindBy(xpath="//input[@name='fullName']")private WebElement fullname;
	@FindBy(xpath="//input[@name='username']")private WebElement username;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//button[text()='Sign up']")private WebElement button;
	@FindBy(xpath="//p[text()='Have an account? ']")private WebElement have_ana_ccount;

	//Initialization
	
	public  InstagramPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void ClickInstagramSignupLink() {
		button.click();
	}
	
//	public void VerifyInstagramImage() {
//		Assert.assertTrue(image.isDisplayed(), "Instagram");
//	}
	
//	public void VerifySignupText() {
//		Assert.assertTrue(text.isDisplayed(),"Sign up to see photos and videos from your friends.");
//	}
	
	public void SetMobileorEmail() {
		mobileoremail.sendKeys("9922774123");
	}
	
	public void SetFullname() {
		fullname.sendKeys("Sagar Paulkar");
	}
	
	public void SetUserName() {
		username.sendKeys("Pranjal@129");
	}
	
	public void SetPassword() {
		password.sendKeys("omiNk@12");
	}
	
	public void VerifysignupButton() {
		//Assert.assertTrue(button.isEnabled());
		button.click();
	}
}

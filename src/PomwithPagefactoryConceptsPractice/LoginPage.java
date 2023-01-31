package PomwithPagefactoryConceptsPractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	@FindBy (xpath="//img[@alt='Facebook']") private WebElement login_fblogo;
	@FindBy (xpath="//h2[contains(text(),'acebook helps you connect')]") private WebElement login_tagline;
	@FindBy (xpath="//input[@name='email']") private WebElement username;
	@FindBy (xpath="//input[@name='pass']") private WebElement password;
	@FindBy (xpath="//button[@name='login']") private WebElement login_btn;
	@FindBy (xpath="//a[text()='Forgotten password?']") private WebElement forgot_password;
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']") private WebElement create_account;
	@FindBys ({@FindBy (xpath="//div[@aria-label='Facebook site links']/ul/li/a")}) private List<WebElement> footerlinks;
	
	
	// initialize
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// usage
	
	public void VerifyFacebookLoginPageFblogo() {
		 Assert.assertTrue(login_fblogo.isDisplayed(), "Facebook logo is not displayed on the login page");
	}
	
	public void VerifyFacebookLoginPageTagline() {
		Assert.assertEquals(login_tagline.getText(), "Facebook helps you connect and share with the people in your life.");
	}
	
	public void SetFacebookLoginPageUsername(String un) {
		username.sendKeys(un);
	}
	
	public void SetFacebookLoginPagePassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void VerifyFacebookLoginPageCreateNewAccount() {
		Assert.assertTrue(create_account.isDisplayed(), "Create new account option is not displayed on the login page");
	}
	
	public void VerifyFacebookLoginPageForgotPasswordLink() {
		Assert.assertTrue(forgot_password.isDisplayed(), "Forgot password link is not displayed on the login page");
		Assert.assertEquals(forgot_password.getText(), "Forgotten password?");
	}
	
	public void VerifyFacebookLoginPageFooterlinks() {
		Assert.assertEquals(footerlinks.size(), 31);
	}
	
	public void ClickFacebookLoginPageLoginBtn() {
		login_btn.click();
	}
}

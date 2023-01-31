package PomwithPagefactoryConceptsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class RegistrationPage {// Pom Class ==> webelements  ==> intialize ==> utlization methods / verification methods
	
	// Declaration ==> driver.findelement ==> @Findby ==> driver.findelement
	
	@FindBy (xpath ="//img[@alt='Facebook']") private WebElement reg_fblogo;
	@FindBy (xpath ="//a[text()='Already have an account?']") private WebElement alrady_acc;
	@FindBy (xpath ="//a[text()='Sign Up']") private WebElement signuplink;
	@FindBy (name ="firstname") private WebElement firstname;
	@FindBy (name ="lastname") private WebElement surname;
	@FindBy (name ="reg_email__") private WebElement mob_email;
	@FindBy (name ="reg_passwd__") private WebElement password;
	@FindBy (name ="birthday_day") private WebElement birthdate;
	@FindBy (name ="birthday_month") private WebElement birthmonth;
	@FindBy (name ="birthday_year") private WebElement birthyear;
	@FindBy (xpath ="//input[@value='2']") private WebElement gender_male;
	@FindBy (xpath ="//input[@value='1']") private WebElement gender_female;
	@FindBy (name ="websubmit") private WebElement submitbtn;
		
		

	// Initailization
	
	 public RegistrationPage(WebDriver driver) {  // this is class constructor used to initialize the datamembers within the class
		 PageFactory.initElements(driver, this);  // early initalization
	 }
	 
	 // usage ==> verification methods for the respective webelements
	 
	 public void ClickFacebookSignupLink() {
		 signuplink.click();    // action //validation
		 Reporter.log("ClickFacebookSignupLink",true);
	 }
	 
	 public void VerifyFacebookRegistrationPageFblogo() {
		 Assert.assertTrue(reg_fblogo.isDisplayed(), "Facebook logo is not displayed on the registration page");
		 Reporter.log("VerifyFacebookRegistrationPageFblogo",true);
	 }
	 
	 public void VerifyFacebookRegistrationPageAllreadyAccount() {
		 Assert.assertTrue(alrady_acc.isDisplayed(), "Facebook allready having an account link is not displayed on the registration page");
		 Assert.assertEquals(alrady_acc.getText(), "Already have an account?", "String validation failed for the already having an account option");
		 Reporter.log("VerifyFacebookRegistrationPageAllreadyAccount",true);
	 }
	 
	 public void SetFacebookRegistrationPageFirstname() {
		 firstname.sendKeys("ABC");
		 Reporter.log("SetFacebookRegistrationPageFirstname",true);
	 }
	 
	 public void SetFacebookRegistrationPageLastname() {
		 surname.sendKeys("XYZ");
		 Reporter.log("SetFacebookRegistrationPageLastname",true);
	 }
	 
	 public void SetFacebookRegistrationPageMobileEmail() {
		 mob_email.sendKeys("9876543210");
		 Reporter.log("SetFacebookRegistrationPageMobileEmail",true);
	 }
	 
	 public void SetFacebookRegistrationPagePassword() {
		 password.sendKeys("Abc@98563214890215");
		 Reporter.log("SetFacebookRegistrationPagePassword",true);
	 }
	 
	 public void SetFacebookRegistrationPageBirthDate() {
		Select bday = new Select(birthdate);
		 Assert.assertTrue(birthdate.isDisplayed());
		 Assert.assertFalse(birthdate.isSelected());
		 try { 
		 bday.selectByVisibleText("19");
		 Reporter.log("SetFacebookRegistrationPageBirthDate",true);}
		 catch(Exception e) {
		 e.printStackTrace();
		}
	 }
	 
	 public void SetFacebookRegistrationPageBirthMonth() {
		 Select bmonth = new Select(birthmonth);
		 Assert.assertTrue(birthmonth.isDisplayed());
		 Assert.assertFalse(birthmonth.isSelected());
		 bmonth.selectByVisibleText("Mar");
		 Reporter.log("SetFacebookRegistrationPageBirthMonth",true);
	 }
	 
	 public void SetFacebookRegistrationPageBirthYear() {
		 Select byear = new Select(birthyear);
		 Assert.assertTrue(birthyear.isDisplayed());
		 Assert.assertFalse(birthyear.isSelected(),"The birth year is already selected");
		 byear.selectByVisibleText("1950");
		 Reporter.log("SetFacebookRegistrationPageBirthYear",true);
	 }
	 
	 public void  SetFacebookRegistrationPageGender(String gender) {
		 
		 if(gender.equalsIgnoreCase("male")) {
			 gender_male.click();
		 }else if(gender.equalsIgnoreCase("female")) {
			 gender_female.click();
		 }else {
			 System.out.println("Wrong input selected by the user for the field gender selection");
		 }
		 Reporter.log("SetFacebookRegistrationPageGender",true);
	 }
	 
	 public void ClickFacebookRegistrationPageSubmitBtn() {
		 submitbtn.click();
		 Reporter.log("ClickFacebookRegistrationPageSubmitBtn",true);
	 }
}

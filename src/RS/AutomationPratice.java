package RS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutomationPratice {

	@FindBy(xpath="//input[@value='radio1']") private WebElement radio; 
	@FindBy(id="autocomplete") private WebElement country; 
	@FindBy(id="dropdown-class-example") private WebElement dd; 
	@FindBy(id="checkBoxOption1") private WebElement cb; 
	@FindBy(id="checkBoxOption2") private WebElement cb2; 
	@FindBy(id="openwindow") private WebElement ow; 
	@FindBy(xpath="//div[@data-ride='carousel']//div//div//div//div//div//h3") private WebElement mainTitle;
	
	public AutomationPratice(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void selectRadio() {
		radio.click();
	}
	
	public void selectcountry() {
		country.sendKeys("India");
	}
	
	public void selectdropdown() {
		
		Select sel= new Select(dd);		
		sel.selectByValue("option3");
	}
	
	public void selectcheckbox() {
		cb.click();
		cb2.click();
	}
	
	public void openwindow(WebDriver driver) {
		ow.click();
		Set<String> s= driver.getWindowHandles();
		Iterator<String>it= s.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(mainTitle.getText());
	}	
}


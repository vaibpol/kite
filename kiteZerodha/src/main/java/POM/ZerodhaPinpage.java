package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinpage {
	@FindBy (xpath = "//input[@id='pin']") private WebElement Pin;
	@FindBy (xpath = "//button[@type='submit']") private WebElement Submit;
	@FindBy (xpath = "//a[@href='/forgot']") private WebElement Forgot;
	@FindBy (xpath = "(//a[@target='_blank'])[3]") private WebElement Signup;

	
	public ZerodhaPinpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterPin (String pinno) {
		Pin.sendKeys(pinno);
	}
	
	public void ClickOnContinue() {
		Submit.click();
	}
	
	public void ClickOnforgot () {
		Forgot.click();
	}
	
	public void ClickOnSignup () {
		Signup.click();
	}
}

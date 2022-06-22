package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaforgotPage {
	@FindBy(xpath="//input[@placeholder=\"User ID\"]")private WebElement userid;
	@FindBy (xpath= "//input[@placeholder=\"PAN\"]") private WebElement PAN;
	@FindBy(xpath="//label[@for=\"radio-36\"]")private WebElement SMS;
	@FindBy (xpath = "//input[@placeholder=\"Mobile number (as on account)\"]")private WebElement MobileNo;
	@FindBy (xpath = "//button[@class=\"button-orange wide\"]") private WebElement Reset;
	@FindBy(xpath = "//a[@class=\"text-xsmall text-light reset-account-button\"]")private WebElement BackToLogin;
	@FindBy (xpath="(//a[@target=\"_blank\"])[3]") private WebElement Signup;
	
	public ZerodhaforgotPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	}
	
	public void enteruserid(String user) {
		userid.sendKeys(user);
	}
	
	public void enterPAN (String pan) {
		PAN.sendKeys(pan);
		
	}
	
	public void SMSclick() {
		SMS.click();
	}
	
	public void Resetclick() {
		Reset.click();
	}
	
	public void BackToLoginclick() {
		BackToLogin.click();
	}
	
	public void Signup () {
		Signup.click();
	}
}

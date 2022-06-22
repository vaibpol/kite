package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	@FindBy(xpath="//input[@id='userid']")private WebElement userid;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[@href='/forgot']") private WebElement ForgotUserId;
	@FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement Signup;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserid(String user) {
		userid.sendKeys(user);
	
	}
	
	public void enterpassword (String pass) {
		password.sendKeys(pass);
	}
	
	public void loginclick() {
		login.click();
	
	}
	
	public void ForgotUserIdclick() {
		ForgotUserId.click();
		
	}
	
	public void Signupclick() {
		Signup.click();
		
	}


}

package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser1;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinpage;
import POM.ZerodhaforgotPage;
import Utility.Parametrization;

public class PinPageTest {
	WebDriver driver;
	@BeforeMethod
	public void Browser1() {
		 driver=Browser1.openBrowser();
	}
	@Test
	
	public void loginWithvalidCredientialsTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage (driver);
		String username = Parametrization.getData("DATA", 3, 1);
		String password = Parametrization.getData("DATA", 4, 1);
		zerodhaLoginPage.enteruserid(username);
		zerodhaLoginPage.enterpassword(password);
		zerodhaLoginPage.loginclick();
		Thread.sleep(5000);
		ZerodhaPinpage zerodhaPinPage = new ZerodhaPinpage (driver);
		String pin = Parametrization.getData("DATA", 2, 1);
		System.out.println(pin);
		zerodhaPinPage.enterPin (pin);
		zerodhaPinPage.ClickOnContinue();
}
	@Test 
	public void test () {
		System.out.println("Thankss ajun");
	}
	@Test 
	public void test2 () {
		System.out.println("Thankss");
	}
}
}
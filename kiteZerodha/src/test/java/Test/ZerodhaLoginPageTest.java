package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser1;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;

public class ZerodhaLoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void Browser1() {
		 driver=Browser1.openBrowser();
	}

	@Test
	public void loginWithvalidCredientialsTest() throws EncryptedDocumentException, IOException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage (driver);
		String username = Parametrization.getData("DATA", 3, 1);
		String password = Parametrization.getData("DATA", 4, 1);
		zerodhaLoginPage.enteruserid(username);
		zerodhaLoginPage.enterpassword(password);
		zerodhaLoginPage.loginclick();
		
}
}

package done.mm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.LoginPages;

public class LoginPageTest extends TestBase {
	LoginPages loginPages;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
	}

	@Test(priority = 1)
	public void SignUp() {
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
		loginPages.ValidateLogin();

	}   

	@AfterMethod
	public  void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}

package done.mm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.LoginPages;
import done.mm.qa.pages.RaisePR;

public class RaisePrTest extends TestBase {
	RaisePR RaisePR;
	LoginPages loginPages;

	public RaisePrTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
		RaisePR = new RaisePR();
	}

	@Test(priority = 1)
	public void RaisePR() throws InterruptedException {
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
		loginPages.ValidateLogin();

		RaisePR.RaisePR();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}

package done.mm.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.CreateRFP;
import done.mm.qa.pages.LoginPages;


public class CreateRfpTest extends TestBase {
	CreateRFP rfp;
	LoginPages loginPages;

	public CreateRfpTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
		rfp = new CreateRFP();
	}

	@Test(priority = 1)
	public void CreateRfp() throws InterruptedException, AWTException {
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
		loginPages.ValidateLogin();

		rfp.CreateRFP();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}

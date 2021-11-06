package done.mm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.DirectGrn;
import done.mm.qa.pages.LoginPages;


public class DirectGrnTest extends TestBase {
	DirectGrn directGrn;
	LoginPages loginPages;

	public DirectGrnTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
		directGrn = new DirectGrn();
	}

	@Test(priority = 1)
	public void DirectGrn() throws InterruptedException {
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
		loginPages.ValidateLogin();

		directGrn.DirectGrn();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}

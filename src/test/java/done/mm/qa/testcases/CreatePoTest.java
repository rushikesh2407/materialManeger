package done.mm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.CreatePO;
import done.mm.qa.pages.LoginPages;


public class CreatePoTest extends TestBase {
	CreatePO po;
	LoginPages loginPages;

	public CreatePoTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
		po = new CreatePO();
	}

	@Test(priority = 1)
	public void CreatePO() throws InterruptedException {
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
		loginPages.ValidateLogin();

		po.CreatePo();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}

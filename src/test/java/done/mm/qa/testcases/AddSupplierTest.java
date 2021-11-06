package done.mm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.AddSupplier;
import done.mm.qa.pages.LoginPages;


public class AddSupplierTest extends TestBase {
	AddSupplier addSupplier;
	LoginPages loginPages;

	public AddSupplierTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
		addSupplier = new AddSupplier(driver);
	}

	@Test(priority = 1)
	public void AddSupplier() throws InterruptedException {
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
		loginPages.ValidateLogin();

		addSupplier.AddSupplier();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}

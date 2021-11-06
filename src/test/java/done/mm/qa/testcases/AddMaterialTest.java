package done.mm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.AddMaterial;
import done.mm.qa.pages.LoginPages;


public class AddMaterialTest extends TestBase {
	AddMaterial addMaterial;
	LoginPages loginPages;

	public AddMaterialTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
		addMaterial = new AddMaterial( driver);
	}

	@Test(priority = 1)
	public void Addmaterial() throws InterruptedException {
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
		loginPages.ValidateLogin();

		addMaterial.addmaterial();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}

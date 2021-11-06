package done.mm.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.HamburgerMenu;
import done.mm.qa.pages.LoginPages;


public class HambergerMenuTest extends TestBase {
	HamburgerMenu hamburgerMenu;
	LoginPages loginPages;

	public HambergerMenuTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
		hamburgerMenu = new HamburgerMenu(driver);
	}

	@Test(priority = 1)
	public void Hamburgermenu() throws InterruptedException, AWTException {
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
		loginPages.ValidateLogin();

		hamburgerMenu.Hamburgermenu();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);

	}
}

package done.mm.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.LoginPages;
import done.mm.qa.pages.RaisePR;
import done.mm.qa.pages.Receipt_Shortclose_Payment;

public class ReceiptTest extends TestBase {
	Receipt_Shortclose_Payment receipt_Shortclose_Payment;
	LoginPages loginPages;

	public ReceiptTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
		receipt_Shortclose_Payment = new Receipt_Shortclose_Payment();
	}

	@Test(priority = 1)
	public void Receipt() throws InterruptedException, AWTException {
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
		loginPages.ValidateLogin();

		receipt_Shortclose_Payment.receipt();
	
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}

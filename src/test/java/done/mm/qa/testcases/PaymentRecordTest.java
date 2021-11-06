package done.mm.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.LoginPages;
import done.mm.qa.pages.RaisePR;
import done.mm.qa.pages.Receipt_Shortclose_Payment;

public class PaymentRecordTest extends TestBase {
	Receipt_Shortclose_Payment receipt_Shortclose_Payment;
	LoginPages loginPages;

	public PaymentRecordTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
		receipt_Shortclose_Payment = new Receipt_Shortclose_Payment();
	}

	@Test(priority = 1)
	public void PaymentRecord() throws InterruptedException, AWTException {
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
		loginPages.ValidateLogin();

		
		receipt_Shortclose_Payment.PaymentRecord();
		

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}

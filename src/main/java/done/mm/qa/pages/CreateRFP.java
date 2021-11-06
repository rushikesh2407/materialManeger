package done.mm.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import done.mm.qa.base.TestBase;

public class CreateRFP extends TestBase {

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Create RFP')]")
	WebElement ClickOnCreateRfp;

	@FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='selected']")
	WebElement SelectProjectDropDown;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'rb Test')]")
	WebElement SelectProject;
	@FindBy(how = How.XPATH, using = "//input[@data-placeholder='Search Material']//parent::div//following-sibling::div")
	WebElement SearchMaterial;
	@FindBy(how = How.XPATH, using = "//div[text()='Ordinary Portland Cement Grade 33 ']")
	WebElement SelectMaterial;
	@FindBy(how = How.XPATH, using = "//span[text()='Next']")
	WebElement Next;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='fullfilmentDate']")
	WebElement FullfilmentDate;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'30')]")
	WebElement SelectDate;
	@FindBy(how = How.XPATH, using = "//input[@data-placeholder='Estimated Rate']")
	WebElement EstimatedRate;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='quantity']")
	WebElement Quantity;
	@FindBy(how = How.XPATH, using = "//span[text()='Next']")
	WebElement Next2;
	@FindBy(how = How.XPATH, using = "//input[@data-placeholder='Search']")
	WebElement SupplierName;
	@FindBy(how = How.XPATH, using = "//div[text()='rb Test']//parent::td[@role='gridcell']//mat-checkbox[@class='mat-checkbox mat-accent']")
	WebElement Supplier;
	@FindBy(how = How.XPATH, using = "//span[text()=' Next ']")
	WebElement Next3;
	@FindBy(how = How.XPATH, using = "//div[text()=' 100% Advance ']")
	WebElement AdvancedPayment;
	@FindBy(how = How.XPATH, using = "//a[text()='skip']//following-sibling::button/span[text()='Next']")
	WebElement Next4;
	@FindBy(how = How.XPATH, using = "//input[@data-placeholder='RFP Name*']")
	WebElement RfpName;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='dueDate']")
	WebElement RfpEndDate;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'30')]")
	WebElement SelectRfpEndDate;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Float RFP')]")
	WebElement Float;
	@FindBy(how = How.XPATH, using = "//div[@class='col-xs-6']/button/span[text()='Float RFP']")
	WebElement FloatRfp;
	@FindBy(how = How.XPATH, using = "//div/menu-item//img[@src='../../../assets/images/sidenav_dashboard.svg']")
	WebElement Home;

	public CreateRFP() {
		PageFactory.initElements(driver, this);

	}

	public void CreateRFP() throws InterruptedException, AWTException {
		wait.until(ExpectedConditions.visibilityOf(Home));

		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ClickOnCreateRfp);
		// ClickOnCreateRfp.click();
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", SelectProjectDropDown);
		// SelectProjectDropDown.click();

		Thread.sleep(1000);
		SelectProject.click();
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.mouseMove(200, 250);

		// Clicks Left mouse button
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// SearchMaterial.click();

		SelectMaterial.click();

		Next.click();
		;

		FullfilmentDate.click();
		SelectDate.click();

		EstimatedRate.sendKeys("1");

		Quantity.sendKeys("1");

		Next2.click();

		SupplierName.sendKeys("rb");
		Thread.sleep(3000);
		Supplier.click();
		Thread.sleep(3000);

		Next3.click();

		AdvancedPayment.click();

		Next4.click();

		RfpName.sendKeys("rbTest");

		RfpEndDate.click();
		SelectRfpEndDate.click();
		Float.click();
		Thread.sleep(2000);
		FloatRfp.click();

		Thread.sleep(3000);

	}

}

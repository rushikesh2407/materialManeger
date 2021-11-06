package done.mm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import done.mm.qa.base.TestBase;

public class CreatePO extends TestBase {

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Create PO')]")
	WebElement CreatePO;
	@FindBy(how = How.XPATH, using = "//input[@data-placeholder='Search']")
	WebElement Search;
	@FindBy(how = How.XPATH, using = "//span[text()='rb Test']//preceding-sibling::mat-radio-group[@formcontrolname='supplier']")
	WebElement Supplier;
	@FindBy(how = How.XPATH, using = "//span[text()=' Next ']")
	WebElement Next;
	// mat-label[text()='Search Project']
	// div[@class='mat-select-arrow ng-tns-c130-79']//mat-label[text()='Search
	// Project']//parent::label
	@FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='selectedProject']")
	WebElement SearchProject;
	@FindBy(how = How.XPATH, using = "//input[@data-placeholder='Search project Name']")
	WebElement SearchProjectName;
	@FindBy(how = How.XPATH, using = "//span[text()=' rb Test ']")
	WebElement ProjectName;
	@FindBy(how = How.XPATH, using = "//div[text()='Ordinary Portland Cement Grade 33']//parent::span")
	WebElement Material;
	@FindBy(how = How.XPATH, using = "//span[text()='Next']")
	WebElement Next1;
	@FindBy(how = How.XPATH, using = "//input[starts-with(@formcontrolname,'fullfilmentDate')]")
	WebElement FullfilmentDate;
	@FindBy(how = How.XPATH, using = "//button[@aria-label='Next month']")
	WebElement next;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'30')]")
	WebElement SelectDate;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='materialUnitPrice']")
	WebElement AwardedRate;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='materialQty']")
	WebElement Quantity;
	@FindBy(how = How.XPATH, using = "//span[3]/button/span[text()='Next']")
	WebElement Next2;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Send P.O For Approval')]")
	WebElement Approval;
	@FindBy(how = How.XPATH, using = "//div[text()=' devAutomation ']")
	WebElement Approvers;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Select Approver')]")
	WebElement Select;

	@FindBy(how = How.XPATH, using = "//mat-panel-title[contains(text(),'PO Amount')]")
	WebElement PoAmount;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='min']")
	WebElement min;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='max']")
	WebElement max;

	@FindBy(how = How.XPATH, using = "//mat-panel-title[contains(text(),'PO Status')]")
	WebElement POStatus;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),' Send for Approval ')]")
	WebElement SendForApproval;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Apply')]")
	WebElement Apply;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'View P.O')]")
	WebElement ViewPO;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Approve')]")
	WebElement Approve;
	@FindBy(how = How.XPATH, using = "//div/menu-item//img[@src='../../../assets/images/sidenav_dashboard.svg']")
	WebElement Home;

	public CreatePO() {
		PageFactory.initElements(driver, this);

	}

	public void CreatePo() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Home));
		Thread.sleep(3000);
		Home.click();
		Thread.sleep(1000);
		CreatePO.click();
		Thread.sleep(1000);
		Search.sendKeys("rb test");
		Thread.sleep(3000);
		Supplier.click();
//		Thread.sleep(4000);
//		Robot robot = new Robot();
//		robot.mouseMove(205,482); 
//
//		//Clicks Left mouse button
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		// Supplier.click();
		Thread.sleep(1000);
		Next.click();
		Thread.sleep(6000);
		SearchProject.click();
		Thread.sleep(3000);
		SearchProjectName.sendKeys("rb test");
		Thread.sleep(3000);
		ProjectName.click();
		Thread.sleep(1000);
		Material.click();
		Thread.sleep(1000);
		Next1.click();
		Thread.sleep(4000);
		FullfilmentDate.click();
		Thread.sleep(1000);
		next.click();
		Thread.sleep(2000);

		SelectDate.click();
		Thread.sleep(1000);
		AwardedRate.sendKeys("0.33");
		Thread.sleep(1000);
		Quantity.sendKeys("100");
		Thread.sleep(1000);
		Next2.click();
		Thread.sleep(4000);
		Approval.click();
		Thread.sleep(4000);
		Approvers.click();
		Thread.sleep(2000);
		Select.click();
		Thread.sleep(2000);
		PoAmount.click();
		Thread.sleep(2000);
		min.sendKeys("33");
		Thread.sleep(1000);
		max.sendKeys("33");
		Thread.sleep(1000);
		POStatus.click();
		Thread.sleep(1000);
		SendForApproval.click();
		Thread.sleep(1000);
		Apply.click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(5000);
		ViewPO.click();

		Thread.sleep(1000);
		Approve.click();
		
		wait.until(ExpectedConditions.visibilityOf(Home));
		Thread.sleep(3000);
		Home.click();

	}

}

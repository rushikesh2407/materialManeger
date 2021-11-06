package done.mm.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import done.mm.qa.pages.*;

import done.mm.qa.base.TestBase;

public class Receipt_Shortclose_Payment extends TestBase {

	@FindBy(how = How.XPATH, using = "//div/menu-item//img[@src='../../../assets/images/sidenav_po.svg']")
	WebElement PurchaseOrder;
	@FindBy(how = How.XPATH, using = "//mat-panel-title[contains(text(),'PO Status')]")
	WebElement POStatus;
	@FindBy(how = How.XPATH, using = "//span[text()=' Approved ']")
	WebElement Approved;
	@FindBy(how = How.XPATH, using = "//mat-icon[contains(text(),'more_vert')]")
	WebElement ThreeDot;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add/View Receipts')]")
	WebElement AddViewReceipts;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Receipts')]")
	WebElement AddReceipts;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='deliveredDate']")
	WebElement Date;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'30')]")
	WebElement SelectDate;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='certifiedQty']")
	WebElement Quatity;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	WebElement Save;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'View P.O')]")
	WebElement ViewPO;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Short Close')]")
	WebElement ShortClose;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Send for Approval')]")
	WebElement SendforApproval;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Payment Record')]")
	WebElement PaymentRecord;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='amountPaid']")
	WebElement AmountPaid;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='paymentDate']")
	WebElement date1;
	@FindBy(how = How.XPATH, using = "//div[ contains(text(), '17')]")
	WebElement SelectDate1;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='transactionId']")
	WebElement TrnsactionID;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add')]")
	WebElement Add;
	@FindBy(how = How.XPATH, using = "//button[@aria-label='Previous month']")
	WebElement Backdate;
	@FindBy(how = How.XPATH, using = "//div/menu-item//img[@src='../../../assets/images/sidenav_dashboard.svg']")
	WebElement Home;

	public Receipt_Shortclose_Payment() {
		PageFactory.initElements(driver, this);

	}

	public void receipt() throws InterruptedException, AWTException {
		wait.until(ExpectedConditions.visibilityOf(Home));
		Thread.sleep(3000);
		PurchaseOrder.click();

		Thread.sleep(3000);
		Robot robot1 = new Robot();
		robot1.mouseMove(450, 500);

		// Clicks Left mouse button
		robot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);

		CreatePO po = PageFactory.initElements(driver, CreatePO.class);
		po.PoAmount.click();
		Thread.sleep(1000);
		po.min.sendKeys("33");
		po.max.sendKeys("33");
		POStatus.click();
		Thread.sleep(1000);
		Approved.click();
		Thread.sleep(1000);
		po.Apply.click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		Robot robot11 = new Robot();
		robot11.mouseMove(1883, 398);

		// Clicks Left mouse button
		robot11.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot11.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		ThreeDot.click();

		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", AddViewReceipts);
		// AddViewReceipts.click();
		Thread.sleep(1000);
		AddReceipts.click();
		Thread.sleep(3000);
		Date.click();
		Thread.sleep(1000);

		Backdate.click();
		Thread.sleep(1000);
		SelectDate.click();
		Thread.sleep(1000);
		Quatity.sendKeys("1");
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div/menu-item[1]/a[1]/button[1]/span[1]/div[1]/div[1]/span[contains(text(),'Home')]"))
				.click();
		Thread.sleep(2000);

	}
	
	 public void PaymentRecord() throws AWTException, InterruptedException {
			

			wait.until(ExpectedConditions.visibilityOf(Home));
		 Thread.sleep(3000);
			PurchaseOrder.click();
			
			Thread.sleep(3000);
			Robot robot1 = new Robot();
			robot1.mouseMove(450,500); 

			//Clicks Left mouse button
			robot1.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			robot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(2000);
			CreatePO po11 = PageFactory.initElements(driver, CreatePO.class);
			
			po11.PoAmount.click();
			Thread.sleep(1000);
			po11.min.sendKeys("33");
			po11.max.sendKeys("33");
			POStatus.click();
			Thread.sleep(5000);
			Approved.click();
			Thread.sleep(5000);
			po11.Apply.click();
			Thread.sleep(4000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,-500)");
			 Thread.sleep(2000); 
			 Robot robot11 = new Robot();
				robot11.mouseMove(1883,398); 

				//Clicks Left mouse button
				robot11.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
				robot11.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			 
			 
			ThreeDot.click();
			Thread.sleep(1000);
			
			
			PaymentRecord.click();		    				
			AmountPaid.sendKeys("0.30");
			Thread.sleep(3000);
			date1.click();
			Thread.sleep(1000);
			
			Backdate.click();
			Thread.sleep(1000);
			SelectDate1.click();
			Thread.sleep(1000);
		
			TrnsactionID.sendKeys("done");
			Thread.sleep(1000);
		    Add.click();
		    Thread.sleep(3000);
		 
    }
	 
	

	public void Shortclose() throws AWTException, InterruptedException {
		CreatePO po = PageFactory.initElements(driver, CreatePO.class);
		Robot robot1 = new Robot();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(Home));
		Home.click();
		Thread.sleep(3000);
		PurchaseOrder.click();
		Thread.sleep(3000);
		// Clicks Left mouse button
		robot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		POStatus.click();
		Thread.sleep(3000);
		Approved.click();
		Thread.sleep(3000);
		po.Apply.click();
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);

		ViewPO.click();
		Thread.sleep(2000);
		ShortClose.click();
		Thread.sleep(2000);
		SendforApproval.click();
		Thread.sleep(3000);
	}

}

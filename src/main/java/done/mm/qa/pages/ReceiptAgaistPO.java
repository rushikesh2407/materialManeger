package done.mm.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import done.mm.qa.base.TestBase;

public class ReceiptAgaistPO extends TestBase{


	
	
	@FindBy(how=How.XPATH,using="//div/menu-item//img[@src='../../../assets/images/sidenav_receipts.svg']") 
	WebElement Receipt;
	
	@FindBy(how=How.XPATH,using="//mat-select[@formcontrolname='selected']//parent::div[starts-with(@class,'mat-form-field-infix ng-tns-c')]")
	WebElement Project;
	@FindBy(how=How.XPATH,using="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement ProjectName;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'rb Test')]")
	WebElement rbTest;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Receipt Against PO')]")
	WebElement ReciptAgaistPO;
	//@FindBy(how=How.XPATH,using="//img[@src='../../../../assets/images/download-po.png']")
	//WebElement SelectPO;
	@FindBy(how=How.XPATH,using="//tbody/tr[1]//mat-radio-group")
	WebElement SelectPO;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Next')]")
	WebElement Next;
	
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='deliveredDate']")
	WebElement Date;
	@FindBy(how=How.XPATH,using="//button[@aria-label='Previous month']")
	WebElement Backdate;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'30')]")	
	WebElement SelectDate;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='certifiedQty']")
	WebElement quantity;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Add')]")
	WebElement Add;
	@FindBy(how=How.XPATH,using="//div/menu-item//img[@src='../../../assets/images/sidenav_dashboard.svg']")
	WebElement Home;
	
	public ReceiptAgaistPO() {
		PageFactory.initElements(driver, this);
		
	}
	public void ReceiptAgaistPo() throws InterruptedException, AWTException {
		wait.until(ExpectedConditions
				.visibilityOf(Home));
		Thread.sleep(3000);
		Receipt.click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.mouseMove(300,431); 

		//Clicks Left mouse button
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	
		Thread.sleep(1000);
		Project.click();	
		Thread.sleep(2000);
		
		rbTest.click();
		Thread.sleep(2000);
		ReciptAgaistPO.click();
		Thread.sleep(2000);
		SelectPO.click();
		
		Thread.sleep(4000);
	
		
		Thread.sleep(1000);
		
		Next.click();
		Thread.sleep(2000);

		//DownloadReceipt.click();
		//Thread.sleep(4000);
		Date.click();
		Thread.sleep(2000);
		Backdate.click();
		Thread.sleep(2000);
		SelectDate.click();
		Thread.sleep(1000);
		quantity.sendKeys("1");
		Thread.sleep(2000);
		Add.click();
		Thread.sleep(3000);
		
		Home.click();
		
		
		
		
	}
	
	
	
	
}

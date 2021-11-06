package done.mm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import done.mm.qa.base.TestBase;

public class RaisePR extends TestBase{

	@FindBy(how=How.XPATH,using="//h6[contains(text(),'Create BOM')]|//img[@src='../../../assets/images/bom.svg']")
	WebElement ClickOnBom;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'rb Test')]")
	WebElement ClickOnProject;
	@FindBy(how=How.XPATH,using="//div[text()='Ordinary Portland Cement Grade 43 ']")
	WebElement SelectMaterial;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Raise PR')]")
	WebElement CreatePR;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='quantity']")
	WebElement RequiredQuantity;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='dueDate']") 
	WebElement RequireDate;
	@FindBy(how=How.XPATH,using="//button[@aria-label='Next month']") 
	WebElement next;
	@FindBy(how=How.XPATH,using="//td//div[contains(text(),'30')]")
	WebElement SelectDate;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Raise PR')]")
	WebElement RaisePR;
	@FindBy(how=How.XPATH,using="//div[@class='maxwidth-96-px word-break-word']|//div[text()='All Materials']")
	WebElement allMaterial;
	@FindBy(how=How.XPATH,using="//div/menu-item//img[@src='../../../assets/images/sidenav_dashboard.svg']")
	WebElement Home;
	
	public RaisePR() {
		PageFactory.initElements(driver, this);
		
	}
	public void RaisePR() throws InterruptedException {
		wait.until(ExpectedConditions
				.visibilityOf(Home));
		Thread.sleep(1000);
		ClickOnBom.click();
		Thread.sleep(1000);
		ClickOnProject.click();
		Thread.sleep(1000);
		SelectMaterial.click();
		Thread.sleep(1000);
		CreatePR.click();
		Thread.sleep(1000);
		RequiredQuantity.sendKeys("1");
		Thread.sleep(1000);
		RequireDate.click();
		Thread.sleep(1000);
		next.click();
		Thread.sleep(1000);
		SelectDate.click();
		Thread.sleep(1000);
		RaisePR.click();
		Thread.sleep(2000);
		//for  api testing
		allMaterial.click();
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
}

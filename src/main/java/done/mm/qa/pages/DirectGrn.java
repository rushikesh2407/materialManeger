package done.mm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import done.mm.qa.base.TestBase;

public class DirectGrn extends TestBase{

	@FindBy(how=How.XPATH,using="//h6[text()='Create BOM']//preceding-sibling::div")
	WebElement ClickOnBom;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'rb Test')]")
	WebElement ClickOnProject;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Ordinary Portland Cement Grade 43 ')]")
	WebElement SelectMaterial;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'menu')]")
	WebElement Menu;
	@FindBy(how=How.XPATH,using="//button[text()='Create Direct Purchase via System']")
	WebElement CreateDirectPurchaseviaSystem;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='materialName']") 
	WebElement Material;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Ordinary Portland Cement Grade 43')]")
	WebElement SelectMaterial1;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='deliveredQty']")
	WebElement Quantity;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='awardedRate']")
	WebElement UnitPrice;
	
	
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='materialTax']")
	WebElement taxpercentage;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Add Other Cost')]")
	WebElement othercost;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='otherCostName']")
	WebElement othercostname;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='otherCostAmount']")
	WebElement othercostamount;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Save')]")
	WebElement Save;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Next')]")
	WebElement Next;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='grnNo']")
	WebElement ReceiptsNo;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='grnDate']")
	WebElement ReceiptsDate;
	@FindBy(how=How.XPATH,using="//button[@aria-label='Previous month']")
	WebElement Backdate;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'30')]")	
	WebElement SelectDate;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='supplierName']")
	WebElement ContactPerson;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='contact']")
	WebElement PhoneNo;
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='email']")
	WebElement Email;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Submit')]")
	WebElement Submit;

	@FindBy(how=How.XPATH,using="//div/menu-item//img[@src='../../../assets/images/sidenav_dashboard.svg']")
	WebElement Home;
	
	public DirectGrn() {
		PageFactory.initElements(driver, this);
		
	}
	public void DirectGrn() throws InterruptedException {
		wait.until(ExpectedConditions
				.visibilityOf(Home));
		Thread.sleep(1000);
		Home.click();
		Thread.sleep(4000);
		ClickOnBom.click();
		Thread.sleep(1000);
		ClickOnProject.click();
		Thread.sleep(1000);
		SelectMaterial.click();
		Thread.sleep(1000);
		Menu.click();
		Thread.sleep(1000);
		CreateDirectPurchaseviaSystem.click();
		Thread.sleep(2000);
		Material.sendKeys("Ordinary Portland Cement Grade 43");
		Thread.sleep(1000);
		SelectMaterial1.click();
		Thread.sleep(1000);
		Quantity.sendKeys("1");
		Thread.sleep(1000);
		UnitPrice.sendKeys("1");
		taxpercentage.sendKeys("10");
		othercost.click();
		othercostname.sendKeys("a1");
		othercostamount.sendKeys("10");
		Save.click();
		Thread.sleep(1000);
		Next.click();
		Thread.sleep(1000);
		ReceiptsNo.sendKeys("1q");
		Thread.sleep(1000);
		ReceiptsDate.click();
		Thread.sleep(1000);
		Backdate.click();
		Thread.sleep(1000);
		SelectDate.click();
		Thread.sleep(1000);
		ContactPerson.sendKeys("rb");
		Thread.sleep(1000);
		PhoneNo.sendKeys("7030724471");
		Thread.sleep(1000);
		Email.sendKeys("nm@nm.mn");
		Thread.sleep(1000);
		Submit.click();
		Thread.sleep(3000);
		
		
		
		
	}
	
	
	
	
}

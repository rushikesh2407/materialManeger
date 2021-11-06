package done.mm.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class IssueToPr {
	WebDriver driver;
	public IssueToPr(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void IssueToPr() throws InterruptedException, AWTException {		
		 		
		 //click on project store
			Thread.sleep(5000);
			driver.findElement(By.xpath("//h6[contains(text(),'Create BOM')]")).click();
			// launching  on project store
			Thread.sleep(5000);
			driver.findElement(By.xpath("//strong[contains(text(),'materials')]")).click();
			
			
			Thread.sleep(5000);
			//click on issue to pr modal
			driver.findElement(By.xpath("//img[@src='../../../../assets/images/issue_to_indent.png']"))
			.click();
			
			Thread.sleep(4000);
			
			//enter qty
			driver.findElement(By.xpath("//input[@formcontrolname='issuedQty']")).sendKeys("1");						
			//enter remark
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@formcontrolname='issueToPrComments']")).sendKeys("1");
			//save the issuance
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Save')]"))
			.click();
			//click on Open Purchase Requisition
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'Open Purchase Requisition')  and (@class='word-break-word')]"))
			.click();
			Thread.sleep(5000);
			
			
			
			
			
			    }
				

}

package done.mm.qa.pages;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddSupplier {
	WebDriver driver;
	public AddSupplier(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void AddSupplier() throws InterruptedException {
		
		 
		 
		Thread.sleep(3000);
			 //click on supplier button
		driver.findElement(By.xpath("//div/menu-item//img[@src='../../../assets/images/sidenav_supplier.svg']"))
		.click();
		Thread.sleep(4000);
		//click on Add supplier
		driver.findElement(By.xpath("//span[contains(text(),'Add Supplier')]"))
		.click();
		Thread.sleep(1000);
		//enter supplier name
		driver.findElement(By.xpath("//input[@formcontrolname='supplierName']"))
		.sendKeys("abc");
		Thread.sleep(1000);
		//enter email
		driver.findElement(By.xpath("//input[@formcontrolname='email']"))
		.sendKeys("bnm@mb.mnb");
		Thread.sleep(1000);
		//enter mobile 
		driver.findElement(By.xpath("//input[@formcontrolname='contactNo']"))
		.sendKeys("7098678665");
		Thread.sleep(1000);
		//enter pan
		driver.findElement(By.xpath("//input[@formcontrolname='pan']"))
		.sendKeys("AAAAA1111A");
		Thread.sleep(1000);
		//click on add
		driver.findElement(By.xpath("//span[text()='Add']"))
		.click();	 
			 
		Thread.sleep(3000);
		
		
    }
	
	

}

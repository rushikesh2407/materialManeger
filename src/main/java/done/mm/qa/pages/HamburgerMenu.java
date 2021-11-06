package done.mm.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HamburgerMenu {
	WebDriver driver;
	public HamburgerMenu(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void Hamburgermenu() throws InterruptedException, AWTException {
		
		 
		 
		//Add edit material
			 //click on project store
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h6[text()='Create BOM']//preceding-sibling::div")).click();
		// launching  on project store
		Thread.sleep(5000);
		driver.findElement(By.xpath("//strong[contains(text(),'materials')]")).click();
		
		//clicking on menu
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'menu')]"))
		.click();
		//click on edit material
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Edit Material')]"))
		.click();
		
		Thread.sleep(4000);
		//click on update		
		driver.findElement(By.xpath("//span[contains(text(),'Update')]"))
		.click();	
		Thread.sleep(2000);
				
			
		
		//Add material
		//click on project store
		
		
		
		
		Thread.sleep(5000);
		//click on menu
		driver.findElement(By.xpath("//span[contains(text(),'menu')]"))
		.click();
		Thread.sleep(2000);
		//click on add material
		driver.findElement(By.xpath("//button[contains(text(),'Add Material')]")).click();
		Thread.sleep(6000);
		
		// clink on trade in add material
		//clicking on civil in trade list 
		driver.findElement(By.xpath("//span[contains(text(),'Civil and Structure')]"))
		.click();
		//robot class for clicking outside of trade modal 
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.mouseMove(131,431); 
		
		//Clicks Left mouse button
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		Thread.sleep(2000);
		//click on apply button in add material 
		driver.findElement(By.xpath("//span[contains(text(),'Apply')]"))
		.click();
		Thread.sleep(5000);
		
		//click on any unit for testing the add material loading
		driver.findElement(By.xpath("//span[text()='cum']//parent::span//parent::div"))
		.click();
		Thread.sleep(4000);
		// goto dashboard
		
		
		//
		
		
		
		
		    }
}

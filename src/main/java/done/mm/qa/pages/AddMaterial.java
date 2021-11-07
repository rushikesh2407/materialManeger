package done.mm.qa.pages;
import org.testng.annotations.*;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddMaterial {
	WebDriver driver;

	public AddMaterial(WebDriver driver) {
		this.driver = driver;
	}

	
	public void addmaterial() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		// add material custom
//click on arrow
		Thread.sleep(1000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(text(),'keyboard_arrow_right')]")));
		driver.findElement(By.xpath("//span[contains(text(),'keyboard_arrow_right')]")).click();
		Thread.sleep(4000);
//click on my material		
		driver.findElement(By.xpath(
				"//div[@class='sidenav sidebar-navigation ng-star-inserted f-w']//span[contains(text(),'My Materials')]"))
				.click();
		Thread.sleep(4000);
//click on add material
		driver.findElement(By.xpath("//span[contains(text(),'+Add Material')]")).click();
		Thread.sleep(4000);

		Date date = java.util.Calendar.getInstance().getTime();
		System.out.println(date);

		String date2 = date.toString();
//click on materail name
		driver.findElement(By.xpath("//input[@formcontrolname='materialName']")).sendKeys(date2);
		Thread.sleep(1000);
//click on material unit		
		driver.findElement(By.xpath(
				"//mat-label[text()='Unit*']//parent::label//parent::span//preceding-sibling::mat-select[@formcontrolname='selected']"))
				.click();
		Thread.sleep(1000);
//select unit		
		driver.findElement(By.xpath("//span[contains(text(),'%')]")).click();
		Thread.sleep(1000);
//click on trade		
		driver.findElement(By.xpath(
				"//mat-label[text()='Trade*']//parent::label//parent::span//preceding-sibling::mat-select[@formcontrolname='selected']"))
				.click();
		Thread.sleep(1000);
//select trade		
		driver.findElement(By.xpath("//span[contains(text(),'Civil and Structure')]")).click();
		Thread.sleep(1000);
//submit material		
		driver.findElement(By.xpath("//form//span[contains(text(),'Add Material') ]")).click();
//		wait.until(
//				ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[5]/div[3]/div[1]/snack-bar-container[1]/simple-snack-bar[1]")));
//		String messege =driver.findElement(By.xpath("//body[1]/div[5]/div[3]/div[1]/snack-bar-container[1]/simple-snack-bar[1]")).getText();
//		System.out.println(messege);
		

	}

}

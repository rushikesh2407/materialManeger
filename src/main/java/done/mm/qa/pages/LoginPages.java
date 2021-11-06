package done.mm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import done.mm.qa.base.TestBase;

public class LoginPages extends TestBase {
	@FindBy(how = How.CSS, using = "#mat-input-2")
	WebElement Login;

	@FindBy(how = How.CSS, using = "#mat-input-0")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Sign In')]")
	WebElement SignUpButton;
	@FindBy(how=How.XPATH,using="//div/menu-item//img[@src='../../../assets/images/sidenav_dashboard.svg']")
	WebElement Home;
	
	public LoginPages() {
		PageFactory.initElements(driver, this);
		
	}

	public void Login(String un,String pwd) {
		Login.sendKeys(un);
		Password.sendKeys(pwd);
		SignUpButton.click();
	
	}
	
	public void ValidateLogin() {
		wait.until(ExpectedConditions
				.visibilityOf(Home));
	}

}
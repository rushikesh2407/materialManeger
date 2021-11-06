package done.mm.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import done.mm.qa.util.Xls_Reader;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.LoginPages;
import done.mm.qa.util.TestUtil;

public class LoginFromExcelData_DataDrivenTest extends TestBase {
	LoginPages loginPages;
	String sheetname = "Sheet1";

	public LoginFromExcelData_DataDrivenTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
	}

	
	
//	public   String GetMmData(){
//	Xls_Reader reader = new Xls_Reader(
//			"/home/buildsupply/Documents/1633082000981_1633073727202_11991633064294981_1417_1199_materials.xlsx");
//	String phoneNo = null;
//	String password=null;
//	int rowCount = reader.getRowCount("Sheet1");
//	
//	for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
//
//		 phoneNo = reader.getCellData("Sheet1", "phoneNo", rowNum);
//
//		System.out.println(phoneNo);
//
//		 password = reader.getCellData("Sheet1", "password", rowNum);
//		System.out.println(password);
//		
//	}
//	return phoneNo;
//	
//	}
	
	
	public Object[][] GetMmData() throws InvalidFormatException{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
		
	}
	
	
	
	@Test(priority = 1,dataProvider="GetMmData")
	public void SignUp(String username,String password) {
		loginPages.Login(username,password);
		loginPages.ValidateLogin();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}

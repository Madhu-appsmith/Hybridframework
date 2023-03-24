package Recipetype_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tutorialninja.qa.pages.ARMPage;
import com.tutorialninja.qa.pages.AccountLoginPage;
import com.tutorialninja.qa.pages.Recipetypepage;
import com.tutorialninja.qa.utilites.Base;

public class Recipetype_searchcriteria extends Base {

	public WebDriver driver;
	AccountLoginPage alp;
	Recipetypepage Rtp;

	public Recipetype_searchcriteria() {
		super();
	}

	@BeforeTest
	public void setup() {
		driver = intializeBrowser();
		alp = new AccountLoginPage(driver);
		Rtp = new Recipetypepage(driver);
		
	}

	@Test(priority = 1)
	public void Recipetypesearchcriteria() throws InterruptedException {
		Thread.sleep(2000);
		ARMPage armPage=alp.enterCreditialsInLoginPage(testDataProp.getProperty("validUserName"), testDataProp.getProperty("validPassword"));
		//alp.clickOnloginButton();
		Thread.sleep(5000);
		armPage.clickOnRecipetypetext();
		Thread.sleep(10000);
		Rtp.enterselectallValueInDropDown();
		Thread.sleep(2000);
		//Doubel click
		List<WebElement> RtsearchButton = driver.findElements(By.xpath("//button[@class='bp3-button bp3-disabled bp3-fill sc-hGEFff cZGYpl']"));
		Actions act = new Actions(driver);
		act.doubleClick((WebElement) RtsearchButton).doubleClick().build().perform();
		//Rtp.clickOnsearchRtButton();
		Thread.sleep(5000);
		
//		
//}
//	String tableData;
//	try {
//		 tableData = ("findrow"); //driver.findElements(By.xpath("//div[@role='row']//div[@role='gridcell' and @tabindex='0']"));
//	}catch(Exception e) {
//		 tableData = ("findrow"); //driver.findElements(By.xpath("//div[@role='row']//div[@role='gridcell' and @tabindex='0']"));
//	}
//	for(WebElement text:tableData) {
//		System.out.println(text.getText());
//	}
//}
}

	@AfterTest
	public void close() {
		driver.close();
	}
}

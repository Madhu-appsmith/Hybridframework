package Recipetype_page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tutorialninja.qa.pages.ARMPage;
import com.tutorialninja.qa.pages.AccountLoginPage;
import com.tutorialninja.qa.pages.Recipetypepage;
import com.tutorialninja.qa.utilites.Base;

public class Recipetype_reset extends Base {

	public WebDriver driver;
	AccountLoginPage alp;
	Recipetypepage Rtp;

	public Recipetype_reset() {
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
		Thread.sleep(5000);
		armPage.clickOnRecipetypetext();
		Thread.sleep(2000);
		Rtp.enterselectallValueInDropDown();
		Thread.sleep(2000);
		//Doubel click
		Rtp.clickOnsearchRtButton();
		Thread.sleep(5000);
		Rtp.clickOnsearchRtButton();
		Thread.sleep(5000);
		
}
 

}

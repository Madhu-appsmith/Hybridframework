package com.tutorialninja.qa.utilites;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tutorialninja.qa.pages.ARMPage;
import com.tutorialninja.qa.pages.AccountLoginPage;

public class Base {
	//AccountLoginPage alp;
	//alp = new AccountLoginPage(driver);

	String configpath = System.getProperty("user.dir")
			+ "//src//main//java//com//tutorialninja//qa//configproperties//config.properties";
	String testDataproppath = System.getProperty("user.dir")
			+ "//src//main//java//com//tutorialninja//qa//testdata//testData.properties";
	public Properties configprop;
	public Properties testDataProp;
	public WebDriver driver;

	public Base() {
		configprop = Utiles.propertiesReader(configpath);
		testDataProp = Utiles.propertiesReader(testDataproppath);
	}

	
	public WebDriver intializeBrowser() {
		driver = Utiles.getBrowser(driver, configprop.getProperty("browser"));
		driver.get(configprop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utiles.PAGELOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utiles.IMPLECITLY_WAIT));
		//driver.findElements(By.xpath("//input[@name='login']"))configpath.click();
		//alp.enterCreditialsInLoginPage(testDataProp.getProperty("validUserName"), testDataProp.getProperty("validPassword"));
		//alp.clickOnloginButton();
		return driver;
	}

}
package com.aviorsys.HRMS_pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.asserts.Assertion;

//import junit.framework.Assert;

//import com.aviorsys.HRMS_tests.pannel_title;

//import junit.framework.Assert;

public class NavigationPage {
	
	WebDriver driver;
	
	//By button_navigationExpand = By.xpath("//*[@id=/\"toggle_nav_btn\"]/");
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_employeeProfile = By.xpath("/html/body/div[3]/div[1]/div/ul/li[4]/a/div[1]");
	By button_createNew =By.xpath("//*[@id=\"emp_prof\"]/li/a[1]");
	By textfield_universalSearch =By.xpath("//*[@id=\"homeSearchBar\"]");
	By pannel_title =By.xpath("//*[@id=\"uiEmpUserName\"]");
	
	public NavigationPage(WebDriver driver){
		this.driver = driver;
	}
	
	 public void clickNavigationExpand() throws InterruptedException{
		 Thread.sleep(5000);
	        driver.findElement(button_navigationExpand).click();
	        Thread.sleep(5000);
	        }
	 
	 public void clickEmployeeProfile(){
	        driver.findElement(button_employeeProfile).click();
	        }
	 
	 public void clickCreateNew(){
	        driver.findElement(button_createNew).click();
	        }
	 
	 public void enterNameforUniversalSearch(String strName) throws InterruptedException{
		 driver.findElement(textfield_universalSearch).sendKeys(strName);
		 Thread.sleep(10000);
		 driver.findElement(textfield_universalSearch).click();		 
	 }
	 
	 public void verifyEmployeeSearch(String strNameSearched) throws InterruptedException{
		// Thread.sleep(10000);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		// assertTrue.isEnbled(pannel_title);
		 String Labeltext= driver.findElement(pannel_title).getText();
		 AssertJUnit.assertEquals(strNameSearched, Labeltext);
		 System.out.println("Assert passed");
	        }

}

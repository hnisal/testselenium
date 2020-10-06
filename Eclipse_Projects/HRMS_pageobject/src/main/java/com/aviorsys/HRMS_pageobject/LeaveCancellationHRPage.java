package com.aviorsys.HRMS_pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LeaveCancellationHRPage {
	
	WebDriver driver;
	
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_timeAttendance = By.xpath("/html/body/div[3]/div[1]/div/ul/li[5]/a");
	By button_leaveCancellation = By.xpath("//*[@id=\"time_n_att\"]/li/a[4]");
	By drpdown_company = By.xpath("//*[@id=\"s2id_cmbCompany\"]/a");
	By drpdown_division = By.xpath("//*[@id=\"s2id_cmbDivision\"]/a");
	By drpdown_unit = By.xpath("//*[@id=\"s2id_cmbUnit\"]/a");
	By drpdown_employee = By.xpath("//*[@id=\"s2id_cmbEmployee\"]/a");
	By calendar_fromDate = By.xpath("//*[@id=\"fromDate\"]");
	By calendar_toDate = By.xpath("//*[@id=\"toDate\"]");
	By button_load = By.xpath("//*[@id=\"btnLoad\"]");
	By button_cancel = By.xpath("//*[@id=\"leaves-table\"]/div/div[6]/div/table/tbody/tr[3]/td[9]/button");
	By textfield_cancelReason = By.xpath("//*[@id=\"cancel-reason\"]");
	By button_cancelLeave = By.xpath("//*[@id=\"btnCancelLeave\"]");
	
	public LeaveCancellationHRPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickNavigationExpand() throws InterruptedException{
		 Thread.sleep(5000);
	        driver.findElement(button_navigationExpand).click();
	        Thread.sleep(5000);
	        }
	 
	 public void clickTimeandAttendance(){
	        driver.findElement(button_timeAttendance).click();
	        }
	 
	 public void clickLeaveCancellation() throws InterruptedException{
	        driver.findElement(button_leaveCancellation).click();
	        Thread.sleep(2000);
	        }
	
	 public void selectCompany() throws InterruptedException{
		 driver.findElement(drpdown_company).click();//click on that combo
		 for(int i = 0; i <= 4; i++){// 1 is the position of the element which you want 
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(3000);
		 	}
		 }
		   
	 public void chooseCompany() throws InterruptedException{
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.ENTER).build().perform();//press enter
		     //driver.findElement(drpdown_company).click();
		     Thread.sleep(3000);
		 }
	 
	 public void selectDivision() throws InterruptedException{
		 driver.findElement(drpdown_division).click();//click on that combo
		 for(int i = 0; i <= 1; i++){// 1 is the position of the element which you want 
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(3000);
		 	}
		 }
		   
	 public void chooseDivision(){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.ENTER).build().perform();//press enter
		 }
	 
	 public void selectUnit() throws InterruptedException{
		 driver.findElement(drpdown_unit).click();//click on that combo
		 for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(3000);
		 	}
		 }
		   
	 public void chooseUnit(){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.ENTER).build().perform();//press enter
		 }
	 
	 public void selectEmployee() throws InterruptedException{
		 driver.findElement(drpdown_employee).click();//click on that combo
		 for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(3000);
		 	}
		 }
		   
	 public void chooseEmployee(){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.ENTER).build().perform();//press enter
		     //driver.findElement(drpdown_employee).click();
		     
		 }
	 
	 public void clearFromDate() throws InterruptedException{
		 WebElement fromdateBox = driver.findElement(calendar_fromDate);
		 fromdateBox.clear();
		 Thread.sleep(3000);
	 	}
	
	 public void selectFromDate(String strfromdate){
		 WebElement fromdateBox = driver.findElement(calendar_fromDate);
		 fromdateBox.sendKeys(strfromdate);
	 	}
	 
	 public void clearToDate() throws InterruptedException{
		 WebElement fromdateBox = driver.findElement(calendar_fromDate);
		 fromdateBox.clear();
		 Thread.sleep(3000);
	 	}
	
	 public void selectToDate(String strtodate){
		 WebElement fromdateBox = driver.findElement(calendar_fromDate);
		 fromdateBox.sendKeys(strtodate);
	 	}
	 
	 public void clickLoad() throws InterruptedException{
		 Thread.sleep(1000);
	        driver.findElement(button_load).click();
	        Thread.sleep(1000);
	        } 
	 
	 public void selectRecordToDelete() throws InterruptedException{
		 Thread.sleep(1000);
	        driver.findElement(button_cancel).click();
	        Thread.sleep(1000);
	        } 
	 
	 public void enterCancelReason(String strCancelReason) throws InterruptedException{
	        driver.findElement(textfield_cancelReason).sendKeys(strCancelReason);
	        Thread.sleep(8000);
	        }
	 
	 public void clickCancelLeave() throws InterruptedException{
		 Thread.sleep(1000);
	        driver.findElement(button_cancelLeave).click();
	        Thread.sleep(1000);
	        } 
}

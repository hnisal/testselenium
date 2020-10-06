package com.aviorsys.HRMS_pageobject;

import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ViewLeaveCancellationPage {
	
	WebDriver driver;
	
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_timeAttendance = By.xpath("/html/body/div[3]/div[1]/div/ul/li[5]/a");
	By button_viewCancelledLeave = By.xpath("//*[@id=\"time_n_att\"]/li/a[5]");
	By drpdown_company = By.xpath("//*[@id=\"s2id_company\"]/a");
	By drpdown_division = By.xpath("//*[@id=\"s2id_division\"]/a");
	By drpdown_unit = By.xpath("//*[@id=\"s2id_unit\"]/a");
	By drpdown_employee = By.xpath("//*[@id=\"s2id_comEmployee\"]/a");
	By calendar_fromDate = By.xpath("//*[@id=\"dateFrom\"]");
	By calendar_toDate = By.xpath("//*[@id=\"dateTo\"]");
	By button_load = By.xpath("//*[@id=\"btn_loadLeave\"]");
	By button_view = By.xpath("//*[@id=\"view_leave\"]/i");
	
	public ViewLeaveCancellationPage(WebDriver driver){
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
	 
	 public void clickViewLeaveCancellation() throws InterruptedException{
	        driver.findElement(button_viewCancelledLeave).click();
	        Thread.sleep(2000);
	        }
	
	 public void selectCompany() throws InterruptedException{
		 driver.findElement(drpdown_company).click();//click on that combo
		 for(int i = 0; i <= 5; i++){// 1 is the position of the element which you want 
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
		 for(int i = 0; i <= 19; i++){// 1 is the position of the element which you want 
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
		 WebElement fromdateBox = driver.findElement(calendar_toDate);
		 fromdateBox.clear();
		 Thread.sleep(3000);
	 	}
	
	 public void selectToDate(String strtodate){
		 WebElement fromdateBox = driver.findElement(calendar_toDate);
		 fromdateBox.sendKeys(strtodate);
	 	}
	 
	 public void clickLoad() throws InterruptedException{
		 Thread.sleep(1000);
	        driver.findElement(button_load).click();
	        Thread.sleep(1000);
	        } 
	 
	// public class NoofRowsAndColsInGrid {
	 public void NoofRowsAndColsInGrid() throws ParseException {         
		        //No.of Columns
		        List  col = driver.findElements(By.xpath("//*[@id=\"leaveDxDatagrid\"]/div/div[5]/div/table/tbody/tr[1]"));
		        System.out.println("No of cols are : " +col.size()); 
		        //No.of rows 
		        List  rows = driver.findElements(By.xpath("//*[@id=\"leaveDxDatagrid\"]/div/div[6]")); 
		        System.out.println("No of rows are : " + rows.size());
		    }
	 
	 public void ViewCancelledLeave(){
		 driver.findElement(button_view).click();
	 }
	
	 public void NoofRowsAndColsInGridss(){
		 List<WebElement> allrows = driver.findElements(By.tagName("tr"));
		    List<WebElement> allcols = driver.findElements(By.tagName("td"));
		    System.out.println("Number of rows in the table "+allrows.size());
		    System.out.println("Number of columns in the table "+allcols.size());
		 for(WebElement row: allrows){
			    List<WebElement> Cells = row.findElements(By.tagName("td"));
			    for(WebElement Cell:Cells){
			        if (Cell.getText().contains("2020/06/04"))//  if (Cell.getText().contains("2020/06/04"))//.getText
			           // Cell.click();
			        	 System.out.println("anuradhika");
			    	}
		 		}
	 		}

}

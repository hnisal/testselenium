package com.aviorsys.HRMS_pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;

public class LeaveMgtBulkPage {

	WebDriver driver;
	
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_timeAttendance = By.xpath("/html/body/div[3]/div[1]/div/ul/li[5]/a");
	By button_leaveMgt = By.xpath("//*[@id=\"time_n_att\"]/li/a[3]");
	By button_BulkTab = By.xpath("//*[@id=\"bulk_tab_2\"]");
	By drpdown_LeaveType = By.xpath("//*[@id=\"s2id_leav_type\"]/a");
	By defaultdrpdown_Year = By.xpath("//*[@id=\"s2id_leav_year\"]/a");
	By drpdown_PrePost = By.xpath("//*[@id=\"s2id_leav_prepost\"]/a");
	By Textfield_ReasonTask = By.xpath("//*[@id=\"leave_Reason\"]");
	By calendar_StartDate = By.xpath("//*[@id=\"start_date\"]");
	By calendar_EndDate = By.xpath("//*[@id=\"end_date\"]");
	By drpdown_Company = By.xpath("//*[@id=\"s2id_leav_com\"]/a");
	By autofilledtextfield_NoDays = By.xpath("//*[@id=\"no_of_days\"]");
	By drpdown_Division = By.xpath("//*[@id=\"s2id_leav_div\"]/a");
	By drpdown_Unit = By.xpath("//*[@id=\"s2id_leav_unit\"]/a");
	By drpdown_StartTime = By.xpath("//*[@id=\"s2id_leav_sTime\"]/a");
	By drpdown_EndTime = By.xpath("//*[@id=\"s2id_leav_eTime\"]/a");
	By drpdown_AttProfile= By.xpath("//*[@id=\"s2id_leav_attProfile\"]/a");
	By button_SelectEmployee = By.xpath("//*[@id=\"btnSelectEmp\"]");
	By button_SelectAllEmp = By.className("dx-checkbox-icon");//Select All Employees
	By button_Submit = By.xpath("//*[@id=\"btnSubmitEmp\"]");
	By button_Save = By.xpath("//*[@id=\"btnLastSave\"]/span");
	
	public LeaveMgtBulkPage(WebDriver driver){
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
	 
	 public void clickLeaveManagement() throws InterruptedException{
	        driver.findElement(button_leaveMgt).click();
	        Thread.sleep(2000);
	        }
	
	 public void clickBulkTab() throws InterruptedException{
	        driver.findElement(button_BulkTab).click();
	        Thread.sleep(2000);
	        }

	 public void selectLeaveType() throws InterruptedException{
		 driver.findElement(drpdown_LeaveType).click();//click on that combo
		 for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(3000);
		 	}
		 }
		   
	 public void chooseLeaveType(){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.ENTER).build().perform();//press enter
		 }
		
	 public void verifyYearAppeareCorrect(String stryear) throws InterruptedException{
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			 String defaultyear= driver.findElement(defaultdrpdown_Year).getText();
			 AssertJUnit.assertEquals(stryear,defaultyear);
			 System.out.println(defaultyear + " is correct.Assert passed");
		        }
		
	 public void selectPrePostLeave() throws InterruptedException{
			 driver.findElement(drpdown_PrePost).click();//click on that combo
			 for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			     Actions actions = new Actions(driver);
			     actions.sendKeys(Keys.DOWN).build().perform();
			     Thread.sleep(3000);
			 	}
			 }
			   
	 public void choosePrePost(){
			     Actions actions = new Actions(driver);
			     actions.sendKeys(Keys.ENTER).build().perform();//press enter
			 }
			
	 public void enterReason(String strReason) throws InterruptedException{
		        driver.findElement(Textfield_ReasonTask).sendKeys(strReason);
		        Thread.sleep(2000);
		        }
			
	 public void clearStartDate() throws InterruptedException{
				 WebElement fromdateBox = driver.findElement(calendar_StartDate);
				 fromdateBox.clear();
				 Thread.sleep(3000);
			 	}
			
     public void selectStartDate(String strstartdate){
				 WebElement fromdateBox = driver.findElement(calendar_StartDate);
				 fromdateBox.sendKeys(strstartdate);
			 	}
		     
	 public void clearEndDate() throws InterruptedException{
				  WebElement todateBox = driver.findElement(calendar_EndDate);
				  todateBox.clear();
				  Thread.sleep(3000);
			 	}
			
	 public void selectEndDate(String strenddate){
				 WebElement todateBox = driver.findElement(calendar_EndDate);
				 todateBox.sendKeys(strenddate);
				 driver.findElement(calendar_EndDate).click();
	 			}
		  
	 public void selectCompany() throws InterruptedException{
				 driver.findElement(drpdown_Company).click();//click on that combo
				 for(int i = 0; i <= 5; i++){// 1 is the position of the item you want 
				     Actions actions = new Actions(driver);
				     actions.sendKeys(Keys.DOWN).build().perform();
				     //Thread.sleep(3000);
				 	}
				}
				   
	 public void chooseCompany(){
				  Actions actions = new Actions(driver);
				  actions.sendKeys(Keys.ENTER).build().perform();//press enter
				 }
				
	 public void selectStartTime() throws InterruptedException{
				driver.findElement(drpdown_StartTime).click();//click on that combo
				for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
					 Actions actions = new Actions(driver);
					 actions.sendKeys(Keys.DOWN).build().perform();
					 Thread.sleep(3000);
					}
				 }
					   
	 public void chooseStartTime(){
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.ENTER).build().perform();//press enter
				 }
					
	 public void selectEndTime() throws InterruptedException{
				driver.findElement(drpdown_EndTime).click();//click on that combo
				for(int i = 0; i <= 1; i++){// 1 is the position of the element which you want 
					Actions actions = new Actions(driver);
					actions.sendKeys(Keys.DOWN).build().perform();
					Thread.sleep(3000);
					}
				 }
						   
	 public void chooseEndTime() throws InterruptedException{
					Actions actions = new Actions(driver);
					actions.sendKeys(Keys.ENTER).build().perform();//press enter
					Thread.sleep(3000);
				 }
						
	 public void selectAttProfile() throws InterruptedException{
				driver.findElement(drpdown_AttProfile).click();//click on that combo
				for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
					Actions actions = new Actions(driver);
					actions.sendKeys(Keys.DOWN).build().perform();
					Thread.sleep(3000);
					}
				}
							   
	 public void chooseAttProfile() throws InterruptedException{
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.ENTER).build().perform();//press enter
				Thread.sleep(2000);
			}
	 
	 public void clickSelectEmpButton() throws InterruptedException{
	        driver.findElement(button_SelectEmployee).click();
	        Thread.sleep(2000);
	        }
	
	 public void clickSelectAllButton() throws InterruptedException{
		 driver.findElement(button_SelectAllEmp).click();
	        Thread.sleep(2000);
	        }
	 
	 public void clickSubmitButton() throws InterruptedException{
		 driver.findElement(button_Submit).click();
	        Thread.sleep(2000);
	        }
	 
	 public void clickSaveButton() throws InterruptedException{
		 driver.findElement(button_Save).click();
	        Thread.sleep(2000);
	        }
}

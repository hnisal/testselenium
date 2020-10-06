package com.aviorsys.HRMS_pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

public class LeaveMgtIndivdualPage {
	
	WebDriver driver;
	


	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_timeAttendance = By.xpath("/html/body/div[3]/div[1]/div/ul/li[5]/a");
	By button_leaveMgt = By.xpath("//*[@id=\"time_n_att\"]/li/a[3]");
	By button_IndividualTab = By.xpath("//*[@id=\"individual_tab_1\"]");
	By textfield_NameEpf = By.xpath("//*[@id=\"indiEmpRefName\"]");
	By drpdown_NameEpf = By.xpath("//*[@id=\"eac-container-indiEmpRefName\"]/ul/li");
	By autofilledtextfield_Company = By.xpath("//*[@id=\"indiComp\"]");
	By autofilledtextfield_Division = By.xpath("//*[@id=\"indiComp\"]");
	By autofilledtextfield_Unit = By.xpath("//*[@id=\"indiUnit\"]");
	By default_drpdown_year = By.xpath("//*[@id=\"select2-chosen-20\"]");
	By drpdown_LeaveType = By.xpath("//*[@id=\"s2id_indleav_type\"]/a");
	By dropdonvalue_Annual = By.xpath("//*[@id=\"select2-results-21\"]");
	By drpdown_PrePost = By.xpath("//*[@id=\"s2id_indleav_prepost\"]/a");
	By dropdonvalue_Pre = By.xpath("//*[@id=\"select2-result-label-68\"]");
	By textfield_ReasonTask= By.xpath("//*[@id=\"indleave_Reason\"]");
	By calendar_FromDate = By.xpath("//*[@id=\"indstart_date\"]");
	By select_Date1 = By.xpath("");//select date from calendar
	By calendar_ToDate = By.xpath("//*[@id=\"indend_date\"]");
	By select_Date2 = By.xpath("");//select date from calendar
	By drpdown_StartTime = By.xpath("//*[@id=\"s2id_indleav_sTime\"]/a");
	By drpdown_EndTime = By.xpath("//*[@id=\"s2id_indleav_eTime\"]/a");
	By button_submit = By.xpath("//*[@id=\"btnIndSave\"]");
	By autofilledtextfield_NoDays = By.xpath("//*[@id=\"indno_of_days\"]");
	By toastmsg_Body = By.className("toast-message");
	//By autofilledtextfield_NoDays = 
	
	public LeaveMgtIndivdualPage(WebDriver driver){
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
	
	 public void clickIndividualTab() throws InterruptedException{
	        driver.findElement(button_IndividualTab).click();
	        Thread.sleep(2000);
	        }

	 public void enterEpfNoName(String strNameorEpf) throws InterruptedException{
	        driver.findElement(textfield_NameEpf).sendKeys(strNameorEpf);
	        Thread.sleep(8000);
	        }
	 
	 public void selectEpfNoName() throws InterruptedException{
	        driver.findElement(drpdown_NameEpf).click();
	        Thread.sleep(8000);
	        }
	 
	 public void verifyCompanyAppeareCorrect() throws InterruptedException{
			 //Thread.sleep(10000);
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			 String companyappeared= driver.findElement(autofilledtextfield_Company).getText();
			 Thread.sleep(5000);
			 //AssertJUnit.assertEquals(strcompany,companyappeared);
			 System.out.println(companyappeared+" is correct.Assert passed1");
			 AssertJUnit.assertEquals(companyappeared,"AITS");
			 System.out.println(companyappeared + " is correct.Assert passed2");

		        }
	 
	 public void verifyDivisionAppeareCorrect(String strdivision) throws InterruptedException{
			 //Thread.sleep(10000);
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			 String divisionappeared= driver.findElement(autofilledtextfield_Division).getText();
			 //AssertJUnit.assertEquals(strdivision,divisionappeared);
			 System.out.println(divisionappeared + " is correct.Assert passed");
			 AssertJUnit.assertEquals(divisionappeared,strdivision);
		        }
	 
	 public void verifyUnitAppeareCorrect(String strunit) throws InterruptedException{
			 //Thread.sleep(10000);
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			 String unitappeared= driver.findElement(autofilledtextfield_Division).getText();
			 AssertJUnit.assertEquals(unitappeared,strunit);
			 System.out.println(unitappeared + " is correct.Assert passed");
		        }
	 
	 public void verifyYearAppeareCorrect(String stryear) throws InterruptedException{
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			 String defaultyear= driver.findElement(default_drpdown_year).getText();
			 AssertJUnit.assertEquals(stryear,defaultyear);
			 System.out.println(defaultyear + " is correct.Assert passed");
		        } 
	 
	 public int selectLeaveType() throws InterruptedException{
		    driver.findElement(drpdown_LeaveType).click();//click on that combo
		     for(int i = 0; i <= 20; i++){
		         Actions actions = new Actions(driver);
		         actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
		         
		         if(i==20)
		         {
		         return i;
		         }
		        	 
		     }
			return 0;
		     }
		     
	 public void chooseLeaveType() throws InterruptedException{     
		         Actions actions = new Actions(driver);
		         actions.sendKeys(Keys.ENTER).build().perform();//press enter
		         System.out.println("i");
		         Thread.sleep(6000);
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
	 
	 /*public void choosePrePost() throws InterruptedException{
	        driver.findElement(dropdonvalue_Pre).click();
	        Thread.sleep(2000);
	        }*/ 
	 
	 public void enterReason(String strReason) throws InterruptedException{
	        driver.findElement(textfield_ReasonTask).sendKeys(strReason);
	        Thread.sleep(2000);
	        }  
	 
	 public void clearFromDate() throws InterruptedException{
		    WebElement fromdateBox = driver.findElement(calendar_FromDate);
		    fromdateBox.clear();
		    Thread.sleep(3000);
	 		}
	
     public void selectFromDate(String strdate){
		 	WebElement fromdateBox = driver.findElement(calendar_FromDate);
		 	fromdateBox.sendKeys(strdate);
	 }
     
     public void clearToDate() throws InterruptedException{
		    WebElement todateBox = driver.findElement(calendar_ToDate);
		    todateBox.clear();
		    Thread.sleep(3000);
	 		}
	
  public void selectToDate(String strcurrentdate){
		 	WebElement todateBox = driver.findElement(calendar_ToDate);
		 	todateBox.sendKeys(strcurrentdate);
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
			
			public void verifyAutofilledEditDisabledDays(){
				System.out.println("inside the method - verifyAutofilledEditDisabledDays");
				//String populatedState=driver.findElement(By.xpath("//*[@id=\"indno_of_days\"]")).getText();
				//AssertJUnit.assertEquals(populatedState, "1");
				System.out.println(driver.findElement(By.id("indno_of_days")).getText());
				                                                
			}
			
			public void clickSubmitButton() throws InterruptedException{
			        driver.findElement(button_submit).click();
			        Thread.sleep(2000);
			        }
			 
			public void catchToastrMessage(){
				String Toast_Message = driver.findElement(toastmsg_Body).getText();
				System.out.println("The toast message is : " +Toast_Message);
				 AssertJUnit.assertEquals(Toast_Message,"Leave for the selected employee has been successfully applied");
			 }
}

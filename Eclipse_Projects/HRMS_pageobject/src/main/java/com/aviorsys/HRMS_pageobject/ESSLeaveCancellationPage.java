package com.aviorsys.HRMS_pageobject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;

public class ESSLeaveCancellationPage {
	
	WebDriver driver;
	
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_myProfile = By.xpath("//*[@id=\"wrapper\"]/div[1]/div/ul/li[3]/a");
	By button_cancelLeave = By.xpath("/html/body/div[4]/div[1]/div/ul/li[3]/ul/li/a[2]");
	By header_cancelLeaveTitle = By.cssSelector("div.panel-heading:nth-child(1) > div:nth-child(1) > h6:nth-child(1)");
	By calendar_fromDate = By.id("dateFrom");
	By calendar_toDate = By.id("dateTo");
	By dropdown_leaveStatus = By.cssSelector(".select2-choice");
	By button_loadCancelLeave = By.id("btn_loadLeave");
	By table_leaveRecords = By.cssSelector(".dx-scrollable-content");
	By button_leaveEdit = By.id("viewDevice");
	By header_cancelLeavePopUp = By.xpath("/html/body/div[4]/div[2]/div/div[1]/form/div/div/div[1]/div/div[1]/h6");
	By unchangebletextfield_leaveType = By.id("leave_type");
	By unchangebletextfield_year = By.id("year");
	By unchangebletextfield_startDate = By.id("start_date");
	By unchangebletextfield_startTime = By.id("start_time");
	By unchangebletextfield_endDate = By.id("end_date");
	By unchangebletextfield_endTime = By.id("end_time");
	By unchangebletextfield_totalDays = By.id("total_no_of_days");
	By unchangebletextfield_coveringPerson = By.id("covering_person");
	By unchangebletextfield_confirmationOfficer = By.id("confirmation_officer");
	By unchangebletextfield_reason = By.id("reason");
	By unchangebletextfield_approvalOfficer = By.id("approval_officer");
	By unchangebletextfield_cancellationReason = By.id("cancelReason");
	By unchangebletextfield_keyOfficer = By.id("keyRepoOfficer");
	By buttonbelow_cancelLeave = By.id("btnCancelAppr");
	By toastmsg_Body = By.className("toast-message");
	
	public ESSLeaveCancellationPage(WebDriver driver) {
		this.driver = driver;
		}
	
	 public void clickNavigationExpand() throws InterruptedException{
		 Thread.sleep(3000);
	        driver.findElement(button_navigationExpand).click();
	        Thread.sleep(4000);
	 	}
	 
	 public void clickMyProfile() {
		 driver.findElement(button_myProfile).click();
	 	}
	 
	 public void clickCancelLeave() {
		 driver.findElement(button_cancelLeave).click();
	 	}

	 public void verifyLeavecancelationInterfaceHeader(String strleavecancellationHeader) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
		 String LeavecancellationHeader= driver.findElement(header_cancelLeaveTitle).getText();
		 AssertJUnit.assertEquals(strleavecancellationHeader,LeavecancellationHeader);
		 System.out.println(LeavecancellationHeader + " is correct.Assert passed");
	    } 
	 
	 public void enterFromDate(String strfromdate){
		 	WebElement fromdateBox = driver.findElement(calendar_fromDate);
		 	fromdateBox.sendKeys(strfromdate);
	 	}
	 
	 public void enterToDate(String strtodate){
		 	WebElement todateBox = driver.findElement(calendar_toDate);
		 	todateBox.sendKeys(strtodate);
	 	}
	 
	 public void selectLeaveStatus() throws InterruptedException{
		 driver.findElement(dropdown_leaveStatus).click();//click on that combo
		 for(int i = 0; i <= 2; i++){// 1 is the position of the element which you want 
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(1000);
		 	}
		 }
		   
	 public void chooseLeaveStatus(){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.ENTER).build().perform();//press enter
		 }
	 
	 public void clickLoad() throws InterruptedException {
		 driver.findElement(button_loadCancelLeave).click();
		 Thread.sleep(4000);
	 	}
	 
	 public void getTableValues() throws InterruptedException{
			Thread.sleep(6000);
			String Noofrecords= driver.findElement(table_leaveRecords).getText();
			System.out.println(Noofrecords);
		}
	
	 public void clickEdit() throws InterruptedException {
		 driver.findElement(button_leaveEdit).click();
		 Thread.sleep(5000);
	 	}
	 
	 public void verifyLeavecancelationPopupHeader(String strleavecancelpopupHeader) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
		 String LeavecancelPouupHeader= driver.findElement(header_cancelLeavePopUp).getText();
		 AssertJUnit.assertEquals(strleavecancelpopupHeader,LeavecancelPouupHeader);
		 System.out.println(LeavecancelPouupHeader + " is correct.Assert passed");
	    }
	 
	 public void verifyLeaveTypeone() throws InterruptedException{
	// driver.findElement(unchangebletextfield_leaveType).click();              
	 //String text=driver.findElement(By.id("unchangebletextfield_leaveType")).getText();
		 String text=driver.findElement(unchangebletextfield_leaveType).getAttribute("value");
		 System.out.println(text);}
	 
	 public void verifyLeaveType(String strleavetype) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		 String LeaveType= driver.findElement(unchangebletextfield_leaveType).getAttribute("value");
		 AssertJUnit.assertEquals(strleavetype,LeaveType);
		 System.out.println(LeaveType + " is correct.Assert passed");
	    }
	 
	 public void verifyYear(String stryear) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		 String Year= driver.findElement(unchangebletextfield_year).getAttribute("value");
		 AssertJUnit.assertEquals(stryear,Year);
		 System.out.println(Year + " is correct.Assert passed");
	    }
	 
	 public void verifyStartDate(String strstartDate) throws InterruptedException{
		 String StartDate=driver.findElement(unchangebletextfield_startDate).getAttribute("value");
		 AssertJUnit.assertEquals(strstartDate,StartDate);
		 System.out.println(StartDate + " is correct.Assert passed");
	    }
	 
	 public void verifyStartTime(String strstartTime){
		 String StartTime=driver.findElement(unchangebletextfield_startTime).getAttribute("value");
		 AssertJUnit.assertEquals(strstartTime,StartTime);
		 System.out.println(StartTime + " is correct.Assert passed");
	    }
	 
	 public void verifyEndDate(String strendDate){
		 String EndDate=driver.findElement(unchangebletextfield_endDate).getAttribute("value");
		 AssertJUnit.assertEquals(strendDate,EndDate);
		 System.out.println(EndDate + " is correct.Assert passed");
	    }
	 
	 public void verifyEndTime(String strendTime) {
		 String EndTime=driver.findElement(unchangebletextfield_endTime).getAttribute("value");
		 AssertJUnit.assertEquals(strendTime,EndTime);
		 System.out.println(EndTime + " is correct.Assert passed");
	    }
	 
	 public void verifyTotalDays(String strtotalDays) {
		 String TotalDays=driver.findElement(unchangebletextfield_totalDays).getAttribute("value");
		 AssertJUnit.assertEquals(strtotalDays,TotalDays);
		 System.out.println(TotalDays + " is correct.Assert passed");
	    }

	 public void verifyCoverPerson(){
		 String CoverPerson= driver.findElement(unchangebletextfield_coveringPerson).getAttribute("Value");
		 //AssertJUnit.assertEquals(strcoverPerson,CoverPerson);
		 System.out.println(CoverPerson);
	    }
	 
	 public void verifyConfirmOfficer(String strconfirmPerson){
		 String ConfirmOfficer=driver.findElement(unchangebletextfield_confirmationOfficer).getAttribute("Value");
		 AssertJUnit.assertEquals(strconfirmPerson,ConfirmOfficer);
		 System.out.println(ConfirmOfficer + " is correct.Assert passed");
	    }
	 
	 public void verifyReason(String strreason) throws InterruptedException{
		 String Reason=driver.findElement(unchangebletextfield_reason).getAttribute("value");
		 AssertJUnit.assertEquals(strreason,Reason);
		 System.out.println(Reason + " is correct.Assert passed");
	    }
	 
	 public void verifyApprovOfficer(String strapprovOfficer) {
		 String ApprovOfficer=driver.findElement(unchangebletextfield_approvalOfficer).getAttribute("value");
		 AssertJUnit.assertEquals(strapprovOfficer,ApprovOfficer);
		 System.out.println(ApprovOfficer + " is correct.Assert passed");
	    }
	 
	 public void enterCancelReason(String strcancelreason){
		 	driver.findElement(unchangebletextfield_cancellationReason).sendKeys(strcancelreason);
	 	}
	 
	 public void verifyKeyOfficer(String strkeyOfficer){
		 String KeyOfficer=driver.findElement(unchangebletextfield_keyOfficer).getAttribute("value");
		 AssertJUnit.assertEquals(strkeyOfficer,KeyOfficer);
		 System.out.println(KeyOfficer + " is correct.Assert passed");
	    }
	 
	 public void clickBelowCancelLeave() {
		 driver.findElement(buttonbelow_cancelLeave).click();
	 	}
	
	 public void catchToastrMessage(String strtoastmsg){
		String Toast_Message = driver.findElement(toastmsg_Body).getText();
		System.out.println("The toast message is : " +Toast_Message);
		AssertJUnit.assertEquals(strtoastmsg,Toast_Message);
		}
	
}

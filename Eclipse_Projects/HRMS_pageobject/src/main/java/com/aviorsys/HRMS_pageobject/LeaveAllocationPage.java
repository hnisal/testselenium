package com.aviorsys.HRMS_pageobject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LeaveAllocationPage {
	
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	Actions actions;
	
	
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_timeAttendance = By.xpath("/html/body/div[3]/div[1]/div/ul/li[5]/a");
	By button_leaveAllocation = By.xpath("//*[@id=\"time_n_att\"]/li/a[2]");
	By textfield_epfNo = By.xpath("//*[@id=\"Epfno\"]");
	By autofilledtextfield_name = By.xpath("//*[@id=\"Name\"]");
	By autofilledtextfield_company = By.xpath("//*[@id=\"Company\"]");
	By autofilledtextfield_unit = By.xpath("//*[@id=\"Unit\"]");
	By autofilledtextfield_payrollProfile = By.xpath("//*[@id=\"PayrollProf\"]");
	By textfield_annualLeave = By.xpath("//*[@id=\"dxDataGridLeaveAllocation\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]");
	By button_save = By.xpath("//*[@id=\"dxDataGridLeaveAllocation\"]/div/div[4]/div/div/div[3]/div[1]/div");
	By button_submit = By.xpath("//*[@id=\"btn-save-leave-allocation\"]");
	By toast_msg = By.id("toast-container");
	By table_row = By.xpath("//*[@id=\"dxDataGridLeaveAllocation\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]");
	By toastmsg_Body = By.className("toast-message");
	
	public LeaveAllocationPage(WebDriver driver){
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
	 
	public void clickLeaveallocation(){
	    driver.findElement(button_leaveAllocation).click();
	    }
	 
	 public void selectEPFOption(String strtextToSelect) throws InterruptedException {
		 driver.findElement(textfield_epfNo).sendKeys(strtextToSelect);
		 Thread.sleep(10000);
		 driver.findElement(textfield_epfNo).sendKeys(Keys.ENTER);
		 Thread.sleep(10000);
	 	}
	 
	 public void verifyEmployeeNameAppeared(String strNameoftheEPFSearched) throws InterruptedException{
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String Labelname= driver.findElement(autofilledtextfield_name).getAttribute("value");
			System.out.println(Labelname);
			AssertJUnit.assertEquals(strNameoftheEPFSearched, Labelname);
			System.out.println("Expected - "+strNameoftheEPFSearched);
			System.out.println("Actual - "+Labelname);
			System.out.println("Name - Assert passed");       
			System.out.println("=================================================");
	 	}
	 
	 public void verifyEmployeeCompanyAppeared(String strCompanyoftheEPFSearched) throws InterruptedException{
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String LabelCompany= driver.findElement(autofilledtextfield_company).getAttribute("value");
			System.out.println(LabelCompany);
			AssertJUnit.assertEquals(strCompanyoftheEPFSearched, LabelCompany);
			System.out.println("Expected - "+strCompanyoftheEPFSearched);
			System.out.println("Actual - "+LabelCompany);
			System.out.println("Company - Assert passed");       
			System.out.println("=================================================");
		 }
	 
	 public void verifyEmployeeUnitAppeared(String strUnitoftheEPFSearched) throws InterruptedException{
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String LabelUnit= driver.findElement(autofilledtextfield_unit).getAttribute("value");
			System.out.println(LabelUnit);
			AssertJUnit.assertEquals(strUnitoftheEPFSearched, LabelUnit);
			System.out.println("Expected - "+strUnitoftheEPFSearched);
			System.out.println("Actual - "+LabelUnit);
			System.out.println("Unit - Assert passed");       
			System.out.println("=================================================");
		 }
	 
	 public void verifyEmployeeParollProfileAppeared(String strPayrolloftheEPFSearched) throws InterruptedException{
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String LabelPayrollProfile= driver.findElement(autofilledtextfield_payrollProfile).getAttribute("value");
			System.out.println(LabelPayrollProfile);
			AssertJUnit.assertEquals(strPayrolloftheEPFSearched, LabelPayrollProfile);
			System.out.println("Expected - "+strPayrolloftheEPFSearched);
			System.out.println("Actual - "+LabelPayrollProfile);
			System.out.println("Payroll Profile - Assert passed");       
			System.out.println("=================================================");
		}
	 
	 public void clearAnnualLeave() throws InterruptedException{
		 String x = driver.findElement(textfield_annualLeave).getText();
		 System.out.println(x);
		 driver.findElement(textfield_annualLeave).click();
		 Thread.sleep(4000);
		 //driver.findElement(textfield_annualLeave).click();

		 Actions action = new Actions(driver);
		 WebElement link =driver.findElement(textfield_annualLeave);
		 action.doubleClick(link).perform();
		 Thread.sleep(4000);
		 //WebElement link =driver.findElement(textfield_annualLeave);
		 //action.doubleClick(link).perform();
		 //Thread.sleep(4000);
		//Actions actions = new Actions(driver);
		// WebElement linkb =driver.findElement(textfield_annualLeave);
		 link.sendKeys("20");
		/* actions.doubleClick(linkb).perform();
		 driver.findElement(textfield_annualLeave).sendKeys(Keys.DELETE);*/
		 Thread.sleep(8000);
	 	}

	 public void enterAnnualLeave(String strannualLeaveValue){
		 driver.findElement(textfield_annualLeave).sendKeys(strannualLeaveValue);
		 System.out.println(strannualLeaveValue);
	 	}
	 
	 public void saveAnnualLeave() throws InterruptedException{
		 driver.findElement(button_save).click();
		 Thread.sleep(3000);
		 driver.findElement(button_save).click();
	 	}
	 
	 public void clickSubmittoSave() throws InterruptedException{
		 driver.findElement(button_submit).click();
		 Thread.sleep(4000);
	 	} 
		 
	public void verifyAnnualLeaveMaximum(String strwaningmsgAnnual) throws InterruptedException{
		String Toast_Message_Annual_Leave_Maximum = driver.findElement(toastmsg_Body).getText();
		System.out.println(Toast_Message_Annual_Leave_Maximum);
		AssertJUnit.assertEquals(strwaningmsgAnnual,Toast_Message_Annual_Leave_Maximum);
		System.out.println("Expected - "+strwaningmsgAnnual);
		System.out.println("Actual - "+Toast_Message_Annual_Leave_Maximum);
		System.out.println("Warinig message if Annual leave > 14 - Assert passed");
		Thread.sleep(5000);
		}
		
		  //String expect="The maximum number of leaves allowed to allocate for annual leaves is 14";
	 
}

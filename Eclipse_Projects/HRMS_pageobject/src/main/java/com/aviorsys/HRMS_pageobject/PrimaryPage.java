package com.aviorsys.HRMS_pageobject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

import java.util.Scanner;


public class PrimaryPage {

	WebDriver driver;
	PrimaryPage HRMSDashboard;
	
	
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_employeeProfile = By.xpath("/html/body/div[3]/div[1]/div/ul/li[4]/a/div[1]");
	By button_createNew = By.xpath("//*[@id=\"emp_prof\"]/li/a[1]");
	By drpdwn_identificationType = By.xpath("//*[@id=\"s2id_identificationType\"]/a");
	By calendar_birthDay = By.xpath("//*[@id=\"dateOfBirth\"]");
	By textfield_identificationNumber = By.xpath("//*[@id=\"identificationNumber\"]");
	By drpdwn_gender = By.xpath("//*[@id=\"s2id_gender\"]/a");
	By textfield_initials = By.xpath("//*[@id=\"priInitials\"]");
	By drpdwn_titleType = By.xpath("//*[@id=\"s2id_title\"]/a");
	By textfield_firstName = By.xpath("//*[@id=\"firstName\"]");
	By textfield_middleName = By.xpath("//*[@id=\"middleName\"]");
	By textfield_LastName = By.xpath("//*[@id=\"lastName\"]");
	By textfield_fullName = By.xpath("//*[@id=\"fullName\"]");
	By unchangeble_group = By.xpath("//*[@id=\"group\"]");
	By drpdwn_companyName = By.id("select2-chosen-5");
	By drpdwn_complexName = By.xpath("//*[@id=\"s2id_complex\"]/a");
	By drpdwn_employeeType = By.xpath("//*[@id=\"s2id_employeeType\"]/a");
	By drpdwn_confirmationPeriod = By.xpath("//*[@id=\"s2id_confirmPeriod\"]/a");
	By autofilledtextfield_ePFNo = By.xpath("//*[@id=\"epfNumber\"]");
	By autofilledtextfield_referenceNo = By.xpath("//*[@id=\"employeeReferenceNo\"]");
	By textfield_cardID = By.xpath("//*[@id=\"employeeCardID\"]");
	By drpdwn_attendanceProfile = By.xpath("//*[@id=\"s2id_attendanceProfile\"]/a");
	By calendar_appointmentDate = By.id("appointmentDate");
	By unchangeble_profileCreatedDate = By.xpath("//*[@id=\"profileCreatedDate\"]");
	By button_save = By.xpath("//*[@id=\"save\"]");
	By toastmsg_Body = By.className("toast-message");
	By unchangeble_employeeList = By.xpath("//*[@id=\"recent-employees\"]");
	
	public PrimaryPage (WebDriver driver){
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
	 
	 public void selectIdentificationType() throws InterruptedException{
		 driver.findElement(drpdwn_identificationType).click();//click on that combo
		 for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(3000);
		 	}
		 }
		   
		public void chooseIdentificationType(){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.ENTER).build().perform();//press enter
		 }
	 
	 public void enterIdentificationNumber(String strNIColdNo) throws InterruptedException{
		 driver.findElement(textfield_identificationNumber).sendKeys(strNIColdNo);
		 Actions actions = new Actions(driver);
	     actions.sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(5000);
	 }
	 
	 
	 public void verifyGender(String strgender) throws InterruptedException{
			 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			 String Labelgender= driver.findElement(drpdwn_gender).getText();
			 AssertJUnit.assertEquals(Labelgender,strgender);
			 System.out.println("The Generated Value is :"+Labelgender);
			 System.out.println("Expected value : "+strgender);
			 System.out.println("Actual value : "+Labelgender);
			 System.out.println("gender - Assert pass");
		        }
	 
	 public void verifyBirthday(String strbirthday) throws InterruptedException{
			 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			 String Labeldate= driver.findElement(calendar_birthDay).getAttribute("value");
			 System.out.println("The Generated Value is : "+Labeldate);
			 AssertJUnit.assertEquals(Labeldate,strbirthday);
			 System.out.println("Expected value : "+strbirthday);
			 System.out.println("Actual value : "+Labeldate);
			 System.out.println("Birthday - Assert pass");
		        }
 
	 
	 public void enterInitials(String strInitials){
		 driver.findElement(textfield_initials).sendKeys(strInitials);
	 }
	 
	 public void selectTitle() throws InterruptedException{
		 driver.findElement(drpdwn_titleType).click();
		 Thread.sleep(1000);
		 for(int i = 0; i <= 2; i++){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(3000);
		 	}
		 }
	 
	 public void chooseTitle(){
	     Actions actions = new Actions(driver);
	     actions.sendKeys(Keys.ENTER).build().perform();
	 }
	
	 public void enterFirstName(String strFirstName){
		 driver.findElement(textfield_firstName).sendKeys(strFirstName);
	 }
	 
	 public void enterMiddleName(String strMidName){
		 driver.findElement(textfield_middleName).sendKeys(strMidName);
	 }
	 
	 public void enterLastName(String strLastName){
		 driver.findElement(textfield_LastName).sendKeys(strLastName);
	 }
	 
	 public void enterFullName(String strFullName){
		 driver.findElement(textfield_fullName).sendKeys(strFullName);
	 }
	 
	 public void verifyGroup(String strGroup) throws InterruptedException{
			 driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
			 String Labelgroup = driver.findElement(unchangeble_group).getAttribute("value");
			 System.out.println("The Generated Value is : "+Labelgroup);
			 AssertJUnit.assertEquals(strGroup,Labelgroup);
			 System.out.println("Expected value : "+strGroup);
			 System.out.println("Actual value : "+Labelgroup);
			 System.out.println("Group - Assert pass");
		        }
	 
	 public void scrollDown() throws InterruptedException{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,-10000)", "");
         Thread.sleep(3000);
	 }
	 
	 public void selectCompany() throws InterruptedException{
		 driver.findElement(drpdwn_companyName).click();
		 Thread.sleep(2000);
		 for(int i = 0; i <= 4; i++){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(3000);
		 	}
		 }
		   
		public void chooseCompany(){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.ENTER).build().perform();
		 }
	 
	 public void selectComplex() throws InterruptedException{
		 driver.findElement(drpdwn_complexName).click();
		 Thread.sleep(1000);
		 for(int i =1; i <= 1; i++){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(2000);
		 	}
		 }
	 
	 public void chooseComplex(){
	     Actions actions = new Actions(driver);
	     actions.sendKeys(Keys.ENTER).build().perform();
	 }
	 
	 public void selectEmployeeType() throws InterruptedException{
		 driver.findElement(drpdwn_employeeType).click();
		 for(int i = 0; i <= 0; i++){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(1000);
		 	}
		 }
	 
	 public void chooseEmployeeType() throws InterruptedException{
	     Actions actions = new Actions(driver);
	     actions.sendKeys(Keys.ENTER).build().perform();
	     Thread.sleep(4000);
	 }
	 
	 public void selectConfirmationPeriod() throws InterruptedException{
		 driver.findElement(drpdwn_confirmationPeriod).click();
		 for(int i =-1; i <= 0; i++){
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(2000);
		 	}
		 }
	 
	 public void chooseConfirmationPeriod() throws InterruptedException{
	     Actions actions = new Actions(driver);
	     actions.sendKeys(Keys.ENTER).build().perform();
	     Thread.sleep(4000);
	 } 
	 
	 public void verifyEPfNo() throws InterruptedException{
		 Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			String LabelEpf= driver.findElement(autofilledtextfield_ePFNo).getAttribute("value");
			System.out.println("Gnerated EPF No : "+LabelEpf);
		       }
	 
	 public void verifyReference(String strRefNo) throws InterruptedException{
			 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			 String Labeltext= driver.findElement(autofilledtextfield_ePFNo).getText();
			 AssertJUnit.assertEquals(strRefNo, Labeltext);
			 System.out.println("Assert passed");
		        }
	 
	 
	 public void enterEmployeeCardID(String strCardID){
		 driver.findElement(textfield_cardID).sendKeys(strCardID);
	 		}
	
	 public void selectAttendanceProfile() throws InterruptedException{
		 driver.findElement(drpdwn_attendanceProfile).click();
		 for(int i = 0; i <= 0; i++){ 
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.DOWN).build().perform();
		     Thread.sleep(3000);
		 	}
		 }
		   
	public void chooseAttendanceProfile() throws InterruptedException{
		     Actions actions = new Actions(driver);
		     actions.sendKeys(Keys.ENTER).build().perform();
		     Thread.sleep(4000);
		 }
	 
	public void clearAppointmentDate() throws InterruptedException{
		//((JavascriptExecutor)driver).executeScript ("document.getElementById('fromDate').removeAttribute('readonly',0);"); // Enables the from date box
		    WebElement DateBox = driver.findElement(calendar_appointmentDate);
		    DateBox.clear();
		    System.out.println("Displayed Date is "+DateBox);
		    Thread.sleep(3000);
	 		}
	
	public void selectAppointmentDate(String strenteredtdate){
		 	WebElement DateBox = driver.findElement(calendar_appointmentDate);
		 	DateBox.sendKeys(strenteredtdate);
		 	System.out.println("Entered Date is "+DateBox);
	 }
	
	public void verifyProfileCreatedDate() throws InterruptedException{
		 Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			String CreatedDate= driver.findElement(unchangeble_profileCreatedDate).getAttribute("value");
			System.out.println("Displayed Profile Created Date : "+CreatedDate);
		       }
	
	public void clickSaveButton() throws InterruptedException{
        driver.findElement(button_save).click();
        Thread.sleep(2000);
        }
	
	public void catchToastrMessage() throws InterruptedException{
		String Toast_Message_Primary_Success_Save = driver.findElement(toastmsg_Body).getText();
		System.out.println("The toast message is : " +Toast_Message_Primary_Success_Save);
		 AssertJUnit.assertEquals(Toast_Message_Primary_Success_Save,"Employee profile has been successfully created");
		 Thread.sleep(8000);
	 }
	
}

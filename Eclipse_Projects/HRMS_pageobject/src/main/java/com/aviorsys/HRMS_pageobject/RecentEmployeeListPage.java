package com.aviorsys.HRMS_pageobject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;

public class RecentEmployeeListPage {
	
	WebDriver driver;
	RecentEmployeeListPage ToPersonalPage;
	
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_employeeProfile = By.xpath("/html/body/div[3]/div[1]/div/ul/li[4]/a/div[1]");
	By button_createNew = By.xpath("//*[@id=\"emp_prof\"]/li/a[1]");
	By valuelist_recentEmployees = By.id("recent-employees");
	By linkbutton_name = By.id("1710");
	By default_Name = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[3]/div[1]/div/div[1]/h5");
	By header_employeeName = By.id("uiEmpUserName");
	By button_collapsiblePersonal = By.xpath("//*[@id=\"heading_10\"]/h4/a");
	By textfield_initials = By.id("initials");
	By drpdown_title = By.id("s2id_titles");
	By textfield_firstName = By.id("firstName");
	By textfield_middleName = By.id("middleName");
	By textfield_lastName = By.id("lastName");
	By textfield_fullName = By.id("fullName");
	By drpdown_gender = By.id("s2id_empGender");
	By calendar_dateofBirth = By.id("dateOfBirth");
	By button_collapsibleIdentificationInfo = By.xpath("//*[@id=\"accordion_3\"]/div[2]/div[1]/h4/a");
	By textfield_nicNumber = By.id("nicNumber");
	
	public RecentEmployeeListPage(WebDriver driver) {
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
	 
	 public void verifyRecentEmployeeListContainTenEmployees(){
		 WebElement table = driver.findElement(valuelist_recentEmployees);
		 List<WebElement> row = table.findElements(By.id("myLink"));
			System.out.println("Total Number of Employees = " + row.size());
	 }
	 
	 public void verifyRecentEmployeeListContent(){	
		WebElement table = driver.findElement(valuelist_recentEmployees);
		List<WebElement> row = table.findElements(By.className("row"));	
			System.out.println("----------------------------------------");
			//Print content of Rows
			for (int i=0;i<=row.size()-1 ;i++){
				System.out.println(row.get(i).getText());
			}
	 }
	 
	 public void clickNewlyEnteredEmployee(){
	     driver.findElement(linkbutton_name).click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }
	 
	 public void verifyPersonalTabdefaultHeader(String strpersonaltabheader) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelpersonaltabdefaultHeader= driver.findElement(default_Name).getText();
		 System.out.println("The Generated Value is :"+LabelpersonaltabdefaultHeader);
		 AssertJUnit.assertEquals(strpersonaltabheader,LabelpersonaltabdefaultHeader);
		 
		 System.out.println("Expected value : "+strpersonaltabheader);
		 System.out.println("Actual value : "+LabelpersonaltabdefaultHeader);
		 System.out.println("PersonalTab Default Header - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	        }
	 
	 public void verifyPersonalTabHeader(String strpersonaltabname) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS) ;
		 String Labelpersonaltab= driver.findElement(header_employeeName).getText();
		 System.out.println("The Generated Value is :"+Labelpersonaltab);
		 AssertJUnit.assertEquals(strpersonaltabname,Labelpersonaltab);
		 
		 System.out.println("Expected value : "+strpersonaltabname);
		 System.out.println("Actual value : "+Labelpersonaltab);
		 System.out.println("Personal Tab Header - Assert pass");
		 System.out.println("==========================================");
	        }
	 
	 public void verifyColapsibleHeader(String strfirstCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelfirstCol= driver.findElement(button_collapsiblePersonal).getText();
		 System.out.println("The Generated Value is :"+LabelfirstCol);
		 AssertJUnit.assertEquals(strfirstCol,LabelfirstCol);
		 
		 System.out.println("Expected value : "+strfirstCol);
		 System.out.println("Actual value : "+LabelfirstCol);
		 System.out.println("1st Colapsible - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	        }
	 
	 
	 public void verifyInitials(String strinitials) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String Labelinitials= driver.findElement(textfield_initials).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labelinitials);
		 AssertJUnit.assertEquals(strinitials,Labelinitials);
		 
		 System.out.println("Expected value : "+strinitials);
		 System.out.println("Actual value : "+Labelinitials);
		 System.out.println("Initials - Assert pass");
		 System.out.println("==========================================");
	        }
	 
	 public void verifyTitle(String strtitle) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labeltitle= driver.findElement(drpdown_title).getText();
		 System.out.println("The Generated Value is :"+Labeltitle);
		 AssertJUnit.assertEquals(strtitle,Labeltitle);
		 
		 System.out.println("Expected value : "+strtitle);
		 System.out.println("Actual value : "+Labeltitle);
		 System.out.println("Title - Assert pass");
		 System.out.println("==========================================");
	        } 
	 
	 public void verifyFirstName(String strfirstName) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labelfirstname= driver.findElement(textfield_firstName).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labelfirstname);
		 AssertJUnit.assertEquals(strfirstName,Labelfirstname);
		 
		 System.out.println("Expected value : "+strfirstName);
		 System.out.println("Actual value : "+Labelfirstname);
		 System.out.println("First Name - Assert pass");
		 System.out.println("==========================================");
	        } 
	 
	 public void verifyMiddleName(String strmiddleName) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labelmiddlename= driver.findElement(textfield_middleName).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labelmiddlename);
		 AssertJUnit.assertEquals(strmiddleName,Labelmiddlename);
		 
		 System.out.println("Expected value : "+strmiddleName);
		 System.out.println("Actual value : "+Labelmiddlename);
		 System.out.println("Middle Name - Assert pass");
		 System.out.println("==========================================");
	        }
	 
	 public void verifyLastName(String strlastName) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labellastname= driver.findElement(textfield_lastName).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labellastname);
		 AssertJUnit.assertEquals(strlastName,Labellastname);
		 
		 System.out.println("Expected value : "+strlastName);
		 System.out.println("Actual value : "+Labellastname);
		 System.out.println("Last Name - Assert pass");
		 System.out.println("==========================================");
	        }
	 
	 public void verifyFullName(String strfullName) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labelfullname= driver.findElement(textfield_fullName).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labelfullname);
		 AssertJUnit.assertEquals(strfullName,Labelfullname);
		 
		 System.out.println("Expected value : "+strfullName);
		 System.out.println("Actual value : "+Labelfullname);
		 System.out.println("Full Name - Assert pass");
		 System.out.println("==========================================");
	        }
	 
	 public void verifyGender(String strgender) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labelgender= driver.findElement(drpdown_gender).getText();
		 System.out.println("The Generated Value is :"+Labelgender);
		 AssertJUnit.assertEquals(strgender,Labelgender);
		 
		 System.out.println("Expected value : "+strgender);
		 System.out.println("Actual value : "+Labelgender);
		 System.out.println("Gender - Assert pass");
		 System.out.println("==========================================");
	        }
	 
	 public void verifyDateofBirth(String strbirthday) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labelbirthday= driver.findElement(calendar_dateofBirth).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labelbirthday);
		 AssertJUnit.assertEquals(strbirthday,Labelbirthday);
		 
		 System.out.println("Expected value : "+strbirthday);
		 System.out.println("Actual value : "+Labelbirthday);
		 System.out.println("Date of Birth - Assert pass");
		 System.out.println("==========================================");
	        }
	 
	 public void clickEmployeeIdentificationInfoCalapsible(){
	     driver.findElement(button_collapsibleIdentificationInfo).click();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        } 
	 
	 public void verifyIdentificationNo(String stridno) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String LabelidNo= driver.findElement(textfield_nicNumber).getAttribute("value");
		 System.out.println("The Generated Value is :"+LabelidNo);
		 AssertJUnit.assertEquals(stridno,LabelidNo);
		 
		 System.out.println("Expected value : "+stridno);
		 System.out.println("Actual value : "+LabelidNo);
		 System.out.println("Identification Information - Assert pass");
		 System.out.println("==========================================");
	        }
}

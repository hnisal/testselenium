package com.aviorsys.HRMS_pageobject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;

public class EmployeeWorkPage {
	
	WebDriver driver;
	EmployeeWorkPage ToEmployeeWorkPage;
	
	By textfield_universalSearch = By.xpath("//*[@id=\"homeSearchBar\"]");
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_employeeProfile = By.xpath("/html/body/div[3]/div[1]/div/ul/li[4]/a/div[1]");
	By button_createNew = By.xpath("//*[@id=\"emp_prof\"]/li/a[1]");
	By valuelist_recentEmployees = By.id("recent-employees");
	By linkbutton_name = By.id("1710");
	By default_Name = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[3]/div[1]/div/div[1]/h5");
	By header_employeeName = By.id("uiEmpUserName");
	By button_workTab = By.id("profile_work");
	By button_collapsibleOrganizational = By.xpath("//*[@id=\"accordion_2\"]/div[1]/div[1]/h4/a");
	By dropdown_division = By.xpath("//*[@id=\"s2id_wrk_division\"]/a");
	By dropdown_unit = By.xpath("//*[@id=\"s2id_wrk_unit\"]/a");
	By dropdown_location = By.xpath("//*[@id=\"s2id_wrk_location\"]/a");
	By dropdown_reportingOfficer = By.xpath("//*[@id=\"s2id_wrk_reportOfficer\"]/a");
	By dropdown_postReportingOfficer = By.xpath("//*[@id=\"s2id_wrk_postReportOfficer\"]/a");
	By calendar_effectiveDate =By.id("wrk_intComStartDate");
	//By default_Name = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[3]/div[1]/div/di
	By textfield_unchangableGroup = By.id("wrk_group");
	By textfield_unchangableCompany = By.xpath("//*[@id=\"s2id_wrk_company\"]/a");
	By dropdown_Complex = By.xpath("//*[@id=\"s2id_wrk_complex\"]/a");
	By calendar_unchangableComstartDate = By.id("wrk_comStartDate");
	By button_collapsibleEmpIdentificationinfo = By.xpath("//*[@id=\"accordion_2\"]/div[2]/div[1]/h4/a");
	By dropdown_empType = By.xpath("//*[@id=\"s2id_wrk_empType\"]/a");
	By dropdown_attProfile = By.xpath("//*[@id=\"s2id_wrk_attprof\"]/a");
	By textfield_abhNo = By.id("wrk_abhNo");
	By dropdown_abhStatus = By.xpath("//*[@id=\"s2id_wrk_abhStatus\"]/a");
	By textfield_unchangableEpfRefno = By.id("wrk_epfRefNo");
	By textfield_empCardno = By.id("wrk_empCardId");
	By button_collapsibleEmpPosition = By.xpath("//*[@id=\"accordion_2\"]/div[3]/div[1]/h4/a");
	By dropdown_jobCategory = By.xpath("//*[@id=\"s2id_wrk_empJobType\"]/a");
	By dropdown_designation = By.xpath("//*[@id=\"s2id_wrk_designation\"]/a");
	By dropdown_payrollCategory = By.xpath("//*[@id=\"s2id_wrk_payCateAct\"]/a");
	By dropdown_payrollProfile = By.xpath("//*[@id=\"s2id_wrk_payProf\"]/a");
	By dropdown_payrollUnit = By.xpath("//*[@id=\"s2id_wrk_payrollUnit\"]/a");
	By dropdown_grade = By.xpath("//*[@id=\"s2id_wrk_grade\"]/a");
	By dropdown_otCategory = By.xpath("//*[@id=\"s2id_wrk_ot_category\"]/a");
	By textfield_jobDescription =By.id("wrk_jobDescription");
	By button_collapsibleappointmentInfo = By.xpath("//*[@id=\"accordion_2\"]/div[4]/div[1]/h4/a");
	By calendar_unchangableAppointmentdate = By.id("wrk_DateOfApp");
	By calendar_unchangableConfirmationdate = By.id("wrk_confDate");
	By calendar_resignationDate = By.id("wrk_resigDate");
	By textfield_unchangableAppointmentdate = By.id("wrk_peOfEmployeement");
	By calendar_unchangableRetirementdate = By.id("wrk_retireDate");
	By dropdown_unchangableEmployeestatus = By.xpath("//*[@id=\"s2id_wrk_empStatus\"]/a");
	By button_collapsibleExperience = By.xpath("//*[@id=\"accordion_2\"]/div[5]/div[1]/h4/a");
	By textfield_companyName = By.id("wrk_expComName");
	By textfield_dureationYearup = By.xpath("//*[@id=\"collapseWrkFive\"]/div/div[1]/div[2]/div[2]/div[1]/div/span[2]/button[1]/i");
	By textfield_dureationYeardown = By.xpath("//*[@id=\"collapseWrkFive\"]/div/div[1]/div[2]/div[2]/div[1]/div/span[2]/button[2]/i");
	By textfield_dureationMonthup = By.xpath("//*[@id=\"collapseWrkFive\"]/div/div[1]/div[2]/div[2]/div[2]/div/span[2]/button[1]/i");
	By textfield_dureationMonthdown = By.xpath("//*[@id=\"collapseWrkFive\"]/div/div[1]/div[2]/div[2]/div[2]/div/span[2]/button[2]/i");
	By textfield_positionHeld = By.id("wrk_positionHeld");
	By textfield_otherRemarks = By.id("wrk_expRemarks");
	By button_add = By.id("saveEmpExpInfo");
	By button_save = By.id("saveWorkInfo");
	
	
	public EmployeeWorkPage(WebDriver driver) {
		this.driver = driver;
		}
	
	public void enterNewEPFforUniversalSearch(String strEpfno) throws InterruptedException{
		 driver.findElement(textfield_universalSearch).sendKeys(strEpfno);
		 Thread.sleep(6000);
		 driver.findElement(textfield_universalSearch).click();	
		 Thread.sleep(10000);
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
	
	public void clickNewlyEnteredEmployee(){
	     driver.findElement(linkbutton_name).click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     }
	
	public void verifyEmployeeProfileDefaultHeader(String strempprofileheader) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelempprofileHeader= driver.findElement(default_Name).getText();
		 System.out.println("The Generated Value is :"+LabelempprofileHeader);
		 AssertJUnit.assertEquals(strempprofileheader,LabelempprofileHeader);
		 
		 System.out.println("Expected value : "+strempprofileheader);
		 System.out.println("Actual value : "+LabelempprofileHeader);
		 System.out.println("Employee profile Default Header - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	        }
	
	public void verifyEmployeeProfileNameHeader(String strempprofileheadername) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelempprofileHeadername= driver.findElement(default_Name).getText();
		 System.out.println("The Generated Value is :"+LabelempprofileHeadername);
		 AssertJUnit.assertEquals(strempprofileheadername,LabelempprofileHeadername);
		 
		 System.out.println("Expected value : "+strempprofileheadername);
		 System.out.println("Actual value : "+LabelempprofileHeadername);
		 System.out.println("Employee Profile Default Header Name - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	        }
	
	public void clickWorkTab() throws InterruptedException{
	     driver.findElement(button_workTab).click();
	     Thread.sleep(6000);
	     }
	
	public void verifyColapsibleHeaderOrg(String strfirstCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelfirstCol= driver.findElement(button_collapsibleOrganizational).getText();
		 System.out.println("The Generated Value is :"+LabelfirstCol);
		 AssertJUnit.assertEquals(strfirstCol,LabelfirstCol);
		 
		 System.out.println("Expected value : "+strfirstCol);
		 System.out.println("Actual value : "+LabelfirstCol);
		 System.out.println("1st Colapsible - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	        }
	
	public void clickColapsibleHeaderOrganizational() throws InterruptedException{
	     driver.findElement(button_collapsibleOrganizational).click();
	     Thread.sleep(6000);
	     }
	
	public void verifyGroup(String strgroup) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String Labelgroup= driver.findElement(textfield_unchangableGroup).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labelgroup);
		 AssertJUnit.assertEquals(strgroup,Labelgroup);
		 
		 System.out.println("Expected value : "+strgroup);
		 System.out.println("Actual value : "+Labelgroup);
		 System.out.println("Group - Assert pass");
		 System.out.println("----------");
	        }
	
	public void verifyCompany(String strcompany) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelCompany= driver.findElement(textfield_unchangableCompany).getText();
		 System.out.println("The Generated Value is :"+LabelCompany);
		 AssertJUnit.assertEquals(strcompany,LabelCompany);
		 
		 System.out.println("Expected value : "+strcompany);
		 System.out.println("Actual value : "+LabelCompany);
		 System.out.println("Company - Assert pass");
		 System.out.println("----------");
	        }
	
	public void verifyComplex(String strcomplex) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelComplex= driver.findElement(dropdown_Complex).getText();
		 System.out.println("The Generated Value is :"+LabelComplex);
		 AssertJUnit.assertEquals(strcomplex,LabelComplex);
		 
		 System.out.println("Expected value : "+strcomplex);
		 System.out.println("Actual value : "+LabelComplex);
		 System.out.println("Complex - Assert pass");
		 System.out.println("----------");
	        }
	 
	public void verifyCompanyStartDate(String strcomstartdate) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelCompanystartdate= driver.findElement(calendar_unchangableComstartDate).getAttribute("value");
		 System.out.println("The Generated Value is :"+LabelCompanystartdate);
		 AssertJUnit.assertEquals(strcomstartdate,LabelCompanystartdate);
		 
		 System.out.println("Expected value : "+strcomstartdate);
		 System.out.println("Actual value : "+LabelCompanystartdate);
		 System.out.println("Company Start Date - Assert pass");
		 System.out.println("----------");
	        }
	
	public void selectDivision() throws InterruptedException{
		 driver.findElement(dropdown_division).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
			   
	public void chooseDivision(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectComplex() throws InterruptedException{
		 driver.findElement(dropdown_Complex).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
			   
	public void chooseComplex(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectUnit() throws InterruptedException{
		 driver.findElement(dropdown_unit).click();//click on that combo
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
	
	public void selectLocation() throws InterruptedException{
		 driver.findElement(dropdown_location).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
			   
	public void chooseLocation(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectReportingOfficer() throws InterruptedException{
		 driver.findElement(dropdown_reportingOfficer).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
			   
	public void chooseReportingOfficer(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectPostReportingOfficer() throws InterruptedException{
		 driver.findElement(dropdown_postReportingOfficer).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
			   
	public void choosePostReportingOfficer(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	 public void clearEffectiveDate() throws InterruptedException{
		  WebElement todateBox = driver.findElement(calendar_effectiveDate);
		  todateBox.clear();
		  Thread.sleep(3000);
	 	 }
	
	public void selectEffectiveDate(String strenddate){
		 WebElement todateBox = driver.findElement(calendar_effectiveDate);
		 todateBox.sendKeys(strenddate);
		 driver.findElement(calendar_effectiveDate).click();
		 }
	
	public void verifyColapsibleHeaderIdenti(String strSecondCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelsecondCol = driver.findElement(button_collapsibleEmpIdentificationinfo).getText();
		 System.out.println("The Generated Value is :"+LabelsecondCol);
		 AssertJUnit.assertEquals(strSecondCol,LabelsecondCol);
		 
		 System.out.println("Expected value : "+strSecondCol);
		 System.out.println("Actual value : "+LabelsecondCol);
		 System.out.println("2nd Colapsible - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	        }
	
	public void clickColapsibleHeaderIdentification(){
	     driver.findElement(button_collapsibleEmpIdentificationinfo).click();
	     }
	
	public void selectAttendanceProfile() throws InterruptedException{
		 driver.findElement(dropdown_attProfile).click();//click on that combo
			for(int i = 0; i <= 2; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
	   
	public void chooseAttendanceProfle(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void enterABHNo(String strABHno){
		 driver.findElement(textfield_abhNo).sendKeys(strABHno);
	 	  }
	
	public void selectABHStatus() throws InterruptedException{
		 driver.findElement(dropdown_abhStatus).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
	   
	public void chooseABHStatus(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
			
	public void verifyEmpType(String stremptype) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelEmptype= driver.findElement(dropdown_empType).getText();
		 System.out.println("The Generated Value is :"+LabelEmptype);
		 AssertJUnit.assertEquals(stremptype,LabelEmptype);
		 
		 System.out.println("Expected value : "+stremptype);
		 System.out.println("Actual value : "+LabelEmptype);
		 System.out.println("Employee Type - Assert pass");
		 System.out.println("----------");
	        }
	
	public void verifyAttProfile(String strattProfile) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String LabelAttprofile = driver.findElement(dropdown_attProfile).getText();
		System.out.println("The Generated Value is :"+LabelAttprofile);
		AssertJUnit.assertEquals(strattProfile,LabelAttprofile);
		 
		System.out.println("Expected value : "+strattProfile);
		System.out.println("Actual value : "+LabelAttprofile);
		System.out.println("Attendance Profile - Assert pass");
		System.out.println("----------");
	        }
	
	public void verifyEpfRefNo(String strepfrefNo) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String LabelEpfrefno = driver.findElement(textfield_unchangableEpfRefno).getAttribute("value");
		System.out.println("The Generated Value is :"+LabelEpfrefno);
		AssertJUnit.assertEquals(strepfrefNo,LabelEpfrefno);
		 
		System.out.println("Expected value : "+strepfrefNo);
		System.out.println("Actual value : "+LabelEpfrefno);
		System.out.println("EPF/Ref No - Assert pass");
		System.out.println("----------");
	        }
	
	public void verifyEmpCardID(String strcardID) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String LabelEmpcardid = driver.findElement(textfield_empCardno).getAttribute("value");
		System.out.println("The Generated Value is :"+LabelEmpcardid);
		AssertJUnit.assertEquals(strcardID,LabelEmpcardid);
		 
		System.out.println("Expected value : "+strcardID);
		System.out.println("Actual value : "+LabelEmpcardid);
		System.out.println("Employee Card ID - Assert pass");
		System.out.println("----------");
	        }
	
	public void verifyColapsibleHeaderEmployeePosition(String strThirdCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelthirdCol = driver.findElement(button_collapsibleEmpPosition).getText();
		 System.out.println("The Generated Value is :"+LabelthirdCol);
		 AssertJUnit.assertEquals(strThirdCol,LabelthirdCol);
		 
		 System.out.println("Expected value : "+strThirdCol);
		 System.out.println("Actual value : "+LabelthirdCol);
		 System.out.println("3rd Colapsible - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	        }
	
	public void clickColapsibleEmployeePosition(){
	     driver.findElement(button_collapsibleEmpPosition).click();
	     }
	
	public void selectJobCategory() throws InterruptedException{
		 driver.findElement(dropdown_jobCategory).click();//click on that combo
			for(int i = 0; i <= 6; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
	   
	public void chooseJobCategory(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectDesignation() throws InterruptedException{
		 driver.findElement(dropdown_designation).click();//click on that combo
			for(int i = 0; i <= 4; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
	   
	public void chooseDesignation(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectPayrollCategory() throws InterruptedException{
		 driver.findElement(dropdown_payrollCategory).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
	   
	public void choosePayrollCategory(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectPayrollProfile() throws InterruptedException{
		 driver.findElement(dropdown_payrollProfile).click();//click on that combo
			for(int i = 0; i <= 2; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
	   
	public void choosePayrollProfile(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectPayrollUnit() throws InterruptedException{
		 driver.findElement(dropdown_payrollUnit).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
	   
	public void choosePayrollUnit(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectPayrollGrade() throws InterruptedException{
		 driver.findElement(dropdown_grade).click();//click on that combo
			for(int i = 0; i <= 2; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
	   
	public void choosePayrollGrade(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectOvertimeCategory() throws InterruptedException{
		 driver.findElement(dropdown_otCategory).click();//click on that combo
			for(int i = 0; i <= 2; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	   }
	   
	public void chooseOvertimeCategory(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void enterJobDescription(String strjobDescription){
		 driver.findElement(textfield_jobDescription).sendKeys(strjobDescription);
	 	  }
	
	public void verifyColapsibleHeaderAppoint(String strForthCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelforthCol = driver.findElement(button_collapsibleappointmentInfo).getText();
		 System.out.println("The Generated Value is :"+LabelforthCol);
		 AssertJUnit.assertEquals(strForthCol,LabelforthCol);
		 
		 System.out.println("Expected value : "+strForthCol);
		 System.out.println("Actual value : "+LabelforthCol);
		 System.out.println("4th Colapsible - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	        }
	public void clickColapsibleHeaderAppointment(){
	     driver.findElement(button_collapsibleappointmentInfo).click();
	     }
	
	public void verifyDateofAppointment(String strdateofAppoint) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String LabelDateappoint = driver.findElement(calendar_unchangableAppointmentdate).getAttribute("value");
		System.out.println("The Generated Value is :"+LabelDateappoint);
		AssertJUnit.assertEquals(strdateofAppoint,LabelDateappoint);
		 
		System.out.println("Expected value : "+strdateofAppoint);
		System.out.println("Actual value : "+LabelDateappoint);
		System.out.println("Date of Appointment - Assert pass");
		System.out.println("----------");
	        }
	
	public void verifyConfirmationDate(String strConfordate) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String LabelConfordate = driver.findElement(calendar_unchangableConfirmationdate).getAttribute("value");
		System.out.println("The Generated Value is :"+LabelConfordate);
		AssertJUnit.assertEquals(strConfordate,LabelConfordate);
		 
		System.out.println("Expected value : "+strConfordate);
		System.out.println("Actual value : "+LabelConfordate);
		System.out.println("Confirmation Date - Assert pass");
		System.out.println("----------");
	        }
	
	public void verifyRetirementDate() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String LabelRetiredate = driver.findElement(calendar_unchangableRetirementdate).getAttribute("value");
		System.out.println("The Generated Value is :"+LabelRetiredate);
		System.out.println("Confirmation Date - "+LabelRetiredate);
		System.out.println("----------");
	        }
	
	public void verifyEmployeeStatus(String strEmpstatus) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String LabelEmpstatus = driver.findElement(dropdown_unchangableEmployeestatus).getText();
		System.out.println("The Generated Value is :"+LabelEmpstatus);
		AssertJUnit.assertEquals(strEmpstatus,LabelEmpstatus);
		 
		System.out.println("Expected value : "+strEmpstatus);
		System.out.println("Actual value : "+LabelEmpstatus);
		System.out.println("Employee Status - Assert pass");
		System.out.println("----------");
	        }
	
	public void verifyColapsibleHeaderExperience(String strfifthCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelfifthCol = driver.findElement(button_collapsibleExperience).getText();
		 System.out.println("The Generated Value is :"+LabelfifthCol);
		 AssertJUnit.assertEquals(strfifthCol,LabelfifthCol);
		 
		 System.out.println("Expected value : "+strfifthCol);
		 System.out.println("Actual value : "+LabelfifthCol);
		 System.out.println("5th Colapsible - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	        }
	public void clickColapsibleHeaderExperience(){
	     driver.findElement(button_collapsibleExperience).click();
	     }
	
	public void enterCompanyName(String strcompanyName){
		 driver.findElement(textfield_companyName).sendKeys(strcompanyName);
	 	  }
	
	public void clickYearUp(){
	     driver.findElement(textfield_dureationYearup).click();
	     driver.findElement(textfield_dureationYearup).click();
	     driver.findElement(textfield_dureationYearup).click();
	     }
	
	public void clickYearDown(){
	     driver.findElement(textfield_dureationYeardown).click();
	     }
	
	public void clickMonthUp() throws InterruptedException{
		for (int i = 0; i < 10; i++){
			 //click the button
			  driver.findElement(textfield_dureationMonthup).click();
			 //wait 2 seconds
			  Thread.sleep(2000);
			}
	     //driver.findElement(textfield_dureationMonthup).click();
	     }
	
	public void clickMonthDown(){
	     driver.findElement(textfield_dureationMonthdown).click();
	     driver.findElement(textfield_dureationMonthdown).click();
	     }
	
	public void enterPositionheld(String strpositionHeld){
		 driver.findElement(textfield_positionHeld).sendKeys(strpositionHeld);
	 	  }
	public void enterOtherRemarks(String strRemarks){
		 driver.findElement(textfield_otherRemarks).sendKeys(strRemarks);
	 	  }
	
	public void clickAdd(){
	     driver.findElement(button_add).click();
	     }
	
	public void clickSave(){
	     driver.findElement(button_save).click();
	     }
	
}

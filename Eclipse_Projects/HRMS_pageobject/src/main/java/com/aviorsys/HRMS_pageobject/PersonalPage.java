package com.aviorsys.HRMS_pageobject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;

public class PersonalPage {
	
	WebDriver driver;
	PersonalPage PersonalDetailPage;
	
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By textfield_universalSearch = By.xpath("//*[@id=\"homeSearchBar\"]");
	By default_Name = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[3]/div[1]/div/div[1]/h5");
	By header_employeeName = By.id("uiEmpUserName");
	//By button_collapsiblePersonal = By.xpath("//*[@id=\"heading_10\"]/h4/a");
	//By pannel_title = By.id("uiEmpUserName");
	By button_collapsiblePersonal = By.xpath("//*[@id=\"heading_10\"]/h4/a");
	By textfield_initials = By.id("initials");
	By drpdown_title = By.id("s2id_titles");
	By textfield_firstName = By.id("firstName");
	By textfield_middleName = By.id("middleName");
	By textfield_lastName = By.id("lastName");
	By textfield_fullName = By.id("fullName");
	By drpdown_gender = By.id("s2id_empGender");
	By calendar_dateofBirth = By.id("dateOfBirth");
	By drpdown_maritalStatus = By.xpath("//*[@id=\"s2id_maritalStatus\"]/a");
	By button_uploadPicure = By.id("empPicture");//choose file
	By button_collapsibleIdentificationInfo = By.xpath("//*[@id=\"accordion_3\"]/div[2]/div[1]/h4/a");
	By radiobutton_nicOld = By.id("TypeOfNicOld");
	By radiobutton_nicNew = By.id("TypeOfNicNew");
	By textfield_nicNumber = By.id("nicNumber");
	By button_collapsibleEthnicInfor = By.xpath("//*[@id=\"accordion_3\"]/div[3]/div[1]/h4/a");
	By drpdown_religion = By.xpath("//*[@id=\"s2id_religion\"]/a");
	By drpdown_race = By.xpath("//*[@id=\"s2id_raceGroups\"]/a");
	By drpdown_nationality = By.xpath("//*[@id=\"s2id_nationality\"]/a");
	By button_collapsibleHealthInfor = By.xpath("//*[@id=\"accordion_3\"]/div[4]/div[1]/h4/a");
	By button_save = By.id("saveEmpProf");
	
	
	public PersonalPage(WebDriver driver){
		this.driver = driver;
		}
	
	public void enterNewEPFforUniversalSearch(String strEpfno) throws InterruptedException{
		 driver.findElement(textfield_universalSearch).sendKeys(strEpfno);
		 Thread.sleep(6000);
		 driver.findElement(textfield_universalSearch).click();	
		 Thread.sleep(15000);
	 }
	 
	public void verifyPersonaldefaultHeader(String strpersonaltabheader) throws InterruptedException{
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
	 
	 public void verifyPersonalTabSearchedEmployeeHeader(String strpersonaltabname) throws InterruptedException{
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
	 
	 public void getEmployeeInitials(){
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String Labelinitials= driver.findElement(textfield_initials).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labelinitials);
	 		}
	 
	 public void getEmployeeTitle(){
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labeltitle= driver.findElement(drpdown_title).getText();
		 System.out.println("The Generated Value is :"+Labeltitle);
	 		}
	 
	 public void getFirstName() throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labelfirstname= driver.findElement(textfield_firstName).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labelfirstname);
	 	}
	 
	 public void getMiddleName() throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labelmiddlename= driver.findElement(textfield_middleName).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labelmiddlename); 
	 	}
	 
	 public void getLastName() throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labellastname= driver.findElement(textfield_lastName).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labellastname);
	 	}
	 
	 public void getFullName() throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labelfullname= driver.findElement(textfield_fullName).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labelfullname);
	 	}
	 
	 public void getGender() throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labelgender= driver.findElement(drpdown_gender).getText();
		 System.out.println("The Generated Value is :"+Labelgender);	 
	 	}
	
	 public void getDateofBirth() throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String Labelbirthday= driver.findElement(calendar_dateofBirth).getAttribute("value");
		 System.out.println("The Generated Value is :"+Labelbirthday);
	 	}
	 
	 public void scrollDown() throws InterruptedException{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,-10000)", "");
         Thread.sleep(3000);
	 }
	
	 public void selectMaritalStatus() throws InterruptedException{
		 driver.findElement(drpdown_maritalStatus).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	}
			   
	public void chooseMaritalStatus(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 }
	
	public void getMaritalStatus() throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String LabemaritalStatus= driver.findElement(drpdown_maritalStatus).getText();
		 System.out.println("The Generated Value is :"+LabemaritalStatus);
		 System.out.println("==========================================");
	 	}
	
	public void uploadIEmployeeEmage() throws InterruptedException{
		WebElement chooseFile = driver.findElement(button_uploadPicure);
		chooseFile.sendKeys("C:\\Users\\Anuradhika\\Pictures\\galle\\TestData.jpg");
		Thread.sleep(3000);
		}
	 
	 public void clickEmployeeIdentificationInfoCalapsible(){
	     driver.findElement(button_collapsibleIdentificationInfo).click();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    }
	 
	 public void verifyEmployeeIdentificationInfoCalapsible(String strsecondCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelsecondCol= driver.findElement(button_collapsibleIdentificationInfo).getText();
		 System.out.println("The Generated Value is :"+LabelsecondCol);
		 AssertJUnit.assertEquals(strsecondCol,LabelsecondCol);
		 
		 System.out.println("Expected value : "+strsecondCol);
		 System.out.println("Actual value : "+LabelsecondCol);
		 System.out.println("2nd Colapsible - Assert pass");
		 System.out.println("-------------");
		 Thread.sleep(8000);
	        }
	 
	 public void checkEmployeeIdentificationTypeNew() throws InterruptedException{
		 List<WebElement> radio = driver.findElements(radiobutton_nicNew);
		 radio.get(0).getAttribute("checked");
		     System.out.println("NIC(New) Radio Button selected");
		 }
	 
	 public void checkEmployeeIdentificationTypeOld() throws InterruptedException{
		 String strnicoldSelect = driver.findElement(radiobutton_nicOld).getAttribute("checked");
		 if (strnicoldSelect.equalsIgnoreCase("true"))
		 	{
		     System.out.println("NIC(Old) Radio Button selected");
		 	}
	 	 }
	 
	 public void getIdentificationNo() throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String LabelidNo= driver.findElement(textfield_nicNumber).getAttribute("value");
		 System.out.println("The Generated Value is :"+LabelidNo);
		 System.out.println("==========================================");
	 	}
	 
	 public void clickEmployeeEthnicInfoCalapsible(){
	     driver.findElement(button_collapsibleEthnicInfor).click();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    }
	 
	 public void verifyEmployeeEthnicInfoCalapsible(String strthirdCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelthirdCol= driver.findElement(button_collapsibleEthnicInfor).getText();
		 System.out.println("The Generated Value is :"+LabelthirdCol);
		 AssertJUnit.assertEquals(strthirdCol,LabelthirdCol);
		 
		 System.out.println("Expected value : "+strthirdCol);
		 System.out.println("Actual value : "+LabelthirdCol);
		 System.out.println("3rd Colapsible - Assert pass");
		 System.out.println("-------------");
		 Thread.sleep(8000);
	        }
	 
	 /*public void getEmployeeEthnicInfoCalapsible() throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelsecondCol= driver.findElement(button_collapsibleEthnicInfor).getText();
		 System.out.println("The Generated Value is :"+LabelsecondCol);
	 	}*/
	 
	 public void selectReligion() throws InterruptedException{
		 driver.findElement(drpdown_religion).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	}
			   
	public void chooseReligion(){
		 Actions actions = new Actions(driver);
		 actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 }
	
	 public void selectRace() throws InterruptedException{
		 driver.findElement(drpdown_race).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	}
			   
	public void chooseRace(){
		 Actions actions = new Actions(driver);
		 actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 }
	
	 public void selectNationality() throws InterruptedException{
		 driver.findElement(drpdown_nationality).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	}
			   
	public void chooseNationality(){
		 Actions actions = new Actions(driver);
		 actions.sendKeys(Keys.ENTER).build().perform();//press enter
		 System.out.println("==========================================");
	 }
	 
	 public void verifyEmployeeHealthInfoCalapsible(String strfoirthCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelforthCol= driver.findElement(button_collapsibleHealthInfor).getText();
		 System.out.println("The Generated Value is :"+LabelforthCol);
		 AssertJUnit.assertEquals(strfoirthCol,LabelforthCol);
		 
		 System.out.println("Expected value : "+strfoirthCol);
		 System.out.println("Actual value : "+LabelforthCol);
		 System.out.println("4th Colapsible - Assert pass");
		 System.out.println("-------------");
		 Thread.sleep(8000);
	    }
	 
	 public void clickEmployeePersonalSave(){
	     driver.findElement(button_save).click();
	  }
	 
}

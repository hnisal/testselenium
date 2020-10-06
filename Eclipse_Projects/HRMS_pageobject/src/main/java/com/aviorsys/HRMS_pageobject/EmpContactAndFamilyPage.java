package com.aviorsys.HRMS_pageobject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

public class EmpContactAndFamilyPage {
	
	WebDriver driver;
	
	By textfield_universalSearch = By.xpath("//*[@id=\"homeSearchBar\"]");
	By default_Name = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[3]/div[1]/div/div[1]/h5");
	By header_employeeName = By.id("uiEmpUserName");
	By button_contactandFamily = By.id("profile_cont_n_fmly");
	By button_collapsibleAddressInfo = By.xpath("//*[@id=\"accordion_4\"]/div[1]/div[1]/h4/a");
	By button_addressAdd = By.id("addNewAddress");
	By label_popupFormHeaderAddress = By.xpath("//*[@id=\"addAddressForm\"]/div/div/div[1]/h4");
	By dropdown_addressLabel = By.id("s2id_contactfamily_addresslable");
	By textfield_addressline1 = By.id("contactfamily_addressone");
	By textfield_addressline2 = By.id("contactfamily_addresstwo");
	By textfield_addressline3 = By.id("contactfamily_addressthree");
	By textfield_city = By.id("contactfamily_city");
	By dropdown_country = By.xpath("//*[@id=\"s2id_contactfamily_country\"]/a");
	By dropdown_Province = By.xpath("//*[@id=\"s2id_contactfamily_province\"]/a");
	By dropdown_District = By.xpath("//*[@id=\"s2id_contactfamily_district\"]/a");
	By textfield_postalCode = By.id("contactfamily_postal");
	By checkbox_defaultStatus = By.id("contactfamily_defstatus");
	By button_submit = By.id("saveAddressInfo");
	By enteredrow_firstAddress = By.xpath("//*[@id=\"dxDataGridAddressInfo\"]/div/div[6]/div/div/div[1]");
	By toastmsg_Body = By.className("toast-message");
	
	By button_collapsibleContactInfor = By.xpath("//*[@id=\"accordion_4\"]/div[2]/div[1]/h4/a");
	By dropdown_contactNo = By.xpath("//*[@id=\"s2id_contactfamily_cnumber1\"]/a");
	By textfield_contactNumber = By.id("contactfamily_cnum1");
	By button_contactAdd = By.id("addtel1");
	By button_contactDelete = By.id("dlttel1");
	By dropdown_email = By.xpath("//*[@id=\"s2id_contactfamily_email1\"]/a");
	By textfield_emailAddress = By.id("contactfamily_em1");
	By button_emailAdd = By.id("addmail1");
	By button_emailDelete = By.id("dltmail1");
	By textfield_extentionNo = By.id("contactfamily_extension");
	
	By button_collapsibleImergencyContactInfor = By.xpath("//*[@id=\"accordion_4\"]/div[3]/div[1]/h4/a");
	By button_emergencyAdd = By.id("addNewEmergency");
	By label_popupFormHeaderEmergency = By.xpath("//*[@id=\"addEmergencyForm\"]/div/div/div[1]/h4");
	By dropdown_relationshipEm = By.xpath("//*[@id=\"s2id_contactfamily_relationship\"]/a");
	By textfield_name = By.id("contactfamily_name");
	By textfield_personalContactNo = By.id("contactfamily_pconnumber");
	By checkbox_personalActiveStatus = By.id("active");
	By textfield_recidentialAddress = By.id("contactfamily_resaddress");
	By checkbox_activeStatus = By.id("contactfamily_actstatus");
	By button_emergencySubmit = By.id("saveEmergContInfo");
	By toastmsg_BodyEmergency = By.className("toast-message");
	By enteredrow_firstImergency = By.xpath("//*[@id=\"dxDataGridEmContactInfo\"]/div/div[6]");
	
	By button_collapsibleFamilyInfor = By.xpath("//*[@id=\"accordion_4\"]/div[4]/div[1]/h4/a");
	By button_familyAdd = By.id("addNewFamily");
	By label_popupFormHeaderFamily = By.xpath("//*[@id=\"addFamilyForm\"]/div/div/div[1]/h4");
	By dropdown_relationshipFam = By.id("s2id_contactfamily_frelationship");
	By textfield_nameFamily = By.id("contactfamily_fname");
	By dropdown_gender = By.xpath("//*[@id=\"s2id_contactfamily_gender\"]/a");
	By textfield_dateofBirth = By.id("contactfamily_dob");
	By radiobutton_deseasedYes = By.id("contactfamily_diseased");
	By radiobutton_deseasedNo = By.id("contactfamily_notdiseased");
	By button_familySubmit = By.id("saveFamilyInfo");
	By toastmsg_BodyFamily = By.className("toast-message");
	By enteredrow_firstFamily = By.xpath("//*[@id=\"dxDataGridFamilyInfo\"]/div/div[6]/div/div/div[1]");
	
	By button_contactandFamilyWholeSave = By.id("btn-save-contact-and-family");
	By toastmsg_BodyFullSave = By.className("toast-message");
	
	public EmpContactAndFamilyPage(WebDriver driver){
		this.driver = driver;
	}

	
	public void enterNewEPFforUniversalSearch(String strEpfno) throws InterruptedException{
		 driver.findElement(textfield_universalSearch).sendKeys(strEpfno);
		 Thread.sleep(6000);
		 driver.findElement(textfield_universalSearch).click();	
		 Thread.sleep(10000);
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
	
	public void clickContacFamityTab() throws InterruptedException{
	     driver.findElement(button_contactandFamily).click();
	     Thread.sleep(3000);
	     }
	
	public void verifyColapsibleHeaderAddressInfo(String strfirstCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelfirstCol= driver.findElement(button_collapsibleAddressInfo).getText();
		 System.out.println("The Generated Value is :"+LabelfirstCol);
		 AssertJUnit.assertEquals(strfirstCol,LabelfirstCol);
		 
		 System.out.println("Expected value : "+strfirstCol);
		 System.out.println("Actual value : "+LabelfirstCol);
		 System.out.println("1st Colapsible - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(3000);
	        }
	
	public void clickCollapsibleAddressInfo() throws InterruptedException{
	     driver.findElement(button_collapsibleAddressInfo).click();
	     Thread.sleep(3000);
	     }
	
	public void clickAddressInfoAdd() throws InterruptedException{
	     driver.findElement(button_addressAdd).click();
	     Thread.sleep(2000);
	     }
	
	public void verifyAddressPopUpFormHeader(String straddressformheader) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		 String LabeladdressFormHeader= driver.findElement(label_popupFormHeaderAddress).getText();
		 System.out.println("The Generated Value is :"+LabeladdressFormHeader);
		 AssertJUnit.assertEquals(straddressformheader,LabeladdressFormHeader);
		 
		 System.out.println("Expected value : "+straddressformheader);
		 System.out.println("Actual value : "+LabeladdressFormHeader);
		 System.out.println("1st Form Header - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(2000);
	    }
	
	public void verifyAddaddressInforWindowAppeared(){
		String mwh=driver.getWindowHandle();
		
		Set s=driver.getWindowHandles(); //this method will gives you the handles of all opened windows

		Iterator ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		        driver.switchTo().window(popupHandle);
		        //here you can perform operation in pop-up window
		        //After finished your operation in pop-up just select the main window again
		        driver.switchTo().window(mwh);
		        System.out.println("PopUp Window Appeared");
		    }
		 }
		}
	
	public void selectAddressLabel() throws InterruptedException{
		 driver.findElement(dropdown_addressLabel).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(2000);
			 }
	 	   }
			   
	public void chooseAddressLabel(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void enterAddressineOne(String straddressOne){
		driver.findElement(textfield_addressline1).sendKeys(straddressOne);
	}
	
	public void enterAddressineTwo(String straddressTwo){
		driver.findElement(textfield_addressline2).sendKeys(straddressTwo);
	}
	
	public void enterAddressineThree(String straddressThree){
		driver.findElement(textfield_addressline3).sendKeys(straddressThree);
	}
	
	public void enterCity(String strCity){
		driver.findElement(textfield_city).sendKeys(strCity);
	}
	
	public void selectCountrye() throws InterruptedException{
		 Select Country = new Select (driver.findElement(dropdown_country));//click on that combo
			Country.selectByVisibleText("Sri Lanka");/*for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(2000);
			 }*/
	}
	
	public void selectCountry() throws InterruptedException{
		 driver.findElement(dropdown_country).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(2000);
			 }
	 	   }
			   
	public void chooseCountry(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectProvince() throws InterruptedException{
		 driver.findElement(dropdown_Province).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(2000);
			 }
	 	   }
			   
	public void chooseProvince(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void selectDistrict() throws InterruptedException{
		 driver.findElement(dropdown_District).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(2000);
			 }
	 	   }
			   
	public void chooseDistrict(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void enterPostalCode(String strPostalCode){
		driver.findElement(textfield_postalCode).sendKeys(strPostalCode);
	}
	
	public void markDefaultAddressCheckBox(){
		driver.findElement(checkbox_defaultStatus).click();
	}
	
	public void clickSubmitAddressInfor() throws InterruptedException{
	     driver.findElement(button_submit).click();
	     Thread.sleep(3000);
	     }
	
	public void switchToPoupBox(){
		String popUpTextforgetConfirmation = driver.switchTo().alert().getText();
		System.out.println(popUpTextforgetConfirmation);

	}
	
	public void acceptPopUp(){
		driver.switchTo().alert().accept();
	}
	
	public void checkRecordsinGrid(String expectedName) throws InterruptedException{
		//String expectedName = "AGI GATE";
		String actualName = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(enteredrow_firstAddress)).getText();
		System.out.println("The Generated Value is : "+actualName);
		AssertJUnit.assertEquals(expectedName, actualName);
		 
		System.out.println(expectedName);
		System.out.println(actualName);
		System.out.println("Read Row1 - Assert pass");
		}
	
	public void checknewlyEnteredRecordPracence(String expectedName) throws InterruptedException{
		if(driver.getPageSource().contains(expectedName)){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
		}
	
	public void catchToastrMessageAddres(String strtostmsg){
		String Toast_Message = driver.findElement(toastmsg_Body).getText();
		System.out.println("The toast message is : " +Toast_Message);
		 AssertJUnit.assertEquals(strtostmsg,Toast_Message);
	 }
	
	//contact infor
	
	public void verifyColapsibleHeaderContactInfo(String strsecondCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
		 String LabelsecondCol= driver.findElement(button_collapsibleContactInfor).getText();
		 System.out.println("The Generated Value is :"+LabelsecondCol);
		 AssertJUnit.assertEquals(strsecondCol,LabelsecondCol);
		 
		 System.out.println("Expected value : "+strsecondCol);
		 System.out.println("Actual value : "+LabelsecondCol);
		 System.out.println("1st Colapsible - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(3000);
	        }
	
	public void clickCollapsibleContactInfo() throws InterruptedException{
	     driver.findElement(button_collapsibleContactInfor).click();
	     Thread.sleep(3000);
	     }
	
	public void selectContactNoLabel() throws InterruptedException{
		 driver.findElement(dropdown_contactNo).click();//click on that combo
			for(int i = 0; i <= 3; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(1000);
			 }
	 	   }
			   
	public void chooseContactNoLabel(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void enterContactNumber(String strcontactNumber){
		driver.findElement(textfield_contactNumber).sendKeys(strcontactNumber);
	}
	
	public void selectEmailLabel() throws InterruptedException{
		 driver.findElement(dropdown_email).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(1000);
			 }
	 	   }
			   
	public void chooseEmailLabel(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void enterEmailAddres(String stremailAddress){
		driver.findElement(textfield_emailAddress).sendKeys(stremailAddress);
	}
	
	//Emergency Contact Infor
	public void verifyColapsibleHeaderEmergencyContactInfo(String strthirdCol) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		 String LabelthirdCol= driver.findElement(button_collapsibleImergencyContactInfor).getText();
		 System.out.println("The Generated Value is :"+LabelthirdCol);
		 AssertJUnit.assertEquals(strthirdCol,LabelthirdCol);
		 
		 System.out.println("Expected value : "+strthirdCol);
		 System.out.println("Actual value : "+LabelthirdCol);
		 System.out.println("3rd Colapsible - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(3000);
	        }
	
	public void clickColapsibleHeaderEmergencyContactInfo() throws InterruptedException{
	     driver.findElement(button_collapsibleImergencyContactInfor).click();
	     Thread.sleep(3000);
	     }
	
	public void clickEmergencyContactInfoAdd() throws InterruptedException{
	     driver.findElement(button_emergencyAdd).click();
	     Thread.sleep(2000);
	     }
	
	public void verifyEmergencyContactInfoFormHeader(String strEmergencyContactInfoformheader) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		 String LabelEmergencyContactInfoFormHeader= driver.findElement(label_popupFormHeaderAddress).getText();
		 System.out.println("The Generated Value is :"+LabelEmergencyContactInfoFormHeader);
		 AssertJUnit.assertEquals(strEmergencyContactInfoformheader,LabelEmergencyContactInfoFormHeader);
		 
		 System.out.println("Expected value : "+strEmergencyContactInfoformheader);
		 System.out.println("Actual value : "+LabelEmergencyContactInfoFormHeader);
		 System.out.println("2nd Form Header - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(2000);
	    }
	
	public void selectRelationshipEm() throws InterruptedException{
		 driver.findElement(dropdown_relationshipEm).click();//click on that combo
			for(int i = 0; i <= 1; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(2000);
			 }
	 	   }
			   
	public void chooseRelationshipEm(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void enterNameEm(String strname){
		driver.findElement(textfield_name).sendKeys(strname);
	}
	
	public void enterPersonalContactNo(String strcontactNo){
		driver.findElement(textfield_personalContactNo).sendKeys(strcontactNo);
	}
	
	 public void checkEmployeeDefaultContactNo() throws InterruptedException{
		 List<WebElement> radio = driver.findElements(checkbox_personalActiveStatus);
		 radio.get(0).getAttribute("checked");
		     System.out.println("Personal Active Status selected");
	}
	 
	 public void enterResidentialAddress(String strResidentialAddress){
			driver.findElement(textfield_recidentialAddress).sendKeys(strResidentialAddress);
		}
	
	 public void markActiveStatusCheckBox(){
			driver.findElement(checkbox_activeStatus).click();
		}
	 
	 public void clickSubmitEmeregency(){
			driver.findElement(button_emergencySubmit).click();
		}
	 
	 public void catchToastrMessageEmergency(String strtostmsg){
			String Toast_Message = driver.findElement(toastmsg_Body).getText();
			System.out.println("The toast message is : " +Toast_Message);
			 AssertJUnit.assertEquals(strtostmsg,Toast_Message);
		 }
	 
	 public void checkRecordsinGridEmergency(String expectedName) throws InterruptedException{
			String actualName = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(enteredrow_firstImergency)).getText();
			System.out.println("The Generated Value is : "+actualName);
			AssertJUnit.assertEquals(expectedName, actualName);
			 
			System.out.println(expectedName);
			System.out.println(actualName);
			System.out.println("Read Row2 - Assert pass");
			}
		
	 public void checkEmergencynewlyEnteredRecordPracence(String expectedName) throws InterruptedException{
			if(driver.getPageSource().contains(expectedName)){
				System.out.println("Text is present");
				}else{
				System.out.println("Text is absent");
				}
			}
	
	 //family infor
	 public void verifyColapsibleHeaderFamilyInfo(String strforthCol) throws InterruptedException{
			 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
			 String LabelforthCol= driver.findElement(button_collapsibleFamilyInfor).getText();
			 System.out.println("The Generated Value is :"+LabelforthCol);
			 AssertJUnit.assertEquals(strforthCol,LabelforthCol);
			 
			 System.out.println("Expected value : "+strforthCol);
			 System.out.println("Actual value : "+LabelforthCol);
			 System.out.println("1st Colapsible - Assert pass");
			 System.out.println("==========================================");
			 Thread.sleep(3000);
		        }
		
	 public void clickCollapsibleFamilyInfo() throws InterruptedException{
		     driver.findElement(button_collapsibleFamilyInfor).click();
		     Thread.sleep(3000);
		     }
		
	 public void clickFamilyInfoAdd() throws InterruptedException{
		     driver.findElement(button_familyAdd).click();
		     Thread.sleep(2000);
		     }
		
	 public void verifyFamilyInfpPopUpFormHeader(String strfamilyformheader) throws InterruptedException{
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			 String LabelfamilyFormHeader= driver.findElement(label_popupFormHeaderFamily).getText();
			 System.out.println("The Generated Value is :"+LabelfamilyFormHeader);
			 AssertJUnit.assertEquals(strfamilyformheader,LabelfamilyFormHeader);
			 
			 System.out.println("Expected value : "+strfamilyformheader);
			 System.out.println("Actual value : "+LabelfamilyFormHeader);
			 System.out.println("3rd Form Header - Assert pass");
			 System.out.println("==========================================");
			 Thread.sleep(2000);
		    }
	
	 public void selectRelationshipFam() throws InterruptedException{
			 driver.findElement(dropdown_relationshipFam).click();//click on that combo
				for(int i = 0; i <= 1; i++){// 1 is the position of the element which you want 
				  Actions actions = new Actions(driver);
				  actions.sendKeys(Keys.DOWN).build().perform();
				  Thread.sleep(2000);
				 }
		 	   }
				   
	 public void chooseRelationshipFam(){
				  Actions actions = new Actions(driver);
				  actions.sendKeys(Keys.ENTER).build().perform();//press enter
		 	   }
		
	 public void enterNameFam(String strname){
			driver.findElement(textfield_nameFamily).sendKeys(strname);
		}
	 
	 public void selectGenderFam() throws InterruptedException{
		 driver.findElement(dropdown_gender).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(2000);
			 }
	 	   }
			   
	public void chooseGenderFam(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	   }
	
	public void enterDateofBirth(String strDatebirth){
		driver.findElement(textfield_dateofBirth).sendKeys(strDatebirth);
	}
	
	public void checkFamilyInfoDeseasedNoMarked() throws InterruptedException{
		 List<WebElement> radio = driver.findElements(radiobutton_deseasedNo);
		 radio.get(0).getAttribute("checked");
		     System.out.println("Deseased- No Radio Button selected");
		 }
	
	public void markFamilyInfoDeseasedYes(){
		driver.findElement(radiobutton_deseasedYes).click();
	}
	
	public void markFamilyInfoDeseasedNo(){
		driver.findElement(radiobutton_deseasedNo).click();
	}
	
	public void ClickFamilyInfoSubmit(){
		driver.findElement(button_familySubmit).click();
	}
	
	public void catchToastrMessageFamily(String strtostmsg){
		String Toast_Message = driver.findElement(toastmsg_BodyFamily).getText();
		System.out.println("The toast message is : " +Toast_Message);
		 AssertJUnit.assertEquals(strtostmsg,Toast_Message);
	 }
 
	public void checkRecordsinGridFamily(String expectedName) throws InterruptedException{
		String actualName = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(enteredrow_firstFamily)).getText();
		System.out.println("The Generated Value is : "+actualName);
		AssertJUnit.assertEquals(expectedName, actualName);
		 
		System.out.println(expectedName);
		System.out.println(actualName);
		System.out.println("Read Row3 - Assert pass");
		}
	
	public void checkFamilyInfonewlyEnteredRecordPracence(String expectedName) throws InterruptedException{
		if(driver.getPageSource().contains(expectedName)){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
		}
	
	public void clickSaveofContactFamily(){
		driver.findElement(button_contactandFamilyWholeSave).click();
	}
	
	public void catchToastrMessageContactFamily(String strtostmsg){
		String Toast_Message = driver.findElement(toastmsg_BodyFullSave).getText();
		System.out.println("The toast message is : " +Toast_Message);
		 AssertJUnit.assertEquals(strtostmsg,Toast_Message);
	 }

}

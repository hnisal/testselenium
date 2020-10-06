package com.aviorsys.HRMS_pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

public class DeviceRegistrationPage {
	
	WebDriver driver;
	
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_hrmSettings = By.xpath("//*[@id=\"wrapper\"]/div[1]/div/ul/li[8]/a");
	//("//*[@id="wrapper"]/div[1]/div/ul/li[8]/a")
	By button_deviceRegistration = By.xpath("//*[@id=\"hrm_set\"]/li[1]/a[2]");
	By default_InterfaceHeader = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div/div/div[1]/h5");
	By pannel_titleGridheader = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[3]/div[1]/div[1]/h6");
	By button_add = By.id("addNewDevice");
	By modal_header = By.className("modal-title");
	By textfield_deviceName = By.id("deviceName");
	By textfield_ipAddress = By.id("ipAddress");
	By textfield_port = By.id("port");
	By dropdown_location = By.xpath("//*[@id=\"s2id_locationIdx\"]/a");
	By textfield_serialNo = By.id("serialNo");
	By textfield_model = By.id("model");
	By textfield_boudRate = By.id("baudRate");
	By dropdown_process = By.xpath("//*[@id=\"s2id_processIdx\"]/a");
	By textfield_description = By.id("deviceDescription");
	By checkbox_active = By.id("isActive");
	By button_save = By.id("btnSave");
	By button_reset = By.id("btnReset");
	By row_first = By.xpath("//*[@id=\"dxDataGrid\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]");
	
	public DeviceRegistrationPage(WebDriver driver) {
	this.driver = driver;
	}

	public void clickNavigationExpand() throws InterruptedException{
		 Thread.sleep(5000);
	     driver.findElement(button_navigationExpand).click();
	     Thread.sleep(5000);
	     }
	 
	public void clickHRMSetings(){
	     driver.findElement(button_hrmSettings).click();
	     }
	 
	public void clickDeviceRegistration(){
	     driver.findElement(button_deviceRegistration).click();
	     }
	
	public void verifyDeviceRegistrationInterfaceHeader(String strDeviceRegheader) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelDeviceRegHeader = driver.findElement(default_InterfaceHeader).getText();
		 System.out.println("The Generated Value is :"+LabelDeviceRegHeader);
		 AssertJUnit.assertEquals(strDeviceRegheader,LabelDeviceRegHeader);
		 
		 System.out.println("Expected value : "+strDeviceRegheader);
		 System.out.println("Actual value : "+LabelDeviceRegHeader);
		 System.out.println("Device Registration Interface Header - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	        }
	
	public void verifyDeviceRegistrationGridHeader(String strDeviceReggridHead) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelDeviceReggridhead= driver.findElement(pannel_titleGridheader).getText();
		 System.out.println("The Generated Value is :"+LabelDeviceReggridhead);
		 AssertJUnit.assertEquals(strDeviceReggridHead,LabelDeviceReggridhead);
		 
		 System.out.println("Expected value : "+strDeviceReggridHead);
		 System.out.println("Actual value : "+LabelDeviceReggridhead);
		 System.out.println("Device Registration Title Grid Header - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	        }
	
	public void clickAddNew() throws InterruptedException{
	     driver.findElement(button_add).click();
	     Thread.sleep(3000);
	     }
	
	public void verifyModalTitle(String strmodalTitle) throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String LabelmodalTitle = driver.findElement(modal_header).getText();
		 System.out.println("The Generated Value is :"+LabelmodalTitle);
		 AssertJUnit.assertEquals(strmodalTitle,LabelmodalTitle);
		 
		 System.out.println("Expected value : "+strmodalTitle);
		 System.out.println("Actual value : "+LabelmodalTitle);
		 System.out.println("Device Registration Modal Title - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(8000);
	     }
	
	public void verifyActiveCheckBoxChecked() throws InterruptedException{
		 WebElement checkbox = driver.findElement(checkbox_active);
		 System.out.println("The checkbox is selection state is - " + checkbox.isSelected());

		 System.out.println("Device Registration - Active Checkbox Marked - Assert pass");
		 System.out.println("==========================================");
		 Thread.sleep(1000);
		 }
	
	public void enterDeviceName(String strdeviceName){
		driver.findElement(textfield_deviceName).sendKeys(strdeviceName);
		}
	
	public void enterIPAddress(String strIPAddress){
		driver.findElement(textfield_ipAddress).sendKeys(strIPAddress);
		}
	
	public void enterPort(String strport){
		driver.findElement(textfield_port).sendKeys(strport);
		}
	
	public void selectLocation() throws InterruptedException{
		 driver.findElement(dropdown_location).click();//click on that combo
			for(int i = 0; i <= 1; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	}
			   
	public void chooseLocation(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	}
	
	public void enterSerialNo(String strserialNo){
		driver.findElement(textfield_serialNo).sendKeys(strserialNo);
		}
	
	public void enterModel(String strmodel){
		driver.findElement(textfield_model).sendKeys(strmodel);
		}
	
	public void enterBoudRate(String strboudRate){
		driver.findElement(textfield_boudRate).sendKeys(strboudRate);
		}
	
	public void selectProcess() throws InterruptedException{
		 driver.findElement(dropdown_process).click();//click on that combo
			for(int i = 0; i <= 0; i++){// 1 is the position of the element which you want 
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.DOWN).build().perform();
			  Thread.sleep(3000);
			 }
	 	}
			   
	public void chooseProcess(){
			  Actions actions = new Actions(driver);
			  actions.sendKeys(Keys.ENTER).build().perform();//press enter
	 	}
	
	public void enterDescription(String strdescription){
		driver.findElement(textfield_description).sendKeys(strdescription);
		}
	
	public void clickReset() throws InterruptedException{
	     driver.findElement(button_reset).click();
	     Thread.sleep(3000);
	     }
	
	public void clickSave() throws InterruptedException{
	     driver.findElement(button_save).click();
	     Thread.sleep(3000);
	     }
	
	public void checkRecordsinGrid(String expectedName) throws InterruptedException{
		//String expectedName = "AGI GATE";
		String actualName = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(row_first)).getText();
		System.out.println("The Generated Value is : "+actualName);
		AssertJUnit.assertEquals(expectedName, actualName);
		 
		System.out.println(expectedName);
		System.out.println(actualName);
		System.out.println("Read Row - Assert pass");
		}
	
	public void checknewlyEnteredRecordPracence(String expectedName) throws InterruptedException{
		if(driver.getPageSource().contains(expectedName)){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
		}
	
}

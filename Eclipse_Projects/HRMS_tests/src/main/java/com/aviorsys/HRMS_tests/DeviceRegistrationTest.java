package com.aviorsys.HRMS_tests;

import org.junit.After;
import org.junit.Test;
import com.aviorsys.HRMS_pageobject.DeviceRegistrationPage;

public class DeviceRegistrationTest extends BasicTest {
	
	DeviceRegistrationPage ToDeviceRegistrationPage;
	
	@Test
	
	public void test_a_Register_New_Device() throws InterruptedException{
		System.out.println("@Test - test_Enter_New_Device");
		
	//Create DeviceRegistration Page object
	ToDeviceRegistrationPage = new DeviceRegistrationPage(driver);
	
	ToDeviceRegistrationPage.clickNavigationExpand();
	ToDeviceRegistrationPage.clickHRMSetings();
	ToDeviceRegistrationPage.clickDeviceRegistration();
	
	ToDeviceRegistrationPage.verifyDeviceRegistrationInterfaceHeader("Device Registration");
	ToDeviceRegistrationPage.verifyDeviceRegistrationGridHeader("Device Registration Details");
	ToDeviceRegistrationPage.clickAddNew();
	ToDeviceRegistrationPage.verifyModalTitle("Device Registration Form");
	ToDeviceRegistrationPage.verifyActiveCheckBoxChecked();
	ToDeviceRegistrationPage.enterDeviceName("Test Auto1");
	ToDeviceRegistrationPage.enterIPAddress("10.10.10.10");
	ToDeviceRegistrationPage.enterPort("8070");
	ToDeviceRegistrationPage.selectLocation();
	ToDeviceRegistrationPage.chooseLocation();
	ToDeviceRegistrationPage.enterSerialNo("1111111111");
	ToDeviceRegistrationPage.enterModel("AB");
	ToDeviceRegistrationPage.enterBoudRate("100000");
	ToDeviceRegistrationPage.selectProcess();
	ToDeviceRegistrationPage.chooseProcess();
	ToDeviceRegistrationPage.enterDescription("Automation Testig Device.Do not Remove");
	ToDeviceRegistrationPage.clickReset();
	//ToDeviceRegistrationPage.clickSave();
	
	}
	
	@Test
	
	public void test_b_Entered_New_Device_Present() throws InterruptedException{
		System.out.println("@Test - test_Entered_New_Device_Present");
		
		ToDeviceRegistrationPage = new DeviceRegistrationPage(driver);

		
		ToDeviceRegistrationPage.clickNavigationExpand();
		ToDeviceRegistrationPage.clickHRMSetings();
		ToDeviceRegistrationPage.clickDeviceRegistration();
		
		ToDeviceRegistrationPage.verifyDeviceRegistrationInterfaceHeader("Device Registration");
		ToDeviceRegistrationPage.verifyDeviceRegistrationGridHeader("Device Registration Details");
		ToDeviceRegistrationPage.checkRecordsinGrid("  AGI GATE 172.17.1.54 4370 AGI 2302454 R2 Process 01  ");
		ToDeviceRegistrationPage.checknewlyEnteredRecordPracence("Head Office Main Entrance");
	}

	@After
	
	public void test_Browser_Close(){
		driver.quit();
	}

}

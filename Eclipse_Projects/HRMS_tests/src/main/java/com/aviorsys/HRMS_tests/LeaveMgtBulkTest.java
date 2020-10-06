package com.aviorsys.HRMS_tests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aviorsys.HRMS_pageobject.LeaveMgtBulkPage;
import com.aviorsys.HRMS_pageobject.LeaveMgtIndivdualPage;
import com.aviorsys.HRMS_pageobject.LoginPage;

public class LeaveMgtBulkTest extends BasicTest {
	
	WebDriver driver ;
	LoginPage HRMSLoginPage;
	LeaveMgtBulkPage LeaveMgtBlkPage;
	
@Before
	
    public void setup() throws InterruptedException{
    	System.out.println("@Before - runBeforeTestMethod");
    	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Chrome driver1\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://52.70.234.125:8055/");
        Thread.sleep(1000);
        System.out.println(driver.getTitle());  
        
        	System.out.println("@Test - test_method");
            
        	//Create Login Page object
        	HRMSLoginPage = new LoginPage(driver);
        	
            //login to application
        	//HRMSLoginPage.setUserName("qaadmin");
        	//HRMSLoginPage.setPassword("bbc@456");
        	HRMSLoginPage.clickLogin();
        	// go the next page
        }
	@Test
	
	public void test_Apply_Bulk_Leave() throws InterruptedException{
    	System.out.println("@test_Leave mgt Bulk Tab-start");
	LeaveMgtBlkPage = new LeaveMgtBulkPage(driver);
	
	LeaveMgtBlkPage.clickNavigationExpand();
	LeaveMgtBlkPage.clickTimeandAttendance();
	LeaveMgtBlkPage.clickLeaveManagement();
	LeaveMgtBlkPage.clickBulkTab();
	LeaveMgtBlkPage.selectLeaveType();
	LeaveMgtBlkPage.chooseLeaveType();
	//LeaveMgtBlkPage.verifyYearAppeareCorrect("2020");
	LeaveMgtBlkPage.selectPrePostLeave();
	LeaveMgtBlkPage.choosePrePost();
	LeaveMgtBlkPage.enterReason("Official");
	LeaveMgtBlkPage.clearStartDate();
	LeaveMgtBlkPage.selectStartDate("2020/07/22");
	LeaveMgtBlkPage.clearEndDate();
	LeaveMgtBlkPage.selectEndDate("2020/07/22");
	LeaveMgtBlkPage.selectCompany();
	LeaveMgtBlkPage.chooseCompany();
	LeaveMgtBlkPage.selectStartTime();
	LeaveMgtBlkPage.chooseStartTime();
	LeaveMgtBlkPage.selectEndTime();
	LeaveMgtBlkPage.chooseEndTime();
	LeaveMgtBlkPage.selectAttProfile();
	LeaveMgtBlkPage.chooseAttProfile();
	LeaveMgtBlkPage.clickSelectEmpButton();
	LeaveMgtBlkPage.clickSelectAllButton();
	LeaveMgtBlkPage.clickSubmitButton();
	LeaveMgtBlkPage.clickSaveButton();
	
	System.out.println("@test_Leave mgt Bulk Tab-End");
	}
}

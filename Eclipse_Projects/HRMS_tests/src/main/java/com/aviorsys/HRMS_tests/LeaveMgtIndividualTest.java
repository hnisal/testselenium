package com.aviorsys.HRMS_tests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aviorsys.HRMS_pageobject.LeaveAllocationPage;
import com.aviorsys.HRMS_pageobject.LeaveMgtIndivdualPage;
import com.aviorsys.HRMS_pageobject.LoginPage;
import com.aviorsys.HRMS_pageobject.NavigationPage;

public class LeaveMgtIndividualTest extends BasicTest {

	WebDriver driver ;
	LoginPage HRMSLoginPage;
	NavigationPage Dashboard;
	LeaveMgtIndivdualPage LeaveMgtPage;
	Select leave;
	Actions actions;
	
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
        
        	System.out.println("@Test - test_method_1");
            
        	//Create Login Page object
        	HRMSLoginPage = new LoginPage(driver);
        	
            //login to application
        	//HRMSLoginPage.setUserName("qaadmin");
        	//HRMSLoginPage.setPassword("bbc@456");
        	HRMSLoginPage.clickLogin();
        	// go the next page
        }
	
	@Test
		
	 public void test_Apply_Individual_Leave() throws InterruptedException{
    	System.out.println("@test_Leave mgt Individual Tab-start");
       
    	//Create LeaveAllocation Page object
    	LeaveMgtPage = new LeaveMgtIndivdualPage(driver);
        //Go to employee Profile-Create New
    	LeaveMgtPage.clickNavigationExpand();
    	LeaveMgtPage.clickTimeandAttendance();
    	LeaveMgtPage.clickLeaveManagement();
    	LeaveMgtPage.clickIndividualTab();
    	LeaveMgtPage.enterEpfNoName("AITS025");
    	LeaveMgtPage.selectEpfNoName();
    	//LeaveMgtPage.verifyCompanyAppeareCorrect();
    	//LeaveMgtPage.verifyDivisionAppeareCorrect("QA");
    	//LeaveMgtPage.verifyUnitAppeareCorrect("QA");
    	//LeaveMgtPage.verifyYearAppeareCorrect("2020");
    	LeaveMgtPage.selectLeaveType();
    	LeaveMgtPage.chooseLeaveType();
    	LeaveMgtPage.selectPrePostLeave();
    	LeaveMgtPage.choosePrePost();
    	LeaveMgtPage.enterReason("official");
    	LeaveMgtPage.clearFromDate();
    	LeaveMgtPage.selectFromDate("2020/07/07");
    	LeaveMgtPage.clearToDate();
    	LeaveMgtPage.selectToDate("2020/07/07");
    	LeaveMgtPage.selectStartTime();
    	LeaveMgtPage.chooseStartTime();
    	LeaveMgtPage.selectEndTime();
    	LeaveMgtPage.chooseEndTime();
    	LeaveMgtPage.verifyAutofilledEditDisabledDays();
    	LeaveMgtPage.clickSubmitButton();
    	LeaveMgtPage.catchToastrMessage();
    
    	System.out.println("@test_Leave mgt Individual Tab-end");
	}
	
}

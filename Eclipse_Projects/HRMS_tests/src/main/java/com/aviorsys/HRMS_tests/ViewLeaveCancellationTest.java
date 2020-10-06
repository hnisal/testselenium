package com.aviorsys.HRMS_tests;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aviorsys.HRMS_pageobject.LeaveCancellationHRPage;
import com.aviorsys.HRMS_pageobject.LoginPage;
import com.aviorsys.HRMS_pageobject.ViewLeaveCancellationPage;

public class ViewLeaveCancellationTest extends BasicTest {
	
	WebDriver driver ;
	LoginPage HRMSLoginPage;
	ViewLeaveCancellationPage ViewLeaveCancelHRPage;
	
/*@Before
	
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
        }*/
@Test

	public void test_View_Cancel_LeaveHR() throws InterruptedException, ParseException{
		System.out.println("@test_View Leave Cancellation-start");
		
	ViewLeaveCancelHRPage = new ViewLeaveCancellationPage(driver);
	
	ViewLeaveCancelHRPage.clickNavigationExpand();
	ViewLeaveCancelHRPage.clickTimeandAttendance();
	ViewLeaveCancelHRPage.clickViewLeaveCancellation();
	ViewLeaveCancelHRPage.selectCompany();
	ViewLeaveCancelHRPage.chooseCompany();
	//ViewLeaveCancelHRPage.selectDivision();
	//ViewLeaveCancelHRPage.chooseDivision();
	//ViewLeaveCancelHRPage.selectUnit();
	//ViewLeaveCancelHRPage.chooseUnit();
	ViewLeaveCancelHRPage.selectEmployee();
	ViewLeaveCancelHRPage.chooseEmployee();
	ViewLeaveCancelHRPage.clearFromDate();
	ViewLeaveCancelHRPage.selectFromDate("2020/01/01");
	ViewLeaveCancelHRPage.clearToDate();
	ViewLeaveCancelHRPage.selectToDate("2020/06/01");
	ViewLeaveCancelHRPage.clickLoad();
	ViewLeaveCancelHRPage.ViewCancelledLeave();
	//ViewLeaveCancelHRPage.NoofRowsAndColsInGrid();
	//ViewLeaveCancelHRPage.NoofRowsAndColsInGridss();
	
	
}

}

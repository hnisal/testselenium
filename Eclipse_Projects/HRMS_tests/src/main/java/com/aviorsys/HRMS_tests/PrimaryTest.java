package com.aviorsys.HRMS_tests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aviorsys.HRMS_pageobject.LoginPage;
import com.aviorsys.HRMS_pageobject.PrimaryPage;

public class PrimaryTest extends BasicTest {
	
	WebDriver driver ;
	LoginPage HRMSLoginPage;
	PrimaryPage HRMSDashboard;
	Select identificationtype;
	
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
        	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
        	
        // go the next page
		}
        	
       @Test
       
       public void test_Create_New_Employee_Correct() throws InterruptedException{
	    	System.out.println("@Test - test_Create_New_Employee from create new");
	    	
	    	//Create Primary Page object
	    	HRMSDashboard = new PrimaryPage(driver);
	        
	    	HRMSDashboard.clickNavigationExpand();
	    	HRMSDashboard.clickEmployeeProfile();
	    	HRMSDashboard.clickCreateNew();
	    	
	    	HRMSDashboard.selectIdentificationType();
	    	HRMSDashboard.chooseIdentificationType();
	    	HRMSDashboard.enterIdentificationNumber("936433525V");
	    	HRMSDashboard.verifyGender("Female");
	    	HRMSDashboard.verifyBirthday("1993-05-22");
	    	HRMSDashboard.enterInitials("H.M.T.K");
	    	HRMSDashboard.selectTitle();
	    	HRMSDashboard.chooseTitle();
	    	HRMSDashboard.enterFirstName("Thimali");
	    	HRMSDashboard.enterMiddleName("Kaushalya");
	    	HRMSDashboard.enterLastName("Wijayathilake");
	    	HRMSDashboard.enterFullName("Hitihami Mudiyanselage Thimali Kaushalya Wijayathilake");
	    	HRMSDashboard.verifyGroup("Antler Group of Companies");
	    	HRMSDashboard.scrollDown();
	    	HRMSDashboard.selectCompany();
	    	HRMSDashboard.chooseCompany();
	    	HRMSDashboard.selectComplex();
	    	HRMSDashboard.chooseComplex();
	    	HRMSDashboard.selectEmployeeType();
	    	HRMSDashboard.chooseEmployeeType();
	    	HRMSDashboard.selectConfirmationPeriod();
	    	HRMSDashboard.chooseConfirmationPeriod();
	    	HRMSDashboard.verifyEPfNo();
	    	//HRMSDashboard.verifyReference();
	    	HRMSDashboard.enterEmployeeCardID("456456456");
	    	HRMSDashboard.selectAttendanceProfile();
	    	HRMSDashboard.chooseAttendanceProfile();
	    	HRMSDashboard.clearAppointmentDate();
	    	HRMSDashboard.selectAppointmentDate("2020-07-01");
	    	HRMSDashboard.verifyProfileCreatedDate();
	    	//HRMSDashboard
	    	HRMSDashboard.catchToastrMessage();
       }

}

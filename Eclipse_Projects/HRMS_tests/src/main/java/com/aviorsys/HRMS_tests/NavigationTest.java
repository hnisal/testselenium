package com.aviorsys.HRMS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import com.aviorsys.HRMS_pageobject.LoginPage;
import com.aviorsys.HRMS_pageobject.NavigationPage;


import org.openqa.selenium.support.PageFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NavigationTest extends BasicTest{
	
	WebDriver driver ;
	LoginPage HRMSLoginPage;
	NavigationPage Dashboard;
	
	@Before
    public void setup() throws InterruptedException{
    	System.out.println("@Before - runBeforeTestMethod");
    	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Chrome driver2\\chromedriver.exe");
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
	
	
	/*@Test 
    public void test_Home_Page_Appear_Correct() throws InterruptedException{
    	System.out.println("@Test - test_method_1");
        
    	//Create Login Page object
    	HRMSLoginPage = new LoginPage(driver);
    	
        //login to application
    	HRMSLoginPage.setUserName("qaadmin");
    	HRMSLoginPage.setPassword("bbc@456");
    	HRMSLoginPage.clickLogin();
    	
    // go the next page
    }*/
	

	
	 @Test
	    public void test_Create_New_Employee() throws InterruptedException{
	    	System.out.println("@Test - test_Create_New_Employee");
	        
	    	//Create Navigation Page object
	    	Dashboard = new NavigationPage(driver);
	    	
	        //Go to employee Profile-Create New
	    	Dashboard.clickNavigationExpand();
	    	Dashboard.clickEmployeeProfile();
	    	Dashboard.clickCreateNew();
	    	
	 }
	 
	 @Test
	 public void test_Search_Employee() throws InterruptedException{
		 System.out.println("@Test - test_Search_Employee");
		 Dashboard = new NavigationPage(driver);
		 Thread.sleep(5000);
		 Dashboard.enterNameforUniversalSearch("Anuradhika Wijayathilake");
		 Thread.sleep(8000);
		 Dashboard.verifyEmployeeSearch("Anuradhika Wijayathilake - AITS025");
		 Thread.sleep(10000);
		

	 }
	 

	 @After
	    public void testclose() throws InterruptedException{
	    	System.out.println("@After - runAfterTestMethod");
	    	Thread.sleep(8000);
	    	driver.close();     
	        
	    }
	 
}

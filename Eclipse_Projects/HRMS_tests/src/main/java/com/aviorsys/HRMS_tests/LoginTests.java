package com.aviorsys.HRMS_tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aviorsys.HRMS_pageobject.LoginPage;

public class LoginTests {
    
    WebDriver driver;
    LoginPage HRMSLoginPage;

@Before
public void setup() throws InterruptedException{
	System.out.println("@Before - runBeforeTestMethod");
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Chrome driver2\\chromedriver.exe");
    driver = new ChromeDriver();

    driver.manage().timeouts().pageLoadTimeout(20 , TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.get("http://52.70.234.125:8055/");
    Thread.sleep(10000);
    System.out.println(driver.getTitle());  
	}

@Test

	 public void test_Home_Page_Appear_Correct() throws InterruptedException, IOException{
	    	System.out.println("@Test - test_method_1");
	        
	    	//Create Login Page object
	    	HRMSLoginPage = new LoginPage(driver);
	    	
	        //login to application
	    	HRMSLoginPage.ReadDataforLogin();
	    	HRMSLoginPage.clickLogin();
	    	HRMSLoginPage.verifyLeaveAllocationGraphAppeared("Leave Allocation Chart");
	    	}

}




/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import com.aviorsys.HRMS_pageobject.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTests {
    
    WebDriver driver;
    LoginPage HRMSLoginPage;

    @Before
    public void setup() throws InterruptedException{
    	System.out.println("@Before - runBeforeTestMethod");
    	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Chrome driver1\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(20 , TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://52.70.234.125:8055/");
        Thread.sleep(10000);
        System.out.println(driver.getTitle());  
    	}
    
    @Test 
    public void test_Home_Page_Appear_Correct() throws InterruptedException{
    	System.out.println("@Test - test_method_1");
        
    	//Create Login Page object
    	HRMSLoginPage = new LoginPage(driver);
    	
        //login to application
    	HRMSLoginPage.setUserName("qaadmin");
    	HRMSLoginPage.setPassword("bbc@456");
    	HRMSLoginPage.clickLogin();
    	}
    
    @After
    public void testclose() throws InterruptedException{
    	System.out.println("@After - runAfterTestMethod");
    	Thread.sleep(20000);
    	driver.close();     
        
    }
    
}*/

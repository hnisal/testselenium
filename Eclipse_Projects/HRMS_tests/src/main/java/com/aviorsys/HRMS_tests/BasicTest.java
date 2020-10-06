package com.aviorsys.HRMS_tests;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aviorsys.HRMS_pageobject.BasicPage;


public class BasicTest {

	WebDriver driver;
	BasicPage HRMSBasePage;
	
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
       System.out.println("@Test - test_method_1");
       
   	HRMSBasePage = new BasicPage(driver);
   	
   	HRMSBasePage.setUserName("qaadmin");
   	HRMSBasePage.setPassword("bbc@456");
   	HRMSBasePage.clickLogin();
   	
   }
	
}

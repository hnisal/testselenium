package com.aviorsys.HRMS_pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;*/
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;

public class LoginPage {
    
    WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
    int i;
    
    By textfield_userName = By.xpath("//*[@id=\"userName\"]");
    By textfield_password = By.xpath("//*[@id=\"password\"]");
    By button_login = By.id("hrmLogin");
    By textsearch_universal = By.id("homeSearchBar");
    By graph_leaveHeader = By.xpath("//*[@id=\"ESSDashboard\"]/div[3]/div[1]/div/div[2]/div[1]/h6");
    By graph_weeklyBirthdayHeader = By.xpath("//*[@id=\"ESSDashboard\"]/div[2]/div[1]/div/div[2]/div[1]/h6");
    By graph_comNewsHeader = By.xpath("//*[@id=\"ESSDashboard\"]/div[2]/div[2]/div/div[2]/div[1]/h6");
    By graph_myTaskHeader = By.xpath("//*[@id=\"ESSDashboard\"]/div[2]/div[3]/div/div[1]/div[1]/h6");
    By graph_recentActivetiesHeader = By.xpath("//*[@id=\"ESSDashboard\"]/div[3]/div[2]/div/div[2]/div[1]/h6");
    
    
   public LoginPage (WebDriver driver){
        this.driver = driver;
        }


@Test
public void ReadDataforLogin() throws IOException
{
    // Import excel sheet.
    File src=new File("D:\\selenium\\Excel_data\\TestData.xlsx");
     
    // Load the file.
    FileInputStream finput = new FileInputStream(src);
     
    // Load the workbook.
   workbook = new XSSFWorkbook(finput);
     
    // Load the sheet in which data is stored.in ourcase 1st sheet
    sheet= workbook.getSheetAt(0);
     
    for( i=1; i< sheet.getLastRowNum(); i++);{
        // Import data for Username.
        cell = sheet.getRow(i).getCell(0);
        cell.setCellType(CellType.STRING);
        driver.findElement(textfield_userName).sendKeys(cell.getStringCellValue());
         
        // Import data for password.
        cell = sheet.getRow(i).getCell(1);
        cell.setCellType(CellType.STRING);
        driver.findElement(textfield_password).sendKeys(cell.getStringCellValue());         
       }
 	} 
public void clickLogin() throws InterruptedException{
    driver.findElement(button_login).click();
    Thread.sleep(10000);
    }

public void verifyLeaveAllocationGraphAppeared(String strleaveheader) throws InterruptedException{
	//isDisplayed() method returns boolean value either True or False
	Boolean Display = driver.findElement(graph_leaveHeader).isDisplayed();
	System.out.println("Element displayed is :"+Display);
	/*//isEnabled() method returns boolean value either True or False 
	Boolean Enable = driver.findElement(graph_leaveHeader).isEnabled();
	System.out.println("Element enabled is :"+Enable);*/
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	 String LabelleaveHeader= driver.findElement(graph_leaveHeader).getText();
	 System.out.println("The Generated Value is :"+LabelleaveHeader);
	 AssertJUnit.assertEquals(strleaveheader,LabelleaveHeader);
	 
	 System.out.println("Dashboard Leave Allocation chart - Assert pass");
	 System.out.println("==========================================");
	 Thread.sleep(1000);
	}

public void verifyValidationMessageforIncorrectLogin(){
	//Your username or password is incorrect
	//clear ur and pass field
	//enternew pass
}

}








/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class LoginPage {

	WebDriver driver;

    By textfield_userName = By.xpath("//*[@id=\"userName\"]");
    By textfield_password = By.xpath("//*[@id=\"password\"]");
    By button_login = By.id("hrmLogin");
    
   public LoginPage (WebDriver driver){
        this.driver = driver;
        }

    public void setUserName(String strUserName) throws InterruptedException{
    //Thread.sleep(20000);
    driver.findElement(textfield_userName).sendKeys(strUserName);
    }
    
    public void setPassword(String strPasword){
        driver.findElement(textfield_password).sendKeys(strPasword);
        }
    
    public void clickLogin(){
        driver.findElement(button_login).click();
        }*/
    
    /*public void loginToHRMS(String strUserName, String strPasword) throws InterruptedException{

        //Fill user name
    	Thread.sleep(2000);
    	System.out.println("Inside the method login,waited for 2000ms");

         this.setUserName(strUserName);

        //Fill password
        this.setPassword(strPasword);

        //Click Login button
        this.clickLogin();        
    }*/
    

//}

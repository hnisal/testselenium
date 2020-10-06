package com.aviorsys.HRMS_pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicPageConfirm {

	WebDriver driver;

    By textfield_userName = By.xpath("//*[@id=\"userName\"]");
    By textfield_password = By.xpath("//*[@id=\"password\"]");
    By button_login = By.id("hrmLogin");
    
   public BasicPageConfirm (WebDriver driver){
        this.driver = driver;
        }

    //Set user name in textbox
    public void setUserName(String strUserName) throws InterruptedException{
    Thread.sleep(20000);
    driver.findElement(textfield_userName).sendKeys(strUserName);
    }
    
    public void setPassword(String strPasword){
        driver.findElement(textfield_password).sendKeys(strPasword);
        }
    
    public void clickLogin() throws InterruptedException{
        driver.findElement(button_login).click();
        Thread.sleep(2000);
        }
}


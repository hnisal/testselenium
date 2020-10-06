package com.aviorsys.HRMS_pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ESSDashboardPage {

	WebDriver driver;

	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By table_weekBirthdays = By.id("weekly-bdays");
	By table_recentActivities = By.id("rec_Act");
	
	public ESSDashboardPage(WebDriver driver) {
		this.driver = driver;
		}
	
	public void clickNavigationExpand() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(button_navigationExpand).click();
		Thread.sleep(5000);
		}
	
	//get all records in the grid
	public void getRecentActivitiesPanelValues(){
		String actualName;
		if((actualName = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(table_recentActivities)).getText()) != null){
		System.out.println("The Generated Value is : "+actualName);
		}
		else{
			System.out.println("Recent Activities = No Data");	
		}
	}
	
	public void getWeeklyBirthdayPanelValues(){
		String actualName;
		if((actualName = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(table_weekBirthdays)).getText()) != null){
			System.out.println("The Generated Value is : "+actualName);
			}
		else{
			System.out.println("Weekly Birthday - No Data");	
		}
	}
	
}
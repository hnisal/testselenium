package com.aviorsys.HRMS_pageobject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;

public class ESSLeaveApplyPage {

	WebDriver driver;

	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_myProfile = By.xpath("//*[@id=\"wrapper\"]/div[1]/div/ul/li[3]/a");
	By button_requestleave = By.xpath("//*[@id=\"my_prof\"]/li/a[1]");
	By button_leaveRequest = By.id("btnLeaveReq");
	By header_requestFormTitle = By.className("modal-title");
	By unchangebletxtfield_leaveRequestNo = By.id("att_leave_req_number");
	By autofilldropdown_year = By.cssSelector("#s2id_att_leave_year > a");
	By dropdown_leaveType = By.xpath("//*[@id=\"s2id_att_leave_type\"]/a");
	By calendar_startDate = By.id("att_leave_start_date");// calendar locator
	By calendar_endDate = By.id("att_leave_end_date");// calendar locator
	By drpdown_startTime = By.id("att_leave_start_date");
	By drpdown_endTime = By.xpath("//*[@id=\"s2id_att_leave_end_time\"]/a");
	By drpdowncal_startDate = By.xpath("/html/body/div[6]/div[1]/div[2]");
	By drpdowncal_endtDate = By.xpath("/html/body/div[7]/div[1]/div[2]");
	By autofilltextfield_noofDays = By.id("att_leave_numbr_days");
	By textfield_ReasonTask = By.id("att_leave_reason");
	By drpdown_coveringPerson = By.cssSelector("#s2id_att_leave_covering_person > a:nth-child(1)");
	By dropdown_confirmOfficer = By.cssSelector("#s2id_att_leave_conf_officer > a:nth-child(1)");
	By unchangebletextfield_reportingOfficer = By.id("att_leave_rep_officer");
	By unchangebletextfield_postReportingOfficer = By.id("att_leave_post_rep_officer");
	By button_reset = By.id("reset_leave_req_form");
	By button_submit = By.id("save_leave_req_form");
	By toastmsg_Body = By.className("toast-message");

	By button_leaveHistory = By.id("view_my_leave_history");
	By header_leaveHistoryFormTitle = By.id("myLargeModalLabel");
	By autofilldropdown_yearHistoryLeave = By.cssSelector("#s2id_leave_history_year > a:nth-child(1)");
	By dropdown_month = By.cssSelector("#s2id_leave_history_month > a:nth-child(1)");
	By button_load = By.id("load_my_leave_history");
	By grid_dataTable = By.cssSelector("#leave_history_dxdatagrid > div:nth-child(1) > div:nth-child(6)");

	public ESSLeaveApplyPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickNavigationExpand() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(button_navigationExpand).click();
		Thread.sleep(4000);
	}

	public void clickMyProfile() {
		driver.findElement(button_myProfile).click();
	}

	public void clickRequestLeave() throws InterruptedException {
		driver.findElement(button_requestleave).click();
		Thread.sleep(4000);
	}

	public void clickLeaveRequest() throws InterruptedException {
		driver.findElement(button_leaveRequest).click();
		Thread.sleep(3000);
	}

	public void verifyLeaveFormHeader(String strleaveHeader) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String LeaaveHeader = driver.findElement(header_requestFormTitle).getText();
		AssertJUnit.assertEquals(strleaveHeader, LeaaveHeader);
		System.out.println(LeaaveHeader + " is correct.Assert passed");
	}

	public void verifyLeaveRequestNoAppeared(String strLeavereequestNo) throws InterruptedException {
		// Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String LeaveReqestNo = driver.findElement(unchangebletxtfield_leaveRequestNo).getAttribute("value");
		AssertJUnit.assertEquals(strLeavereequestNo, LeaveReqestNo);
		System.out.println(LeaveReqestNo + " is correct.Assert passed");
	}

	public void verifyYearAppeareCorrect(String stryear) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String defaultyear = driver.findElement(autofilldropdown_year).getText();
		AssertJUnit.assertEquals(stryear, defaultyear);
		System.out.println(defaultyear + " is correct.Assert passed");
	}

	public void selectLeaveType() throws InterruptedException {
		driver.findElement(dropdown_leaveType).click();// click on that combo
		for (int i = 0; i <= 5; i++) {// 1 is the position of the element which
										// you want
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(3000);
		}
	}

	public void chooseLeaveType() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();// press enter
		Thread.sleep(6000);
	}

	public void openCalendarforStartDate() {
		driver.findElement(calendar_startDate).click();
	}

	public void pickCurrentDateforStartDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date today = Calendar.getInstance().getTime();
		String date = dateFormat.format(today);
		System.out.println(date);
		driver.findElement(calendar_startDate).sendKeys(date);
	}
	
	
	public void currentZdatepic()throws InterruptedException{

		driver.findElement(calendar_startDate).click();
		Thread.sleep(2000);

		Date d = new Date(1);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		String date = formatter.format(d);
		String splitter[] = date.split("-");
		String month_year = splitter[1];
		String day = splitter[0]; 
		System.out.println(month_year);
		System.out.println(day);
		selectDate(month_year,day); 
		Thread.sleep(3000);
		}
				

		public void selectDate(String month_year, String select_day) throws InterruptedException{
		{ 
		List<WebElement> elements = driver.findElements(calendar_startDate);

		for (int i=0; i<elements.size();i++)
		{
		System.out.println(elements.get(i).getText());

		//Selecting the month
		if(elements.get(i).getText().equals(month_year)){ 

		//Selecting the date 
		List<WebElement> days = driver.findElements(drpdowncal_startDate);

		for (WebElement d:days){ 
		System.out.println(d.getText());
		
		if(d.getText().equals(select_day)){
		d.click();
		Thread.sleep(10000);
		return;}
		} 
		
		} 
		
		}

		driver.findElement(drpdowncal_startDate).click();
		selectDate(month_year,select_day);
		}
}
	
		
		

	public void pickDateforStartDate() {
		driver.findElement(drpdowncal_startDate).click();

	}

	public void selectStartTime() throws InterruptedException {
		driver.findElement(drpdown_startTime).click();// click on that combo
		for (int i = 0; i <= 1; i++) {// 1 is the position of the element which
										// you want
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(3000);
		}
	}

	public void chooseStartTime() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();// press enter
	}

	public void openCalendarforEndtDate() {
		driver.findElement(calendar_endDate).click();
	}

	public void pickDateforEndDate() {
		driver.findElement(drpdowncal_endtDate).click();
	}

	public void selectEndTime() throws InterruptedException {
		driver.findElement(drpdown_endTime).click();// click on that combo
		for (int i = 0; i <= 1; i++) {// 1 is the position of the element which
										// you want
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(3000);
		}
	}

	public void chooseEndTime() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();// press enter
	}

	public void verifyNoofLeave() throws InterruptedException {
		Thread.sleep(6000);
		String NoofLeaave = driver.findElement(autofilltextfield_noofDays).getText();
		System.out.println(NoofLeaave + " is correct.Assert passed");
	}

	public void enterReason(String strReason) throws InterruptedException {
		driver.findElement(textfield_ReasonTask).sendKeys(strReason);
		Thread.sleep(2000);
	}

	public void selectCoveringPerson() throws InterruptedException {
		driver.findElement(drpdown_coveringPerson).click();// click on that
															// combo
		for (int i = 0; i <= 2; i++) {// 1 is the position of the element which
										// you want
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(3000);
		}
	}

	public void chooseCoveringPerson() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();// press enter
		Thread.sleep(6000);
	}

	public void selectConfirmOfficer() throws InterruptedException {
		driver.findElement(dropdown_confirmOfficer).click();// click on that
															// combo
		for (int i = 0; i <= 0; i++) {// 1 is the position of the element which
										// you want
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(3000);
		}
	}

	public void chooseConfirmOfficer() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();// press enter
		Thread.sleep(6000);
	}

	public void verifyReportingOfficerAppeareCorrect(String reportingofficer) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String ReportingOfficer = driver.findElement(unchangebletextfield_reportingOfficer).getAttribute("value");
		AssertJUnit.assertEquals(reportingofficer, ReportingOfficer);
		System.out.println(ReportingOfficer + " is correct.Assert passed");
	}

	public void verifyPostReportingOfficerAppeareCorrect(String postreportingofficer) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String PostReportingOfficer = driver.findElement(unchangebletextfield_postReportingOfficer)
				.getAttribute("value");
		AssertJUnit.assertEquals(postreportingofficer, PostReportingOfficer);
		System.out.println(PostReportingOfficer + " is correct.Assert passed");
	}

	public void clickReset() {
		driver.findElement(button_reset).click();
	}

	public void clickSubmit() {
		driver.findElement(button_submit).click();
	}

	public void catchToastrMessage(String strtoastmsg) {
		String Toast_Message = driver.findElement(toastmsg_Body).getText();
		System.out.println("The toast message is : " + Toast_Message);
		AssertJUnit.assertEquals(strtoastmsg, Toast_Message);
	}

	public void clickMyLeaveHistory() {
		driver.findElement(button_leaveHistory).click();
	}

	public void verifyLeaveHistoryFormHeader(String strleavehistoryHeader) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String LeaaveHistoryHeader = driver.findElement(header_leaveHistoryFormTitle).getText();
		AssertJUnit.assertEquals(strleavehistoryHeader, LeaaveHistoryHeader);
		System.out.println(LeaaveHistoryHeader + " is correct.Assert passed");
	}

	public void verifyHistoryYearAppeareCorrect(String stryear) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String defaultyear = driver.findElement(autofilldropdown_yearHistoryLeave).getText();
		AssertJUnit.assertEquals(stryear, defaultyear);
		System.out.println(defaultyear + " is correct.Assert passed");
	}

	public void selectMonth() throws InterruptedException {
		driver.findElement(dropdown_month).click();// click on that combo
		for (int i = 0; i <= 4; i++) {// 1 is the position of the element which
										// you want
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(3000);
		}
	}

	public void chooseMonth() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();// press enter
		Thread.sleep(6000);
	}

	public void getTableValues() throws InterruptedException {
		Thread.sleep(6000);
		String NoofLeaave = driver.findElement(grid_dataTable).getText();
		System.out.println(NoofLeaave);
	}

	public void clickLoad() throws InterruptedException {
		driver.findElement(button_load).click();
		Thread.sleep(3000);
	}

}

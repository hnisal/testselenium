package com.aviorsys.HRMS_tests;

import org.junit.Test;
import com.aviorsys.HRMS_pageobject.LeaveCancellationHRPage;

public class LeaveCancellationHRTest extends BasicTest {

	LeaveCancellationHRPage LeaveCancelHRPage;
	
@Test

	public void test_Cancel_LeaveHR() throws InterruptedException{
	System.out.println("@test_Leave Cancellation by HR-start");
	LeaveCancelHRPage = new LeaveCancellationHRPage(driver);
	
	LeaveCancelHRPage.clickNavigationExpand();
	LeaveCancelHRPage.clickTimeandAttendance();
	LeaveCancelHRPage.clickLeaveCancellation();
	LeaveCancelHRPage.selectCompany();
	LeaveCancelHRPage.chooseCompany();
	//LeaveCancelHRPage.selectDivision();
	//LeaveCancelHRPage.chooseDivision();
	//LeaveCancelHRPage.selectUnit();
	//LeaveCancelHRPage.chooseUnit();
	LeaveCancelHRPage.selectEmployee();
	LeaveCancelHRPage.chooseEmployee();
	LeaveCancelHRPage.clearFromDate();
	LeaveCancelHRPage.selectFromDate("2020-04-01");
	LeaveCancelHRPage.clearToDate();
	LeaveCancelHRPage.selectFromDate("2020-06-01");
	LeaveCancelHRPage.clickLoad();
	LeaveCancelHRPage.selectRecordToDelete();
	LeaveCancelHRPage.enterCancelReason("Testing");
	LeaveCancelHRPage.clickCancelLeave();
	//LeaveCancelHRPage
	
		}


}

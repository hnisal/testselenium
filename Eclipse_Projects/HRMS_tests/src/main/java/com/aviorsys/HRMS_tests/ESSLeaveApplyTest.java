package com.aviorsys.HRMS_tests;

import org.junit.Test;
import com.aviorsys.HRMS_pageobject.ESSLeaveApplyPage;

public class ESSLeaveApplyTest extends BasicTestConfirm{
	ESSLeaveApplyPage ApplyESSLeavePage;
	
@Test
	public void test_a_ESS_Leave_Apply() throws InterruptedException{
		System.out.println("@Test a - Verify ESS Leave Apply");
		Thread.sleep(2000);	
		//Create ESSLeaveApply Page object
		ApplyESSLeavePage = new ESSLeaveApplyPage (driver);
		
		ApplyESSLeavePage.clickNavigationExpand();
		ApplyESSLeavePage.clickMyProfile();
		ApplyESSLeavePage.clickRequestLeave();
		ApplyESSLeavePage.clickLeaveRequest();
		ApplyESSLeavePage.verifyLeaveFormHeader("Leave Request Form");
		ApplyESSLeavePage.verifyLeaveRequestNoAppeared("LA2020/010966");
		ApplyESSLeavePage.verifyYearAppeareCorrect("2020");
		ApplyESSLeavePage.selectLeaveType();
		ApplyESSLeavePage.chooseLeaveType();
		//ApplyESSLeavePage.pickCurrentDateforStartDate();
		ApplyESSLeavePage.currentZdatepic();
		//ApplyESSLeavePage.selectDate(2020/09, 25);
}
		
		
		/*ApplyESSLeavePage.selectStartTime();
		ApplyESSLeavePage.chooseStartTime();
		ApplyESSLeavePage.openCalendarforStartDate();
		ApplyESSLeavePage.pickDateforStartDate();
		ApplyESSLeavePage.selectEndTime();
		ApplyESSLeavePage.chooseEndTime();
		ApplyESSLeavePage.openCalendarforEndtDate();
		ApplyESSLeavePage.pickDateforEndDate();
		ApplyESSLeavePage.chooseEndTime();
		ApplyESSLeavePage.verifyNoofLeave();
		ApplyESSLeavePage.enterReason("PersonalTest");
		//ApplyESSLeavePage.selectCoveringPerson();
		//ApplyESSLeavePage.chooseCoveringPerson();
		ApplyESSLeavePage.selectConfirmOfficer();
		ApplyESSLeavePage.chooseConfirmOfficer();
		ApplyESSLeavePage.verifyReportingOfficerAppeareCorrect("Nalaka Wimalaratne");
		ApplyESSLeavePage.verifyPostReportingOfficerAppeareCorrect("Nalaka Wimalaratne");
		//ApplyESSLeavePage.clickReset();
		ApplyESSLeavePage.clickSubmit();
		ApplyESSLeavePage.catchToastrMessage("Your pre leave request has been successfully sent for approval");
	}*/
		
@Test
public void test_b_ESS_Leave_History() throws InterruptedException{
	System.out.println("@Test a - Verify ESS View My Leave History");
	Thread.sleep(2000);
	ApplyESSLeavePage = new ESSLeaveApplyPage (driver);
	
	ApplyESSLeavePage.clickNavigationExpand();
	ApplyESSLeavePage.clickMyProfile();
	ApplyESSLeavePage.clickRequestLeave();
	ApplyESSLeavePage.clickMyLeaveHistory();
	ApplyESSLeavePage.verifyLeaveHistoryFormHeader("Leave History");
	ApplyESSLeavePage.verifyHistoryYearAppeareCorrect("2020");
	ApplyESSLeavePage.selectMonth();
	ApplyESSLeavePage.chooseMonth();
	ApplyESSLeavePage.clickLoad();
	ApplyESSLeavePage.getTableValues();
	
	}
}
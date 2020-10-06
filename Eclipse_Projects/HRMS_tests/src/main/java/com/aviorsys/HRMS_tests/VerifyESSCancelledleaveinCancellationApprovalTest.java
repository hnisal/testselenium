package com.aviorsys.HRMS_tests;

import org.junit.Test;
//import com.aviorsys.HRMS_pageobject.VerifyESSCancelledLeaveinCancellationApprovalPage;
import com.aviorsys.HRMS_pageobject.VerifyESSCancelledleaveinCancellationApprovalPage;


public class VerifyESSCancelledleaveinCancellationApprovalTest extends BasicTestApprove {
	
	VerifyESSCancelledleaveinCancellationApprovalPage ESSCancelledleaveinCancellationApprovalPage;

@Test

	public void test_a_ESS_Leave_Cancellation_Approval() throws InterruptedException{
		System.out.println("@Test a - Verify ESS Leave Appeared in Cancellation_Approval");
		Thread.sleep(2000);
		
		//Create ESSLeavecancel Page object
		ESSCancelledleaveinCancellationApprovalPage = new VerifyESSCancelledleaveinCancellationApprovalPage(driver);
		
		
		ESSCancelledleaveinCancellationApprovalPage.clickNavigationExpand();
		ESSCancelledleaveinCancellationApprovalPage.clickLeaveCancellationApprove();
		ESSCancelledleaveinCancellationApprovalPage.clickLeaveCancellation();
		ESSCancelledleaveinCancellationApprovalPage.verifyLeaveCancellationApproveInterfaceHeader("Leave Cancellation Approval");
		ESSCancelledleaveinCancellationApprovalPage.getTableValues();
		ESSCancelledleaveinCancellationApprovalPage.switchToRespectiveEditButton();
		ESSCancelledleaveinCancellationApprovalPage.verifyLeaveCancelRequestDetailPanelHeader("Leave Cancellation Request Details");
		ESSCancelledleaveinCancellationApprovalPage.verifyLeaveRequestNo("LA2020/010959");
		ESSCancelledleaveinCancellationApprovalPage.verifyLeaveYear("2020");
		ESSCancelledleaveinCancellationApprovalPage.verifyLeaveType("Work From Home");
		ESSCancelledleaveinCancellationApprovalPage.verifyLeaveCancelledDate("2020/09/17");
		ESSCancelledleaveinCancellationApprovalPage.verifyLeaveCancelledTime("11:56:29");
		ESSCancelledleaveinCancellationApprovalPage.verifyLeaveStartDate("2020/09/15");
		ESSCancelledleaveinCancellationApprovalPage.verifyLeaveStartTime("Morning");
		ESSCancelledleaveinCancellationApprovalPage.verifyLeaveEndDate("2020/09/15");
		ESSCancelledleaveinCancellationApprovalPage.verifyLeaveEndTime("Evening");
		ESSCancelledleaveinCancellationApprovalPage.verifyNoofDays("1.00");
		ESSCancelledleaveinCancellationApprovalPage.verifyReasonforCancellation("Testing Leave Cancellation Outomation");
		
		ESSCancelledleaveinCancellationApprovalPage.verifyEmployeeDetailPanelHeader("Employee Details");
		//ESSCancelledleaveinCancellationApprovalPage.getAllEmployeeDetails();
		ESSCancelledleaveinCancellationApprovalPage.getEmployeeDetailsLabelName("Employee Name : Anuradhika Wijayathilake");
		ESSCancelledleaveinCancellationApprovalPage.getEmployeeDetailsLabelEPF("EPF/Ref No : AITS025");
		ESSCancelledleaveinCancellationApprovalPage.getEmployeeDetailsLabelDesignation("Designation : Associate Quality Assurance Engineer");
		ESSCancelledleaveinCancellationApprovalPage.getEmployeeDetailsLabelComplex("Complex : Head Office");
		
		ESSCancelledleaveinCancellationApprovalPage.clickApprove();
		ESSCancelledleaveinCancellationApprovalPage.catchToastrMessage("Leave cancellation request has been successfully approved");
	}
}
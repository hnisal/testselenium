package com.aviorsys.HRMS_tests;

import org.junit.After;
import org.junit.Test;
import com.aviorsys.HRMS_pageobject.LeaveConfirmationPage;

public class LeaveConfirmationTest  extends BasicTestConfirm {
	
LeaveConfirmationPage LeaveConfirmPage;
	
@Test
    
    public void test_a_Individual_Leave_Confirmation() throws InterruptedException{
	    System.out.println("@Test a - Verify individual Leave Confirmation");
	    Thread.sleep(2000);	
	    	//Create LeaveConfirmation Page object
	    LeaveConfirmPage = new LeaveConfirmationPage (driver);
	    
	    LeaveConfirmPage.clickNavigationExpand();
	    LeaveConfirmPage.clickConfirmApprove();
	    LeaveConfirmPage.clickLeaveConfirmation();
	    LeaveConfirmPage.verifyLeaveConfirmHeader("Leave Request Confirmation");
	    LeaveConfirmPage.checkRecordsinGrid();
	    LeaveConfirmPage.clickLeaveRequestEdit();
	    LeaveConfirmPage.verifyLeaveRquesttHeader("Leave Confirmation");
	    LeaveConfirmPage.verifyLeaveRquestedEmpDetailHeader("Employee Details");
	    LeaveConfirmPage.verifyLeaveAllocationHeader("Leave Allocation Chart");
	    LeaveConfirmPage.clickLeaveConfirmButton();
	    //LeaveConfirmPage.clickLeaveRejectButton();
	    LeaveConfirmPage.catchToastrMessage("Leave request have been successfully confirmed"); 
	    LeaveConfirmPage.checkRecordsinGrid();
	    
	    System.out.println("1st test successfully Completed");
	    System.out.println("                                                   ");
	    System.out.println("                                                   ");
      	}

@Test

public void test_b_Bulk_Leave_Confirmation() throws InterruptedException{
    System.out.println("@Test b - Verify Bulk Leave Confirmation");
    Thread.sleep(2000);	
    	//Create LeaveConfirmation Page object
    LeaveConfirmPage = new LeaveConfirmationPage (driver);
    
    LeaveConfirmPage.clickNavigationExpand();
    LeaveConfirmPage.clickConfirmApprove();
    LeaveConfirmPage.clickLeaveConfirmation();
    LeaveConfirmPage.verifyLeaveConfirmHeader("Leave Request Confirmation");
    LeaveConfirmPage.checkRecordsinGrid();
    LeaveConfirmPage.clickSelectAllButton();
    LeaveConfirmPage.clickBulkConfirmButton();
    LeaveConfirmPage.catchToastrMessage("Leave requests have been successfully confirmed");
	}

/*@After

	public void test_Browser_Close(){
	driver.quit();
	}*/

}

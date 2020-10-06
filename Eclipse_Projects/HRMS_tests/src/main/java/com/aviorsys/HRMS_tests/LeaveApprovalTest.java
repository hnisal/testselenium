package com.aviorsys.HRMS_tests;

import org.junit.After;
import org.junit.Test;
import com.aviorsys.HRMS_pageobject.LeaveApprovalPage;

public class LeaveApprovalTest  extends BasicTestApprove {
		
	LeaveApprovalPage LeaveApprovePage;
		
@Test
	    
	public void test_a_Individual_Leave_Approval() throws InterruptedException{
		System.out.println("@Test a - Verify individual Leave Approval");
		Thread.sleep(2000);	
		//Create LeaveConfirmation Page object
		LeaveApprovePage = new LeaveApprovalPage (driver);
		    
		LeaveApprovePage.clickNavigationExpand();
		LeaveApprovePage.clickConfirmApprove();
		LeaveApprovePage.clickLeaveConfirmation();
		LeaveApprovePage.verifyLeaveConfirmHeader("Leave Request Approval");
		LeaveApprovePage.checkRecordsinGrid();
		LeaveApprovePage.clickLeaveRequestEdit();
		LeaveApprovePage.verifyLeaveRquesttHeader("Leave Approval");
		LeaveApprovePage.verifyLeaveRquestedEmpDetailHeader("Employee Details");
		LeaveApprovePage.verifyLeaveAllocationHeader("Leave Allocation Chart");
		LeaveApprovePage.clickLeaveApproveButton();
		//LeaveApprovePage.clickLeaveRejectButton();
		LeaveApprovePage.catchToastrMessage("Leave request have been successfully Approved"); 
		//LeaveApprovePage.checkRecordsinGrid();
		LeaveApprovePage.getTableValues();
		    
		System.out.println("1st test successfully Completed");
		System.out.println("                                                   ");
		System.out.println("                                                   ");
	   	}

@Test

	public void test_b_Bulk_Leave_Approval() throws InterruptedException{
	    System.out.println("@Test b - Verify Bulk Leave Approval");
	    Thread.sleep(2000);	
	    	//Create LeaveConfirmation Page object
	    LeaveApprovePage = new LeaveApprovalPage (driver);
	    
	    LeaveApprovePage.clickNavigationExpand();
	    LeaveApprovePage.clickConfirmApprove();
	    LeaveApprovePage.clickLeaveConfirmation();
	    LeaveApprovePage.verifyLeaveConfirmHeader("Leave Request Approval");
	    LeaveApprovePage.checkRecordsinGrid();
	    LeaveApprovePage.clickSelectAllButton();
	    LeaveApprovePage.clickBulkApproveButton();
	    //LeaveApprovePage.selectmulipleRowUsingControlKey();
	    //LeaveApprovePage.doubleclickforBulkApproveButton();
	    LeaveApprovePage.catchToastrMessage("Leave requests have been successfully Approved");
		}

@After

		public void test_Browser_Close(){
		driver.quit();
		}

	}

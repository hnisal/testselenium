package com.aviorsys.HRMS_tests;

import org.junit.Test;
import com.aviorsys.HRMS_pageobject.LeaveAllocationPage;

public class LeaveAllocationTest extends BasicTest{

	LeaveAllocationPage AllocationPage;
	
	@Test
	
	 public void test_Employee_Appear_Correct_In_Leave_Allocation_Interface() throws InterruptedException{
    	System.out.println("@test_Allocate_Leave_for_Employee-female permanent employee");
       
    	//Create LeaveAllocation Page object
    	AllocationPage = new LeaveAllocationPage(driver);
    	
    	AllocationPage.clickNavigationExpand();
    	AllocationPage.clickTimeandAttendance();
    	AllocationPage.clickLeaveallocation();
    	AllocationPage.selectEPFOption("AITS025");
    	//AllocationPage.verifyEmployeeNameAppeared("Hitihami Mudiyanselage Anuradhika Ravini Wijayathilake");
    	//AllocationPage.verifyEmployeeCompanyAppeared("Antler IT Solutions (Pvt) Ltd");
    	//AllocationPage.verifyEmployeeUnitAppeared("QA");
    	//AllocationPage.verifyEmployeeParollProfileAppeared("Staff");
    	AllocationPage.clearAnnualLeave();
    	AllocationPage.enterAnnualLeave("20");
    	//AllocationPage.saveAnnualLeave();
    	//AllocationPage.clickSubmittoSave();
    	//AllocationPage.verifyAnnualLeaveMaximum("The maximum number of leaves allowed to allocate for annual leaves is 14");
    	
	}
	
	/*@Test
		
	public void test_Annual_Leave_Allocation_Exceed_The_Maximum(){
		AllocationPage = new LeaveAllocationPage(driver);
		
	}*/
	
}

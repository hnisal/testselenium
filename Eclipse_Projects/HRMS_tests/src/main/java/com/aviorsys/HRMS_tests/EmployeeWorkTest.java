package com.aviorsys.HRMS_tests;

import org.junit.Test;
import com.aviorsys.HRMS_pageobject.EmployeeWorkPage;

public class EmployeeWorkTest extends BasicTest {
	
	EmployeeWorkPage ToEmployeeWorkPage;
	
	@Test
    
    public void test_a_Primary_Details_in_Work() throws InterruptedException{
	    System.out.println("@Test - Verify the newly added employee's details are loadded to the work tab");
	    Thread.sleep(2000);	
	    	//Create EmployeeWork Page object
	    ToEmployeeWorkPage = new EmployeeWorkPage (driver);
	    
	    ToEmployeeWorkPage.clickNavigationExpand();
	    ToEmployeeWorkPage.clickEmployeeProfile();
	    ToEmployeeWorkPage.clickCreateNew();
	    ToEmployeeWorkPage.clickNewlyEnteredEmployee();
	    ToEmployeeWorkPage.verifyEmployeeProfileDefaultHeader("Employee Profile  ");
	    ToEmployeeWorkPage.verifyEmployeeProfileNameHeader("Employee Profile   Navoda Somarathne - AITS37");
	    ToEmployeeWorkPage.clickWorkTab();
	    ToEmployeeWorkPage.verifyColapsibleHeaderOrg("Organizational Information");
	    ToEmployeeWorkPage.clickColapsibleHeaderOrganizational();
	    ToEmployeeWorkPage.verifyGroup("Antler Group of Companies");
	    ToEmployeeWorkPage.verifyCompany("ANTLER IT SOLUTIONS (PVT) LTD");
	    ToEmployeeWorkPage.verifyComplex("HEAD OFFICE");
	    ToEmployeeWorkPage.verifyCompanyStartDate("2020-07-06");
	    
	    ToEmployeeWorkPage.verifyColapsibleHeaderIdenti("Employee Identification Information");
	    ToEmployeeWorkPage.clickColapsibleHeaderIdentification();
	    ToEmployeeWorkPage.verifyEmpType("COMPANY EMPLOYEE (PROBATION)");
	    ToEmployeeWorkPage.verifyAttProfile("5OT");
	    ToEmployeeWorkPage.verifyEpfRefNo("AITS37");
	    ToEmployeeWorkPage.verifyEmpCardID("1212121212");
	    
	    ToEmployeeWorkPage.verifyColapsibleHeaderAppoint("Appointment Information");
	    ToEmployeeWorkPage.clickColapsibleHeaderAppointment();
	    ToEmployeeWorkPage.verifyDateofAppointment("2020-07-06");
	    ToEmployeeWorkPage.verifyConfirmationDate("2021-01-06");
	    ToEmployeeWorkPage.verifyRetirementDate();
	    ToEmployeeWorkPage.verifyEmployeeStatus("ACTIVE");
	    
	}
	
	@Test
	
	 public void test_b_Enter_Employee_Work_Details() throws InterruptedException{
	    System.out.println("@Test - Enter work details of newly added employee");
	   Thread.sleep(2000);	
	    	//Create EmployeeWork Page object
	    ToEmployeeWorkPage = new EmployeeWorkPage (driver);
	    
	    ToEmployeeWorkPage.enterNewEPFforUniversalSearch("AITS37");
	    ToEmployeeWorkPage.verifyEmployeeProfileNameHeader("Employee Profile  ");
	    ToEmployeeWorkPage.verifyEmployeeProfileDefaultHeader("Employee Profile   Navoda Somarathne - AITS37");
	    ToEmployeeWorkPage.clickWorkTab();
	    ToEmployeeWorkPage.verifyColapsibleHeaderOrg("Organizational Information");
	    ToEmployeeWorkPage.clickColapsibleHeaderOrganizational();
	    ToEmployeeWorkPage.selectDivision();
	    ToEmployeeWorkPage.chooseDivision();
	    ToEmployeeWorkPage.selectUnit();
	    ToEmployeeWorkPage.chooseUnit();
	    ToEmployeeWorkPage.selectComplex();
	    ToEmployeeWorkPage.chooseComplex();
	    ToEmployeeWorkPage.selectLocation();
	    ToEmployeeWorkPage.chooseLocation();
	    ToEmployeeWorkPage.selectReportingOfficer();
	    ToEmployeeWorkPage.chooseReportingOfficer();
	    ToEmployeeWorkPage.selectPostReportingOfficer();
	    ToEmployeeWorkPage.choosePostReportingOfficer();
	    ToEmployeeWorkPage.clearEffectiveDate();
	    ToEmployeeWorkPage.selectEffectiveDate("2020-07-06");
	    
	    ToEmployeeWorkPage.verifyColapsibleHeaderIdenti("Employee Identification Information");
	    ToEmployeeWorkPage.clickColapsibleHeaderIdentification();
	    ToEmployeeWorkPage.selectAttendanceProfile();
	    ToEmployeeWorkPage.chooseAttendanceProfle();
	    ToEmployeeWorkPage.enterABHNo("1231231");
	    ToEmployeeWorkPage.selectABHStatus();
	    ToEmployeeWorkPage.chooseABHStatus();
	    
	    ToEmployeeWorkPage.verifyColapsibleHeaderEmployeePosition("Employee Position");
	    ToEmployeeWorkPage.clickColapsibleEmployeePosition();
	    ToEmployeeWorkPage.selectJobCategory();
	    ToEmployeeWorkPage.chooseJobCategory();
	    ToEmployeeWorkPage.selectDesignation();
	    ToEmployeeWorkPage.chooseDesignation();
	    ToEmployeeWorkPage.selectPayrollCategory();
	    ToEmployeeWorkPage.choosePayrollCategory();
	    ToEmployeeWorkPage.selectPayrollProfile();
	    ToEmployeeWorkPage.choosePayrollProfile();
	    ToEmployeeWorkPage.selectPayrollUnit();
	    ToEmployeeWorkPage.choosePayrollUnit();
	    ToEmployeeWorkPage.selectPayrollGrade();
	    ToEmployeeWorkPage.choosePayrollGrade();
	    ToEmployeeWorkPage.selectOvertimeCategory();
	    ToEmployeeWorkPage.chooseOvertimeCategory();
	    ToEmployeeWorkPage.enterJobDescription("Business Analyst -Testing");
	    
	    ToEmployeeWorkPage.verifyColapsibleHeaderAppoint("Appointment Information");
	    ToEmployeeWorkPage.clickColapsibleHeaderAppointment();
	    
	    ToEmployeeWorkPage.verifyColapsibleHeaderExperience("Experience");
	    ToEmployeeWorkPage.clickColapsibleHeaderExperience();
	    ToEmployeeWorkPage.enterCompanyName("ABC Testing Company");
	    ToEmployeeWorkPage.clickYearUp();
	    ToEmployeeWorkPage.clickYearDown();
	    ToEmployeeWorkPage.clickMonthUp();
	    ToEmployeeWorkPage.clickMonthDown();
	    ToEmployeeWorkPage.enterPositionheld("Associate BA -Test");
	    ToEmployeeWorkPage.enterOtherRemarks("Testing - QA Analyst");
	    ToEmployeeWorkPage.clickAdd();
	    //ToEmployeeWorkPage.clickSave();
	    
	}

}

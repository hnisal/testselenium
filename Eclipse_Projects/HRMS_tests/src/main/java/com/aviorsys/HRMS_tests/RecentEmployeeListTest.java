package com.aviorsys.HRMS_tests;

import org.junit.Test;
import com.aviorsys.HRMS_pageobject.BasicPage;
import com.aviorsys.HRMS_pageobject.RecentEmployeeListPage;

public class RecentEmployeeListTest extends BasicTest {
	
	RecentEmployeeListPage ToPersonalPage;
	BasicPage HRMSBasePage;
	
	
	@Test
     
     public void test_Primary_Details_in_Personal() throws InterruptedException{
	    System.out.println("@Test - Verify the newly added employee's details are loadded to the personal tab");
	   Thread.sleep(2000);	
	    	//Create RecentEmployeeList Page object
	    ToPersonalPage = new RecentEmployeeListPage (driver);
	    
	   ToPersonalPage.clickNavigationExpand();
	   ToPersonalPage.clickEmployeeProfile(); 
	   ToPersonalPage.clickCreateNew();
	   ToPersonalPage.verifyRecentEmployeeListContainTenEmployees();
	   ToPersonalPage.verifyRecentEmployeeListContent();
	   ToPersonalPage.clickNewlyEnteredEmployee();
	   ToPersonalPage.verifyPersonalTabdefaultHeader("Employee Profile  ");
	   ToPersonalPage.verifyPersonalTabHeader("Navoda Somarathne - AITS37");
	   ToPersonalPage.verifyColapsibleHeader("Personal Information");
	   ToPersonalPage.verifyInitials("R.M.N.R");
	   ToPersonalPage.verifyTitle("MISS");
	   ToPersonalPage.verifyFirstName("Navoda");
	   ToPersonalPage.verifyMiddleName("Riviprabha");
	   ToPersonalPage.verifyLastName("Somarathne");
	   ToPersonalPage.verifyFullName("Raja Muni Navoda Riviprabha Somarathne");
	   ToPersonalPage.verifyGender("FEMALE");
	   ToPersonalPage.verifyDateofBirth("1994-05-30");
	   ToPersonalPage.clickEmployeeIdentificationInfoCalapsible();
	   ToPersonalPage.verifyIdentificationNo("946512482V");
	   //ToPersonalPage
	   //ToPersonalPage
	   
	 }
}

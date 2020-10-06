package com.aviorsys.HRMS_tests;

import org.junit.Test;
import com.aviorsys.HRMS_pageobject.PersonalPage;

public class PersonalTest extends BasicTest{
	
	PersonalPage PersonalDetailPage;
	
@Test
	
public void test_Enter_New_Employee_Personal() throws InterruptedException{
	System.out.println("@Test - test_Enter_New_Employee_Personal");
    
	//Create Login Page object
	PersonalDetailPage = new PersonalPage(driver);
	
	PersonalDetailPage.enterNewEPFforUniversalSearch("AITS37");
	PersonalDetailPage.verifyPersonaldefaultHeader("Employee Profile   Navoda Somarathne - AITS37");
	//PersonalDetailPage.verifyPersonalTabSearchedEmployeeHeader("Navoda Somarathne - AITS37");
	PersonalDetailPage.verifyColapsibleHeader("Personal Information");
	PersonalDetailPage.getEmployeeInitials();
	PersonalDetailPage.getEmployeeTitle();
	PersonalDetailPage.getFirstName();
	PersonalDetailPage.getMiddleName();
	PersonalDetailPage.getLastName();
	PersonalDetailPage.getFullName();
	PersonalDetailPage.getGender();
	PersonalDetailPage.getDateofBirth();
	PersonalDetailPage.scrollDown();
	PersonalDetailPage.selectMaritalStatus();
	PersonalDetailPage.chooseMaritalStatus();
	PersonalDetailPage.getMaritalStatus();
	PersonalDetailPage.uploadIEmployeeEmage();
	
	PersonalDetailPage.clickEmployeeIdentificationInfoCalapsible();
	PersonalDetailPage.verifyEmployeeIdentificationInfoCalapsible("Identification Information");
	//PersonalDetailPage.checkEmployeeIdentificationTypeNew();
	PersonalDetailPage.checkEmployeeIdentificationTypeOld();
	PersonalDetailPage.getIdentificationNo();
	
	PersonalDetailPage.clickEmployeeEthnicInfoCalapsible();
	PersonalDetailPage.verifyEmployeeEthnicInfoCalapsible("Ethnic Information");
	PersonalDetailPage.selectReligion();
	PersonalDetailPage.chooseReligion();
	PersonalDetailPage.selectRace();
	PersonalDetailPage.chooseRace();
	PersonalDetailPage.selectNationality();
	PersonalDetailPage.chooseNationality();
	
	PersonalDetailPage.verifyEmployeeHealthInfoCalapsible("Health Information");
	//PersonalDetailPage.clickEmployeePersonalSave();
	
	}

}

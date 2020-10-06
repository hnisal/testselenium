package com.aviorsys.HRMS_tests;

import org.junit.Test;

import com.aviorsys.HRMS_pageobject.EmpContactAndFamilyPage;

public class EmpContactAndFamilyTest extends BasicTest {
	EmpContactAndFamilyPage  ToEmployeeContactFamilyPage;
	
@Test
    
    public void test_a_Enter_Contact_Family_Infor() throws InterruptedException{
	    System.out.println("@Test - Enter Contact & Family Information to new Employee");
	    Thread.sleep(2000);	
	    	//Create EmployeeWork Page object
	    ToEmployeeContactFamilyPage = new EmpContactAndFamilyPage (driver);
	    
	    ToEmployeeContactFamilyPage.enterNewEPFforUniversalSearch("AITS37");
	    ToEmployeeContactFamilyPage.verifyEmployeeProfileDefaultHeader("Employee Profile  ");
	    ToEmployeeContactFamilyPage.verifyEmployeeProfileNameHeader("Employee Profile   Navoda Somarathne - AITS37");
	    ToEmployeeContactFamilyPage.clickContacFamityTab();
	    ToEmployeeContactFamilyPage.verifyColapsibleHeaderAddressInfo("Address Information");
	    ToEmployeeContactFamilyPage.clickCollapsibleAddressInfo();
	    ToEmployeeContactFamilyPage.clickAddressInfoAdd();
	    ToEmployeeContactFamilyPage.verifyAddressPopUpFormHeader("Address Information");
	    //ToEmployeeContactFamilyPage.verifyAddaddressInforWindowAppeared();
	    ToEmployeeContactFamilyPage.selectAddressLabel();
	    ToEmployeeContactFamilyPage.chooseAddressLabel();
	    ToEmployeeContactFamilyPage.enterAddressineOne("257/A/1,");
	    ToEmployeeContactFamilyPage.enterAddressineTwo("Imbulethenna");
	    ToEmployeeContactFamilyPage.enterAddressineThree("Hatharaliyadda");
	    ToEmployeeContactFamilyPage.enterCity("Kandy");
	    //ToEmployeeContactFamilyPage.selectCountrye();
	    ToEmployeeContactFamilyPage.selectCountry();
	    ToEmployeeContactFamilyPage.chooseCountry();
	    ToEmployeeContactFamilyPage.selectProvince();
	    ToEmployeeContactFamilyPage.chooseProvince();
	    ToEmployeeContactFamilyPage.selectDistrict();
	    ToEmployeeContactFamilyPage.chooseDistrict();
	    ToEmployeeContactFamilyPage.enterPostalCode("10020");
	    ToEmployeeContactFamilyPage.markDefaultAddressCheckBox();
	    ToEmployeeContactFamilyPage.clickSubmitAddressInfor();
	    ToEmployeeContactFamilyPage.switchToPoupBox();
	    ToEmployeeContactFamilyPage.acceptPopUp();
	    ToEmployeeContactFamilyPage.catchToastrMessageAddres("Address Infomation has been successfully Added");
	    ToEmployeeContactFamilyPage.checkRecordsinGrid("Resident Address 257/A/1, , Imbulethenna , Hatharaliyadda Kandy Matale Central Sri Lanka 10020      ");
	    ToEmployeeContactFamilyPage.checknewlyEnteredRecordPracence("10020");
	    
	    ToEmployeeContactFamilyPage.verifyColapsibleHeaderContactInfo("Contact Information");
	    ToEmployeeContactFamilyPage.clickCollapsibleContactInfo();
	    ToEmployeeContactFamilyPage.selectContactNoLabel();
	    ToEmployeeContactFamilyPage.chooseContactNoLabel();
	    ToEmployeeContactFamilyPage.enterContactNumber("0764747947");
	    ToEmployeeContactFamilyPage.selectEmailLabel();
	    ToEmployeeContactFamilyPage.chooseEmailLabel();
	    ToEmployeeContactFamilyPage.enterEmailAddres("navoda@gmail.com");
	    
	    ToEmployeeContactFamilyPage.verifyColapsibleHeaderEmergencyContactInfo("Emergency Contact Information");
	    ToEmployeeContactFamilyPage.clickColapsibleHeaderEmergencyContactInfo();
	    ToEmployeeContactFamilyPage.clickEmergencyContactInfoAdd();
	    ToEmployeeContactFamilyPage.verifyEmergencyContactInfoFormHeader("Emergency Contact Information");
	    ToEmployeeContactFamilyPage.selectRelationshipEm();
	    ToEmployeeContactFamilyPage.chooseRelationshipEm();
	    ToEmployeeContactFamilyPage.enterNameEm("Somaratne");
	    ToEmployeeContactFamilyPage.enterPersonalContactNo("0778958584");
	    ToEmployeeContactFamilyPage.checkEmployeeDefaultContactNo();
	    ToEmployeeContactFamilyPage.enterResidentialAddress("pattapola,Hataraliyadda");
	    ToEmployeeContactFamilyPage.markActiveStatusCheckBox();
	    ToEmployeeContactFamilyPage.clickSubmitEmeregency();
	    ToEmployeeContactFamilyPage.catchToastrMessageEmergency("Emergency Contact Information has been successfully saved");
	    ToEmployeeContactFamilyPage.checkRecordsinGridEmergency("a");
	    ToEmployeeContactFamilyPage.checkEmergencynewlyEnteredRecordPracence("a");
	    
	    ToEmployeeContactFamilyPage.verifyColapsibleHeaderFamilyInfo("Family Information");
	    ToEmployeeContactFamilyPage.clickCollapsibleFamilyInfo();
	    ToEmployeeContactFamilyPage.clickFamilyInfoAdd();
	    ToEmployeeContactFamilyPage.verifyFamilyInfpPopUpFormHeader("Family Information");
	    ToEmployeeContactFamilyPage.selectRelationshipFam();
	    ToEmployeeContactFamilyPage.chooseRelationshipFam();
	    ToEmployeeContactFamilyPage.enterNameFam("Somarathne");
	    ToEmployeeContactFamilyPage.selectGenderFam();
	    ToEmployeeContactFamilyPage.chooseGenderFam();
	    ToEmployeeContactFamilyPage.enterDateofBirth("1965/07/06");
	    ToEmployeeContactFamilyPage.checkFamilyInfoDeseasedNoMarked();
	    ToEmployeeContactFamilyPage.markFamilyInfoDeseasedYes();
	    ToEmployeeContactFamilyPage.markFamilyInfoDeseasedNo();
	    ToEmployeeContactFamilyPage.ClickFamilyInfoSubmit();
	    ToEmployeeContactFamilyPage.catchToastrMessageFamily("a");
	    ToEmployeeContactFamilyPage.checkRecordsinGridFamily("a");
	    ToEmployeeContactFamilyPage.checkFamilyInfonewlyEnteredRecordPracence("a");
	    
	    ToEmployeeContactFamilyPage.clickSaveofContactFamily();
	    ToEmployeeContactFamilyPage.catchToastrMessageContactFamily("Contact and Family Information has been Successfully saved");
		}
}

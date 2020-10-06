package com.aviorsys.HRMS_tests;

import org.junit.Test;
import com.aviorsys.HRMS_pageobject.ESSDashboardPage;

public class ESSDashboardTest extends BasicTestConfirm{
	
	ESSDashboardPage ESSDashboard;
@Test
 public void test_a_Verify_ESS_Dsshboard() throws InterruptedException{
		System.out.println("@Test a - Verify_ESS_Dsshboard");
		Thread.sleep(2000);
		//Create ESSDashboard Page object	
	ESSDashboard = new ESSDashboardPage(driver);
	
	ESSDashboard.clickNavigationExpand();
	ESSDashboard.getWeeklyBirthdayPanelValues();
	ESSDashboard.getRecentActivitiesPanelValues();
	
	}
}

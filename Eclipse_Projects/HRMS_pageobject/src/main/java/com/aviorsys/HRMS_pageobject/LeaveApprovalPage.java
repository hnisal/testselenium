package com.aviorsys.HRMS_pageobject;
	
//import java.awt.List;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

public class LeaveApprovalPage  {

	WebDriver driver;
				
	By button_navigationExpand = By.xpath("//*[@id=\"toggle_nav_btn\"]");
	By button_confirmApprove = By.xpath("//*[@id=\"wrapper\"]/div[1]/div/ul/li[6]/a/div[1]");
	By button_leaveApproval = By.xpath("//*[@id=\"app_n_conf\"]/li/a[2]");
	By header_leaveApproval = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/div/div/div/div[1]/h5");
	By button_requesrEdit = By.xpath("//*[@id=\"view_leave\"]/i");
	By headertext_empLeaveInterfaceHeader = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/div/div/div/div[1]");
	By text_empInforHeader = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[1]/div[1]/h6");
	By text_leaveRequestHeader = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/h6");
	By text_leaveAllocChartHeader = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/h6");
	By button_Approve = By.id("btn-approve");
	By button_reject = By.id("btn-reject");
	By button_bulkApprove = By.id("Approve-leave");
	By button_selectAll = By.xpath("//*[@id=\"leave-approval-grid\"]/div/div[5]/div/table/tbody/tr[1]/td[1]/div/div");
	By toastmsg_Body = By.className("toast-message");
	By row_values = By.xpath("//*[@id=\"leave-approval-grid\"]/div/div[6]/div/div/div[1]/div/table/tbody");
	By grid_dataTable = By.cssSelector(".dx-datagrid-rowsview");
	By firstrow_edit = By.cssSelector("tr.dx-data-row:nth-child(1) > td:nth-child(1)");
	
	
	public LeaveApprovalPage(WebDriver driver) {
		this.driver = driver;
		}
		
	public void clickNavigationExpand() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(button_navigationExpand).click();
		Thread.sleep(5000);
		}
		 
	public void clickConfirmApprove(){
		driver.findElement(button_confirmApprove).click();
		}
		 
	public void clickLeaveConfirmation() throws InterruptedException{
		driver.findElement(button_leaveApproval).click();
		Thread.sleep(6000);
		}
		 
	public void verifyLeaveConfirmHeader(String strleaveapproveHeader) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		String LabelLeaveApproveHeader= driver.findElement(header_leaveApproval).getText();
		System.out.println("The Generated Value is :"+LabelLeaveApproveHeader);
		AssertJUnit.assertEquals(strleaveapproveHeader,LabelLeaveApproveHeader);
			 
		System.out.println("Expected value : "+strleaveapproveHeader);
		System.out.println("Actual value : "+LabelLeaveApproveHeader);
		System.out.println(" Assert pass");
		System.out.println("==========================================");
		Thread.sleep(8000);
		}
		 
	//get all records in the grid
	public void checkRecordsinGrid() throws InterruptedException{
		String actualName = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(row_values)).getText();
		System.out.println("The Generated Value is : "+actualName);
		}
	
	public void getTableValues() throws InterruptedException{
		Thread.sleep(6000);
		String NoofLeaave= driver.findElement(grid_dataTable).getText();
		System.out.println(NoofLeaave);
	}
		 
	public void clickLeaveRequestEdit() throws InterruptedException{
		driver.findElement(button_requesrEdit).click();
		Thread.sleep(7000);
		} 
		 
	public void verifyLeaveRquesttHeader(String strleaveRquesttHeader) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		String LabelLeaveRquesttHeader= driver.findElement(headertext_empLeaveInterfaceHeader).getText();
		System.out.println("The Generated Value is :"+LabelLeaveRquesttHeader);
		AssertJUnit.assertEquals(strleaveRquesttHeader,LabelLeaveRquesttHeader);
			 
		System.out.println("Expected value : "+strleaveRquesttHeader);
		System.out.println("Actual value : "+LabelLeaveRquesttHeader);
		System.out.println(" Assert pass");
		System.out.println("==========================================");
		Thread.sleep(8000);
		}
		 
	public void verifyLeaveRquestedEmpDetailHeader(String strleaveRquestedEmpDetailHeader) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		String LabelleaveRquestedEmpDetailHeader = driver.findElement(text_empInforHeader).getText();
		System.out.println("The Generated Value is :"+LabelleaveRquestedEmpDetailHeader);
		AssertJUnit.assertEquals(strleaveRquestedEmpDetailHeader,LabelleaveRquestedEmpDetailHeader);
			 
		System.out.println("Expected value : "+strleaveRquestedEmpDetailHeader);
		System.out.println("Actual value : "+LabelleaveRquestedEmpDetailHeader);
		System.out.println("Assert pass");
		System.out.println("==========================================");
		Thread.sleep(8000);
		}
		 
	public void verifyLeaveRquestDetailHeader(String strleaveRquestdetailHeader) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		String LabelleaveRquestdetailHeader = driver.findElement(text_leaveRequestHeader).getText();
		System.out.println("The Generated Value is :"+LabelleaveRquestdetailHeader);
		AssertJUnit.assertEquals(strleaveRquestdetailHeader,LabelleaveRquestdetailHeader);
			 
		System.out.println("Expected value : "+strleaveRquestdetailHeader);
		System.out.println("Actual value : "+LabelleaveRquestdetailHeader);
		System.out.println("Assert pass");
		System.out.println("==========================================");
		Thread.sleep(8000);
		}
		 
	public void verifyLeaveAllocationHeader(String strleaveAllocationHeader) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		String LabelleaveAllocationHeader = driver.findElement(text_leaveAllocChartHeader).getText();
		System.out.println("The Generated Value is :"+LabelleaveAllocationHeader);
		AssertJUnit.assertEquals(strleaveAllocationHeader,LabelleaveAllocationHeader);
			 
		System.out.println("Expected value : "+strleaveAllocationHeader);
		System.out.println("Actual value : "+LabelleaveAllocationHeader);
		System.out.println("Assert pass");
		System.out.println("==========================================");
		Thread.sleep(8000);
		}
		 
	public void clickLeaveApproveButton(){
		 driver.findElement(button_Approve).click();
		 }
		 
	public void clickLeaveRejectButton(){
		 driver.findElement(button_reject).click();
		 }
		 
	public void catchToastrMessage(String strtostMessage) throws InterruptedException{
		String Toast_Message = driver.findElement(toastmsg_Body).getText();
		System.out.println("The toast message is : " +Toast_Message);
		AssertJUnit.assertEquals(strtostMessage,Toast_Message);
		Thread.sleep(5000);
				 
		System.out.println("Assert pass");
		System.out.println("==========================================");
		Thread.sleep(2000);
		}
		 
	public void clickSelectAllButton() throws InterruptedException{
		driver.findElement(button_selectAll).click();
		  Thread.sleep(2000);
		}
		 
	public void clickBulkApproveButton(){
		driver.findElement(button_bulkApprove).click();
		}
	
	public void doubleclickforBulkApproveButton(){
		Actions a = new Actions(driver);
	      a.moveToElement(driver.findElement(button_bulkApprove)).
	      doubleClick().
	      build().perform();
		//driver.findElement(button_bulkApprove).click();
		}
	
	public void selectmulipleRowUsingControlKey() {
	        java.util.List<WebElement> tableRows = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div/div/div[5]/div/table/tbody/tr[1]/td[1]/div"));
	        Actions builder = new Actions(driver);
	        builder.click(tableRows.get(1)).keyDown(Keys.CONTROL).click(tableRows.get(4)).keyUp(Keys.CONTROL).build().perform();
	    }
		 
}

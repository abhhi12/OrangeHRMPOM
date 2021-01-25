package Orangehrm.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Orangehrm.BaseTest.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class ContactForSaleFormTest extends BaseTest {

	@BeforeClass
	public void Enter_ContactForSaleForm() {
		contForSale=OrHmpage.DoclickContactForSale();
	}
	
	@Description("Test Contact for sale Test page")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void DoTestContactForSaleFormTest() {
		contForSale.mehodContactForSaleForm("Shyam", "Kumar", "Glaxy Pvt Ltd", "123456789", "Intel", "me@gmail.com", "All is Well");
	}
}

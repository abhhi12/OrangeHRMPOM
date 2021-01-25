package Orangehrm.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Orangehrm.BaseTest.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class OrangeHrmRegFormPageTest  extends BaseTest {
	
	@BeforeClass
	public void From_OrangeHrmMomePage_TO_RegFormPage() {
		OrhRegPage=OrHmpage.DoLoginPage_As30DaysTrial();
	}
	@Description("Test orange OrangeHrm reg form Page")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void Tets_OrangeHrmRegFormPageTest() {
		OrhRegPage.OrangeHrmRegFormPageSetUp("Abhi", "Shankar", "email@gmail.com", "CS", "401-450", "Travel", "Trav", "123456789", "India");
	}

}

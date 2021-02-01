package Orangehrm.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Orangehrm.BaseTest.BaseTest;
import Orangehrm.Utils.Constants;
import Orangehrm.Utils.ExelUtil;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class OrangeHrmRegFormPageTest  extends BaseTest {
	
	@BeforeClass
	public void From_OrangeHrmMomePage_TO_RegFormPage() {
		OrhRegPage=OrHmpage.DoLoginPage_As30DaysTrial();
	}
	@DataProvider
	public Object[][] DataFromExelSheetForRegPage() {
		Object data [][]=ExelUtil.getTestData(Constants.EXEL_SHET);
		return data;
	}
	
	
	
	@Description("Test orange OrangeHrm reg form Page")
	@Severity(SeverityLevel.NORMAL)
	@Test(dataProvider="DataFromExelSheetForRegPage")
	public void Tets_OrangeHrmRegFormPageTest(String firstname, String lastname, String email, String jobtitle, String company, String phoneno) {
		OrhRegPage.OrangeHrmRegFormPageSetUp(firstname, lastname, email, jobtitle, company, jobtitle, phoneno, company);
	}

}

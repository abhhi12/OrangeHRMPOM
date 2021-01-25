package Orangehrm.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Orangehrm.BaseTest.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class OrangeHrmMomePageTest extends BaseTest {
	
	@Description("Test orange Logo")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority=1)
	public void TestgetOrangeHrmLogog() {
		OrHmpage.getOrangeHrmLogog();
	}
	@Description("Test Footer page")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority=2)
	public void TestFooterpage() {
		OrHmpage.getFooterContainer();
		Assert.assertTrue(OrHmpage.getFooterContainer());
	}
	@Description("Test Header Page")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority=3)
	public void TestHeadrePage() {
		OrHmpage.getheadercount();
		Assert.assertTrue(OrHmpage.getheadercount());
	}

}

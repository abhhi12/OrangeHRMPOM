package Orangehrm.Test;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Orangehrm.BaseTest.BaseTest;
import Orangehrm.Utils.Constants;
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
	@Test(priority=4)
	public void testdoModularSolution() {
		List<String> getmodular=OrHmpage.doModularSolution();
		System.out.println(getmodular);
		Assert.assertEquals(getmodular, Constants.getExpectedModularSolution());
		
	}

}

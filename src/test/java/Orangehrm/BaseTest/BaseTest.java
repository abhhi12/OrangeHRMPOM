package Orangehrm.BaseTest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Orangehrm.Driverfactory.DriverFactory;
import Orangehrm.Pages.ContactForSaleForm;
import Orangehrm.Pages.OrangeHrmMomePage;
import Orangehrm.Pages.OrangeHrmRegFormPage;

public class BaseTest {
	
	WebDriver driver;
	DriverFactory df;
	public Properties prop;
	public OrangeHrmMomePage OrHmpage;
	public OrangeHrmRegFormPage OrhRegPage;
	public ContactForSaleForm contForSale;
	
	@BeforeTest
	public void SetUp() {
		df = new DriverFactory();
		prop=df.int_prop();
		driver=df.init_driver(prop);
		OrHmpage = new OrangeHrmMomePage(driver);
		OrhRegPage = new OrangeHrmRegFormPage(driver);
		contForSale = new ContactForSaleForm(driver);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

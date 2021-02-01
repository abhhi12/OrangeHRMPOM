package Orangehrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Orangehrm.Utils.ElementUtil;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


@Epic("EPIC:100 Design Full Accounts Page for open cart applicaton....")
@Story("US 201: OrangeHRM Reg Page")
public class OrangeHrmRegFormPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	private By firstname = By.cssSelector("#Form_submitForm_FirstName");
	private By lastname = By.cssSelector("#Form_submitForm_LastName");
	private By email = By.cssSelector("#Form_submitForm_Email");
	private By jobtitle = By.cssSelector("#Form_submitForm_JobTitle");
	private By noOfEmp = By.cssSelector("#Form_submitForm_NoOfEmployees option:nth-of-type(3)");
	private By company = By.cssSelector("#Form_submitForm_CompanyName");
	private By induster = By.cssSelector("#Form_submitForm_Industry option:nth-of-type(6)");
	private By contactNo = By.cssSelector("#Form_submitForm_Contact");
	private By country = By.cssSelector("#Form_submitForm_Country :nth-of-type(6)");
	private By checkBtn = By.cssSelector("#Form_submitForm_SetDummyData");
	private By IamNotRobotBtn = By.xpath("//div[@class='recaptcha-checkbox-border']");
	private By subtBtn = By.cssSelector("#Form_submitForm_action_request");
	
	
	
	public OrangeHrmRegFormPage(WebDriver driver) {
		this.driver=driver;
		eleutil = new ElementUtil(driver);
	}
	@Step("For Subbmit with FirstName:{0}, Lastname:{1}, Email:{3}, Jobtitle:{4}, Company:{5}, and Contactno:{6}")
	public void OrangeHrmRegFormPageSetUp(String Firstname, String LastName, String Email, String Jobtitle, String Company, String ind,String Phoneno, String Comp) {
		eleutil.doSendKeys(firstname, Firstname);
		eleutil.doSendKeys(lastname, LastName);
		eleutil.doSendKeys(email, Email);
		eleutil.doSendKeys(jobtitle, Jobtitle);
		eleutil.doClick(noOfEmp);
		eleutil.doSendKeys(company, Company);
		eleutil.doClick(induster);
		eleutil.doSendKeys(contactNo, Phoneno);
		eleutil.doClick(country);
		//eleutil.clickWhenReady(checkBtn, 2000);;
		//eleutil.clickWhenReady(IamNotRobotBtn, 2000);
		//eleutil.clickWhenReady(subtBtn, 2000);
		
	}

}

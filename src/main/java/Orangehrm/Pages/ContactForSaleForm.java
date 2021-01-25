package Orangehrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Orangehrm.Utils.ElementUtil;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


@Epic("EPIC:100 Design Full Accounts Page for open cart applicaton....")
@Story("US 201: Contact For Sale Page")
public class ContactForSaleForm {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	private By FirstName = By.cssSelector("#Form_submitForm_FirstName");
	private By LastName = By.cssSelector("#Form_submitForm_LastName");
	private By CompName = By.cssSelector("#Form_submitForm_CompanyName");
	private By noOfEmp = By.cssSelector("#Form_submitForm_NoOfEmployees option:nth-of-type(8)");
	private By contactNo = By.cssSelector("#Form_submitForm_Contact");
	private By JobTitle = By.cssSelector("#Form_submitForm_JobTitle");
	private By Email = By.cssSelector("#Form_submitForm_Email");
	private By Country = By.cssSelector("#Form_submitForm_Country :nth-of-type(3)");
	private By Comment = By.cssSelector("#Form_submitForm_Comment");
	//private By checkbox = By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]");
	private By SubBtn = By.cssSelector("#Form_submitForm_action_request");
	
	
	
	
	
	public ContactForSaleForm(WebDriver driver) {
		this.driver=driver;
		eleutil = new ElementUtil(driver);
	}
	@Step("Contact for Sale Form rgistration Firtsname:{0} and last name:{1}")
	public void mehodContactForSaleForm(String firstname, String lastname, String companyname, String phoneno, String IT, String mailid, String AnyGoodComment  ) {
		eleutil.doSendKeys(FirstName, firstname);
		eleutil.doSendKeys(LastName, lastname);
		eleutil.doSendKeys(CompName, companyname);
		eleutil.doClick(noOfEmp);
		eleutil.doSendKeys(contactNo, phoneno);
		eleutil.doSendKeys(JobTitle, IT);
		eleutil.doSendKeys(Email, mailid);
		eleutil.doClick(Country);
		eleutil.doSendKeys(Comment, AnyGoodComment);
		//eleutil.doClick(checkbox);
		//eleutil.doClick(SubBtn);
		
		
	}
	
	
	}

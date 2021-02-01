package Orangehrm.Pages;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Orangehrm.Utils.Constants;
import Orangehrm.Utils.ElementUtil;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;



@Epic("EPIC:001 Design Full OrangeHRM Page for open cart applicaton....")
@Story("US 001:Way to Several page testing")
public class OrangeHrmMomePage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	private By LoginToRegPage = By.linkText("FREE 30 Day Trial");
	private By ContactForSale = By.xpath("//li[@class='ex-nav']/a");
	private By OrangeHrmLogog = By.xpath("//img[@class='nav-logo']");
	private By HeaderLink = By.xpath("//a[@class='link']");
	private By FooterContainer = By.xpath("(//div[@class='container'])[8]");
	private By ModularSolution = By.xpath("//h4[@class='text-center module-title']");
	
	public OrangeHrmMomePage(WebDriver driver) {
		this.driver=driver;
		eleutil = new ElementUtil(driver);
		 
	}
	@Step("Go to Login Page")
	public void DoClick_LoginToRegPage() {
		eleutil.doClick(LoginToRegPage);
	}
	@Step("Go To Contact For Sale Page")
	public ContactForSaleForm DoclickContactForSale() {
		eleutil.doClick(ContactForSale);
		return new ContactForSaleForm(driver);
	}
	@Step("Validate Orangehrm logo")
	public void getOrangeHrmLogog() {
		System.out.println("Orange HrmLogog Atribute:" +eleutil.doGetAttribute(OrangeHrmLogog, "src"));
	}
	@Step("Count Footer Container")
	public boolean getFooterContainer() {
		if(eleutil.getElements(FooterContainer).size()==Constants.FOOTER_COUNT) {
			return true;
		}
		else {
			return false;
		}
		
	}
	@Step("Get Hrader Count")
	public boolean getheadercount() {
		if(eleutil.getElements(HeaderLink).size()==Constants.HEADER_COUNT){
			return true;
		}
		else {
			return false;
		}
	}
	@Step("Go to Login 30 Days Trile Page")
	public OrangeHrmRegFormPage DoLoginPage_As30DaysTrial() {
		eleutil.doClick(LoginToRegPage);
		return new OrangeHrmRegFormPage(driver);
	}
	public List<String> doModularSolution() {
		List<String> modularlist = new ArrayList<String>();
		
		List<WebElement> modular=eleutil.getElements(ModularSolution);
		for(WebElement e: modular) {
			String Module=e.getText();
			modularlist.add(Module);
		}
		return modularlist;
	}
}

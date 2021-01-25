package Orangehrm.Driverfactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	public WebDriver init_driver(Properties prop) {
		String browserName=prop.getProperty("browser");
		
		System.out.println("Browser name is" + browserName);
		
		switch(browserName) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver();
			tlDriver.set(new ChromeDriver());
			break;
		 
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			//driver = new FireFoxDriver();
			tlDriver.set(new FirefoxDriver());
			break;
			
		case"safari":
			//driver = new SafariDriver();
			tlDriver.set(new SafariDriver());
			break;
			
			
		default:
			System.out.println("Please Pass the correct Browser name:" +browserName);
			break;

		}
		
		    getDriver().manage().window().maximize();
		    getDriver().manage().deleteAllCookies();
		
		return getDriver();
	
	}
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
	
	public Properties int_prop() {
		Properties prop = null;
		
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop = new Properties();
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
		
	}
	
	public String getScreenShot() {
		File src=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"/screenshots/"+ System.currentTimeMillis()+".png";
		File destination = new File(path);
		
		try {
			FileUtils.copyDirectory(src, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}

}



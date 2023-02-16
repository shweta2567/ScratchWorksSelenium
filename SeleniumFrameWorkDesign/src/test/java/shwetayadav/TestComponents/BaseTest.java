package shwetayadav.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import tcs.SeleniumFrameWorkDesign.Landingpage;

public class BaseTest {
public WebDriver driver;
public Landingpage landingpage;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+ "//src//main//java//shwetayadav//resources//GolbalData.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
	}
	@BeforeMethod
	public Landingpage launchApplication() throws IOException
	{
		 driver=initializeDriver();
		  landingpage=new Landingpage(driver);
			landingpage.goTo();
			return landingpage;
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

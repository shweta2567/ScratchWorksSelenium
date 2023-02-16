package SeleniumPractice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CalendarDemo {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub
		
		//Calendar of spicejet website 
		
		
		ChromeOptions options=new ChromeOptions();   //create the object of chromeoptions

	       Map<String, Object> prefs=new HashMap<>();    // create the object of map collection

	       prefs.put("profile.default_content_setting_values.notifications", 2);    //put the values in map, 1 - accept , 2 - block

	       options.setExperimentalOption("prefs",prefs);

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(options);
		
		  
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(90));
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		// driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.get("https://www.spicejet.com/");
		 driver.manage().window().maximize();
		
		 //Dynamic Dropdowns
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Agra'] ")).click();
		
		driver.findElement(By.xpath("//div[text()='Agra'] ")).click();
				
		
				driver.findElement(By.xpath("(//div[text()='4'])[1] ")).click();
				
				driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
				
				int i=1;
				while(i<6)
				{
					driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
					i++;
				}
				driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[3]")).click();
				Thread.sleep(3000);
				System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'])[1]")).isSelected());
			
				Assert.assertFalse(driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'])[1]")).isSelected());
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'])[1]")).click();
				//Thread.sleep(3000);
				Assert.assertTrue(driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'])[1]")).isSelected());
				System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'])[1]")).isSelected());
				
				
					
						
						
						
						
						
						
		/*driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(" (//a[@value='MAA'])[2]")).click();   or
		
		
		
		//Parent -child Relationship Xpath 
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")));
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();  */
		
		

	}

}

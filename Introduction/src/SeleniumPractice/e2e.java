package SeleniumPractice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

	
		ChromeOptions options=new ChromeOptions();   //create the object of chromeoptions

	       Map<String, Object> prefs=new HashMap<>();    // create the object of map collection

	       prefs.put("profile.default_content_setting_values.notifications", 2);    //put the values in map, 1 - accept , 2 - block

	       options.setExperimentalOption("prefs",prefs);

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(options);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			
			//Click on the one round button
			driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']")).click();
		
			
			//Click on the from destination
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		
		Thread.sleep(3000);
		
		//select from city
		driver.findElement(By.xpath("//div[text()='AMD'] ")).click();
		//select too city
		driver.findElement(By.xpath("//div[text()='Agra'] ")).click();
				
		//select calendar
				driver.findElement(By.xpath("(//div[text()='4'])[1] ")).click();
				//click on passenger count
				driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
				//looping 6 adults 
				int i=1;
				while(i<6)
				{
					driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
					i++;
				}
				//click again on passenger to close 
				driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[3]")).click();
				Thread.sleep(3000);
				
				//checkbox is disable
				System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'])[1]")).isSelected());
			//checking disable or not 
				Assert.assertFalse(driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'])[1]")).isSelected());
				Thread.sleep(3000);
				
				//click on checkbox family and friends 
				driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'])[1]")).click();
				//Thread.sleep(3000);
				//Assert.assertTrue(driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'])[1]")).isSelected());
				System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'])[1]")).isSelected());
				

				//checking return date is disable or not
				if(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style").contains("0.5"))
				{
					System.out.println("Its disabled");
					Assert.assertTrue(true);
					
				}
				else {
					Assert.assertTrue(false);
				}
				
				Thread.sleep(4000);
				
				//select the currency 
				driver.findElement(By.xpath("(//div[@style='font-family: inherit; opacity: 1;'])[2]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='USD']")).click();
				Thread.sleep(4000);
				
				//click on the search button 
				driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		
	}

}

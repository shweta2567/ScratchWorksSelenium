package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
		 System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		 
		 //Check if condition is false or not
		 
		 Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		 driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		 Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		 System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		 
		 //Count the Number of checkbox
		 
		int length=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(length);
		 
		 driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(2000);
		 
		 System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
		 int i=1;
		 while(i<5)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
			 i++;
		 }
		 
		 //To check if the expected value is 5 adults or not 
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 
		 
		 
	}

}

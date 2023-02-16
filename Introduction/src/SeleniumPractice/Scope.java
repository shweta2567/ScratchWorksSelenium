package SeleniumPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Total count of links in the webage 
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//When you want the link count of specific section like footer section 
		
		//we have to create one more footer driver for that 
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));   //limiting webdriver scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//div[@id='gf-BIG']/table/tbody/tr/td[1]
		
		WebElement columndriver=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on each link in the column and check if the pages are opening 
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000L);
			
		} //opens all the tabs
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
			while(it.hasNext())   //check if iterator have next index is present or not 
			{
				driver.switchTo().window(it.next());   //it.next moves to next index
				System.out.println(driver.getTitle());
			}
		}
		

	}



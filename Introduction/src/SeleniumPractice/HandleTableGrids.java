package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class HandleTableGrids {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(90));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// Scroll the Page

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		//iterate
		for(int i=0;i<values.size();i++) {
			
			//convert string into integer
			sum=sum+Integer.parseInt(values.get(i).getText());
			
			
		}
		System.out.println(sum);
		int total=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);

	}

}

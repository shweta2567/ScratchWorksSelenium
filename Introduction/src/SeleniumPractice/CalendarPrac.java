package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPrac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		//For Calendar = Grab a common attribute ,Put into a list and iterate 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(90));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		// Scroll the Page

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,900)");

		
		Thread.sleep(2000);
		
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='form-field-travel_comp_date']")));
		
		
		driver.findElement(By.xpath("//input[@name='form_fields[travel_comp_date]']")).click();
		Thread.sleep(1000);
		//while loop keep on executing until it becomes false
		while(!driver.findElement(By.xpath("//div[@class='flatpickr-current-month']")).getText().contains("April")) {
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
			
		}
		List<WebElement> dates=driver.findElements(By.xpath("//span[@class='flatpickr-day ']"));
		int count=driver.findElements(By.xpath("//span[@class='flatpickr-day '] ")).size();
		for(int i=0;i<count;i++) {
			String text=driver.findElements(By.xpath("//span[@class='flatpickr-day '] ")).get(i).getText();
			if(text.equalsIgnoreCase("23")) 
			{
				driver.findElements(By.xpath("//span[@class='flatpickr-day '] ")).get(i).click();
				break;
			}
			
		}
		


	}

}

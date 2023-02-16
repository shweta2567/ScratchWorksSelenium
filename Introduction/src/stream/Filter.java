package stream;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
			driver.manage().window().maximize();
			driver.findElement(By.id("search-field")).sendKeys("Rice");
			List<WebElement> veggies =driver.findElements(By.xpath("search-field"));
			List<WebElement> filteredList=veggies.stream().filter(veggie->veggie.getText().contains("Rice")).
			collect(Collectors.toList());
			 Assert.assertEquals(veggies.size(), filteredList.size());
		}
		catch(Exception e)
		{
			System.out.println("i am in catch block");
			e.printStackTrace();
		}
	}

}

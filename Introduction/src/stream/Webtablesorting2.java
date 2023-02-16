package stream;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtablesorting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all the webelements into list 
		List<WebElement> elementsList =driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of all webelements into new list 
		List<String> originalList =elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the original list of step 3 -> sorted list 
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list 
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		//scan the namecolumn with getText -> print the price of rice
		do {
			List<WebElement> rows =driver.findElements(By.xpath("//tr/td[1]"));
		price=rows.stream().filter(s->s.getText().contains("Rice"))
		.map(s->getpriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.size()<1);
	}
	
	catch(Exception e)
	{
		System.out.println("I am in catch block");
		e.printStackTrace();
	}
	}

	private static String getpriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}

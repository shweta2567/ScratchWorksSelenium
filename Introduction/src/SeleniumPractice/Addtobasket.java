package SeleniumPractice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtobasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Declare the array to store all items name
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		// Navigate to the website
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// Maximising the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Calling the method
		addItems(driver, itemsNeeded);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException {
		int j = 0;

		// X path for all the products storing in the List
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		Thread.sleep(3000);

		// Looping the products
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			// name should be formatted to get actual vegetable name

			String formattedName = name[0].trim();

			// convert array into Array List for easy search

			@SuppressWarnings("rawtypes")
			List itemsNeededList = Arrays.asList(itemsNeeded);

			// check whether name you extracted is present in arrayList or not

			if (itemsNeededList.contains(formattedName)) {
				j++;
				// Click on add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				Thread.sleep(2000);
				if (i == itemsNeeded.length) {
					break;

				}

			}

		}

	}
}
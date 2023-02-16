package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Exam {

	public static void main(String[] args) 
	{
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		//driver.switchTo().alert().dismiss();
		
		loginId(driver);
		try {
			addToCart(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
public static void loginId(WebDriver driver)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(90));

	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("password")).sendKeys("learning");
	driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
	Assert.assertTrue(true);
	WebElement element=driver.findElement(By.xpath("//select[@data-style='btn-info']"));
	Select dropdown=new Select(element);
	dropdown.selectByVisibleText("Student");
	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Okay']")));
	driver.findElement(By.xpath("//button[text()='Okay']")).click();
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.id("signInBtn")).click();	
}

public static void addToCart(WebDriver driver) throws InterruptedException

{
	
	int length=driver.findElements(By.xpath("//button[@class='btn btn-info']")).size();
	System.out.println(length);
	for(int i=1;i<=length;i++)
	{
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])["+i+"]")).click();
	}
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
}
}

package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.findElement(By.id("checkBoxOption1")).click();
			String name=driver.findElement(By.xpath("//label[@for='bmw']")).getText();
			
			System.out.println(name);
			Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
			
			System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
			
			WebElement element =driver.findElement(By.id("dropdown-class-example"));
			
			
			Select dropdown=new Select(element);
			dropdown.selectByVisibleText(name);
			driver.findElement(By.id("name")).sendKeys(name);
			driver.findElement(By.id("alertbtn")).click();
			String text=driver.switchTo().alert().getText();
			if(text.contains(name)) {
				System.out.println("Alert success");
			}
			else {
				System.out.println("no success");
			}
			System.out.println(driver.switchTo().alert().getText().split(",")[0].split(" ")[1].trim());
			
			//Hello Option1, share this practice page and share your knowledge
			
			
			
			
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

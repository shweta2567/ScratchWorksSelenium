package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 Actions ac=new Actions(driver);
		 WebElement move=driver.findElement(By.id("nav-link-accountList"));
		 
		 
		 ac.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").build().perform();
		 
		 //Double click:
		 
		 ac.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
		 //Moves to specific element 
		 ac.moveToElement(move).build().perform();
		 
		 //Right click 
		 ac.moveToElement(move).contextClick().build().perform();
		 
		 
		 

	}

}

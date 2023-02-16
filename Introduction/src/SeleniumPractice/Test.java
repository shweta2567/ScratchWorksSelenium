package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		//Actions  perform
		
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHWETA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		//driver.get("https://demoqa.com/buttons");
		String urL="https://demoqa.com/droppable/";
		driver.get(urL);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(90));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions ac=new Actions(driver);
		
		
		driver.manage().window().maximize();
		/*WebElement element=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		WebElement element1=driver.findElement(By.id("doubleClickBtn"));
		ac.contextClick(element).perform();                //for right click
		
		ac.doubleClick(element1).build().perform();
		*/
		
		WebElement from =driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement to=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(from, to).perform();
		String textTo = to.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
	      
		}
		
		catch(Exception e)
		{
			System.out.println("I am in catch Block ");
			e.printStackTrace();
		}
	}

}

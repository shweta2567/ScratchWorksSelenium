package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framePractice {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());  //Can find the total number of iframes
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
driver.findElement(By.id("draggable")).click();
Actions ac=new Actions(driver);
WebElement source=driver.findElement(By.id("draggable"));
WebElement target=driver.findElement(By.id("droppable"));
ac.dragAndDrop(source, target).build().perform();

//back to defaut
driver.switchTo().defaultContent();

	}

}
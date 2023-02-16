package SeleniumPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		try {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows=driver.getWindowHandles();     //[parentId,child1,child2]
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		
		Thread.sleep(3000);
		driver.switchTo().window(it.next());
		
		
		String name=driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println(name);
	
		driver.switchTo().window(parent);
		String win=driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
		System.out.println(win);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("I am in catch block ");
		}
		
		

	}

}

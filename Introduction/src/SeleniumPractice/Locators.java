package SeleniumPractice;

import java.time.Duration;


//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;

public class Locators {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));     //To wait to element to showup and then automate
		
        
        driver.manage().window().maximize();         //To maximize  browser 
		driver.findElement(By.id("w3loginbtn")).click();       //Login button 
		driver.findElement(By.id("modalusername")).sendKeys("shwetayadav2567@gmail.com");   //entering username
		driver.findElement(By.name("current-password")).sendKeys("@#$Shweta123");             //enter password
		//Declare using CSS Selector
		driver.findElement(By.cssSelector("button[class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();    //click on Login Button using css selector
		//Using Xpath 
		//driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();       //click on Login Button using Xpath
		
		//driver.findElement(By.cssSelector("div a[5]")).click();         
		
		//xpath sing parentTagname childTagname 
		
		//driver.findElement(By.xpath("//div/a[5]")).click();
		
		//driver.findElement(By.xpath("//a[@class='_oSecO undefined _gVHF7']")).click();
		//driver.findElement(By.xpath("//a[@class='_oSecO undefined'][1]")).click();
		
		
		//Using Xpath only Parent Tagname and childname
		//driver.findElement(By.xpath("//nav/a[2]")).click();
		
		//Using Css Selector  only Parent Tagname  and child Tagname 
		//driver.findElement(By.cssSelector("nav a:nth-child(2)")).click();
		
		// Combination of all xpath using Parent Tag name and childTagNAme
		//driver.findElement(By.xpath("//nav[@id='navigation']/a[2]")).click();
		// using Regular expression 
		
		//driver.findElement(By.xpath("//a[contains(@class,'_oSecO')][2]")).click();
		
		//
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div/h2[1]")).getText());
		
		Assert.assertEquals(driver.findElement(By.xpath("//div/h2[1]")).getText(), "Hi, Shweta");
		
		driver.findElement(By.xpath("//button[text()='Log out']")).click();
		////div/div/nav/div/button/parent::div/button
		driver.quit();
	}

}

package SeleniumPractice;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionKeyboardEvents {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHWETA\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver  driver = new ChromeDriver();
			//driver.get("https://demoqa.com/buttons");
			String urL="https://demoqa.com/text-box";
			driver.get(urL);
			//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(90));
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Actions ac=new Actions(driver);
			driver.manage().window().maximize();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userForm")));
			//enter the full name
			WebElement name=driver.findElement(By.id("userName"));
			name.sendKeys("Shweta Yadav");
			//enter the mail
			WebElement mail=driver.findElement(By.id("userEmail"));
			mail.sendKeys("shweta@toolsqa.com");
			//enter the current address 
			WebElement current=driver.findElement(By.id("currentAddress"));
			current.sendKeys("Nair 199 block");
			//select  address using ctrl a
			ac.keyDown(Keys.CONTROL);
			ac.sendKeys("a");
			ac.keyUp(Keys.CONTROL);
			ac.build().perform();
			
			//copy the address using ctrl c
			ac.keyDown(Keys.CONTROL);
			ac.sendKeys("c");
			ac.keyUp(Keys.CONTROL);
			ac.build().perform();
			Thread.sleep(1000);
			
			
			//Press the tab to switch to the permanent Address
			ac.sendKeys(Keys.TAB);
			ac.build().perform();
			Thread.sleep(1000);
			
			//Paste the address from current address
			ac.keyDown(Keys.CONTROL);
			ac.sendKeys("v");
			ac.keyUp(Keys.CONTROL);
			ac.build().perform();
			
			//button[text()='Submit']
			
			//Paste the permanent address
			WebElement permanent =driver.findElement(By.id("permanentAddress"));
			
			
			
			//Compare Text of current Address and Permanent Address
	        assertEquals(current.getAttribute("value"),permanent.getAttribute("value"));
			
			
			
		
			// Initialize ChromeDriver
			// Here we assume that the ChromeDriver path has been set in the System Global variables
	      
	        //Navigate to the demo site
	       
	        
	        //Create object of the Actions class
	     
	        
	        // Enter the Full Name
	       /* WebElement fullName = driver.findElement(By.id("userName"));
	        fullName.sendKeys("Mr.Peter Haynes");
	        
	        //Enter the Email
	        WebElement email=driver.findElement(By.id("userEmail"));
	        email.sendKeys("PeterHaynes@toolsqa.com");
	        
	        
	        // Enter the Current Address
	        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
	        
	        currentAddress.sendKeys("43 School Lane London EC71 9GO");
	        
	        
	        // Select the Current Address using CTRL + A
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("a");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        
	        // Copy the Current Address using CTRL + C
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("c");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        
	        //Press the TAB Key to Switch Focus to Permanent Address
	        actions.sendKeys(Keys.TAB);
	        actions.build().perform();
	        
	        //Paste the Address in the Permanent Address field using CTRL + V
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("v");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        
	        
	        //Compare Text of current Address and Permanent Address
	        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
	        assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
	        */
			
		}
		catch(Exception e)
		{
			System.out.println("I am in catch Block ");
			e.printStackTrace();
		}

	}

}

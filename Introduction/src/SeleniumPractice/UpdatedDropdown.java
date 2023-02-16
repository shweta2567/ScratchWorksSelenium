package SeleniumPractice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@SuppressWarnings("unused")
public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();   //create the object of chromeoptions

	       Map<String, Object> prefs=new HashMap<>();    // create the object of map collection

	       prefs.put("profile.default_content_setting_values.notifications", 2);    //put the values in map, 1 - accept , 2 - block

	       options.setExperimentalOption("prefs",prefs);

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(options);
		
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
		Thread.sleep(4000);
		
		
		/*int i=1;
		while(i<5) {
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]")).click();
		i++;
		}*/
		for(int i=1;i<5;i++){
			
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		
		
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
	}

}

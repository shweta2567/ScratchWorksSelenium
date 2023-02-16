package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Brokenlinks {
	public static void main(String args[]) throws MalformedURLException, IOException {

		// step 1 Is to get all the URLs tied up to the links using the selenium
		// step 2 Java methods will call URL's and get you the status code
		// Step 3 if status code is >400 then that url is not working -> link which tied
		// to the url is broken

		try {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();


			List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
			SoftAssert a=new SoftAssert();

			for (WebElement link : links)

			{

				String url = link.getAttribute("href");

				System.out.println(url);

				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

				conn.setRequestMethod("HEAD");

				conn.connect();

				int responsecode = conn.getResponseCode();

				System.out.println(responsecode);
				Assert.assertTrue(responsecode<400, "The ink with text" + link.getText() + "is broken with code" + responsecode);

				
			}
			a.assertAll();

		}

		catch (Exception e) {
			System.out.println("I am in catch block");
			e.printStackTrace();

		}

	}

}

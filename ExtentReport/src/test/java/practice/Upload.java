package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {

	public static void main(String[] args) throws IOException, InterruptedException {
		String downloadPath =System.getProperty("user.dir");
		ChromeOptions chromeOptions = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);
		chromeOptions.setExperimentalOption("prefs", chromePrefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[class*='uploader__btn']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\SHWETA\\Pictures\\Screenshots\\check\\fileupload.exe");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='processTaskTextBtn']")));
		driver.findElement(By.xpath("//span[@id='processTaskTextBtn']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='downloader__btn']")));
		driver.findElement(By.cssSelector("[class*='downloader__btn']")).click();
		Thread.sleep(5000);
		File f =new File(downloadPath+"/Passport_Photograph.pdf");
		if(f.exists()) {
			Assert.assertTrue(f.exists());
			if(f.delete())
			System.out.println("File deleted");
		}
	}

}

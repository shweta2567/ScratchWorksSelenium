package corejava;

import java.io.IOException;
//import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shweta {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHWETA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[class*='uploader__btn']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\SHWETA\\Pictures\\Screenshots\\check\\fileupload.exe");
	}

}

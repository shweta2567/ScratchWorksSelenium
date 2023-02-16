package shwetayadav.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import shwetayadav.TestComponents.BaseTest;
import tcs.SeleniumFrameWorkDesign.CartPage;
import tcs.SeleniumFrameWorkDesign.CheckoutPage;
import tcs.SeleniumFrameWorkDesign.ConfirmationPage;
import tcs.SeleniumFrameWorkDesign.Landingpage;
import tcs.SeleniumFrameWorkDesign.Productcatalogue;

public class Dumpy extends BaseTest {

	@Test
	public void submitOrder() throws IOException
	{

		String productName="ZARA COAT 3";
		
		Productcatalogue productCatalogue=landingpage.loginApplication("shweta@gmail.com", "Shweta@123");
		
		List<WebElement> products=productCatalogue.getProductList();
		productCatalogue.addProductCart(productName);
		//productCatalogue.addProductCart(input.get("product"));
		
		CartPage cartpage=productCatalogue.goToCartPage();
		Boolean match=cartpage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage checkoutPage=cartpage.goToCheckout();
		checkoutPage.selectCountry("india");
		ConfirmationPage confirmationPage=checkoutPage.submitOrder();
		String confirmMessage=confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
		
	}
	

}

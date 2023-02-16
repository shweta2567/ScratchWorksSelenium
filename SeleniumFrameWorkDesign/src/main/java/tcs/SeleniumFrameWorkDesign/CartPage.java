package tcs.SeleniumFrameWorkDesign;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import shweta.AbsractComponents.AbstractComponent;

public class CartPage extends AbstractComponent {
WebDriver driver;
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	@FindBy(xpath="//div[@class='cartSection']/h3")
	private List<WebElement> cartProducts;
	
	
	
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Boolean VerifyProductDisplay(String productName)
	{
		Boolean match=cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
		return match;
	}
	public CheckoutPage goToCheckout()
	{
		checkoutEle.click();
		return new CheckoutPage(driver);
	}
	

}

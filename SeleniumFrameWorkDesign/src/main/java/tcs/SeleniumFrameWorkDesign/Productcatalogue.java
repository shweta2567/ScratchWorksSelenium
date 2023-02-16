package tcs.SeleniumFrameWorkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import shweta.AbsractComponents.AbstractComponent;

public class Productcatalogue extends AbstractComponent{
WebDriver driver;
	public Productcatalogue(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//div[@class='row'])[3]")     //driver.find store in userEmail
	List<WebElement> products;
	
	@FindBy(css=".ng-animating")     //driver.find store in userEmail
	WebElement spinner;
	
	By productsBy =By.xpath("(//div[@class='row'])[3]");
	By addToCart=By.cssSelector(".card-body button:last-of-type");
	By toastMessage=By.cssSelector("#toast-container");
	
	public List<WebElement> getProductList()
	{
		waitforElementToAppear(productsBy);
		return products;
		
	}
	public WebElement getProductByName(String productName)
	{
		WebElement prod=getProductList().stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
	   return prod;
	}
	public void addProductCart(String productName)
	{
		WebElement prod=getProductByName(productName);
		prod.findElement(addToCart).click();
		waitforElementToAppear(toastMessage);
		waitForElementToDisappear(spinner);
	}
	
	
}

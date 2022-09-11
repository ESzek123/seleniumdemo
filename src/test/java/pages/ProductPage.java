package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductPage {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement firstBackpack;


    @FindBy(className = "shopping_cart_badge")
    public WebElement shoppingCart;

    WebDriver driver;

    public ProductPage(WebDriver  driver) {
        this.driver = driver;
    }

    public void buyFirstBackpack() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(firstBackpack));
        String text = firstBackpack.getText();
        System.out.println(text);
        Assert.assertEquals(text, "ADD TO CART");
        firstBackpack.click();
        shoppingCart.click();
    }


}

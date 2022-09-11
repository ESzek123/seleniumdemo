package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class YourCartPage {

    @FindBy(id = "checkout")
    WebElement buttonCheckout;

    WebDriver driver;

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void doPurchase(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(buttonCheckout));
        Assert.assertTrue(buttonCheckout.isDisplayed());
        buttonCheckout.click();
    }
}

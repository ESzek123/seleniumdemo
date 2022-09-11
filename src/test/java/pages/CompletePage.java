package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CompletePage {

    @FindBy(id = "back-to-products")
    public WebElement buttonBack;

    public WebDriver driver;

    public CompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public void backToFirstPage() {
        Assert.assertTrue(buttonBack.isDisplayed());
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(buttonBack));
        buttonBack.click();
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class OverviewPage {

    @FindBy(id = "finish")
    WebElement buttonFinish;

    WebDriver driver;

    public OverviewPage(WebDriver driver){
        this.driver = driver;
    }

    public void finalizationPurchasing() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(buttonFinish));
        Assert.assertTrue(buttonFinish.isDisplayed());
        buttonFinish.click();
    }
}

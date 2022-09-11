package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class YourInformationPage {

    @FindBy(id = "first-name")
    public WebElement firstNameInput;

    @FindBy(id = "last-name")
    public WebElement lastNameInput;

    @FindBy(id = "postal-code")
    public WebElement postalCodeInput;

    @FindBy(id = "continue")
    public WebElement continueButton;

    WebDriver driver;

    public YourInformationPage(WebDriver driver) {
        this.driver = driver;
    }


    public void inputInformation(String name, String lastName, int postalCode) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(firstNameInput));
        Assert.assertTrue(firstNameInput.isDisplayed());
        firstNameInput.sendKeys(name);
        lastNameInput.sendKeys(lastName);
        postalCodeInput.sendKeys(String.valueOf(postalCode));
        continueButton.click();
    }

}

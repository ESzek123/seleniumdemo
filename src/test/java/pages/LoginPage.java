package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

    @FindBy(id = "user-name")
    public WebElement loginInput;

    @FindBy(id = "password")
    public WebElement passInput;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logIn(String login, String pass) {
        loginInput.sendKeys(login);
        passInput.sendKeys(pass);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        Assert.assertTrue(loginButton.isDisplayed());
        loginButton.click();
    }


}

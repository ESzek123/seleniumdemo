package scenarios;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.*;

public class BuyOneThingTest extends BaseTest {

    public String login = "standard_user";
    public String pass = "secret_sauce";

    @Test
    public void buyOneBag(){
        openBrowser();
        LoginPage loginPage1 = new LoginPage(driver);
        //PageFactory.initElements(this.driver, loginPage1);
        loginPage1.logIn(login, pass);
        ProductPage productPage = new ProductPage(driver);
        PageFactory.initElements(driver, productPage);
        productPage.buyFirstBackpack();
        YourCartPage yourCartPage = new YourCartPage(driver);
        PageFactory.initElements(driver, yourCartPage);
        yourCartPage.doPurchase();
        YourInformationPage yourInformationPage = new YourInformationPage(driver);
        PageFactory.initElements(driver, yourInformationPage);
        yourInformationPage.inputInformation("Edyta", "Edyta", 2);
        OverviewPage overviewPage = new OverviewPage(driver);
        PageFactory.initElements(driver, overviewPage);
        overviewPage.finalizationPurchasing();
        CompletePage completePage = new CompletePage(driver);
        PageFactory.initElements(driver, completePage);
        completePage.backToFirstPage();
    }


}

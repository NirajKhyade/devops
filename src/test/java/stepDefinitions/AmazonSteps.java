package stepDefinitions;

import PageObject.BrowserFactory;
import PageObject.UtilityClass;
import PageObject.WithLogin;
import PageObject.WithOutLogin;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class AmazonSteps extends BrowserFactory {
    WebDriver driver;
    public WithOutLogin withOutLogin;
    public WithLogin withLogin;

    @Given("User Launch  Browser")
    public void user_Launch_Browser() throws IOException {
        driver=openBrowser(UtilityClass.getData("Browser"));
        withOutLogin = new WithOutLogin(driver);
        withLogin = new WithLogin(driver);


    }

    @When("User Enter Url")
    public void user_Enter_Url() throws IOException {
        driver=enterUrl(UtilityClass.getData("Url"));
        driver.manage().window().maximize();
    }

    @When("User Click On Today's Deal")
    public void user_Click_On_Today_s_Deal() {
        withOutLogin.clickOnTodayDeal();

    }

    @When("User CLick On Third Deal")
    public void user_CLick_On_Third_Deal() {
        withOutLogin.clickOnThirdDeal();

    }

    @When("User Click On Product")
    public void user_Click_On_Product() {
        withOutLogin.clickOnProduct();

    }

    @When("Click On Add To Cart Button")
    public void click_On_Add_To_Cart_Button() {
        withOutLogin.clickOnAddToCart();
        withOutLogin.clickOnCartButton();

    }

    @When("Verify Quantity as {string}")
    public void verify_Quantity_as(String string) {
       // withOutLogin.verifyQuantity();

    }

    @When("User Search The {string}")
    public void user_Search_The(String string) throws IOException {
        withOutLogin.clickOnAmazon();
        withOutLogin.clickOnSearchTab(string);

    }

    @Then("Product Page Is Visible")
    public void product_Page_Is_Visible() {
        String title = driver.getTitle();
        System.out.println(title);
    }

    @When("Scroll Down The Page")
    public void scroll_Down_The_Page() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6000)", "");

    }

    @When("Get The Last Displayed Item Details")
    public void get_The_Last_Displayed_Item_Details() {
        withOutLogin.getTextOfLastProduct();

    }

    @When("Click On Left Navigation")
    public void click_On_Left_Navigation() {
        for (int i=0;i<=5;i++){
            driver.navigate().back();

        }

    }

    @When("Close The Browser")
    public void close_The_Browser() {
        driver.quit();
    }

    @When("User Click On SignUp Button")
    public void userClickOnSignUpButton() {
        withLogin.clickOnSignIn();

    }

    @And("User Enter Email and Password")
    public void userEnterEmailAndPassword() throws IOException {
        withLogin.signIn();

    }

    @And("Click On Login")
    public void clickOnLogin() {
        withLogin.clickOnLogin();
    }

    @Then("Select The Prime Delivery Checkbox")
    public void selectThePrimeDeliveryCheckbox() {
        withLogin.clickOnMobile();
        withLogin.clickOnPrime();

    }

    @And("Get The First Item Delivery Date")
    public void getTheFirstItemDeliveryDate() {
        withLogin.deliveryDate();
    }

    @When("Click On Your Order")
    public void clickOnYourOrder() {
        withLogin.clickOnYourOrder();

    }

    @And("Select Past One Year Order")
    public void selectPastOneYearOrder() {
        withLogin.lastOrder();
    }

    @When("Click On Account")
    public void clickOnAccount() {
       for(int i =0;i<=1;i++) {
           driver.navigate().back();
       }
    }

    @And("Click On Add Payment Option")
    public void clickOnAddPaymentOption() {
        withLogin.clickOnAddPayment();
    }

    @Then("Verify Payment Option")
    public void verifyPaymentOption() {
        String title = driver.getTitle();
        System.out.println(title);
    }

    @And("Click On Add Address Option")
    public void clickOnAddAddressOption() {
        driver.navigate().forward();
    }

    @And("Add The Address With All Details")
    public void addTheAddressWithAllDetails() throws IOException {
        withLogin.yourAddress();
        withLogin.addDetails();


    }

    @Then("Verify Address is Added")
    public void verifyAddressIsAdded() {
        withLogin.verifyAdd();
    }

    @And("Close Browser")
    public void closeBrowser() {
        driver.quit();
    }
}

package PageObject;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class WithLogin {

    public WebDriver driver;
    public WithLogin(WebDriver driver) { PageFactory.initElements(driver,this); }

    @FindBy(xpath = "//a[@data-nav-ref='nav_ya_signin']")@CacheLookup WebElement signIn;
    public void clickOnSignIn(){
        signIn.click();
    }
    @FindBy(xpath = "//input[@type='email']")@CacheLookup WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='continue']")@CacheLookup WebElement next;
    @FindBy(xpath = "//input[@id='ap_password']")@CacheLookup WebElement password;
    @FindBy(xpath = "//input[@id='signInSubmit']")@CacheLookup WebElement submit;

    public void signIn() throws IOException {
        mobileNumber.sendKeys(UtilityClass.getData("MobileNumber"));
        next.click();
        password.sendKeys(UtilityClass.getData("Password"));

    }
    public void clickOnLogin(){
        submit.click();
    }
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[5]")@CacheLookup WebElement mobile;
    public void clickOnMobile(){
        mobile.click();
    }
    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[2]")@CacheLookup WebElement prime;
    public void clickOnPrime(){
        prime.click();
    }
    @FindBy(xpath = "(//div[@class='a-row s-align-children-center'])[1]")@CacheLookup WebElement text;
    public void deliveryDate(){
        String date=text.getText();
        System.out.println(date);
    }
    @FindBy(xpath = "//a[@data-nav-ref='nav_youraccount_btn']")@CacheLookup WebElement yourAccount;
    @FindBy(xpath = "(//div[@class='a-row'])[1]")@CacheLookup WebElement yourOrder;
    public void clickOnYourOrder(){
        yourAccount.click();
        yourOrder.click();
    }
    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")@CacheLookup WebElement previousOrder;
    @FindBy(xpath = "(//li[@class='a-dropdown-item'])[3]")@CacheLookup WebElement year;
    public void lastOrder(){
        previousOrder.click();
        year.click();

    }
    public void clickOnYourAccount(){
        yourAccount.click();
    }
    @FindBy(xpath = "//div[@data-card-identifier='PaymentOptions']")@CacheLookup WebElement payment;
    public void clickOnAddPayment(){
        payment.click();
    }

    @FindBy(xpath = "(//div[@class='a-box-inner'])[4]")@CacheLookup WebElement address;
    @FindBy(xpath = "//div[@class='a-box first-desktop-address-tile']")@CacheLookup WebElement addAddress;
    public void yourAddress(){
        address.click();
        addAddress.click();
    }
    @FindBy(xpath = "//input[@name='address-ui-widgets-enterAddressFullName']")@CacheLookup WebElement fullName;
    @FindBy(xpath = "//input[@name='address-ui-widgets-enterAddressPhoneNumber']")@CacheLookup WebElement mobileNo;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']")@CacheLookup WebElement pinCode;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")@CacheLookup WebElement flatNo;
    @FindBy(xpath = "//input[@name='address-ui-widgets-enterAddressLine2']")@CacheLookup WebElement area;
    @FindBy(xpath = "//input[@name='address-ui-widgets-landmark']")@CacheLookup WebElement landmark;

    @FindBy(xpath = "(//input[@type='submit'])[4]")@CacheLookup WebElement clickOnAdd;
    @FindBy(xpath = "(//input[@type='submit'])[4]")@CacheLookup WebElement clickOnAddress;


    public void addDetails() throws IOException {
        fullName.sendKeys(UtilityClass.getData("FullName"));
        mobileNo.sendKeys(UtilityClass.getData("MobileNo"));
        pinCode.sendKeys(UtilityClass.getData("PinCode"));
        flatNo.sendKeys(UtilityClass.getData("Flat"));
        area.sendKeys(UtilityClass.getData("Area"));
        landmark.sendKeys(UtilityClass.getData("Landmark"));
        clickOnAdd.click();
        try {
            clickOnAddress.click();
        }
        catch (Exception e) {
            System.out.println("Clicked again on add address");
            clickOnAddress.click();
        }
    }
    @FindBy(xpath = " //h4[@class='a-alert-heading']")@CacheLookup WebElement verifyAdd;
    public void verifyAdd(){
        String addressText=verifyAdd.getText();
        System.out.println(addressText);
        Assert.assertEquals(addressText,"Address saved");

    }













}

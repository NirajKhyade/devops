package PageObject;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class WithOutLogin {
    public WebDriver driver;

    public WithOutLogin(WebDriver driver) { PageFactory.initElements(driver,this); }

    @FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_gb']") @CacheLookup  WebElement todayDeal;
    public void clickOnTodayDeal(){ todayDeal.click();}

    @FindBy(xpath = "(//img[@data-a-hires='https://m.media-amazon.com/images/I/61voxnxH9LL._AC_UF452,452_FMjpg_.png'])[1]")@CacheLookup WebElement thirdDeal;
    @FindBy (xpath = "(//div[@class='a-section octopus-dlp-image-shield'])[3]")@CacheLookup WebElement thirdProduct;
    public void clickOnThirdDeal(){
        thirdDeal.click();
    }
    public void clickOnProduct(){
        thirdProduct.click();
    }
    @FindBy(xpath = "//Select[@id='native_dropdown_selected_size_name']")@CacheLookup WebElement size;

    public void clickOnAddToCart(){
        Select dropdown = new Select(size);
        dropdown.selectByIndex(1);
    }
    @FindBy(xpath = "//input[@id='add-to-cart-button']")@CacheLookup WebElement addToCart;
    public void clickOnCartButton(){
        addToCart.click();
    }
    @FindBy(xpath = "//label[@class=\"a-native-dropdown\"]")@CacheLookup WebElement quantity;
    public void verifyQuantity(){

        String actualQty= quantity.getText();
        Assert.assertEquals(actualQty, "1");
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']") @CacheLookup WebElement search;
    @FindBy(xpath = "//input[@type='submit']") @CacheLookup WebElement submit;
    public void clickOnSearchTab(String item) throws IOException {
        search.sendKeys(UtilityClass.getData("Search"));
        submit.click();
    }
    @FindBy(xpath = "//a[@id=\"nav-logo-sprites\"]")@CacheLookup WebElement amazon;
    public void clickOnAmazon(){
        amazon.click();
    }
    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[22]")@CacheLookup WebElement lastProduct;
    public void getTextOfLastProduct(){
        String text=lastProduct.getText();
        System.out.println(text);
    }





}

package stepdefinitations.productsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.productpages.ProductLoginPage;
import pages.productpages.ProductMainPage;
import pages.productpages.ProductOrderPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class ProductOrderSteps {
    WebDriver driver = DriverHelper.getDriver();
    ProductLoginPage productLoginPage = new ProductLoginPage(driver);
    ProductMainPage productMainPage = new ProductMainPage(driver);
   ProductOrderPage productOrderPage = new ProductOrderPage(driver);

    @Given("the user navigates to product website homepage and click orderButton")
    public void the_user_navigates_to_product_website_homepage_and_click_order_button() {
        productLoginPage.login(ConfigReader.readProperty("productusername"),ConfigReader.readProperty("productpassword"));
        productMainPage.clickOrderButton();
    }

    @When("the user enters the product information {string} and {string}")
    public void the_user_enters_the_product_information_and(String productname, String quantitynumber) {
        productOrderPage.sendProductInfo(productname,quantitynumber);

    }

    @When("the user enters the adresss information {string},{string},{string},{string},{string}")
    public void the_user_enters_the_adresss_information(String customername, String streetname,
                                                        String cityname, String statename, String zipcodename) {
        productOrderPage.sendAdressInformation(customername,streetname,cityname,statename,zipcodename);

    }

    @When("the user enters the card information {string},{string},{string}")
    public void the_user_enters_the_card_information(String cardtype, String cardnumber, String expiredate) {
        productOrderPage.selectCardType(cardtype);
productOrderPage.sendPaymentInformation(cardnumber,expiredate);
    }

    @Then("the user validates succes message")
    public void the_user_validates_succes_message() throws InterruptedException {
        productOrderPage.clickProcessButton();
        Thread.sleep(3000);
        Assert.assertEquals("New order has been successfully added.",productOrderPage.getSuccessMessage());

    }
    @Then("the user validates product details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void the_user_validates_product_details(String customerName, String productName, String quantity, String street, String city,
                                                   String state, String zipCode, String cardType, String cardNumber, String expirationDate) {
productMainPage.clickviewallOrderButton();
productOrderPage.getInfo(customerName,productName,quantity,street,city,state,zipCode,cardType,cardNumber,expirationDate);

    }

}

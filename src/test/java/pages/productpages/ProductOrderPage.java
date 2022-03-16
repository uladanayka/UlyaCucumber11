package pages.productpages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class ProductOrderPage {
    public ProductOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
    private WebElement productName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    private WebElement quantityNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    private WebElement customerName;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    private WebElement street;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    private WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    private WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    private WebElement zipcode;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    private WebElement visaCard;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_1")
    private WebElement mastercard;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_2")
    private WebElement americanExpress;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    private WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    private WebElement expireDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement prosessButton;

    @FindBy(tagName = "strong")
    private WebElement message;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']//tr[2]//td")
    private List<WebElement> productInfo;

    public void sendProductInfo(String product, String quantity){
        BrowserUtils.selectBy(this.productName,product,"value");
        this.quantityNumber.clear();
        this.quantityNumber.sendKeys(quantity);
    }

    public void sendAdressInformation(String customerN,String streetN,String cityN,
                                      String stateN,String zipcodeN){
        this.customerName.sendKeys(customerN);
        this.street.sendKeys(streetN);
        this.city.sendKeys(cityN);
        this.state.sendKeys(stateN);
        this.zipcode.sendKeys(zipcodeN);
    }
    public void sendPaymentInformation(String cardN,String expireDateN){
        this.cardNumber.sendKeys(cardN);
        this.expireDate.sendKeys(expireDateN);
    }

    public void selectCardType(String cardTypeN){
        switch (cardTypeN){
            case "Visa":
                visaCard.click();
                break;

            case "MasterCard":
                mastercard.click();
                break;
            case "American Express":
                americanExpress.click();
                break;

        }
    }

public void clickProcessButton(){
        prosessButton.click();
}
public String getSuccessMessage(){
        return BrowserUtils.getTextMethod(message);

}

public void getInfo(String customerName, String productName, String quantity, String street, String city,
                    String state, String zipCode, String cardType, String cardNumber, String expirationDate){
    Assert.assertEquals(productInfo.get(1).getText().trim(),customerName);
    Assert.assertEquals(productInfo.get(2).getText().trim(),productName);
    Assert.assertEquals(productInfo.get(3).getText().trim(),quantity);
    Assert.assertEquals(productInfo.get(5).getText().trim(),street);
    Assert.assertEquals(productInfo.get(6).getText().trim(),city);
    Assert.assertEquals(productInfo.get(7).getText().trim(),state);
    Assert.assertEquals(productInfo.get(8).getText().trim(),zipCode);
    Assert.assertEquals(productInfo.get(9).getText().trim(),cardType);
    Assert.assertEquals(productInfo.get(10).getText().trim(),cardNumber);
    Assert.assertEquals(productInfo.get(11).getText().trim(),expirationDate);

}


}

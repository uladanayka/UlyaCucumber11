package pages.etsypages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage {
    public EtsyHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "global-enhancements-search-query")
    private WebElement searhBox;

    public void sendSearchBox(String searchValue){
        searhBox.sendKeys(searchValue, Keys.ENTER);

    }


}

package pages.openmrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRSLoginPage {
    public OpenMRSLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement passWord;

    @FindBy(id = "Inpatient Ward")
    private WebElement inpWardButton;

    @FindBy(id = "loginButton")
    private WebElement loginButton;


    public void login(String username,String password){
        this.userName.sendKeys(username);
        this.passWord.sendKeys(password);
        inpWardButton.click();
        loginButton.click();

    }
}

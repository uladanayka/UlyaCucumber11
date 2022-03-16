package pages.openmrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OpenMRSRegisterPage {
    public OpenMRSRegisterPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(name = "givenName")
    private WebElement givenname;

    @FindBy(name = "familyName")
    private WebElement familyName;

    @FindBy(id = "next-button")
    private WebElement nextButton;

    @FindBy(id = "gender-field")
    private WebElement selectGender;

    @FindBy(xpath = "//input[@id='birthdateDay-field']")
    private WebElement dayBirthday;

    @FindBy(id = "birthdateMonth-field")
    private WebElement selectBirthMonth;

    @FindBy(xpath = "//input[@id='birthdateYear-field']")
    private WebElement selectBirthYear;

    @FindBy(id = "address1")
    private WebElement adDress;

    @FindBy(name = "phoneNumber")
    private WebElement phoneNumber;

    @FindBy(id = "relationship_type")
    private WebElement relationType;

    @FindBy(xpath = "//input[@placeholder='Person Name']")
    private WebElement relativeName;

    @FindBy(id = "submit")
    private WebElement confirmButton;
    //@FindBy(xpath = )



   public void sendName(String name, String familyname) throws InterruptedException {
       this.givenname.sendKeys(name);
       this.familyName.sendKeys(familyname);
       Thread.sleep(3000);
       nextButton.click();
   }
   public void sendGender(String gender) throws InterruptedException {
       BrowserUtils.selectBy(selectGender,gender,"text");
       Thread.sleep(3000);
       nextButton.click();
   }

   public void sendBirthDate(String day,String month,String year) throws InterruptedException {
       dayBirthday.clear();
       dayBirthday.sendKeys(day);
       Thread.sleep(3000);
       BrowserUtils.selectBy(selectBirthMonth,month,"text");
       selectBirthYear.clear();
       selectBirthYear.sendKeys(year);
       Thread.sleep(3000);
       nextButton.click();
   }

   public void sendAddress(String address) throws InterruptedException {
       this.adDress.sendKeys(address);
       Thread.sleep(3000);
       nextButton.click();
   }

   public void sendPhoneNUmber(String phonenumber) throws InterruptedException {
       this.phoneNumber.sendKeys(phonenumber);
       Thread.sleep(3000);
       nextButton.click();
   }

   public void sendrelativeInfo(String relativetype, String relativename) throws InterruptedException {
       BrowserUtils.selectBy(relationType,relativetype,"text");
       this.relativeName.sendKeys(relativename);
       Thread.sleep(2000);
       nextButton.click();
   }

   public void clickConfirmButton() throws InterruptedException {
       Thread.sleep(3000);
       confirmButton.click();
   }




}

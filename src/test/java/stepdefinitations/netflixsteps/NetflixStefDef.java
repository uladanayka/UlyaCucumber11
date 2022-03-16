package stepdefinitations.netflixsteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.netflixpages.NetflixLoginPage;
import utils.DriverHelper;

public class NetflixStefDef {
WebDriver driver = DriverHelper.getDriver();
NetflixLoginPage netflixLoginPage = new NetflixLoginPage(driver);
    @When("I navigate to Netflix loginPage")
    public void i_navigate_to_netflix_login_page() {
        driver.get("https://www.netflix.com/login");

    }
    @When("I enter not valid email")
    public void i_enter_not_valid_email() {
        netflixLoginPage = new NetflixLoginPage(driver);
        netflixLoginPage.enterEmail("test@test.com");
    }
    @When("I enter not valid password")
    public void i_enter_not_valid_password() {

    }
    @When("I click submit button")
    public void i_click_submit_button() {

    }
    @Then("I see Incorrect password element")
    public void i_see_incorrect_password_element() {

    }

}

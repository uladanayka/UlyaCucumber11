package stepdefinitations.openmrssteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.openmrs.OpenMRSLoginPage;
import pages.openmrs.OpenMRSMainPage;
import pages.openmrs.OpenMRSRegisterPage;
import utils.DriverHelper;

import java.util.Map;

public class RegisterPatientSteps {
    WebDriver driver= DriverHelper.getDriver();
    OpenMRSLoginPage openMRSLoginPage = new OpenMRSLoginPage(driver);
    OpenMRSMainPage openMRSMainPage = new OpenMRSMainPage(driver);
    OpenMRSRegisterPage openMRSRegisterPage = new OpenMRSRegisterPage(driver);


    @Given("the user in to OpenMRS with following credentials")
    public void the_user_in_to_open_mrs_with_following_credentials(io.cucumber.datatable.DataTable dataTable) {
        //you should know that " dataTable will come as a parameter when you provide data table in
        //the feature file and delete the first part of the Datatable and import it.
        Map<String,String> usernamePasswordMap=dataTable.asMap();
        //username=admin
        //password=Admin123
//        String name = usernamePasswordMap.get("username");
//        String password = usernamePasswordMap.get("password");
//        System.out.println(name);//admin
//        System.out.println(password);//Admin123
        openMRSLoginPage.login(usernamePasswordMap.get("username"),usernamePasswordMap.get("password"));
    }
    @When("the user registers a new patient with following information:")
    public void the_user_registers_a_new_patient_with_following_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
    Map<String,String> patientInfoMap = dataTable.asMap();
    openMRSMainPage.clickregisterPatientButton();

    openMRSRegisterPage.sendName(patientInfoMap.get("GivenName"),patientInfoMap.get("FamilyName"));
    openMRSRegisterPage.sendGender(patientInfoMap.get("Gender"));
    openMRSRegisterPage.sendBirthDate(patientInfoMap.get("Day"),patientInfoMap.get("Month"),patientInfoMap.get("Year"));
    openMRSRegisterPage.sendAddress(patientInfoMap.get("Adress"));
    openMRSRegisterPage.sendPhoneNUmber(patientInfoMap.get("PhoneNumber"));
    openMRSRegisterPage.sendrelativeInfo(patientInfoMap.get("RelationType"),patientInfoMap.get("RelativeName"));
    openMRSRegisterPage.clickConfirmButton();
    }

    @Then("the user valiadtes the patient name and familyName")
    public void the_user_valiadtes_the_patient_name_and_family_name(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> validateNames = dataTable.asMap();

    }

}

package stepdefinitations.weborderSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverHelper;

public class HookWebOrder {
    @Before
    public void beforescenario(){
        System.out.println("it runs before eachscenario");
    }
    @After
    public void afterscenario(){
        System.out.println("it runs after each scenario");
        DriverHelper.tearDown();
    }
}

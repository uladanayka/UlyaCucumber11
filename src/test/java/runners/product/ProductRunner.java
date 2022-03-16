package runners.product;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features/com.products",
            glue = "stepdefinitations/productsteps",
            dryRun = false,
            tags = "@productprojectOutline"
    )

    public class ProductRunner {

    }

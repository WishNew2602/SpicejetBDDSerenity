package org.Ebay.starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/Features/ProductAccess.feature",
        glue = "org.Ebay.StepDefinitions"
)
public class TestRunner {
    public static void main(String[] args){

    }
}
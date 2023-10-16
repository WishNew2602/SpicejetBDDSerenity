package org.spicejet.starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/Features",
        glue = "stepdefs"
)
public class SpiceJetTestSuite {

    public static void main(String[] args) {

    }
}

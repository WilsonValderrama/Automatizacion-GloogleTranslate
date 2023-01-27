package co.com.bancolombia.certification.googlesuite.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/google_translate.feature",
        glue = "co.com.bancolombia.certification.googlesuite.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class GoogleTranslateRunner {
}

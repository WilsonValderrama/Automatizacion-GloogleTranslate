package co.com.bancolombia.certification.googlesuite.stepdefinitions;

import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class GoogleTranslateStepDefinitions {

    //Instancieamos el WebDriver
    @Managed(driver = "chrome")
    private WebDriver browser;

    //Actor
    private Actor user = Actor.named("User");

    //El actor referencia al driver
    @Before
    public void setUp(){
        //Actor puede navegar en el browser
        user.can(BrowseTheWeb.with(browser));
    }

    //Snippets
    @Given("^That user wants translate a words$")
    public void thatUserWantsTranslateAWords() {
        //Precondicion: Estar en google translate
        //1. Abrir navegador en el home de google: http
        user.wasAbleTo(OpenTheBrowser.on()); //fue capaz de lo usamos en los metodos @Given
        user.wasAbleTo(GoTo.theApp());

    }

    @When("^user types the words to be translates from English to Spanish$")
    public void userTypesTheWordsToBeTranslatesFromEnglishToSpanish() {
        //Condiciones: Traducir una palabra de ingles aespañol
        //user.attemptsTo(Task);  //Intenta hacer lo usamos en el @When

    }

    @Then("^user sees the word on the screen in the lenguages than user wants$")
    public void userSeesTheWordOnTheScreenInTheLenguagesThanUserWants() {
        //Consecuencia: Traduccion de las palabras -> verificar
    }

}

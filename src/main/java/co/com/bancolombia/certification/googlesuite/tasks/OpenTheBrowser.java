package co.com.bancolombia.certification.googlesuite.tasks;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {
    @Override
    @Step("{0} opens the browser on google home page") //Esto es para que aparezca en el informe
    public <T extends Actor> void performAs(T actor) {
        //Aqui van todas las interacciones para cumplir con dicha tarea
        actor.attemptsTo(Open.browserOn(new GoogleHomePage()));

    }

    public static OpenTheBrowser on(){
        return instrumented(OpenTheBrowser.class);
    }

}

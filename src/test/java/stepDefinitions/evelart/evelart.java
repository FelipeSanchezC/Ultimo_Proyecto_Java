package stepDefinitions.evelart;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import userInterfaces.evelart.evelartUi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static questions.evelart.keyFinalEvelart.finalString;
import static tasks.evelart.almacenarInfo.keyFinal;
import static tasks.evelart.completarInfo.flujoCompleto;
import static tasks.evelart.loginEvelart.ingreso;
import static utilities.constantes.ACTOR_NAME;

public class evelart {

    @Before
    public void setUpEvelart(){
        setTheStage(new OnlineCast());
    }

    @Given("El usuario ingresa a la pagina web")
    public void ingresoALaWeb(){
        theActorCalled(ACTOR_NAME).wasAbleTo(Open.browserOn(new evelartUi()));
    }

    @When("Realiza el flujo de interaccion")
    public void realizarActions(){
        theActorInTheSpotlight().attemptsTo(
                ingreso(),
                flujoCompleto(),
                keyFinal()
        );
    }

    @Then("Valida que el resultado sea correcto")
    public void validarResultado(){
        String resultado = theActorInTheSpotlight().asksFor(finalString());
        System.out.println("Resultado: " + resultado);

        theActorInTheSpotlight().should(
                seeThat(finalString())
        );
    }
}

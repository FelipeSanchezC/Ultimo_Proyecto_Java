package stepDefinitions.registerUser;

import exceptions.registerException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;
import static questions.register.validateCorrectRegisterQuestion.registroExitoso;
import static tasks.register.createNewUser.conDatos;
import static utilities.constantes.ACTOR_NAME;

public class registerUser {

    @Given("Selecciono la opcion de Crear cuenta y complemento la informacion")
    public void completarInforRegistro(Map<String,String> userData){
        theActorInTheSpotlight().attemptsTo(
                conDatos(userData)
        );
    }

    @When("Valido que realice de forma el registro del usuario")
    public void validarCorrectoRegistro() {
        System.out.println(theActor(ACTOR_NAME).asksFor(registroExitoso()).toString());

        theActorInTheSpotlight().should(
                seeThat(registroExitoso(), is(true)).
                        orComplainWith(registerException.class, "No se realizo el registro presenta fallas" )
        );
    }

}

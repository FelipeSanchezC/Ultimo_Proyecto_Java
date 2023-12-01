package stepDefinitions.loginPage;

import exceptions.loginException;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.login.ingresarUsuariostasks;
import tasks.login.loginPageTask;
import userInterfaces.homePageUi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.is;
import static questions.login.validateCorrectLoginQuestion.CorrectLogin;
import static questions.login.validateIncorrectLogin.mensajeControl;
import static utilities.constantes.ACTOR_NAME;

public class loginPage {
    @Given("Selecciono la opcion de Login en la pagina web")
    public void seleccionarLoginHomePage(){
        theActorInTheSpotlight().attemptsTo(
                loginPageTask.loginPage()
        );
    }

    @When("Ingreso las credenciales correctas usuario {string} y password {string}")
    public void ingresoCredencialesCorrectas(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(
                ingresarUsuariostasks.page(usuario, password)
        );
    }

    @When("Ingreso las credenciales incorrectas usuario {string} y password {string}")
    public void ingresoCredencialesIncorrectas(String usuario, String password){
        theActorInTheSpotlight().attemptsTo(
                ingresarUsuariostasks.page(usuario, password)
        );
    }

    @Then("Valido que realice de forma correcta el Login en la web")
    public void validacionLoginCorrecto() {
        System.out.println(theActor(ACTOR_NAME).asksFor(CorrectLogin()));

        theActorInTheSpotlight().should(
                seeThat(CorrectLogin(), is(true))
                        .orComplainWith(loginException.class, "error de Ingreso en el Login" )
        );
    }

    @Then("Valido que se presente el mensaje de control para usuario y contraseña erroneo")
    public void validacionLoginIncorrecto(){
        theActorInTheSpotlight().should(
                seeThat(mensajeControl(), is(true)).orComplainWith(loginException.class, "Error de Ingreso en el Login")
        );
    }
}

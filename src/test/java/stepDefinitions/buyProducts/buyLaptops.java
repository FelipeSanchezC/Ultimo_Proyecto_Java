package stepDefinitions.buyProducts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static tasks.login.completeLogin.completeLoginUser;

public class buyLaptops {

    @Given("el {word} realiza el login en la pagina Web con usuario registado")
    public void loginInThePortal(String usuario, Map<String, String> dataLogin){
        theActorCalled(usuario).wasAbleTo(
                completeLoginUser(dataLogin)
        );
    }

    @When("Selecciona los productos de {word} que quiere comprar")
    public void selectProduct(String product){

    }

    @Then("Valida que el carrito cuente con los productos de forma correcta")
    public void validateShoppingCart(){

    }
}

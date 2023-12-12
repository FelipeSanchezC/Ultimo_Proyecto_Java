package tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterfaces.homePageUi.*;
import static utilities.constantes.TEN_SECONDS;

public class completeLogin implements Task {

    private final Map<String, String> userData;

    public completeLogin(Map<String, String> userData) {
        this.userData = userData;
    }

    public static Performable completeLoginUser(Map<String, String> userData){
        return instrumented(completeLogin.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String username = userData.get("username");
        String password = userData.get("password");

        actor.attemptsTo(
                Click.on(btn_login_homePage),
                Enter.theValue(username).into(label_userName_homePage),
                Enter.theValue(password).into(label_password_homePage),
                Click.on(btn_signIn_homePage),
                WaitUntil.the(txt_user_logged, isVisible()).forNoMoreThan(TEN_SECONDS).seconds()
        );
    }
}

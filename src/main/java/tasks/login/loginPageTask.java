package tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.awaitility.Durations.TEN_SECONDS;
import static userInterfaces.homePageUi.btn_login_homePage;
import static userInterfaces.homePageUi.label_userName_homePage;

public class loginPageTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(btn_login_homePage));
        actor.attemptsTo(WaitUntil.the(label_userName_homePage, isVisible()).forNoMoreThan(TEN_SECONDS));
    }

    public static loginPageTask loginPage(){
        return instrumented(loginPageTask.class);
    }
}

package tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.homePageUi.*;

public class ingresarUsuariostasks implements Task {

    private String usuario;
    private String password;

    public ingresarUsuariostasks(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.remember("USERNAME", usuario);

        actor.attemptsTo(
                Click.on(label_userName_homePage),
                Enter.theValue(usuario).into(label_userName_homePage),
                Click.on(label_password_homePage),
                Enter.theValue(password).into(label_password_homePage),
                Click.on(checkBox_rememberme_homePage),
                Click.on(btn_signIn_homePage)
        );
    }

    public static ingresarUsuariostasks page(String usuario, String password){
        return instrumented(ingresarUsuariostasks.class, usuario, password);
    }
}

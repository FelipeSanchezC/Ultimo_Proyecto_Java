package tasks.evelart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.evelart.evelartUi.*;

public class loginEvelart implements Task {

    private String username = "729382";
    private String password = "10df2f32286b7120My0zLTI4MzkyNw==30e0c83e6c29f1c3";

    public static loginEvelart ingreso(){
        return instrumented(loginEvelart.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(lbd_usuario),
                Enter.theValue(username).into(lbd_usuario),
                Click.on(lbl_password),
                Enter.theValue(password).into(lbl_password),
                Click.on(btn_enviar)
        );
    }
}

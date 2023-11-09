package tasks.evelart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterfaces.evelart.evelartUi.txt_codigo_final;
import static userInterfaces.evelart.evelartUi.txt_pantalla_final;
import static utilities.constantes.TEN_SECONDS;

public class almacenarInfo implements Task {


    public static almacenarInfo keyFinal(){
        return instrumented(almacenarInfo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Target locatorElementoCodigo = txt_codigo_final;

        actor.attemptsTo(
                WaitUntil.the(txt_pantalla_final, isVisible()).forNoMoreThan(TEN_SECONDS).seconds()
        );

        String obtenerCodigo = TextContent.of(locatorElementoCodigo).answeredBy(actor).toString();
        actor.remember("keyFinal", obtenerCodigo);
    }
}

package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterfaces.evelart.evelartUi.*;
import static utilities.constantes.TEN_SECONDS;

public class evelartCicloFormulario implements Interaction {

    private String botonCiclo;
    private String sumaCiclo;

    public evelartCicloFormulario(String botonCiclo, String sumaCiclo) {
        this.botonCiclo = botonCiclo;
        this.sumaCiclo = sumaCiclo;
    }

    public static evelartCicloFormulario cicloForm(String botonCiclo, String sumaCiclo){
        return instrumented(evelartCicloFormulario.class, botonCiclo, sumaCiclo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(select_botton(botonCiclo)),
                WaitUntil.the(txt_modal, isVisible()).forNoMoreThan(TEN_SECONDS).seconds(),
                Enter.theValue(sumaCiclo).into(lbl_suma_modal),
                Click.on(btn_enviar_modal)
                //WaitUntil.the(txt_coordenadas, isVisible()).forNoMoreThan(TEN_SECONDS).seconds()
        );
    }
}

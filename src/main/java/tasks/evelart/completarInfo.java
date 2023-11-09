package tasks.evelart;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static interactions.evelartCicloFormulario.cicloForm;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static utilities.constantesEvelart.*;


public class completarInfo implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                cicloForm(bottonCiclo1, sumaCiclo1),
                cicloForm(bottonCiclo2, sumaCiclo2),
                cicloForm(bottonCiclo3, sumaCiclo3),
                cicloForm(bottonCiclo4, sumaCiclo4),
                cicloForm(bottonCiclo5, sumaCiclo5),
                cicloForm(bottonCiclo6, sumaCiclo6),
                cicloForm(bottonCiclo7, sumaCiclo7),
                cicloForm(bottonCiclo8, sumaCiclo8),
                cicloForm(bottonCiclo9, sumaCiclo9),
                cicloForm(bottonCiclo10, sumaCiclo10),
                cicloForm(bottonCiclo11, sumaCiclo11),
                cicloForm(bottonCiclo12, sumaCiclo12),
                cicloForm(bottonCiclo13, sumaCiclo13)
        );
    }

    public static completarInfo flujoCompleto(){
        return instrumented(completarInfo.class);
    }

}

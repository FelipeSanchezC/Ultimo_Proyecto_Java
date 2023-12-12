package tasks.selectProduct;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterfaces.homePageUi.product_laptops;
import static userInterfaces.products.laptopsUI.*;
import static utilities.constantes.TEN_SECONDS;

public class selectProductTask implements Task {

    private final String product;

    public selectProductTask(String product) {
        this.product = product;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                switch(product){
                    case "laptop":
                        Click.on(product_laptops),
                                Click.on(HP_ENERGY_STAR),
                                WaitUntil.the(btn_addToCart, isVisible()).forNoMoreThan(TEN_SECONDS).seconds(),
                                Click.on(btn_addToCart),
                                Click.on(link_laptops),
                                Click.on(GP_GI_ES),
                                WaitUntil.the(btn_addToCart, isVisible()).forNoMoreThan(TEN_SECONDS).seconds(),
                                Click.on(btn_addToCart),
                        break;

                    case  "mouse":

                }

        );
    }
}

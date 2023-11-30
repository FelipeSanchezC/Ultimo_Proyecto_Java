package stepDefinitions.commons;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utilities.Url;

import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;

public class beforeStep {
    private final Url page = new Url ();

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        aNewActor().attemptsTo(
                Open.browserOn(page)
        );
    }

}

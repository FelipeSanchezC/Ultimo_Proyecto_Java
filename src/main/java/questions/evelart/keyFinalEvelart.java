package questions.evelart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class keyFinalEvelart implements Question<String> {


    public static Question<String> finalString(){
        return new keyFinalEvelart();
    }

    @Override
    public String answeredBy(Actor actor) {

        return actor.recall("keyFinal");

    }
}

package questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static userInterfaces.homePageUi.txt_msj_control_user_incorrect;

public class validateIncorrectLogin implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(txt_msj_control_user_incorrect).answeredBy(actor);
    }

    public static Question<Boolean> mensajeControl (){
        return new validateIncorrectLogin();
    }
}

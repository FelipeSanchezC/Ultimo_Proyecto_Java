package questions.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import questions.login.validateCorrectLoginQuestion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;
import static userInterfaces.homePageUi.btn_login_homePage;
import static userInterfaces.homePageUi.txt_user_logged;
import static utilities.constantes.TEN_SECONDS;

public class validateCorrectRegisterQuestion implements Question<Boolean> {


    public static Question<Boolean> registroExitoso(){
        return new validateCorrectRegisterQuestion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String registerUser = actor.recall("USERNAME_REGISTER");

        actor.attemptsTo(WaitUntil.the(btn_login_homePage, isVisible()).forNoMoreThan(TEN_SECONDS).seconds());
        actor.should(seeThat(Visibility.of(btn_login_homePage), equalTo(true)));

        actor.attemptsTo(WaitUntil.the(txt_user_logged, isVisible()).forNoMoreThan(TEN_SECONDS).seconds());

        return registerUser.equals(Text.of(txt_user_logged).answeredBy(actor));
    }
}

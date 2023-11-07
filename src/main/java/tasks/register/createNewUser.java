package tasks.register;

import io.cucumber.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterfaces.commons.uiCommons.searchLocatorWithTypeAndName;
import static userInterfaces.homePageUi.btn_create_account;
import static userInterfaces.registerPageUi.*;
import static utilities.constantes.*;
import static utilities.constantesUi.*;

public class createNewUser implements Task {

    private final Map<String, String> userData;

    public createNewUser(Map<String, String> userData) {
        this.userData = userData;
    }

    public static Performable conDatos(Map<String, String> userData){
        return instrumented(createNewUser.class, userData );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String username = userData.get("username");
        String email = userData.get("email");
        String password = userData.get("password");

        actor.remember("USERNAME_REGISTER", username);


        actor.attemptsTo(
                Click.on(btn_create_account),
                WaitUntil.the(tittle_create_account, isVisible()).forNoMoreThan(TEN_SECONDS).seconds()
        );

        actor.attemptsTo(
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT, ATRIBUTE_NAME, NAME_LBL_USERNAME_REGISTER)),
                Enter.theValue(username).into(searchLocatorWithTypeAndName(TYPE_INPUT, ATRIBUTE_NAME, NAME_LBL_USERNAME_REGISTER)),
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT, ATRIBUTE_NAME, NAME_LBL_EMAIL_REGISTER)),
                Enter.theValue(email).into(searchLocatorWithTypeAndName(TYPE_INPUT, ATRIBUTE_NAME, NAME_LBL_EMAIL_REGISTER)),
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT, ATRIBUTE_NAME, NAME_LBL_PASSWORD_REGISTER)),
                Enter.theValue(password).into(searchLocatorWithTypeAndName(TYPE_INPUT, ATRIBUTE_NAME, NAME_LBL_PASSWORD_REGISTER)),
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT, ATRIBUTE_NAME, NAME_LBL_CONFIRM_PASS_REGISTER)),
                Enter.theValue(password).into(searchLocatorWithTypeAndName(TYPE_INPUT, ATRIBUTE_NAME, NAME_LBL_CONFIRM_PASS_REGISTER))
        );

        actor.attemptsTo(
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT, ATRIBUTE_NAME, NAME_LBL_FIRST_NAME_REGISTER)),
                Enter.theValue(FIRST_NAME).into(searchLocatorWithTypeAndName(TYPE_INPUT, ATRIBUTE_NAME, NAME_LBL_FIRST_NAME_REGISTER)),
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_LAST_NAME_REGISTER)),
                Enter.theValue(LAST_NAME).into(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_LAST_NAME_REGISTER)),
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_PHONENUMBER_REGISTER)),
                Enter.theValue(PHONE_NUMBER).into(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_PHONENUMBER_REGISTER))
        );

        actor.attemptsTo(
                Scroll.to(searchLocatorWithTypeAndName(TYPE_INPUT, ATRIBUTE_NAME, NAME_LBL_FIRST_NAME_REGISTER)).andAlignToTop()

        );

        actor.attemptsTo(
                Click.on(searchLocatorWithTypeAndName(TYPE_SELECT, ATRIBUTE_NAME,NAME_LIST_COUNTRY_REGISTER)),
                SelectFromOptions.byValue(COUNTRY_ADDRES).from(searchLocatorWithTypeAndName(TYPE_SELECT, ATRIBUTE_NAME,NAME_LIST_COUNTRY_REGISTER)),
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_CITY_REGISTER)),
                Enter.theValue(CITY_ADDRESS).into(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_CITY_REGISTER)),
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_ADDRESS_REGISTER)),
                Enter.theValue(ADDRES).into(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_ADDRESS_REGISTER)),
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_STATE_REGISTER)),
                Enter.theValue(STATE).into(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_STATE_REGISTER)),
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_POSTALCODE_REGISTER)),
                Enter.theValue(POSTAL_CODE).into(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_LBL_POSTALCODE_REGISTER))
        );

        actor.attemptsTo(
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_CHECKBOX_PROMOTION_REGISTER)),
                Click.on(searchLocatorWithTypeAndName(TYPE_INPUT,ATRIBUTE_NAME,NAME_CHECKBOX_POLITICAS_REGISTER)),
                WaitUntil.the(btn_register_page, isEnabled()).forNoMoreThan(TEN_SECONDS).seconds(),
                Click.on(btn_register_page)
        );

    }
}

package userInterfaces.commons;

import net.serenitybdd.screenplay.targets.Target;

public class uiCommons {

    public static Target searchUserWhitPosition(String posicion){
        String searchUser = String.format("(//span[@data-ng-show='userCookie.response'])[%d]", posicion);
        return Target.the("Texto del usuario registrado" + posicion).locatedBy(searchUser);
    }

    public static Target searchLocatorWithTypeAndName(String type, String atributo, String text){
        String searchLocator = String.format("//%s[@%s='%s']", type, atributo, text);
        return Target.the("Elemento "+type+" con name "+atributo+" y texto "+text).locatedBy(searchLocator);
    }

}

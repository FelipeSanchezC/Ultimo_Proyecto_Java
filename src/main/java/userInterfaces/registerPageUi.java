package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class registerPageUi {

    public final static Target tittle_create_account = Target.the("Titulo principal de crear cuenta").locatedBy("//h3[@translate='CREATE_ACCOUNT']");
    public final static Target label_username_register = Target.the("Label para el ingreso de un nuevo username").locatedBy("//input[@name='usernameRegisterPage']");
    public final static Target label_email_register = Target.the("Label para el ingreso de un nuevo Email").locatedBy("//input[@name='emailRegisterPage']");
    public final static Target label_password_register = Target.the("Label para el ingreso del password").locatedBy("//input[@name='passwordRegisterPage']");
    public final static Target txt_Address_register = Target.the("Texto del titulo direccion de la pagina").locatedBy("//h3[@translate='ADDRESS']");
    public final static Target btn_register_page = Target.the("Boton para completar el registro de un usuario").located(By.id("register_btn"));
}

package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.scheduling.SerenityFluentWait;
import org.openqa.selenium.By;

import java.util.concurrent.TransferQueue;


@DefaultUrl("https://www.advantageonlineshopping.com/#/")

public class homePageUi extends PageObject {
    public final static Target btn_login_homePage = Target.the("Boton del home Page para el ingreso al login").located(By.id("menuUser"));
    public final static Target label_userName_homePage = Target.the("Label para el ingreso del userName").locatedBy("//input[@name='username']");
    public final static Target label_password_homePage = Target.the("Label para el ingreso del password").locatedBy("//input[@name='password']");
    public final static Target checkBox_rememberme_homePage = Target.the("Check Box opcion de recordarme").locatedBy("//input[@name='remember_me']");
    public final static Target btn_signIn_homePage = Target.the("Boton para realizar el sigmUp").located(By.id("sign_in_btn"));
    public final static Target txt_user_logged = Target.the("locator del texto del usuario ingresado").locatedBy("//*[@id='menuUserLink']/span");
    public final static Target txt_msj_control_user_incorrect = Target.the("Locator del texto que se presenta cuando se ingresa username y password incorrecto").located(By.id("signInResultMessage"));
    public final static Target btn_create_account = Target.the("Locator del boton para crear una nueva cuenta").locatedBy("//a[@translate='CREATE_NEW_ACCOUNT']");
    public final static Target product_laptops = Target.the("Producto del home con laptops").located(By.id("laptopsTxt"));
}

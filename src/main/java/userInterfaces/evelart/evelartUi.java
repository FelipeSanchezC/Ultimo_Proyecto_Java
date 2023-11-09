package userInterfaces.evelart;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://tasks.evalartapp.com/automatization/")

public class evelartUi extends PageObject {

    public final static Target lbd_usuario = Target.the("label ingresar usuario").locatedBy("//input[@typer='text']");
    public final static Target lbl_password = Target.the("label para ingresar password").locatedBy("//input[@type='password']");
    public final static Target btn_enviar = Target.the("boton enviar").locatedBy("//button[@type='submit']");


    public final static Target txt_coordenadas = Target.the("Localizardor para coordenadas").locatedBy("//p[@class='text-center text-xl font-bold']");
    public final static Target txt_modal = Target.the("Texto del modal").locatedBy("//h5[@class='modal-title']");
    public final static Target lbl_suma_modal = Target.the("Label para el ingreso al modal").locatedBy("//input[@type='number']");
    public final static Target btn_enviar_modal = Target.the("Boton para ingreso de suma modal").locatedBy("//button[@type='submit']");

    public final static Target txt_pantalla_final = Target.the("Texto de felicidades").locatedBy("//h1[@class='text-center text-3xl p-5']");
    public final static Target txt_codigo_final = Target.the("Codigo que se debe almacenar").locatedBy("//p[@class='text-white text-2xl text-center break-all']");


    public static Target select_botton(String idBotton){
        String buttonLocator = String.format("//button[@value='%s']", idBotton);
        return Target.the("Boton con numero " + idBotton).locatedBy(buttonLocator);
    }


}

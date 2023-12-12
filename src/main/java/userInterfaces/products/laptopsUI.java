package userInterfaces.products;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class laptopsUI {

    public final static Target HP_ENERGY_STAR = Target.the("HP Chromebook 14 G1(ENERGY STAR)").located(By.id("9"));
    public final static Target GP_GI_ES = Target.the("HP Chromebook 14 G1(ES)").located(By.id("10"));
    public final static Target btn_addToCart = Target.the("Boton para agregar productos al carrito de compras").locatedBy("//button[@name='save_to_cart']");
    public final static Target link_laptops = Target.the("Link para redireccionar a la pagina de laptops").locatedBy("//a[@class='ng-binding']");
}

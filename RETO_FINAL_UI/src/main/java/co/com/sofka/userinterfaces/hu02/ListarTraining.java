package co.com.sofka.userinterfaces.hu02;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class ListarTraining extends PageObject {

    public static final Target OPCION_MENU = Target
            .the("opcion menu listarTraining")
            .located(xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));//Se actualizara

    public static final Target TARGET_TRAINING = Target
            .the("tarjeta Training Activo")
            .located(xpath("//*[@id=\"center_column\"]/div[1]/div/div/span"));//Se actualizara


}

package co.com.sofka.userinterfaces.hu06;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class HU06CrudHomePage extends PageObject {
    public static final Target SUBMIT_CREATE= Target
            .the("BotónParaIrAcrearPrograma")
            .located(xpath("//*[text()=\"CREAR PROGRAMA\"]"));

//#sideBar_menu\ flex_column_center > ul > a:nth-child(6)
    public static final Target SUBMIT_LIST= Target
            .the("BotónParalistarProgramas")
            .located(xpath("//*[text()=\"PROGRAMAS ACTIVOS\"]"));

}

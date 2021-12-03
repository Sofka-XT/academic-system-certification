package co.com.sofka.userinterfaces.hu07;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;


public class HomePage extends PageObject {
    public static final Target CREAR_TRAINING = Target.the("create_training")
            .located(xpath("//*[@id=\"sideBar_menu flex_column_center\"]/ul/a[4]"));

    public static final Target TRAININGS_ACTIVOS = Target.the("training_active")
            .located(xpath("//*[@id=\"sideBar_menu flex_column_center\"]/ul/a[2]\n"));

}

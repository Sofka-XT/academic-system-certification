package co.com.sofka.userinterfaces.hu02;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ListarTrainingPage extends PageObject {

    public static final Target OPCION_MENU_APRENDIZ = Target
            .the("opcion menu listarTraining")
            .located(xpath("//*[@id=\"dashboard\"]/aside/nav/ul/a[1]"));

    public static final Target ASSERTION_TRAINING_ACTIVO = Target
            .the("opcion menu listarTraining")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/h1"));

    public static final Target TARGET_TRAINING_COACH = Target
            .the("tarjeta Training Activo coach")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div/div[1]/div/a/h6"));

    public static final Target TARGET_TRAINING_APRENDIZ = Target
            .the("tarjeta Training Activo aprendiz")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div/div[1]/div/a/h6"));

    public static final Target OPCION_MENU_COACH = Target
            .the("opcion menu listarTraining para coach")
            .located(xpath("//*[@id=\"sideBar_menu flex_column_center\"]/ul/a[6]"));


}

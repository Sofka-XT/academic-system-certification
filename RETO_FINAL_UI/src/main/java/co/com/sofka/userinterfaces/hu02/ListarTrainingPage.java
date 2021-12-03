package co.com.sofka.userinterfaces.hu02;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ListarTrainingPage extends PageObject {

    protected static final String ID_TRAINING = "61aa23ac4d2f294fb4dd3fe2";

    public static final Target OPCION_MENU_APRENDIZ = Target
            .the("opcion menu listarTraining")
            .located(xpath("//*[contains(@activeclassname,'active') and contains(@href, 'activetraining')]"));

    public static final Target ASSERTION_TRAINING_ACTIVO = Target
            .the("opcion menu listarTraining")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/h1"));

    public static final Target TARGET_TRAINING = Target
            .the("tarjeta Training Activo")
            .located(xpath("//*[contains(@href,'"+ID_TRAINING+"')]"));

    public static final Target OPCION_MENU_COACH = Target
            .the("opcion menu listarTraining para coach")
            .located(xpath("//*[contains(@href,'activetraining') and (contains(@activeclassname,'active'))]"));

    public static final Target OPCION_MENU_COACH_PRINCIPAL = Target
            .the("opcion menu listarTraining para coach presentacion principal")
            .located(xpath("//*[contains(@href,'activetraining') and not (contains(@activeclassname,'active'))]"));

}

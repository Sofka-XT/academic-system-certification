package co.com.sofka.userinterfaces.hu02;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ListarTrainingPage extends PageObject {

    public static final Target OPCION_MENU_APRENDIZ = Target
            .the("opcion menu listarTraining")
            .located(xpath("//*[contains(@activeclassname,'active') and contains(@href, 'activetraining')]"));

    public static final Target ASSERTION_TRAINING_ACTIVO = Target
            .the("opcion menu listarTraining")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/h1"));

    public static final Target TARGET_TRAINING = Target
            .the("tarjeta Training Activo")
            .located(xpath("//*[contains(@href,'61a1346bfb95976275096464')]"));

    public static final Target OPCION_MENU_COACH = Target
            .the("opcion menu listarTraining para coach")
            .located(xpath("//*[contains(@href,'activetrainingcoach') and contains(@activeclassname,'active')]"));

    public static final Target OPCION_MENU_COACH_PRINCIPAL = Target
            .the("opcion menu listarTraining para coach presentacion principal")
            .located(xpath("//*[contains(@href,'activetrainingcoach') and not (contains(@activeclassname,'active'))]"));

}

package co.com.sofka.userinterfaces.hu04;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

import static org.openqa.selenium.By.xpath;

public class ListarTrainingPerfilarPage extends PageObject {

    public static final Target ASSERTION_TRAINING_ACTIVO = Target
            .the("opcion menu listarTraining")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/h1"));

    public static final Target TARGET_TRAINING = Target
            .the("tarjeta Training Activo")
            .located(xpath("//*[contains(@href,'61a8d0076e218a50451e2f97')]"));


}

package co.com.sofka.userinterfaces.hu03;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class TrainingPage extends PageObject {

    public static final Target TRAINING_BUTTON_COACH = Target
            .the("trainingButton")
            .located(xpath("//a[contains(text(),'TRAINING ACTIVO')]"));

    public static final Target TRAINING_BUTTON_APPRENTICE = Target
            .the("trainingButton")
            .located(xpath("//*[@id=\"dashboard\"]/aside/nav/ul/a[1]"));

    public static final Target ACTIVE_TRAINING = Target
            .the("activeTraining")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div/div[1]/div/a"));

    public static final Target APPRENTICE_TABLE = Target
            .the("apprenticeTable")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/table"));
}

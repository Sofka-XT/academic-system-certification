package co.com.sofka.userinterfaces.hu03;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class TrainingPage extends PageObject {

    public static final Target TRAINING_BUTTON = Target
            .the("trainingButton")
            .located(xpath("//a[contains(text(),'TRAINING ACTIVO')]"));

    public static final Target QA_C2_TRAINING = Target
            .the("qaTraining")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div/div[3]/div/a"));
}

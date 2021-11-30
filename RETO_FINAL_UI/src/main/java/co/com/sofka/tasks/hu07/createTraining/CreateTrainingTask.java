package co.com.sofka.tasks.hu07.createTraining;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.awt.*;

import static co.com.sofka.userinterfaces.hu07.CreateTrainingPage.*;
import static co.com.sofka.userinterfaces.hu07.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateTrainingTask implements Task {

    private String dateStart;//Formato dd/mm/aaaa
    private String nameTraining;
    private String valueSelectCoach; // 1-Raul, 2-Pablo, 3-Oscar, 4-Luis, 5-Mario
    private String path = System.getProperty("user.dir")+"\\src\\test\\resources\\File\\aprendices.csv";
    private static String path_image = System.getProperty("user.dir")+"\\src\\test\\resources\\File\\img_1.PNG";
    //Robot robot = new Robot();


    public CreateTrainingTask setValueSelectCoach(String valueSelectCoach) {
        this.valueSelectCoach = valueSelectCoach;
        return this;
    }

    public CreateTrainingTask setDateStart(String dateStart) {
        this.dateStart = dateStart;
        return this;
    }

    public CreateTrainingTask setNameTraining(String nameTraining) {
        this.nameTraining = nameTraining;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CREAR_TRAINING, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(CREAR_TRAINING),
                Click.on(CREAR_TRAINING),

                WaitUntil.the(NAME_TRAINING, isVisible()).forNoMoreThan(10).seconds(),
                Clear.field(NAME_TRAINING),
                Enter.theValue(this.nameTraining).into(NAME_TRAINING),

                WaitUntil.the(SELECT_COACHES, isVisible()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byValue("1").from(SELECT_COACHES),

                WaitUntil.the(FECHA_INICIO, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(FECHA_INICIO),
                Clear.field(FECHA_INICIO),
                Enter.theValue("12/03/2022").into(FECHA_INICIO)
                //WaitUntil.the(UPLOAD_FILE, isVisible()).forNoMoreThan(10).seconds(),
                //Enter.theValue(path).into(UPLOAD_FILE)

        );

    }

    public static CreateTrainingTask createTrainingTask(){
        return new CreateTrainingTask();
    }

}

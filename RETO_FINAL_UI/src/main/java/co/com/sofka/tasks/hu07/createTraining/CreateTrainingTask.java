package co.com.sofka.tasks.hu07.createTraining;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import net.serenitybdd.screenplay.waits.WaitUntil;



import java.nio.file.Path;
import java.nio.file.Paths;

import static co.com.sofka.userinterfaces.hu07.CreateTrainingPage.*;
import static co.com.sofka.userinterfaces.hu07.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CreateTrainingTask implements Task {

    private String trainingsBefore;
    private String trainingAfter;
    public static String[] quantityBefore;
    public static String[] quantityAfter;

    private String dateStart;//Formato dd/mm/aaaa
    private String nameTraining;
    private String valueSelectCoach; // 1-Raul, 2-Pablo, 3-Oscar, 4-Luis, 5-Mario
    private String path = System.getProperty("user.dir")+"\\src\\test\\resources\\File\\aprendices.csv";




    Path p1 = Paths.get(path);


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


    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(TRAININGS_ACTIVOS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TRAININGS_ACTIVOS),
                Scroll.to(TRAININGS_ACTIVOS)
        );
        Thread.sleep(2000);


        trainingsBefore = TRAINING_LIST_ACTIVE.resolveFor(actor).getText().toString();
        quantityBefore = trainingsBefore.split("Coaches:");
        System.out.println((quantityBefore.length)-1);


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
                Enter.theValue("12/03/2022").into(FECHA_INICIO),
                new UploadToTarget(p1,UPLOAD_FILE),
                Click.on(LIST_PROGRAM),

                WaitUntil.the(SUBMIT_TRAINING, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SUBMIT_TRAINING),
                SendKeys.of("\ue054").into(CREAR_TRAINING),
                Click.on(SUBMIT_TRAINING),

                WaitUntil.the(TRAININGS_ACTIVOS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TRAININGS_ACTIVOS)


                );

        Thread.sleep(5000);

        trainingAfter = TRAINING_LIST_ACTIVE.resolveFor(actor).getText().toString();
        quantityAfter = trainingAfter.split("Coaches:");
        System.out.println((quantityAfter.length)-1);

    }


    public static CreateTrainingTask createTrainingTask(){
        return new CreateTrainingTask();
    }


}

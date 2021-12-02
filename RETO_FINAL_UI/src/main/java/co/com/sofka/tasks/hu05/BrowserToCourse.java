package co.com.sofka.tasks.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class BrowserToCourse implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }

    public static BrowserToCourse browserToCurso(){
        return new BrowserToCourse();
    }
}
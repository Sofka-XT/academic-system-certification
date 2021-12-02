package co.com.sofka.tasks.hu12;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

public class DeleteTraining implements Task {
    private String idTrainingDelete;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from("/delete/"+ idTrainingDelete)
        );
    }

    public DeleteTraining usingIdTrainingDelete(String idTrainingDelete) {
        this.idTrainingDelete = idTrainingDelete;
        return this;
    }

    public static DeleteTraining deleteTraining(){
        return new DeleteTraining();
    }
}

package co.com.sofka.tasks.hu06;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Put;

public class DeleteProgram implements Task {
    private String idProgramaDelete;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from("/program/delete/"+idProgramaDelete)
        );
    }

    public DeleteProgram usingIdProgramaDelete(String idProgramaDelete) {
        this.idProgramaDelete = idProgramaDelete;
        return this;
    }

    public static DeleteProgram deleteProgram(){
        return new DeleteProgram();
    }
}

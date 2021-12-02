package co.com.sofka.tasks.hu06;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

public class PutEdirProgram implements Task {
    private String updateInfo;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to("/program/update")
                        .with(
                                requestSpecification -> requestSpecification
                                        .body(updateInfo)
                                        .contentType(ContentType.JSON)
                        )
        );
    }

    public PutEdirProgram usingUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }

    public static PutEdirProgram putEdirSoloNombre(){
        return new PutEdirProgram();
    }
}

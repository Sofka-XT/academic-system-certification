package co.com.sofka.tasks.hu06;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class GetOneProgram implements Task {
    private String idPrograma;

    public GetOneProgram usingIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(idPrograma);

        actor.attemptsTo(
                Get.resource("/program/get/"+idPrograma)
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON))
        );
    }

    public static GetOneProgram getOneProgram(){
        return new GetOneProgram();
    }

}





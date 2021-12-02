package co.com.sofka.tasks.hu12;

import co.com.sofka.tasks.hu06.PostSendProgram;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PostTrainingForProfile implements Task {

    private String updateInfo;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to("/CreateTraining")
                        .with(
                                requestSpecification -> requestSpecification
                                        .body(updateInfo)
                                        .contentType(ContentType.JSON)
                        )
        );
    }

    public PostTrainingForProfile usingUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }

    public static PostTrainingForProfile postTrainingForProfile(){
        return new PostTrainingForProfile();
    }


}




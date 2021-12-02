package co.com.sofka.tasks.hu06;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PostSendProgram implements Task {
    private String updateInfo;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to("/program/create")
                        .with(
                                requestSpecification -> requestSpecification
                                        .body(updateInfo)
                                        .contentType(ContentType.JSON)
                        )
        );
    }

    public PostSendProgram usingUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }

    public static PostSendProgram postSendProgram(){
        return new PostSendProgram();
    }
}

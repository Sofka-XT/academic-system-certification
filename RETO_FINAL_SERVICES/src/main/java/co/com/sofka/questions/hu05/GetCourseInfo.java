package co.com.sofka.questions.hu05;

import net.serenitybdd.rest.SerenityRest;

public class GetCourseInfo {

    public String answeredBy(String answerPart) {
        return SerenityRest.lastResponse()
                .jsonPath().getString(answerPart);
    }
}

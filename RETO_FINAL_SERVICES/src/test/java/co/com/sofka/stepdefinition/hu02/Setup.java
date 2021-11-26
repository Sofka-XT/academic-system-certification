package co.com.sofka.stepdefinition.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import org.apache.log4j.PropertyConfigurator;

import java.nio.charset.StandardCharsets;

import static co.com.sofka.util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;

public class Setup {
    protected static final String URL_BASE = "https://vast-everglades-55825.herokuapp.com";
    protected static final String RESOURCE_TRAINING = "/Training";
    protected static final String RESOURCE_TRAINING_ID = "/619faddb0d77e51895711689";
    protected static final String USER_DIR = System.getProperty("user.dir");
    protected static final String ACTOR_NAME = "Aprendiz";

    protected Actor actor;

    private void setUpActor() {
        actor = Actor.named(ACTOR_NAME);
    }

    private void setUpActorAndApi() {
        actor.can(CallAnApi.at(URL_BASE));
    }

    protected void setUp() {
        setUpLog4j2();
        setUpActor();
        setUpActorAndApi();
    }

    protected String fromLastResponseBy(Actor actor) {
        return new String(
                LastResponse.received().answeredBy(actor).asByteArray(),
                StandardCharsets.UTF_8
        );
    }

    protected void setUpLog4j2() {
        PropertyConfigurator.configure(USER_DIR + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }
}


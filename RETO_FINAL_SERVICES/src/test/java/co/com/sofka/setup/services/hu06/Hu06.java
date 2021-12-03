package co.com.sofka.setup.services.hu06;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class Hu06 {
    protected static final String BASE_URL = "https://vast-everglades-55825.herokuapp.com";
    protected static final String ACTOR_NAME = "AstroTeam";
    protected Actor actor;

    private void setUpActor()
    {
        actor=Actor.named(ACTOR_NAME);
    }

    private void setUpActorAndApi(){
        actor.can(CallAnApi.at(BASE_URL));
    }

    protected void setUp(){
        setUpActor();
        setUpActorAndApi();
    }
}

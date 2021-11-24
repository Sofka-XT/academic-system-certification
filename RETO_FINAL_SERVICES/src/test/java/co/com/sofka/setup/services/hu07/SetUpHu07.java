package co.com.sofka.setup.services.hu07;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


public class SetUpHu07 {
    protected static final String BASE_URL = "http://localhost:8080";
    protected static final String ACTOR_NAME = "Titanes";
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

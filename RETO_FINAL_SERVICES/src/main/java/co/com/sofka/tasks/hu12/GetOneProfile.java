package co.com.sofka.tasks.hu12;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;


public class GetOneProfile implements Task {
    private String idProfile;

    public GetOneProfile usingIdProfile(String idProfile) {
        this.idProfile = idProfile;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(idProfile);

        actor.attemptsTo(
                Get.resource("/apprentice/getById/"+ idProfile)
        );

        System.out.println();
    }

    public static GetOneProfile getOneProfile(){
        return new GetOneProfile();
    }

}
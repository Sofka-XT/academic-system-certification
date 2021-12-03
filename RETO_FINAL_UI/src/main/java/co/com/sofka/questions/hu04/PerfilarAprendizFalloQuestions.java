package co.com.sofka.questions.hu04;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.sofka.userinterfaces.hu04.PefilarRendimientoAprendizPage.*;

public class PerfilarAprendizFalloQuestions implements Question {
    private String mensaje;

    public PerfilarAprendizFalloQuestions wasFilledWithMessage (String mensaje) {
        this.mensaje = mensaje;
        return this;
    }

    public PerfilarAprendizFalloQuestions is() {
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return (
                ASSERTION_MENSAJE.resolveFor(actor).containsOnlyText(mensaje)
        );
    }

    public static PerfilarAprendizFalloQuestions perfilarAprendizFalloQuestions() {
        return new PerfilarAprendizFalloQuestions();
    }
}

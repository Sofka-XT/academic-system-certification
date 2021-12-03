package co.com.sofka.questions.hu04;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu04.PefilarRendimientoAprendizPage.*;

public class PerfilarAprendizEsquemaQuestions implements Question {
    private String nameEsquema;

    public PerfilarAprendizEsquemaQuestions wasFilledWithNameEsquema(String nameEsquema) {
        this.nameEsquema = nameEsquema;
        return this;
    }

    public PerfilarAprendizEsquemaQuestions is() {
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return (
                ESQUEMA_DATOS_APRENDIZ.resolveFor(actor).containsOnlyText(nameEsquema) &&
                        GRAFICA_RENDIMIENTO_APRENDIZ.resolveFor(actor).isVisible()
        );
    }

    public static PerfilarAprendizEsquemaQuestions perfilarAprendizEsquemaQuestions() {
        return new PerfilarAprendizEsquemaQuestions();
    }
}

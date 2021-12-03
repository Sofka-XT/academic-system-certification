package co.com.sofka.questions.hu04;

import co.com.sofka.questions.hu02.ListarTrainingActivoQuestions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu04.PefilarRendimientoAprendizPage.*;

public class PerfilarRendimientoAprendizQuestions implements Question {

    private String nameAprendiz;
    private String celularAprendiz;
    private String emailAprendiz;

    public PerfilarRendimientoAprendizQuestions wasFilledWithNameAprendiz(String nameAprendiz) {
        this.nameAprendiz = nameAprendiz;
        return this;
    }

    public PerfilarRendimientoAprendizQuestions wasFilledWithCelularAprendiz(String celularAprendiz) {
        this.celularAprendiz = celularAprendiz;
        return this;
    }

    public PerfilarRendimientoAprendizQuestions wasFilledWithEmailAprendiz(String emailAprendiz) {
        this.emailAprendiz = emailAprendiz;
        return this;
    }

    public PerfilarRendimientoAprendizQuestions is() {
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return (
                NOMBRE_APRENDIZ.resolveFor(actor).containsOnlyText(nameAprendiz) &&
                        CELULAR_APRENDIZ.resolveFor(actor).getText().contains(celularAprendiz) &&
                        EMAIL_APRENDIZ.resolveFor(actor).getText().contains(emailAprendiz)

        );
    }

    public static PerfilarRendimientoAprendizQuestions perfilarRendimientoAprendizQuestions() {
        return new PerfilarRendimientoAprendizQuestions();
    }

}

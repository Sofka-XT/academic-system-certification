package co.com.sofka.questions.hu01;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu01.LoginPage.LOGIN_BUTTON;

public class LoginValidation implements Question<Boolean> {

    private String loginButton;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (LOGIN_BUTTON.resolveFor(actor).containsOnlyText(loginButton));
    }
    public LoginValidation loginValidationMessage(String loginButton){
        this.loginButton=loginButton;
        return this;
    }
    public LoginValidation is(){
        return this;
    }
    public static LoginValidation loginValidation(){
        return new LoginValidation();
    }
}

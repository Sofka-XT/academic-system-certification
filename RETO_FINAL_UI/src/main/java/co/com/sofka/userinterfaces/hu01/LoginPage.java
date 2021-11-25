package co.com.sofka.userinterfaces.hu01;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class LoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target
            .the("loginButton")
            .located(id("button-login-google"));

    public static final Target ROLE_CONTAINER = Target
            .the("roleContainer")
            .located(id("role-container"));

    public static final Target LOGOUT = Target
            .the("logout")
            .located(xpath("//*[@id=\"dashboard\"]/aside/nav/ul/a[2]"));

    public static final Target SIGN_OUT = Target
            .the("signOut")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div/button"));

    public static final Target EMAIL_GOOGLE = Target
            .the("emailGoogle")
            .located(xpath("//*[@id=\"identifierId\"]"));

    public static final Target NEXT_EMAIL_BUTTON = Target
            .the("nextButton")
            .located(xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"));

    public static final Target PASSWORD = Target
            .the("password")
            .located(xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));

    public static final Target NEXT_PASSWORD_BUTTON = Target
            .the("nextPasswordButton")
            .located(xpath("//*[@id=\"passwordNext\"]/div/button/span"));

}

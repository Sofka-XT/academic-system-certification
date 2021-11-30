package co.com.sofka.userinterfaces.hu01;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class DashBoardPage extends PageObject {
    public static final Target ROLE_COACH = Target
            .the("roleCoach")
            .located(id("role-container"));

    public static final Target ROLE_APPRENDICE = Target
            .the("roleApprendice")
            .located(id("role-container"));

    public static final Target FAIL_LOGIN = Target
            .the("failLogin")
            .located(xpath("//*[@id=\"swal2-html-container\"]"));

    public static final Target LOGOUTBUTTON = Target
            .the("logout")
            .located(id("logout-link"));

    public static final Target SIGNOUT = Target
            .the("logout")
            .located(xpath("//button[@id='logout button']"));

}

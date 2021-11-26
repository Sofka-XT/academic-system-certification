package co.com.sofka.userinterfaces.hu01;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.xpath;

public class DashBoardPage extends PageObject {
    public static final Target ROLE_COACH = Target
            .the("roleCoach")
            .located(xpath("//*[@id=\"role-container\"]/h6"));

    public static final Target ROLE_APPRENDICE = Target
            .the("roleApprendice")
            .located(xpath("//*[@id=\"role-container\"]/h6"));

    public static final Target LOGOUTCOUCH = Target
            .the("logoutCouch")
            .located(xpath("//*[@id=\"sideBar_menu flex_column_center\"]/ul/a[8]"));

    public static final Target LOGOUTSTUDENT = Target
            .the("logoutStudent")
            .located(xpath("//*[@id=\"dashboard\"]/aside/nav/ul/a[2]"));

    public static final Target SIGNOUT = Target
            .the("logout")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div/button"));

}

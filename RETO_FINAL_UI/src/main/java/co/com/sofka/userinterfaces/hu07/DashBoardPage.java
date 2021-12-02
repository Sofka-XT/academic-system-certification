package co.com.sofka.userinterfaces.hu07;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class DashBoardPage extends PageObject {
    public static final Target ROLE = Target.the("role")
            .located(xpath("//*[@id=\"role-container\"]/h6"));
}

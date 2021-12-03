package co.com.sofka.userinterfaces.hu04;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ListarAprendicesPage extends PageObject {

    public static final Target PERFILAR_APRENDIZ= Target
            .the("Link Perfilar aprendiz")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/table/tbody/tr[1]/td[2]"));
}

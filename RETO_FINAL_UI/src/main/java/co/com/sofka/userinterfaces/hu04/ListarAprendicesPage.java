package co.com.sofka.userinterfaces.hu04;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ListarAprendicesPage extends PageObject {

    public static final Target PERFILAR_APRENDIZ= Target
            .the("Link Perfilar aprendiz")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/table/tbody/tr[1]/td[2]"));

    public static final Target LISTAR_NAME_APRENDIZ= Target
            .the("nombre del aprendiz")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/table/tbody/tr[1]/td[1]"));

    public static final Target LISTAR_MOBILE_APRENDIZ= Target
            .the("Celular del aprendiz")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/table/tbody/tr[1]/td[3]"));

    public static final Target LISTAR_EMAIL_APRENDIZ= Target
            .the("correo del aprendiz")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/table/tbody/tr[1]/td[2]"));
}

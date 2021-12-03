package co.com.sofka.userinterfaces.hu04;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class PefilarRendimientoAprendizPage extends PageObject {

    public static final Target PHOTO_PROFILE = Target
            .the("foto de perfil por defecto")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div[1]/div/div/div[1]/img"));

    public static final Target NOMBRE_APRENDIZ = Target
            .the("nombre del aprendiz")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div[1]/div/div/div[2]/div[1]/h1"));

    public static final Target CELULAR_APRENDIZ = Target
            .the("numero celular del aprendiz")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div[1]/div/div/div[2]/div[2]/ul/li[1]"));

    public static final Target EMAIL_APRENDIZ = Target
            .the("email del aprendiz")
            .located(xpath("//*[contains(span,'Correo')]"));


    public static final Target GRAFICA_RENDIMIENTO_APRENDIZ = Target
            .the("grafica del rendimiento del aprendiz")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div[3]/div/canvas"));

    public static final Target ESQUEMA_DATOS_APRENDIZ = Target
            .the("Esquema de datos de notas del aprendiz")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div[2]/div/h1"));

    public static final Target ASSERTION_MENSAJE = Target
            .the("Mensaje de alerta")
            .located(xpath("//*[@id=\"container_dashboard\"]/h2"));

    public static final Target ACORDEON_CURSO = Target
            .the("Curso")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/div[2]/div/div/div/div/div[1]/div[1]/h2"));


}

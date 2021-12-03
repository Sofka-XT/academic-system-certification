package co.com.sofka.userinterfaces.hu005;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;

public class CourseUpdate extends PageObject {

    public static final Target SEE_COURSE = Target
            .the("ver curso")
            .located(linkText("VER CURSO"));

    public static final Target ADD_CATEGORY_BUTTON = Target
            .the("Boton agregar categoria")
            .located(xpath("//button[contains(text(),'AGREGAR CATEGORIA')]  "));
    public static final Target JAVA_BOTTON = Target
            .the("Boton agregar categoria")
            .located(xpath("//button[contains(text(),'Java')]"));
    public static final Target EDITAR_BOTTON = Target
            .the("Botton Editar inicio")
            .located(xpath("//button[contains(text(),'Editar')]"));
    public static final Target EDITAR_BOTTON2 = Target
            .the("Botton Editar inicio")
            .located(xpath("//button[contains(text(),'EDITAR')]"));

    public static final Target CREATE_BUTTON = Target
            .the("Boton crear curso")
            .located(xpath("//button[contains(text(),'CREAR')]"));


    public static final Target ADD_MORE_RULES = Target
            .the(" Add botton more rules")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/button[1]"));

    public static final Target CATEGORY_NAME_1 = Target
            .the("Nombre category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]"));

    public static final Target CONDITION_RED = Target
            .the("Condición red category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/select[1]"));

    public static final Target QUALIFICATION_RED = Target
            .the("Qualification red category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/input[1]"));

    public static final Target FEEDBACK_RED = Target
            .the("FeedBack red category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/input[1]"));

    public static final Target URL_GRADE = Target
            .the("Url grade category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]"));

    public static final Target ADD_BOTTON_URL_GRADE = Target
            .the("add botton grade url category 1")
            .located(xpath("//button[contains(text(),'+')]"));

    public static final Target CONDITION_YELLOW = Target
            .the("Condición yellow category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/select[1]"));
    public static final Target QUALIFICATION_YELLOW = Target
            .the("Qualification yellow category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/input[1]"));
    public static final Target FEEDBACK_YELLOW = Target
            .the("FeedBack yellow category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[4]/input[1]"));

    public static final Target CONDITION_GREEN = Target
            .the("Condición green category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/select[1]"));

    public static final Target QUALIFICATION_GREEN = Target
            .the("Qualification green category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/input[1]"));

    public static final Target FEEDBACK_GREEN = Target
            .the("FeedBack green category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[4]/input[1]"));


    public static final Target HEADER_NAME_CATEGORY = Target
            .the("mensaje header categoria")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/h3[1]"));
}

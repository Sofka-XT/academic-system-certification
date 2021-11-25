package co.com.sofka.userinterfaces.hu005;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CourseInfo extends PageObject {

    public static final Target COURSE_NAME = Target
            .the("Nombre curso")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[1]/input[1]"));

    public static final Target ADD_CATEGORY_BUTTON = Target
            .the("Boton agregar")
            .located(xpath("//button[contains(text(),'AGREGAR CATEGORIA')]"));

    public static final Target CREATE_BUTTON = Target
            .the("Boton crear")
            .located(xpath("//button[contains(text(),'CREAR')]"));

   //--------------------------------------------Categoria 1--------------------------------------------------------------------

    public static final Target CATEGORY_NAME_1 = Target
            .the("Nombre categoria")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/input[1]"));

    public static final Target TYPE_RED = Target
            .the("Tipo")
            .located(xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/div[1]/select[1]"));

    public static final Target CONDITION_RED = Target
            .the("Condición")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/div[2]/select[1]"));

    public static final Target QUALIFICATION_RED = Target
            .the("Qualification")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[3]/div[2]/div[1]/input[1]"));

    public static final Target FEEDBACK_RED = Target
            .the("FeedBack name")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[3]/div[2]/div[1]/input[1]"));


    public static final Target TYPE_YELLOW = Target
            .the("Tipo")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[5]/div[2]/div[2]/input[1]"));

    public static final Target CONDITION_YELLOW = Target
            .the("Condición")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[4]/div[1]/div[2]/select[1]"));

    public static final Target QUALIFICATION_YELLOW = Target
            .the("Qualification")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[4]/div[2]/div[1]/input[1]"));

    public static final Target FEEDBACK_YELLOW = Target
            .the("FeedBack name")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[4]/div[2]/div[2]/input[1]"));

    public static final Target TYPE_GREEN = Target
            .the("Tipo")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[5]/div[1]/div[1]/select[1]"));

    public static final Target CONDITION_GREEN = Target
            .the("Condición")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[5]/div[1]/div[1]/select[1]"));

    public static final Target QUALIFICATION_GREEN = Target
            .the("Qualification")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[5]/div[2]/div[1]/input[1]"));

    public static final Target FEEDBACK_GREEN = Target
            .the("FeedBack name")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[5]/div[2]/div[2]/input[1]"));

    //--------------------------------------------Categoria 2--------------------------------------------------------------------

    public static final Target CATEGORY_NAME_2 = Target
            .the("Nombre categoria")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]"));

    public static final Target TYPE_RED_2 = Target
            .the("Tipo")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/div[1]/select[1]"));
    public static final Target CONDITION_RED_2 = Target
            .the("Condición")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/div[1]/select[1]"));
    public static final Target QUALIFICATION_RED_2 = Target
            .the("Qualification")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[3]/div[2]/div[1]/input[1]"));
    public static final Target FEEDBACK_RED_2 = Target
            .the("FeedBack name")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[3]/div[2]/div[2]/input[1]"));

    public static final Target TYPE_YELLOW_2 = Target
            .the("Tipo")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[4]/div[1]/div[1]/select[1]"));
    public static final Target CONDITION_YELLOW_2 = Target
            .the("Condición")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[4]/div[1]/div[2]/select[1]"));
    public static final Target QUALIFICATION_YELLOW_2 = Target
            .the("Qualification")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[4]/div[2]/div[1]/input[1]"));
    public static final Target FEEDBACK_YELLOW_2 = Target
            .the("FeedBack name")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[4]/div[2]/div[2]/input[1]"));
    public static final Target TYPE_GREEN_2 = Target
            .the("Tipo")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[5]/div[1]/div[1]/select[1]"));
    public static final Target CONDITION_GREEN_2 = Target
            .the("Condición")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[5]/div[1]/div[2]/select[1]"));
    public static final Target QUALIFICATION_GREEN_2 = Target
            .the("Qualification")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[5]/div[2]/div[1]/input[1]"));
    public static final Target FEEDBACK_GREEN_2 = Target
            .the("FeedBack name")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[5]/div[2]/div[2]/input[1]"));
}
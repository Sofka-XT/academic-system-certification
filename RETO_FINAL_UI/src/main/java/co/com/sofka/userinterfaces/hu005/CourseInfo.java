package co.com.sofka.userinterfaces.hu005;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;

public class CourseInfo extends PageObject {

    public static final Target COURSE_CREATE = Target
            .the("Crear curso")
            .located(linkText("CREAR CURSO"));

    public static final Target COURSE_NAME = Target
            .the("Nombre curso")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));

    public static final Target ADD_CATEGORY_BUTTON = Target
            .the("Boton agregar categoria")
            .located(xpath("//button[contains(text(),'AGREGAR CATEGORIA')]  "));
    public static final Target ADD_CATEGORY2_BUTTON = Target
            .the("Boton agregar categoria 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/button[1]"));

    public static final Target CREATE_BUTTON = Target
            .the("Boton crear curso")
            .located(xpath("//button[contains(text(),'CREAR')]"));


    public static final Target ADD_MORE_RULES = Target
            .the(" Add botton more rules")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/button[1]"));

    //--------------------------------------------Categoria 1--------------------------------------------------------------------

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

    public static final Target FILE_RULE_RED = Target
            .the("file rule red category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/input[1]"));

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

    public static final Target FILE_RULE_YELLOW = Target
            .the("file rule yellow category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/input[1]"));

    public static final Target CONDITION_GREEN = Target
            .the("Condición green category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/select[1]"));

    public static final Target QUALIFICATION_GREEN = Target
            .the("Qualification green category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/input[1]"));

    public static final Target FEEDBACK_GREEN = Target
            .the("FeedBack green category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[4]/input[1]"));

    public static final Target FILE_RULE_GREEN = Target
            .the("file rule green category 1")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[5]/input[1]"));
    //--------------------------------------------Categoria 2--------------------------------------------------------------------

    public static final Target ADD_MORE_RULES2 = Target
            .the("Add botton more rule category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/button[1]"));
    public static final Target CATEGORY_NAME2 = Target
            .the("Nombre category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]"));
    public static final Target CONDITION_RED2 = Target
            .the("Condición red category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/select[1]"));
    public static final Target QUALIFICATION_RED2 = Target
            .the("Qualification red category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/input[1]"));
    public static final Target FEEDBACK_RED2 = Target
            .the("FeedBack red category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[4]/input[1]"));
    public static final Target FILE_RULE_RED2 = Target
            .the("file rule red category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[5]/input[1]"));
    public static final Target URL_GRADE2 = Target
            .the("Url grade category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/input[1]"));

    public static final Target ADD_BOTTON_URL_GRADE2 = Target
            .the("add botton grade url")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/button[1]"));
    public static final Target CONDITION_YELLOW2 = Target
            .the("Condición yellow category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/select[1]"));

    public static final Target QUALIFICATION_YELLOW2 = Target
            .the("Qualification yellow category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/input[1]"));
    public static final Target FEEDBACK_YELLOW2 = Target
            .the("FeedBack name yellow category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[4]/input[1]"));
    public static final Target FILE_RULE_YELLOW2 = Target
            .the("file rule yellow category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[5]/input[1]"));
    public static final Target CONDITION_GREEN2 = Target
            .the("Condición green category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[2]/select[1]"));
    public static final Target QUALIFICATION_GREEN2 = Target
            .the("Qualification green category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[3]/input[1]"));
    public static final Target FEEDBACK_GREEN2 = Target
            .the("FeedBack name green category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[4]/input[1]"));
    public static final Target FILE_RULES_GREEN2 = Target
            .the("file rules green category 2")
            .located(xpath("//body/div[@id='root']/div[@id='dashboard']/div[@id='container_dashboard']/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[5]/input[1]"));
//-----------------------------------------------------------localizadores para navergar por el curso------------------------------------------------------------------------

    public static final Target OK_BOTTON = Target
            .the("Qualification green category 2")
            .located(xpath("//button[contains(text(),'OK')]"));
    public static final Target HEADER_NAME_CURSO = Target
            .the("mensaje header")
            .located(xpath("//header//h2"));

}


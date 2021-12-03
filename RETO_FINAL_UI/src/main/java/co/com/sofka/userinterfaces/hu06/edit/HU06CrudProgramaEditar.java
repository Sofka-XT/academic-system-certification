package co.com.sofka.userinterfaces.hu06.edit;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class HU06CrudProgramaEditar extends PageObject {


    public static final Target BTN_EDITAR_PROGRAMA = Target
            .the("btnEditarPrograma")
            .located(xpath("//div[@class=\"card-title\"]//*[text()=\"Program Test\"]//following-sibling::div/a"));

    public static final Target EDIT_NAME_PROGRAM = Target
            .the("editarNombrePrograma")
            .located(xpath("//*[@name=\"programName\"]"));

    public static final Target NUMERO_DE_DIAS = Target
            .the("numeroDias")
            .located(xpath("//*[@class=\"totaldays-name-num\"]"));

    public static final Target DESPLEGAR_LISTA_CURSOS = Target
            .the("desplegarListaCursos")
            .located(xpath("//*[@class=\"create-program-select\"]"));

    public static final Target SELECTION_A_CURSE = Target
            .the("seleccionarUnCurso")
            .located(xpath("//*[@class=\"create-program-select\"]/option[3]"));

    public static final Target SELECTION_A_CURSE2 = Target
            .the("seleccionarUnCurso")
            .located(xpath("//*[@class=\"create-program-select\"]/option[4]"));

    public static final Target AGREGAR_A_CURSO = Target
            .the("agregarCurso")
            .located(xpath("//*[@class=\"trainings__btn-submit add-course-program\"]"));

    public static final Target DURACION_CATEGORIA1_CUrSO = Target
            .the("duracionCategoria1Curso")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/form/div[3]/div/div/div[3]/div/div[2]/ul/div/div/input"));

    public static final Target DURACION_CATEGORIA1_CUrSO2 = Target
            .the("duracionCategoria1Curso2")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/form/div/div[2]/div/div/div[2]/div/div[2]/ul/div[2]/div/input"));

    public static final Target SUBMIT = Target
            .the("submit")
            .located(xpath("//*[text()=\"Enviar\"]"));
    //*[text()="Enviar"]
         //   .located(xpath("//button[@type='submit']"));


    public static final Target ELIMINAR_UN_CURSO = Target
            .the("eliminarUnCurso")
            .located(xpath("//div[@id='container_dashboard']/div/form/div/div[2]/div/div/div[2]/div/div/button"));


    //////////

    public static final Target ELIMINAR_UN_PROGRAMA= Target
            .the("eliminarUnPrograma")
            .located(xpath("//div[@class=\"card-title\"]//*[text()=\"Program Test\"]//following-sibling::div/i"));

    public static final Target ELIMINAR_UN_PROGRAMA2= Target
            .the("eliminarUnPrograma2")
            .located(xpath("//div[@class=\"card-title\"]//*[text()=\"Program Testt\"]//following-sibling::div/i"));
    //editar xpath para volverlo variables con el nombre

    public static final Target CONFIRMAR_CAMBIOS= Target
            .the("ConfirmarCambios")
            .located(xpath("//*[text()=\"Si, Editalo!\"]"));


    public static final Target CONFIRMAR_CAMBIOS2= Target
            .the("ConfirmarCambios2")
            .located(xpath("//*[text()=\"Si, Borrar!\"]"));


    public static final Target EXISTE_PROGRAMA= Target
            .the("ExisteElPrpgrama")
            .located(xpath("//*[text()=\"Program Test\"]"));

    public static final Target NUEVO_NOMBRE_PROGRAMA= Target
            .the("ExisteElPrpgrama")
            .located(xpath("//*[ @class=\"training__description--title\" and text()=\"Program Test\"]"));

    public static final Target NO_NAME_CHANGE= Target
            .the("noNameChange")
            .located(xpath("//*[@value=\"Program Test\"]"));



}

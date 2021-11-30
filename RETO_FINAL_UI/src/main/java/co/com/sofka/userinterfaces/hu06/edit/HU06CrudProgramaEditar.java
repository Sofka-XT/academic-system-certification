package co.com.sofka.userinterfaces.hu06.edit;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class HU06CrudProgramaEditar extends PageObject {


    public static final Target BTN_EDITAR_PROGRAMA = Target
            .the("btnEditarPrograma")
            .located(xpath("//div[@class=\"card-body\"]//*[text()=\"Program Test\"]//following-sibling::div/a"));

    public static final Target EDIT_NAME_PROGRAM = Target
            .the("editarNombrePrograma")
            .located(xpath("//*[@name=\"programName\"]"));

    public static final Target NUMERO_DE_DIAS = Target
            .the("numeroDias")
            .located(xpath("//*[@class=\"totaldays-name-num\"]"));

    public static final Target DESPLEGAR_LISTA_CURSOS = Target
            .the("desplegarListaCursos")
            .located(xpath("//*[@class=\"select-container\"]/div"));

    public static final Target SELECTION_A_CURSE = Target
            .the("seleccionarUnCurso")
            .located(xpath("//*[@class=\"select-container\"]/div/select/option[3]"));

    public static final Target SELECTION_A_CURSE2 = Target
            .the("seleccionarUnCurso")
            .located(xpath("//*[@class=\"select-container\"]/div/select/option[4]"));

    public static final Target AGREGAR_A_CURSO = Target
            .the("agregarCurso")
            .located(xpath("//*[@class=\"button-edit\" and  @type=\"button\"]"));

    public static final Target DURACION_CATEGORIA1_CUrSO = Target
            .the("duracionCategoria1Curso")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/form/div/div[2]/div/div/div[2]/div/div[2]/ul/div[1]/div/input"));

    public static final Target DURACION_CATEGORIA1_CUrSO2 = Target
            .the("duracionCategoria1Curso2")
            .located(xpath("//*[@id=\"container_dashboard\"]/div/form/div/div[2]/div/div/div[2]/div/div[2]/ul/div[2]/div/input"));

    public static final Target SUBMIT = Target
            .the("submit")
            .located(xpath("//button[@type='submit']"));


    public static final Target ELIMINAR_UN_CURSO = Target
            .the("eliminarUnCurso")
            .located(xpath("//div[@id='container_dashboard']/div/form/div/div[2]/div/div/div[2]/div/div/button"));


    //////////

    public static final Target ELIMINAR_UN_PROGRAMA= Target
            .the("eliminarUnPrograma")
            .located(xpath("//div[@class=\"card-body\"]//*[text()=\"Program Test\"]//following-sibling::div/button"));

    public static final Target ELIMINAR_UN_PROGRAMA2= Target
            .the("eliminarUnPrograma2")
            .located(xpath("//div[@class=\"card-body\"]//*[text()=\"Program Testt\"]//following-sibling::div/button"));

    //editar xpath para volverlo variables con el nombre

    public static final Target CONFIRMAR_CAMBIOS= Target
            .the("ConfirmarCambios")
            .located(xpath("//*[text()=\"Si, Editalo!\"]"));


    public static final Target CONFIRMAR_CAMBIOS2= Target
            .the("ConfirmarCambios2")
            .located(xpath("//*[text()=\"Sí, borrar!\"]"));


    public static final Target EXISTE_PROGRAMA= Target
            .the("ExisteElPrpgrama")
            .located(xpath("//*[text()=\"Program Test\"]"));

    public static final Target NUEVO_NOMBRE_PROGRAMA= Target
            .the("ExisteElPrpgrama")
            .located(xpath("//*[text()=\"Program Testt\"]"));

    public static final Target NO_NAME_CHANGE= Target
            .the("noNameChange")
            .located(xpath("//*[@value=\"Program Test\"]"));



}

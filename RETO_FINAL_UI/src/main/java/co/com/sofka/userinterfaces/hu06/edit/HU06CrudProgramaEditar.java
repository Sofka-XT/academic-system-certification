package co.com.sofka.userinterfaces.hu06.edit;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class HU06CrudProgramaEditar extends PageObject {

    public static final Target BTN_EDITAR_PROGRAMA = Target
            .the("btnEditarPrograma")
            .located(xpath("  "));

    public static final Target EDIT_NAME_PROGRAM = Target
            .the("editarNombrePrograma")
            .located(id("  "));

    public static final Target DESPLEGAR_LISTA_CURSOS = Target
            .the("desplegarListaCursos")
            .located(xpath("  "));

    public static final Target SELECTION_A_CURSE = Target
            .the("seleccionarUnCurso")
            .located(xpath("  "));

    public static final Target AGREGAR_A_CURSO = Target
            .the("agregarCurso")
            .located(xpath("  "));

    public static final Target DURACION_CATEGORIA1_CUrSO = Target
            .the("duracionCategoria1Curso")
            .located(xpath("  "));

    public static final Target DURACION_CATEGORIA2_CUrSO = Target
            .the("duracionCategoria2Curso")
            .located(xpath("  "));

    public static final Target SUBMIT = Target
            .the("submit")
            .located(xpath("  "));

    public static final Target ELIMINAR_UN_CURSO = Target
            .the("seleccionarUnCurso")
            .located(xpath("  "));




}

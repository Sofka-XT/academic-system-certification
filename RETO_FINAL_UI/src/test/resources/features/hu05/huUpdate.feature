Feature: Yo como usuario
  quiero crear, listar, actualizar y eliminar un curso
  para manipular y/o persistir la información de los cursos.

  Scenario Outline: Editar exitosamente nuevo curso
    Given doy click sobre la opcion Ver curso
    When lleno la regla con todos los campos y doy clic sobre el boton editar

      |nameCategoryUno|<nameCategoryUno>|
      |conditionRed|<conditionRed>|
      |qualificationRed|<qualificationRed>|
      |feedBackRed|<feedBackRed>|
      |urlGradeCategoryUno|<urlGradeCategoryUno>|
      |conditionYellow|<conditionYellow>|
      |qualificationYellow|<qualificationYellow>|
      |feedBackYellow|<feedBackYellow>|
      |conditionGreen|<conditionGreen>|
      |qualificationGreen|<qualificationGreen>|
      |feedBackGreen|<feedBackGreen>|
    Then el sistema debe mostrara el siguiente mensaje: Registro exitoso.
    Examples:
      |nameCategoryUno|conditionRed|qualificationRed|feedBackRed|urlGradeCategoryUno |conditionYellow|qualificationYellow|feedBackYellow |conditionGreen|qualificationGreen|feedBackGreen|
      |PageFactory|<|40 |Perdio| https://www.aws.com.co|>|75|feedback|=|99 |Exelente|

  Scenario: Eliminar exitosamente un curso
    Given doy click sobre la opcion ver cursos
    When navego por el sitio hasta encontrar la opc eliminar curso
    Then el sistema debe mostrar un mesaje de eliminado correctamente

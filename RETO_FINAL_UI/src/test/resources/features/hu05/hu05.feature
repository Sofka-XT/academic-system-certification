Feature: Yo como usuario
  quiero crear, listar, actualizar y eliminar un curso
  para manipular y/o persistir la información de los cursos.

  Scenario Outline: Creación exitosa nuevo curso
    Given doy click sobre la opcion Crear curso
    When llene el formulario con todos los campos y doy clic sobre el boton crear



      |cursoName|<cursoName>|
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
      |nameCategoryDos|<nameCategoryDos>|
      |conditionRedDos|<conditionRedDos>|
      |qualificationRedDos|<qualificationRedDos>|
      |feedBackRedDos|<feedBackRedDos>|
      |urlGradeCategoryDos|<urlGradeCategoryDos>|
      |conditionYellowDos|<conditionYellowDos>|
      |qualificationYellowDos|<qualificationYellowDos>|
      |feedBackYellowDos|<feedBackYellowDos>|
      |conditionGreenDos|<conditionGreenDos>|
      |qualificationGreenDos|<qualificationGreenDos>|
      |feedBackGreenDos|<feedBackGreenDos>|
    Then el sistema debe mostrar el siguiente mensaje: Registro exitoso.
    Examples:
      |cursoName|nameCategoryUno|conditionRed|qualificationRed|feedBackRed                 |urlGradeCategoryUno       |conditionYellow|qualificationYellow|feedBackYellow                           |conditionGreen|qualificationGreen|feedBackGreen                          | nameCategoryDos|conditionRedDos|qualificationRedDos    |feedBackRedDos |urlGradeCategoryDos|conditionYellowDos|qualificationYellowDos|feedBackYellowDos |conditionGreenDos|qualificationGreenDos|feedBackGreenDos |
      |Java|Poo|<                            |50          |no alcanso el nivel esperado| https://www.google.com.co|<              |100                |se alcanzo lo esperado pero falta mejorar|=             |100               |Felicidades tu aprendizaje fue completo|Base de datos   |<          |50              |no alcanzo el nivel esperado| https://www.google.com.co|<              |100                |se alcanzo lo esperado pero falta mejorar|=             |100              |Felicidades tu aprendizaje fue completo|


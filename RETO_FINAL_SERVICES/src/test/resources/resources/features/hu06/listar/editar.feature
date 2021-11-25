
Feature: Yo como coach
  quiero editar  programas
  para poder definir modificar informacion necesaria para el programa

  Background:
    Given El coah se encuentre el la pagina de edicion de proegramas
  Scenario: Edicion de nombre exitoso
    When El coach edite el nombre de un programa con un numero de caracteres adecuado
    Then entonces el los cambios definidos se deben guardar correctamente y  retornar un status OK

  Scenario: Edicion de nombre fallido
    When El coach edite el nombre de un programa con un numero de caracteres fuera del rango (menos de 3 y mas de 100)
    Then entonces el los cambios definidos no se deben guardar  y  retornar un status FAIL

  Scenario: Agregar curso exitoso
    When El coach proceda a agregar un curso en un programa con los parametros adecuados
    Then entonces el curso se debe guardar correctamente en el programa indicado

  Scenario: Agregar un curso fallido
    When El coach proceda a agregar un curso en un programa con parametros erroneos
    Then entonces el curso no se debe guardar en el programa  y debe retornar un status FAIL

  Scenario: Editar Programa sin cursos
    When El coach proceda a eliminar todos los cursos de un programa
    Then entonces se debe retornar un status FAIL






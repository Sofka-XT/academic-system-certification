
Feature: Yo como coach
  quiero crear programas
  para asignarlos a los training

  Background:
    Given El coach a definido que quiere crear un programa

  Scenario: Creacion exitosa
    When El coach envía la solicitud con el nombre “Prueba programa” y un curso asociado “Fullstack” con una categoría asociada
    Then El deberá obtener como respuesta que fue creado

  Scenario:  Creacion de un programa fallido por nombre
    When El coach proceda a crear un curso sin nombre
    Then el no debera permitir y saldra un status Error

  Scenario:  Creacion de un programa fallido por no suministrar cursos
    When El coach proceda a crear un programa sin cursos asociados
    Then el no debera permitir y saldra un status Error

  Scenario:  Creacion de un programa fallido por 0 dias en la categoria
    When El coach proceda a crear un programa con una categoria con cero dias
    Then el no debera permitir y saldra un status Error

  Scenario:  Creacion de un programa fallido por dias negativos en la categoria
    When El coach proceda a crear un programa con dias negativos
    Then el no debera permitir y saldra un status Error


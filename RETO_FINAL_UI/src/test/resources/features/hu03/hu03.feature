Feature: HU03 - Listar aprendices de un training activo
  Yo como usuario
  Quiero visualizar al listado de aprendices dentro de un Training activo
  Para el seguimiento y control de su rendimiento

  Scenario: uno - Listar estudiantes rol coach
    Given el coach ingresa a la pagina de training activos
    When escoge uno al azar
    Then debera visualizar la lista de estudiantes

  Scenario: dos - Listar estudiantes rol apprentice
    Given el apprentice ingresa a la pagina de training activos
    When selecciona un training activo
    Then debera visualizar la lista de estudiantes
Feature: Listar los training activos

  Yo como usuario autenticado quiero ver los training activos que están
  dentro de la fecha del programa
  para visualizar los training vigente.

  Scenario: consultar un training activo
    Given que el aprendiz desea consultar un training activo en la lista de training activos
    When el aprendiz consulta el training training activo
    Then el sistema deberia mostrar el training activo esperado

  Scenario: consultar todos los training activos
    Given que el coach desea consultar la lista de training activos
    When el coach consulta los training activos
    Then el sistema deberia mostrar todos los training activos

  Scenario: verificar que el programa que esta relacionado con el training activo exista
    Given que el usuario desea consultar el programa asociado al training activo
    When el usuario consulta con el id del programa asociado al training activo
    Then el sistema deberia mostrar el programa asociado al training activo
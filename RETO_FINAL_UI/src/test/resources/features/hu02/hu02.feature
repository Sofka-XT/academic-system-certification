Feature: Listar los training activos

  Yo como usuario autenticado quiero ver los training activos que están
  dentro de la fecha del programa
  para visualizar los training vigente.

  Scenario: Visualizar los training activos con el rol de aprendiz autenticado
    Given que el aprendiz se encuentra logueado y en la pagina principal
    When el aprendiz desea visualizar los training activos
    Then el sistema deberia permitir la visualizacion de los training activos al aprendiz

  Scenario: Visualizar los training activos con el rol de coach autenticado
    Given que el coach se encuentra logueado y en la pagina principal
    When el coach desea visualizar los training activos
    Then el sistema deberia permitir la visualizacion de los training activos al coach

  Scenario: Visualizar un training especifico dentro de la lista
    Given que el couch se encuentra en la pagina de listar training
    When el usuario quiere visualizar en la lista de training activos el training activo "<training>"
    Then el sistema deberia mostrar el training activo consultado en las listas de training activos

  Scenario: Visualizar los training activos con ruta alternativa en el rol de coach autenticado
    Given que el coach se encuentra autenticado y en la pagina principal
    When el coach desea visualizar los training activos ingresando desde una ruta alternativa
    Then el sistema deberia permitir la visualizacion de los training activos al coach como en la ruta principal


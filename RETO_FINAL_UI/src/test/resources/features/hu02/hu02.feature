Feature: Listar los training activos

  Yo como usuario autenticado quiero ver los training activos que están
  dentro de la fecha del programa
  para visualizar los training vigente.

  #Background:
    #When el usuario quiere visualizar los training activos

  @ignore
  Scenario: Visualizar los training activos estando autenticado
    Given que el usuario esta logueado y se encuentra en la pagina de listar training
    When el usuario quiere visualizar los training activos
    Then el sistema deberia mostrar los training activos que estan dentro de la fecha del programa

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


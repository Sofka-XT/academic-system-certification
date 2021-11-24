Feature: Listar los training activos

  Yo como usuario autenticado quiero ver los training activos que están
  dentro de la fecha del programa
  para visualizar los training vigente.

  Background:
    When el usuario quiere visualizar los training activos

  Scenario: Visualizar los training activos estando autenticado
    Given que despues de estar logueado y se encuentra en la pagina de listar training
    Then el sistema deberia mostrar los training activos que estan dentro de la fecha del programa

  Scenario: Visualizar los training activos sin estar autenticado
    Given que el usuario no esta logueado
    Then el sistema no deberia permitir el acceso a los training activos

  Scenario: Visualizar un training especifico dentro de la lista
    Given que el couch se encuentra en la pagina de listar training
    When el usuario quiere visualizar los training activos "<training>"
    Then el sistema deberia mostrar el training consultado en las listas de training activos


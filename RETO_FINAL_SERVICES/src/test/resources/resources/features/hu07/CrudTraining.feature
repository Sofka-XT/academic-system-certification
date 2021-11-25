Feature: HU07
  Yo como: Coach
  Quiero: crear trainings a partir de programas
  Para: poder asignar aprendices y coaches.

  Background:
    Given que tengo acceso a la aplicacion api

  Scenario: ver un training
    When quiero ver un training nuevo
    Then deberia ver el training de manera correcta

  Scenario: actualizar un training
    When quiero actualizar un training nuevo
    Then deberia ver el training actualizado

  Scenario: crear un training nuevo
    When quiero crear un training nuevo
    Then deberia crear el training de manera correcta

  Scenario: eliminar un training
    When quiero eliminar un training
    Then deberia eliminar el training de manera correcta


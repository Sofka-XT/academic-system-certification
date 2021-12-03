Feature: HU07
  Yo como: Coach
  Quiero: crear trainings a partir de programas
  Para: poder asignar aprendices y coaches.

  Background:
    Given que tengo acceso a la aplicacion api

  Scenario: crear un training nuevo
    When quiero crear un training nuevo
    Then deberia crear el training de manera correcta

  Scenario: crear un training de manera incorrecta
    When quiero crear un training con una fecha invalida
    Then deberia ver un mensaje de error en la creacion

  Scenario: ver un training
    When quiero ver un training nuevo
    Then deberia ver el training de manera correcta

  Scenario: ver un training de manera incorrecta
    When solicito ver un training de forma incorrecta
    Then deberia ver un mensaje de error

  Scenario: actualizar un training
    When quiero actualizar un training nuevo
    Then deberia ver el training actualizado

  Scenario: actualizar un training de manera incorrecta
    When quiero actualizar un training ingresando una fecha invalidad
    Then deberia aparecer un mensaje de error en la actualizacion

  Scenario: eliminar un training
    When quiero eliminar un training
    Then deberia eliminar el training de manera correcta

  Scenario: eliminar un training de manera incorrecta
    When quiero eliminar un training sin ingresar id
    Then deberia ver un mensaje de error en la eliminacion


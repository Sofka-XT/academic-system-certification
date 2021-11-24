Feature: HU07
  Yo como: Coach
  Quiero: crear trainings a partir de programas
  Para: poder asignar aprendices y coaches.

  Background:
    Given que tengo acceso al gestor de

  Scenario: Crear un training en sofkau
    When quiero crear un training nuevo
    Then deberia crear el training de manera correcta
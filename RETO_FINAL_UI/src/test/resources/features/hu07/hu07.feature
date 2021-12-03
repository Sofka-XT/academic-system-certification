Feature: HU07
  Yo como: Coach
  Quiero: crear trainings a partir de programas
  Para: poder asignar aprendices y coaches.

  Background:
    Given que el coach se encuentra logueado

  Scenario: Crear un training en sofkau
    When el coah quiere crear un nuevo training
    Then el sistema deberia crear el training de manera correcta
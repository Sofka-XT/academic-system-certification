# new feature
# Tags: optional

Feature: Historia de Usuario 06
  Yo como: Coach,
  Quiero: Administrar los diferentes programas de Sofka U
  Para: Agilizar el proceso de asignacion del programa al training.

  Background:
    Given que el coach se encuentra en la seccion de editar cursos

  Scenario: Verificacion de correcta edicion de nombre de programa
    When el coah proceda a editar el nombre de un programa ya existente y pulse el boton de guardar
    Then este cambio se debe guardar exitosamente en dicho curso

  Scenario:  Verificacion de Error con falta de nombre de programa
    When el coah proceda a editar el nombre de un programa y deje este campo vaccio
    Then debe saltar una alerta que haga saber al usuario el fallo cometido

  Scenario: Correcta asignacion de cursos
    When el coah proceda a asignar un curso en un programa especifico
    Then el curso asignado en dicho programa debe guardarse correctamente y en el orden estipilado de agregacion

  Scenario: Correta elminacion de cursos
    When el coah proceda a eliminar un curso en un programa especifico
    Then el curso eliminado de dicho programa debe retirarse  correctamente y en el orden estipilado se debe conservar


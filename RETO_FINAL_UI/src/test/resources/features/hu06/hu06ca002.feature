# new feature
# Tags: optional

Feature: Historia de Usuario 06 CA003
  Yo como: Coach,
  Quiero: Eliminar los diferentes programas de Sofka U
  Para: Agilizar el proceso de asignacion del programa al training.


  Scenario: Verificacion de correcta eliminacion de un programa
    Given que el coach se encuentra en la seccion de eliminar programa
    When el coah proceda a seleccionar  un programa ya existente y para su eliminacion y pulse el boton de confirmar
    Then este cambio se debe guardar exitosamente  y debe notificarse



# new feature
# Tags: optional
Feature: Historia de Usuario 06 CA001
  Yo como coach
  quiero crear un programa
  para posteriormente asignarlo a training.

  Background:
    Given El coach se encuentra en la ruta de creación de programa

  Scenario: Verificar la creación del programa suministrando los datos obligatorios
    When El mentor ingresa el nombre del programa y escoge un curso o los cursos necesarios para el programa
    Then Se creará exitosamente el programa y se debe notificar.

  Scenario: Verificar la creación del programa suministrando los datos obligatorios
    When El mentor no ingresa el nombre del programa y no selecciona ningún curso
    Then Se debe notificar que no es posible crear el programa.

  Scenario: Verificar la creación del programa suministrando los datos obligatorios
    When El mentor no ingresa el nombre del programa y selecciona un curso
    Then Se debe notificar que no es posible crear el programa sin el que suministre el nombre.

  Scenario: Verificar la creación del programa suministrando los datos obligatorios
    When El mentor ingresa el nombre del programa y no selecciona ningún curso
    Then Se debe notificar que no es posible crear el programa sin el asignar al menos un curso.



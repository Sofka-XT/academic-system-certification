# new feature
# Tags: optional

Feature: Historia de Usuario 06 CA004
  Yo como coach
  quiero listar los programas que he creado
  para conocer los programas existentes.

  Background:
    Given El coach se encuentra en el menú principal

  Scenario: verificar la existencia y el funcionamiento de la opción de listar un programa
    When El mentor selecciona programas activos
    Then me debe llevar a la ruta de programas activos donde se listara los programas activos.


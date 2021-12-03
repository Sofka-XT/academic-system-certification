
Feature: yo como coach
  Cuando creo un training y adjunto los aprendices
  requiero crear cada uno de los perfiles de los aprendices con base a la informacion de archivo

  Scenario: Creacion del perfil del aprendiz exitoso
    Given que el coach asigna aprendices a un training
    When cuando el coach crea el training
    Then se deben crear exitosamente los perfiles de los aprendices

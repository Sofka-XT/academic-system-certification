Feature: Perfilar el aprendiz con su respectivo rendimiento

  Yo como usuario autenticado del sistema (coach o aprendiz)
  quiero poder ver el perfil del aprendiz con su respectivo rendimiento
  para hacer el seguimiento sobre su proceso formativo, y sea de acceso rápido mediante una URL para compartir.

  Background:
    Given el usuario (coach o aprendiz) se encuentra autenticado en el sistema y en la pagina principal del mismo
  @ignore
  Scenario: El coach revisa el rendimiento del aprendiz
    When el coach solicita ver el perfil del aprendiz de un training activo
    Then el sistema debe mostrar el perfil del aprendiz en una nueva seccion

  Scenario: El coach intenta visualizar el rendimiento del aprendiz con correo desactualizado
    When el coach solicita ver el perfil del aprendiz de un training activo con correo desactualizado
    Then el sistema debe mostrar un mensaje manifestadno que no se encuentra informacion vinculada a dicho correo
@ignore
  Scenario: El aprendiz revisa su rendimiento en el training activo
    When el aprendiz solicita ver su perfil en un training activo
    Then el sistema debe mostrar su perfil con su rendimiento en una nueva seccion

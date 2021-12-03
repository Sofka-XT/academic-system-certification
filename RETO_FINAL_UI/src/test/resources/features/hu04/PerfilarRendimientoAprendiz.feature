Feature: Perfilar el aprendiz con su respectivo rendimiento

  Yo como usuario autenticado del sistema (coach o aprendiz)
  quiero poder ver el perfil del aprendiz con su respectivo rendimiento
  para hacer el seguimiento sobre su proceso formativo, y sea de acceso rápido mediante una URL para compartir.

  Scenario: El coach revisa el rendimiento del aprendiz
    Given el coach se encuentra autenticado en el sistema y en la pagina principal del mismo
    When el coach solicita ver el perfil del aprendiz de un training activo
    Then el sistema debe mostrar el perfil del aprendiz en una nueva seccion

  Scenario: El coach intenta visualizar el rendimiento del aprendiz con correo desactualizado
    Given el coach se encuentra logueado en el sistema y en la pagina principal del mismo
    When el coach solicita ver el perfil del aprendiz de un training activo con correo desactualizado
    Then el sistema debe mostrar un mensaje manifestando que no se encuentra informacion vinculada a dicho correo

  Scenario: El aprendiz revisa su rendimiento en el training activo
    Given el aprendiz se encuentra autenticado en el sistema y en la pagina principal del mismo
    When el aprendiz solicita ver su perfil en un training activo
    Then el sistema debe mostrar su perfil con su rendimiento en una nueva seccion

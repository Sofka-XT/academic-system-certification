Feature: HU01 - autenticacion
  Yo como usuario (estudiante/coach)
  Quiero poder ingresar a la plataforma de SofkaU con una cuenta de Google
  Para hacer uso de sus funcionalidades

  Background:
    Given el usuario se encuentra en la pagina login

  Scenario: uno - Existencia de elemento de login en la loginPage
    Then  deberia visualizar el boton de ingreso

  Scenario: dos - Login exitoso coach
    When  realiza login a la plataforma
    Then  deberia visualizar la pagina principal correspondiente a coach

  Scenario: tres - login exitoso aprendiz
    When  realiza login con credenciales de aprendiz
    Then  deberia visualizar la pagina principal correspondiente a aprendiz

  Scenario: cuatro - Acceso a rutas sin tener sesion activa
    When  ingresa a cualquier ruta
    Then  deberia visualizar la pagina de login

  Scenario: cinco - Cierre de sesion
    When  realiza login exitosamente
    And   realiza logout
    Then  se tendra que mostrar la login page



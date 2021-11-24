Feature: HU01 - autenticacion
  Yo como usuario (estudiante/coach)
  Quiero poder ingresar a la plataforma de SofkaU con una cuenta de Google
  Para hacer uso de sus funcionalidades

  Background:
    Given el usuario no esta autenticado

  Scenario: uno - Existencia de elemento de login en la loginPage
    When  ingresa a la pagina de login
    Then  deberia visualizar el boton de ingreso

  Scenario: dos - Login exitoso
    When  realiza login exitosamente
    Then  deberia visualizar la pagina principal correspondiente a su rol

  Scenario: tres - Acceso a rutas sin tener sesion activa
    When  ingresa a cualquier ruta
    Then  deberia visualizar la pagina de login

  Scenario: cuatro - Refrescar pagina estando autenticado
    When  se autentica en la plataforma
    And   Refresaca la pagina
    Then  deberia poder visualizar la pagina a la que accede

  Scenario: cinco - Cierre de sesion
    When  realiza login exitosamente
    And   realiza logout
    Then  deberia visualizar la pagina de login

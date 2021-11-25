Feature: HU01 - autenticacion op2
  Yo como usuario (estudiante/coach)
  Quiero poder ingresar a la plataforma de SofkaU con una cuenta de Google
  Para hacer uso de sus funcionalidades

  Background:
    Given el usuario se encuentra en la pagina login

  @ignore
  Scenario: uno - Existencia de elemento de login en la loginPage
    Then  deberia visualizar el boton de ingreso

  @ignore
  Scenario: dos - Login exitoso
    When  realiza login a la plataforma
    Then  deberia visualizar la pagina principal correspondiente a su rol

  @ignore
  Scenario: tres - Acceso a rutas sin tener sesion activa
    When  ingresa a cualquier ruta
    Then  deberia visualizar la pagina de login

  @ignore
  Scenario: cuatro - Refrescar pagina estando autenticado
    When  se autentica en la plataforma
    And   Refresaca la pagina
    Then  deberia poder visualizar la pagina a la que accede


  Scenario: cinco - Cierre de sesion
    When  realiza login exitosamente
    And   realiza logout
    Then  se tendra que mostrar la login page


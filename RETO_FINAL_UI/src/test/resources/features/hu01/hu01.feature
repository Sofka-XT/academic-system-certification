Feature: Yo como coach
  Quiero acceder a la app mediante una cuenta en google
  Para poder gestionar los programas, cursos y trainings y ver el rendimiento de los aprendices.

  Scenario: existencia de elemento de login en la loginPage
    Given el usuario no esta autenticado
    When  ingresa a la pagina de login
    Then  deberia visualizar el boton de ingreso

  Scenario: carga de formulario con cuentas asociadas a google
    Given el usuario no esta autenticado
    And   tiene cuentas asociadas a google en el navigador
    When  ingresa a la pagina de login
    And   inicia el proceso de autenticacion en google
    Then  deberia visualizar un formulario con sus cuentas asociadas a google

  Scenario: cierre de sesion
    Given el usuario autenticado ha ingresado a la plataforma
    When  realiza logout
    Then  deberia visualizar la pagina de login

  Scenario: acceso a rutas sin tener sesion activa
    Given el usuario no esta autenticado
    When  ingresa a cualquier ruta
    Then  deberia visualizar la pagina de login

  Scenario: acceso a loginPage con sesion activa
    Given el usuario esta autenticado
    When  ingresa a la pagina de login
    Then  deberia visualizar la pagina principal correspondiente a su rol

  Scenario: refrescar pagina estando autenticado
    Given el usuario esta autenticado
    When  ivuelve a acceder a la pagina
    Then  deberia poder visualizar la pagina a la que accede

  Scenario: redireccionado a la pagina correspondiente segun rol
    Given el usuario no esta autenticado
    When  ingresa a la pagina de login
    Then  deberia visualizar la opcion ingresar




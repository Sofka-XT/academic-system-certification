Feature: HU005
  Yo como coach
  quiero crear, listar, actualizar y eliminar un curso
  para manipular y/o persistir la información de los cursos.

  Background:
    Given que tengo acceso a la API


  Scenario: Buscar curso
    When solicito la informacion de un curso
    Then el servidor debe retornar una repuesta exitosa.


  Scenario: Crear curso
    When envio todos los datos obligatorios para crear un curso
    Then los datos deben quedar guardar en la base de datos.


  Scenario: Crear curso con dato average invalido
    When envio todos los datos obligatorios y el dato average invalido
    Then los datos no deben quedar guardados en la base de datos.


  Scenario: Crear curso con dato condition invalido
    When envio todos los datos obligatorios y el dato condition invalido
    Then los datos no deben quedar guardados en la base de datos.


  Scenario: Crear curso con dato type invalido
    When envio todos los datos obligatorios y el dato type invalido
    Then los datos no deben quedar guardados en la base de datos.


  Scenario: Crear curso con dato name curso repetido
    When envio todos los datos obligatorios y el dato name curso igual a uno ya creado
    Then los datos no deben ser guardados en la base de datos.


  Scenario: Crear curso con dato name categoria repetido
    When envio todos los datos obligatorios y el dato name categoria igual a uno ya creado
    Then los datos no deben ser guardados en la base de datos.


  Scenario: Crear curso vacio
    When envio todos los datos vacio
    Then no se debe guardar el la Base de datos


  Scenario: Crear curso algunos campos vacios
    When envio algunos datos vacios
    Then no se debe guardar el la Base de datos


  Scenario: Crear curso todos los campos invalidos
    When envio todos los datos invalidos
    Then no se debe guardar el la Base de datos

  Scenario: Editar curso
    When envio todos los datos de un curso para editar
    Then se debe guardar en la Base de datos


  Scenario: Eliminar curso
    When solicito eliminar un curso
    Then se eliminara de la Base de datos






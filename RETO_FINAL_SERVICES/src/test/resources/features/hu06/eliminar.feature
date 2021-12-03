Feature: Yo como coach
  quiero elimnar  programas
  para poder definir modificar informacion necesaria para el programa

  Background:
    Given El coah se realice una peticion de eliminar programa

  Scenario: eliminar programa exitoso
    When la peticion se realice con un id correcto y existente
    Then entonces el programa se debe eliminar  y  retornar un status ACEPTED

  Scenario: eliminar programa fallido
    When la peticion se realice con un id incorrecto  o no  existente
    Then se debe retornar un status fail
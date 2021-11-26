
Feature: Yo como coach
  quiero listar todos los programas
  para poder verlos

  Scenario: Consulta exitosa
    Given El usuario ha definido que quiere obtener la información de los programas
    When El usuario envía la solicitud
    Then El deberá obtener todos los datos solicitados con el codigo de respuesta status ok.



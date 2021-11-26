Feature: Yo como usuario
  quiero crear, listar, actualizar y eliminar un curso
  para manipular y/o persistir la información de los cursos.

  Scenario: Creación exitosa nuevo curso
    Given doy click sobre la opcion Crear curso
    When llene el formulario con todos los campos y doy clic sobre el boton crear
    Then el sistema debe mostrar el siguiente mensaje: Registro exitoso.




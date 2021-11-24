Feature: Yo como usuario
  quiero crear, listar, actualizar y eliminar un curso
  para manipular y/o persistir la información de los cursos.

  Scenario: Creación exitosa de un nuevo curso
    Given doy click sobre la opcion Crear nuevo curso
    When llene el formulario con todos los campos y de clic sobre guardar
    Then el sistema debe mostrar el siguiente mensaje: Registro exitoso.



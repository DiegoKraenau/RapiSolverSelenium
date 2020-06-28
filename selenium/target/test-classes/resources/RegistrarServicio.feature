Feature: El app permitira registar a un usuario para poder publicar o buscar servicios
  Scenario: Registro de un usuario como cliente para acceso a la app
    Given Presionara el boton de Sing Up
    And Ingresa su nombre
    And Ingresa su apellido
    And Ingresa su email
    And Ingresa la contraseña
    When Se presiona el boton de Agregar
    Then El usuario fue correctamente registrado en el sistema
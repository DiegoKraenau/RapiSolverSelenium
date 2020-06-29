Feature: El app permitira editar el perfil de usuario
  Scenario: Editar perfil de usuario
    Given El usuario ingresa sus credenciales de acceso
    And Hace click en Sing In
    When El usuario hace click en Mi perfil
    And Hace click en Editar contacto
    And Ingresa sus nuevos datos
    And Hace click en Guardar Cambios
    Then El usuario podra visualizar la edicion de su perfil
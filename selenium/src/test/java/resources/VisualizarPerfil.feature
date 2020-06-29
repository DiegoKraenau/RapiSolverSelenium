Feature: El app permitira visualizar el perfil de usuario
  Scenario: Visualizar perfil de usuario
    Given El usuario ingresa sus credenciales de acceso
    And Hace click en Sing In
    When El usuario hace click en Mi perfil
    Then El usuario podra visualizar su perfil
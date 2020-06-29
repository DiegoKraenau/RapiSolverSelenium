Feature: El app permitira visualizar los detalles del servicio
  Scenario: Visualizar detalles de servicio
    Given El usuario ingresa sus credenciales de acceso
    And Hace click en Sing In
    When El usuario hace click en Buscar servicio y selecciona servicio de gasfiteria
    Then El usuario podra visualizar los detalles del servicio
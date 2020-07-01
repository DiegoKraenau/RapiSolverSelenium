# new feature
# Tags: optional

Feature: La app permitira visualizar la lista de servicios de los proveedores

  Scenario: Listar Servicios
    Given El usuario ingresa sus credenciales de acceso
    And Hace click en Sing In
    When El usuario hace click en Buscar Servicio
    Then El usuario podrá visualizar todos los servicios disponibles
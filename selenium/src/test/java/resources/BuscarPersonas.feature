Feature: El app permitira buscar proveedores asociados
  Scenario: Buscar proveedores asociados
    Given El usuario ingresa sus credenciales de acceso
    And Hace click en Sing In
    When El usuario hace click en Buscar Proveedor
    And Ingresa el nombre del proveedor
    Then El usuario podra visualizar el perfil del proveedor